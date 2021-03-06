package SAP_1_SIMPLE_COMPUTER_PRESENTATION;

import SAP_1_SIMPLE_COMPUTER_LOGIC.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Model implements Runnable {

    
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
    private boolean simulando;
    private boolean pausa;
    private Thread hiloDibujo;

    public View_initial getVentana() {
        if (ventana == null) {
            ventana = new View_initial(this);
        }
        return ventana;
    }

    public View_load_program getViewLoadProgram() {
        if (viewLoadProgram == null) {
            viewLoadProgram = new View_load_program(this);
        }
        return viewLoadProgram;
    }

    public Systems getSystem() {
        if (system == null) {
            system = new Systems();
        }
        return system;
    }
    
    public boolean getPausa()
    {
        return pausa;
    }
    
    public void setPausa(boolean a)
    {
        pausa = a;
    }
    // funcionalidad del sistema   
    public void iniciar() {
        getVentana();
        getVentana().setVisible(true);
        getVentana().getBtnIniciar().setEnabled(false);
        getVentana().getBtnDetener().setEnabled(false);
        getVentana().getBtnPausa().setEnabled(false);
    }

    public void loadProgram() {
        getViewLoadProgram();
        getViewLoadProgram().setVisible(true);
    }

    public void iniciarSimulacion() {

        if (simulando && pausa) {
            pausa = false;
        } else {
            getVentana().getBtnIniciar().setEnabled(false);
            getVentana().getBtnDetener().setEnabled(true);
            getVentana().getBtnPausa().setEnabled(true);
            getVentana().getBtnCargarProgram().setEnabled(false);
            hiloDibujo = new Thread(this);
            hiloDibujo.start();
        }
    }

    /*public void terminarSimulacion() {
        getVentana().getBtnIniciar().setEnabled(true);
        getVentana().getBtnDetener().setEnabled(false);
        getVentana().getBtnPausa().setEnabled(false);
        getVentana().getBtnCargarProgram().setEnabled(true);
        simulando = false;
    }*/

    public void detenerSimulacion() {
        getVentana().getBtnIniciar().setEnabled(true);
        getVentana().getBtnDetener().setEnabled(false);
        getVentana().getBtnPausa().setEnabled(false);
        getVentana().getBtnCargarProgram().setEnabled(true);
        simulando = false;
        pausa=false;
        hiloDibujo.stop();
        hiloDibujo = null;
        getVentana().iniciarCero();
        getVentana().dibujarN();
        java.lang.System.gc();
    }

    public void reiniciar() {
        if(getPausa() && simulando)
        {
            setPausa(false);
            getVentana().getBtnPausa().setText("PAUSE");
        }else{
            if(getPausa()==false && simulando==true)
            {
                setPausa(true);
                getVentana().getBtnPausa().setText("RESUME");
            }
        }
    }

    public void loadProgramDefault() {
        JFileChooser selectorArchivo = new JFileChooser();
        selectorArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        File archivo;
        int resultado = selectorArchivo.showOpenDialog(getViewLoadProgram());
        // si el usuario hizo clic en el bot??n Cancelar del cuadro de di??logo, regresar
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

    public void saveMemory() {
        getViewLoadProgram().saveMemory();
        if (ram != null) {
            getVentana().getBtnIniciar().setEnabled(true);
            getVentana().getBtnDetener().setEnabled(false);
            getVentana().getBtnPausa().setEnabled(false);
        }
    }

    public void eraseMemory() {
        ram = null;
        dibujarEraseLoadProgram();
    }

    public MemoryRegister getRam() {
        Utils.setInstructionsA();
        if (ram == null) {
            ram = new MemoryRegister();
        }
        return ram;
    }

    public void setVelocidad(int velocidad) {
        getSystem().setVelocidad(velocidad);
    }

    public void controlarVelocidad() {
        setVelocidad(5000 - getVentana().getSlide().getValue());
    }

    public void esperar() // tiempo en milisegundos
    {
        while (getPausa()) {
            System.out.println("Hilo pausado..."+getPausa());
        }
        try {
            Thread.sleep(getSystem().getVelocidad());
        } catch (InterruptedException ex) {
        }
        getVentana().dibujarN();
    }

    public void cargarInst() {
        if ((String) viewLoadProgram.getInstruccionComboBox().getSelectedItem() == "OUT"
                || (String) viewLoadProgram.getInstruccionComboBox().getSelectedItem() == "HLT") {
            getViewLoadProgram().loadInst();
            getRam().setPosition(viewLoadProgram.getIndexOfMemory(), (String) viewLoadProgram.getInstruccionComboBox().getSelectedItem(), 0, 0);
            dibujarLoadProgram();
        } else if (viewLoadProgram.getPosicionRamTextField().getText().equals("")) {
            JOptionPane.showMessageDialog(viewLoadProgram, "Debe ingresar el numero de la posicion entre 0 y 15", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (Integer.parseInt(viewLoadProgram.getPosicionRamTextField().getText()) < 16
                && Integer.parseInt(viewLoadProgram.getPosicionRamTextField().getText()) >= 0) {
            getViewLoadProgram().loadInst();
            getRam().setPosition(viewLoadProgram.getIndexOfMemory(), (String) viewLoadProgram.getInstruccionComboBox().getSelectedItem(), Integer.parseInt(viewLoadProgram.getPosicionRamTextField().getText()), 0);
            dibujarLoadProgram();
        } else {
            JOptionPane.showMessageDialog(viewLoadProgram, "Numeros permitidos entre 0 y 15", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarDato() {
        if (viewLoadProgram.getTextfieldDato().getText().equals("")) {
            JOptionPane.showMessageDialog(viewLoadProgram, "Debe ingresar el numero entre 0 y 255", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (Integer.parseInt(viewLoadProgram.getTextfieldDato().getText()) < 256
                && Integer.parseInt(viewLoadProgram.getTextfieldDato().getText()) >= 0) {
            getViewLoadProgram().loadData();
            getRam().setPosition(viewLoadProgram.getIndexOfMemory(), "vacio", 0, Integer.parseInt(viewLoadProgram.getTextfieldDato().getText()));
            dibujarLoadProgram();
        } else {
            JOptionPane.showMessageDialog(viewLoadProgram, "Numeros permitidos entre 0 y 255", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void dibujarLoadProgram() {
        for (int i = 0; i < 16; i++) {
            if (ram.getPosition(i).getInstruction() != "NOP") {
                viewLoadProgram.paintMem(i, ram.getPosition(i).getBinaryRepresentation());
            }
        }
    }

    public void dibujarEraseLoadProgram() {
        viewLoadProgram.paintMemErase();
    }

    /*lanzador del hilo*/
    @Override
    public void run() {
        try {
            getVentana().iniciarCero();
            simular();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(getVentana(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        getVentana().getBtnIniciar().setEnabled(true);
        getVentana().getBtnDetener().setEnabled(false);
    }

    public void simular() {
        Utils.setInstructionsA();
        initializeRegisters();
        simulando = true;
        pausa = false;
        while (pc.getPC() < 16) {
            System.out.println("pc get: " + pc.getPC());
            clkSpecific(clkCommon());
        }
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

    private int clkCommon() {
        System.out.print("CLK: " + clock.getCLK());
        getVentana().dibujar("CLK", clock.getCLK(), "0000");
        System.out.print(" PC: " + pc.getBinaryPC());
        getVentana().dibujar("PC", 0, pc.getBinaryPC());
        mar.setMar(pc.getBinaryPC());
        System.out.println(" MAR: " + mar.getMar());
        getVentana().dibujar("MAR", 0, mar.getMar());
        clock.netx();
        esperar();
        System.out.print("CLK: " + clock.getCLK());
        getVentana().dibujar("CLK", clock.getCLK(), "0000");
        pc.netx();
        System.out.print(" PC: " + pc.getBinaryPC());
        getVentana().dibujar("PC+", 0, pc.getBinaryPC());
        ramMemory = ram.getPosition(Utils.getDecimal(mar.getMar()));
        System.out.print(" RAM: " + ramMemory.getBinaryRepresentation());
        getVentana().dibujar("RAM", 0, ramMemory.getBinaryRepresentation());
        ir.setIR(ramMemory.getBinaryRepresentation());
        System.out.println(" IR: " + ir.getIR());
        getVentana().dibujar("IR", 0, ir.getIR());
        clock.netx();
        esperar();
        return Utils.getDecimal(ir.getInstruction());
    }

    private void clkSpecific(int instruction) {
        switch (instruction) {
            case 0://NOP
                System.out.println("NOP ");
                break;
            case 1://LDA
                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                getVentana().dibujar("UC", 0, uc.getGraficSequencer());
                mar.setMar(ir.getPosition());
                System.out.println(" MAR: " + mar.getMar());
                getVentana().dibujar("MAR", 0, mar.getMar());
                clock.netx();
                esperar();

                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                ramMemory = ram.getPosition(Utils.getDecimal(mar.getMar()));
                System.out.print(" RAM: " + ramMemory.getBinaryRepresentation());
                getVentana().dibujar("RAM", 0, ramMemory.getBinaryRepresentation());
                ac.setAC(ramMemory.getBinaryRepresentation());
                System.out.println(" AC: " + ac.getAC());
                getVentana().dibujar("AC", 0, ac.getAC());
                clock.netx();
                esperar();

                System.out.println("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                clock.netx();
                esperar();
                break;
            case 2://ADD
                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                getVentana().dibujar("UC", 0, uc.getGraficSequencer());
                mar.setMar(ir.getPosition());
                System.out.println(" MAR: " + mar.getMar());
                getVentana().dibujar("MAR", 0, mar.getMar());
                clock.netx();
                esperar();

                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                ramMemory = ram.getPosition(Utils.getDecimal(mar.getMar()));
                System.out.print(" RAM: " + ramMemory.getBinaryRepresentation());
                getVentana().dibujar("RAM", 0, ramMemory.getBinaryRepresentation());
                b.setB(ramMemory.getBinaryRepresentation());
                System.out.println(" B: " + b.getB());
                getVentana().dibujar("B", 0, b.getB());
                clock.netx();
                esperar();

                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                alu.setALU(ac.getAC(), b.getB());
                String respAlu = alu.getALU().get("operatorA") + "+" + alu.getALU().get("operatorB")
                        + "="
                        + alu.getALU().get("result");
                System.out.print(" ALU: "
                        + alu.getALU().get("operatorA")
                        + alu.getALU().get("operation")
                        + alu.getALU().get("operatorB")
                        + "="
                        + alu.getALU().get("result"));
                getVentana().dibujar("AC", 0, ac.getAC());
                getVentana().dibujar("B", 0, b.getB());
                getVentana().dibujar("ALU", 0, respAlu);
                ac.setAC(alu.getResult());
                System.out.println(" AC: " + ac.getAC());
                getVentana().dibujar("AC", 0, ac.getAC());
                clock.netx();
                esperar();
                break;
            case 3://SUB
                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                getVentana().dibujar("UC", 0, uc.getGraficSequencer());
                mar.setMar(ir.getPosition());
                System.out.println(" MAR: " + mar.getMar());
                getVentana().dibujar("MAR", 0, mar.getMar());
                clock.netx();
                esperar();

                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                ramMemory = ram.getPosition(Utils.getDecimal(mar.getMar()));
                System.out.print(" RAM: " + ramMemory.getBinaryRepresentation());
                getVentana().dibujar("RAM", 0, ramMemory.getBinaryRepresentation());
                b.setB(ramMemory.getBinaryRepresentation());
                System.out.println(" B: " + b.getB());
                getVentana().dibujar("B", 0, b.getB());
                clock.netx();
                esperar();

                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                alu.setALU(ac.getAC(), b.getB(), true);
                String respAlu2 = alu.getALU().get("operatorA") + "-" + alu.getALU().get("operatorB")
                        + "="
                        + alu.getALU().get("result");
                System.out.print(" ALU: "
                        + alu.getALU().get("operatorA")
                        + alu.getALU().get("operation")
                        + alu.getALU().get("operatorB")
                        + "="
                        + alu.getALU().get("result"));
                getVentana().dibujar("AC", 0, ac.getAC());
                getVentana().dibujar("B", 0, b.getB());
                getVentana().dibujar("ALU", 0, respAlu2);
                ac.setAC(alu.getResult());
                System.out.println(" AC: " + ac.getAC());
                getVentana().dibujar("AC", 0, ac.getAC());
                clock.netx();
                esperar();
                break;
            case 4://STA
                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                getVentana().dibujar("UC", 0, uc.getGraficSequencer());
                mar.setMar(ir.getPosition());
                System.out.println(" MAR: " + mar.getMar());
                getVentana().dibujar("MAR", 0, mar.getMar());
                clock.netx();
                esperar();

                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                ram.setPosition(Utils.getDecimal(mar.getMar()), "vacio", 0, Utils.getDecimal(ac.getAC()));
                System.out.print(" AC: " + ac.getAC());
                getVentana().dibujar("AC", 0, ac.getAC());
                ramMemory = ram.getPosition(Utils.getDecimal(mar.getMar()));
                System.out.println(" RAM: " + ramMemory.getBinaryRepresentation());
                getVentana().dibujar("RAM", 0, ramMemory.getBinaryRepresentation());
                clock.netx();
                esperar();

                System.out.println("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                clock.netx();
                esperar();
                break;
            case 5://LDI
                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                getVentana().dibujar("UC", 0, uc.getGraficSequencer());
                ac.setAC(ir.getPosition());
                System.out.println(" AC: " + ac.getAC());
                getVentana().dibujar("AC", 0, ac.getAC());
                clock.netx();
                esperar();

                System.out.println("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                clock.netx();
                esperar();

                System.out.println("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                clock.netx();
                esperar();
                break;
            case 6://JMP
                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                getVentana().dibujar("UC", 0, uc.getGraficSequencer());
                pc.setPC(Utils.getDecimal(ir.getPosition()));
                System.out.println(" PC: " + pc.getBinaryPC());
                getVentana().dibujar("PC", 0, pc.getBinaryPC());
                clock.netx();
                esperar();

                System.out.println("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                clock.netx();
                esperar();

                System.out.println("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                clock.netx();
                esperar();
                break;
            case 7://JC
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                if (FlagsRegister.isCF()) {
                    System.out.print("CLK: " + clock.getCLK());
                    uc.setUC(ir.getInstruction());
                    System.out.print(" UC: " + uc.getUC());
                    System.out.print(" UC: " + uc.getGraficSequencer());
                    getVentana().dibujar("UC", 0, uc.getGraficSequencer());
                    pc.setPC(Utils.getDecimal(ir.getPosition()));
                    System.out.print(" JC: " + FlagsRegister.isCF());
                    getVentana().dibujar("JC", 1, "0000");
                    System.out.println(" PC: " + pc.getBinaryPC());
                    getVentana().dibujar("PC", 0, pc.getBinaryPC());
                } else {
                    System.out.println("CLK: " + clock.getCLK());
                }
                clock.netx();
                esperar();

                System.out.println("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                clock.netx();
                esperar();

                System.out.println("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                clock.netx();
                esperar();
                break;
            case 8://JZ
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                if (FlagsRegister.isZF()) {
                    System.out.print("CLK: " + clock.getCLK());
                    uc.setUC(ir.getInstruction());
                    System.out.print(" UC: " + uc.getUC());
                    System.out.print(" UC: " + uc.getGraficSequencer());
                    getVentana().dibujar("UC", 0, uc.getGraficSequencer());
                    pc.setPC(Utils.getDecimal(ir.getPosition()));
                    System.out.print(" JZ: " + FlagsRegister.isZF());
                    getVentana().dibujar("JZ", 1, "0000");
                    System.out.println(" PC: " + pc.getBinaryPC());
                    getVentana().dibujar("PC", 0, pc.getBinaryPC());
                } else {
                    System.out.println("CLK: " + clock.getCLK());
                }
                clock.netx();
                esperar();

                System.out.println("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                clock.netx();
                esperar();

                System.out.println("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                clock.netx();
                esperar();
                break;
            case 14://OUT
                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                getVentana().dibujar("UC", 0, uc.getGraficSequencer());
                out.setOUT(ac.getAC());
                System.out.print(" OUT: " + out.getOUT());
                getVentana().dibujar("AC", 0, ac.getAC());
                getVentana().dibujar("OUT", 0, out.getOUT());
                display.setDecimalPrint(out.getOUT());
                System.out.println(" PRINT: " + display.getDisplay());
                getVentana().dibujar("PRINT", display.getDisplay(), "0000");
                clock.netx();
                esperar();

                System.out.println("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                clock.netx();
                esperar();

                System.out.println("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                clock.netx();
                esperar();
                break;
            case 15://HTL
                System.out.print("CLK: " + clock.getCLK());
                getVentana().dibujar("CLK", clock.getCLK(), "0000");
                uc.setUC(ir.getInstruction());
                System.out.print(" UC: " + uc.getUC());
                System.out.print(" UC: " + uc.getGraficSequencer());
                getVentana().dibujar("UC", 0, uc.getGraficSequencer());
                esperar();
                detenerSimulacion();
                break;
        }
    }
}
