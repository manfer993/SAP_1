
package SAP_1_SIMPLE_COMPUTER_PRESENTATION;

import SAP_1_SIMPLE_COMPUTER_LOGIC.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Model implements Runnable{
    
    private static ProgramCounterRegister pc;
    private static ClockCycle clock;
    private static MemoryRegister ram;
    private static MarRegister mar;
    private static InstructionRegister ir;
    private static ControllerRegister uc;
    private static AccumulatorARegister ac;
    private static BRegister b;
    private static AluRegister alu;
    private static OutputRegister out;
    private static DisplayRegister display;
    private static MemoryPositionModel ramMemory;
    
    private View_initial ventana;
    private View_load_program viewLoadProgram;
    private Systems system;
    private Thread hiloDibujo;

    public View_initial getVentana() {
        if(ventana == null){
            ventana = new View_initial(this);
        }
        return ventana;
    }
    
    public View_load_program getViewLoadProgram()
    {
        if(viewLoadProgram == null){
            viewLoadProgram = new View_load_program(this);
        }
        return viewLoadProgram;
    }
    
    public Systems getSystem()
    {
        if(system == null)
        {
            system = new Systems();
        }
        return system;
    }
    
    // funcionalidad del sistema   
    public void iniciar(){
        getVentana();
        getVentana().setVisible(true);
    }
    public void loadProgram()
    {
        getViewLoadProgram();
        getViewLoadProgram().setVisible(true);
    }
    
    public void iniciarSimulacion() {
            //setVelocidad(110 - getVentana().getSliVelocidad().getValue());
            getVentana().getBtnIniciar().setEnabled(false);
            getVentana().getBtnDetener().setEnabled(true);
            hiloDibujo = new Thread( this );
            hiloDibujo.start();
      }

      public void detenerSimulacion() {
            getVentana().getBtnIniciar().setEnabled(true);
            getVentana().getBtnDetener().setEnabled(false);
            //animando = false;
            hiloDibujo = null;
            java.lang.System.gc();
      }
    
    public void reiniciar()
    {
        /*aun no programado*/
    }
    
    public void loadProgramDefault() {
        JFileChooser selectorArchivo = new JFileChooser();
        selectorArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        File archivo;
        int resultado = selectorArchivo.showOpenDialog(getViewLoadProgram());
        // si el usuario hizo clic en el botón Cancelar del cuadro de diálogo, regresar
        if (resultado == JFileChooser.CANCEL_OPTION) {
            return;
        }
        // obtener el archivo seleccionado
        archivo = selectorArchivo.getSelectedFile();
        if (archivo == null || archivo.getName().equals("")) {
            JOptionPane.showMessageDialog(getViewLoadProgram(), "Nombre de archivo incorrecto!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            ram = getSystem().openFile(archivo);
            dibujarLoadProgram();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(getViewLoadProgram(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    public void dibujarLoadProgram()
    {
        for(int i = 0; i < 16; i++ )
        {
            viewLoadProgram.paintMem( i, ram.getPosition(i).getBinaryRepresentation() );
        }
    }
    
    /*lanzador del hilo*/
    
    public void run() {
            try {
                  simular();
            } catch (Exception ex) {
                  JOptionPane.showMessageDialog(getVentana(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            getVentana().getBtnIniciar().setEnabled(true);
            getVentana().getBtnDetener().setEnabled(false);
      }

    public void simular() {
        Utils.setInstructionsA();
        //loadMemory();
        initializeRegisters();

        while (pc.getPC() < 16) {
            clkSpecific(clkCommon());
        }
    }
    
    private static void loadMemory() {
        ram = new MemoryRegister();

        ram.setPosition(0, "LDA", 13, 0);
        ram.setPosition(1, "ADD", 14, 0);
        ram.setPosition(2, "SUB", 15, 0);
        ram.setPosition(3, "JZ", 6, 0);
        ram.setPosition(4, "OUT", 0, 0);
        ram.setPosition(5, "HTL", 0, 0);
        ram.setPosition(6, "LDI", 5, 0);
        ram.setPosition(7, "STA", 15, 0);
        ram.setPosition(8, "JMP", 0, 0);
        ram.setPosition(13, null, 0, 5);
        ram.setPosition(14, null, 0, 10);
        ram.setPosition(15, null, 0, 15);        
    }
    
    private static void initializeRegisters() {
        pc = new ProgramCounterRegister();
        clock = new ClockCycle();
        mar = new MarRegister();
        ir = new InstructionRegister();
        uc = new ControllerRegister();
        ac = new AccumulatorARegister();
        b = new BRegister();
        out = new OutputRegister();
        display = new DisplayRegister();
        alu = new AluRegister();
    }
    
    private static int clkCommon() {
        System.out.print("CLK: " + clock.getCLK());
        System.out.print(" PC: " + pc.getBinaryPC());
        mar.setMar(pc.getBinaryPC());
        System.out.println(" MAR: " + mar.getMar());
        clock.netx();

        System.out.print("CLK: " + clock.getCLK());
        pc.netx();
        System.out.print(" PC: " + pc.getBinaryPC());
        ramMemory = ram.getPosition(Utils.getDecimal(mar.getMar()));
        System.out.print(" RAM: " + ramMemory.getBinaryRepresentation());
        ir.setIR(ramMemory.getBinaryRepresentation());
        System.out.println(" IR: " + ir.getIR());
        clock.netx();
        return Utils.getDecimal(ir.getInstruction());
    }
    
    private static void clkSpecific(int instruction) {
        switch (instruction) {
            case 0://NOP
                System.out.println("NOP ");
                break;
            case 1://LDA
                System.out.print("CLK: " + clock.getCLK());
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                mar.setMar(ir.getPosition());
                System.out.println(" MAR: " + mar.getMar());
                clock.netx();

                System.out.print("CLK: " + clock.getCLK());
                ramMemory = ram.getPosition(Utils.getDecimal(mar.getMar()));
                System.out.print(" RAM: " + ramMemory.getBinaryRepresentation());
                ac.setAC(ramMemory.getBinaryRepresentation());
                System.out.println(" AC: " + ac.getAC());
                clock.netx();

                System.out.println("CLK: " + clock.getCLK());
                clock.netx();
                break;
            case 2://ADD
                System.out.print("CLK: " + clock.getCLK());
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                mar.setMar(ir.getPosition());
                System.out.println(" MAR: " + mar.getMar());
                clock.netx();

                System.out.print("CLK: " + clock.getCLK());
                ramMemory = ram.getPosition(Utils.getDecimal(mar.getMar()));
                System.out.print(" RAM: " + ramMemory.getBinaryRepresentation());
                b.setB(ramMemory.getBinaryRepresentation());
                System.out.println(" B: " + b.getB());
                clock.netx();

                System.out.print("CLK: " + clock.getCLK());
                alu.setALU(ac.getAC(), b.getB());
                System.out.print(" ALU: "
                        + alu.getALU().get("operatorA")
                        + alu.getALU().get("operation")
                        + alu.getALU().get("operatorB")
                        + "="
                        + alu.getALU().get("result"));
                ac.setAC(alu.getResult());
                System.out.println(" AC: " + ac.getAC());
                clock.netx();
                break;
            case 3://SUB
                System.out.print("CLK: " + clock.getCLK());
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                mar.setMar(ir.getPosition());
                System.out.println(" MAR: " + mar.getMar());
                clock.netx();

                System.out.print("CLK: " + clock.getCLK());
                ramMemory = ram.getPosition(Utils.getDecimal(mar.getMar()));
                System.out.print(" RAM: " + ramMemory.getBinaryRepresentation());
                b.setB(ramMemory.getBinaryRepresentation());
                System.out.println(" B: " + b.getB());
                clock.netx();

                System.out.print("CLK: " + clock.getCLK());
                alu.setALU(ac.getAC(), b.getB(), true);
                System.out.print(" ALU: "
                        + alu.getALU().get("operatorA")
                        + alu.getALU().get("operation")
                        + alu.getALU().get("operatorB")
                        + "="
                        + alu.getALU().get("result"));
                ac.setAC(alu.getResult());
                System.out.println(" AC: " + ac.getAC());
                clock.netx();
                break;
            case 4://STA
                System.out.print("CLK: " + clock.getCLK());
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                mar.setMar(ir.getPosition());
                System.out.println(" MAR: " + mar.getMar());
                clock.netx();

                System.out.print("CLK: " + clock.getCLK());
                ram.setPosition(Utils.getDecimal(mar.getMar()), null, 0, Utils.getDecimal(ac.getAC()));
                System.out.print(" AC: " + ac.getAC());
                ramMemory = ram.getPosition(Utils.getDecimal(mar.getMar()));
                System.out.println(" RAM: " + ramMemory.getBinaryRepresentation());
                clock.netx();

                System.out.println("CLK: " + clock.getCLK());
                clock.netx();
                break;
            case 5://LDI
                System.out.print("CLK: " + clock.getCLK());
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                ac.setAC(ir.getPosition());
                System.out.println(" AC: " + ac.getAC());
                clock.netx();

                System.out.println("CLK: " + clock.getCLK());
                clock.netx();

                System.out.println("CLK: " + clock.getCLK());
                clock.netx();
                break;
            case 6://JMP
                System.out.print("CLK: " + clock.getCLK());
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                pc.setPC(Utils.getDecimal(ir.getPosition()));
                System.out.println(" PC: " + pc.getBinaryPC());
                clock.netx();

                System.out.println("CLK: " + clock.getCLK());
                clock.netx();

                System.out.println("CLK: " + clock.getCLK());
                clock.netx();
                break;
            case 7://JC                
                if (FlagsRegister.isCF()) {
                    System.out.print("CLK: " + clock.getCLK());
                    uc.setUC(ir.getInstruction());
                    System.out.print(" UC: " + uc.getUC());
                    System.out.print(" UC: " + uc.getGraficSequencer());
                    pc.setPC(Utils.getDecimal(ir.getPosition()));
                    System.out.print(" JC: " + FlagsRegister.isCF());
                    System.out.println(" PC: " + pc.getBinaryPC());
                } else {
                    System.out.println("CLK: " + clock.getCLK());
                }
                clock.netx();

                System.out.println("CLK: " + clock.getCLK());
                clock.netx();

                System.out.println("CLK: " + clock.getCLK());
                clock.netx();
                break;
            case 8://JZ
                if (FlagsRegister.isZF()) {
                    System.out.print("CLK: " + clock.getCLK());
                    uc.setUC(ir.getInstruction());
                    System.out.print(" UC: " + uc.getUC());
                    System.out.print(" UC: " + uc.getGraficSequencer());
                    pc.setPC(Utils.getDecimal(ir.getPosition()));
                    System.out.print(" JZ: " + FlagsRegister.isZF());
                    System.out.println(" PC: " + pc.getBinaryPC());
                } else {
                    System.out.println("CLK: " + clock.getCLK());
                }
                clock.netx();

                System.out.println("CLK: " + clock.getCLK());
                clock.netx();

                System.out.println("CLK: " + clock.getCLK());
                clock.netx();
                break;
            case 14://OUT
                System.out.print("CLK: " + clock.getCLK());
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                out.setOUT(ac.getAC());
                System.out.print(" OUT: " + out.getOUT());
                display.setDecimalPrint(out.getOUT());
                System.out.println(" PRINT: " + display.getDisplay());
                clock.netx();

                System.out.println("CLK: " + clock.getCLK());
                clock.netx();

                System.out.println("CLK: " + clock.getCLK());
                clock.netx();
                break;
            case 15://HTL
                System.out.print("CLK: " + clock.getCLK());
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                System.exit(0);
                break;
        }
    }
    
}
