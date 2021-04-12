package SAP_1_SIMPLE_COMPUTER_PRESENTATION;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class View_initial extends javax.swing.JFrame {

    private Model myModel;
    private ControllerViewInital myControl;

    /**
     * Creates new form VIEW_INITIAL
     */
    public View_initial(Model aThis) {
        myModel = aThis;
        initComponents();
        getBtnDetener().setEnabled(false);
        getBtnIniciar().setEnabled(false);
        capture_events();
    }

    public ControllerViewInital getControl() {
        if (myControl == null) {
            myControl = new ControllerViewInital(this);
        }
        return myControl;
    }

    public Model getModel() {
        return myModel;
    }

    public JButton getBtnDetener() {
        return btnStop;
    }

    public JButton getBtnIniciar() {
        return btnPlayPause;
    }

    public void capture_events() {
        btnCargar.addActionListener(getControl());
        btnPlayPause.addActionListener(getControl());
        btnStop.addActionListener(getControl());
        btnReiniciar.addActionListener(getControl());
        //SlideVelocidad.addChangeListener(getControl());
    }

    public void dibujarN() {
        PcBit3jLabel.setForeground(Color.black);
        PcABusJL.setBorder(new LineBorder(Color.black));
        RamBit7jLabel.setForeground(Color.black);
        RamABusJL.setBorder(new LineBorder(Color.black));
        MarBit3jLabel.setForeground(Color.black);
        MarABusJL.setBorder(new LineBorder(Color.black));
        IrBit7jLabel.setForeground(Color.black);
        IrABusJL.setBorder(new LineBorder(Color.black));
        UcTextPane.setText("");
        UcTextPane.setForeground(Color.black);
        IrPanel.setBorder(new LineBorder(Color.black));
        AcBit7jLabel.setForeground(Color.black);
        AcABusJL1.setBorder(new LineBorder(Color.black));
        BBit7jLabel.setForeground(Color.black);
        BABusJL.setBorder(new LineBorder(Color.black));
        OutBit7jLabel.setForeground(Color.black);
        OutABusJL.setBorder(new LineBorder(Color.black));
        ResultadoTextPane.setForeground(Color.black);
        //ResultadoTextPane.setText("");
        OutPanel.setBorder(new LineBorder(Color.black));
        AccBit0jLabel.setForeground(Color.black);
        AccBit0jLabel.setText(Integer.toString(0));
        AcABusJL.setBorder(new LineBorder(Color.black));
        AccBit7jLabel.setForeground(Color.black);
        AccBit7jLabel.setText(Integer.toString(0));
        AluTextPane.setForeground(Color.black);
        AluTextPane.setText("");
        AluABusJL.setBorder(new LineBorder(Color.black));
        AcPanel.setBorder(new LineBorder(Color.black));
        BPanel.setBorder(new LineBorder(Color.black));
        BusBit0jLabel.setBorder(new LineBorder(Color.black));
        BusBit1jLabel.setBorder(new LineBorder(Color.black));
        BusBit2jLabel.setBorder(new LineBorder(Color.black));
        BusBit3jLabel.setBorder(new LineBorder(Color.black));
        BusBit4jLabel.setBorder(new LineBorder(Color.black));
        BusBit5jLabel.setBorder(new LineBorder(Color.black));
        BusBit6jLabel.setBorder(new LineBorder(Color.black));
        BusBit7jLabel.setBorder(new LineBorder(Color.black));
        BusjLabel.setText("00000000");
    }

    public void dibujarBus(String repBin) {
        if (repBin.length() == 8) {
            BusBit0jLabel.setBorder(new LineBorder(Color.red));
            BusBit1jLabel.setBorder(new LineBorder(Color.red));
            BusBit2jLabel.setBorder(new LineBorder(Color.red));
            BusBit3jLabel.setBorder(new LineBorder(Color.red));
            BusBit4jLabel.setBorder(new LineBorder(Color.red));
            BusBit5jLabel.setBorder(new LineBorder(Color.red));
            BusBit6jLabel.setBorder(new LineBorder(Color.red));
            BusBit7jLabel.setBorder(new LineBorder(Color.red));
        } else {
            BusBit0jLabel.setBorder(new LineBorder(Color.red));
            BusBit1jLabel.setBorder(new LineBorder(Color.red));
            BusBit2jLabel.setBorder(new LineBorder(Color.red));
            BusBit3jLabel.setBorder(new LineBorder(Color.red));
        }

        BusjLabel.setText(repBin);
    }

    public void dibujar(String pal, int val, String repBin) {
        switch (pal) {
            case "ALU":
                AluTextPane.setForeground(Color.red);
                AluTextPane.setText(repBin);
                AluABusJL.setBorder(new LineBorder(Color.red));
                AcPanel.setBorder(new LineBorder(Color.red));
                BPanel.setBorder(new LineBorder(Color.red));
                break;
            case "JC":
                AccBit0jLabel.setForeground(Color.red);
                AccBit0jLabel.setText(Integer.toString(val));
                AcABusJL.setBorder(new LineBorder(Color.red));
                break;
            case "JZ":
                AccBit7jLabel.setForeground(Color.red);
                AccBit7jLabel.setText(Integer.toString(val));
                AcABusJL.setBorder(new LineBorder(Color.red));
                break;
            case "PRINT":
                ResultadoTextPane.setForeground(Color.red);
                ResultadoTextPane.setText(Integer.toString(val));
                OutPanel.setBorder(new LineBorder(Color.red));
                break;
            case "OUT":
                OutBit7jLabel.setForeground(Color.red);
                OutBit7jLabel.setText(repBin);
                OutABusJL.setBorder(new LineBorder(Color.red));
                dibujarBus(repBin);
                break;
            case "B":
                BBit7jLabel.setForeground(Color.red);
                BBit7jLabel.setText(repBin);
                BABusJL.setBorder(new LineBorder(Color.red));
                dibujarBus(repBin);
                break;
            case "AC":
                AcBit7jLabel.setForeground(Color.red);
                AcBit7jLabel.setText(repBin);
                AcABusJL1.setBorder(new LineBorder(Color.red));
                dibujarBus(repBin);
                break;
            case "UC":
                UcTextPane.setForeground(Color.red);
                UcTextPane.setText(repBin);
                IrPanel.setBorder(new LineBorder(Color.red));
                break;
            case "IR":
                IrBit7jLabel.setForeground(Color.red);
                IrBit7jLabel.setText(repBin);
                IrABusJL.setBorder(new LineBorder(Color.red));
                dibujarBus(repBin);
                break;
            case "RAM":
                RamBit7jLabel.setForeground(Color.red);
                RamBit7jLabel.setText(repBin);
                RamABusJL.setBorder(new LineBorder(Color.red));
                dibujarBus(repBin);
                break;
            case "MAR":
                MarBit3jLabel.setForeground(Color.red);
                MarBit3jLabel.setText(repBin);
                MarABusJL.setBorder(new LineBorder(Color.red));
                dibujarBus(repBin);
                break;
            case "PC+":
                PcBit3jLabel.setForeground(Color.red);
                PcBit3jLabel.setText(repBin);
                break;
            case "PC":
                PcBit3jLabel.setForeground(Color.red);
                PcBit3jLabel.setText(repBin);
                PcABusJL.setBorder(new LineBorder(Color.red));
                dibujarBus(repBin);
                break;
            case "CLK":
                switch (val) {
                    case 1:
                        this.clk1.setForeground(Color.red);
                        this.clk2.setForeground(Color.black);
                        this.clk3.setForeground(Color.black);
                        this.clk4.setForeground(Color.black);
                        this.clk5.setForeground(Color.black);
                        break;
                    case 2:
                        this.clk1.setForeground(Color.black);
                        this.clk2.setForeground(Color.red);
                        break;
                    case 3:
                        this.clk2.setForeground(Color.black);
                        this.clk3.setForeground(Color.red);
                        break;
                    case 4:
                        this.clk3.setForeground(Color.black);
                        this.clk4.setForeground(Color.red);
                        break;
                    case 5:
                        this.clk4.setForeground(Color.black);
                        this.clk5.setForeground(Color.red);
                        break;
                    default:
                        System.out.println("no soportado " + val);
                        break;
                }
                break;
            default:
                System.out.println("no soportado");
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SlideVelocidad = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        btnPlayPause = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        PcPanel = new javax.swing.JPanel();
        PcBit3jLabel = new javax.swing.JLabel();
        MarPanel = new javax.swing.JPanel();
        MarBit3jLabel = new javax.swing.JLabel();
        IrPanel = new javax.swing.JPanel();
        IrBit7jLabel = new javax.swing.JLabel();
        RamPanel = new javax.swing.JPanel();
        RamBit7jLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AluTextPane = new javax.swing.JTextPane();
        BPanel = new javax.swing.JPanel();
        BBit7jLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UcTextPane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        ResultadoTextPane = new javax.swing.JTextPane();
        OutPanel = new javax.swing.JPanel();
        OutBit7jLabel = new javax.swing.JLabel();
        AcPanel = new javax.swing.JPanel();
        AcBit7jLabel = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel76 = new javax.swing.JLabel();
        clk2 = new javax.swing.JLabel();
        clk1 = new javax.swing.JLabel();
        clk5 = new javax.swing.JLabel();
        clk4 = new javax.swing.JLabel();
        clk3 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        BusBit5jLabel = new javax.swing.JLabel();
        BusBit7jLabel = new javax.swing.JLabel();
        BusBit6jLabel = new javax.swing.JLabel();
        BusBit4jLabel = new javax.swing.JLabel();
        BusBit3jLabel = new javax.swing.JLabel();
        BusBit2jLabel = new javax.swing.JLabel();
        BusBit1jLabel = new javax.swing.JLabel();
        BusBit0jLabel = new javax.swing.JLabel();
        BusjLabel = new javax.swing.JLabel();
        AcPanel1 = new javax.swing.JPanel();
        AcBit7jLabel1 = new javax.swing.JLabel();
        AcBit6jLabel1 = new javax.swing.JLabel();
        AcBit5jLabel1 = new javax.swing.JLabel();
        AcBit4jLabel1 = new javax.swing.JLabel();
        AcBit3jLabel1 = new javax.swing.JLabel();
        AcBit2jLabel1 = new javax.swing.JLabel();
        AcBit1jLabel1 = new javax.swing.JLabel();
        AcBit0jLabel1 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        AcBit0jLabel2 = new javax.swing.JLabel();
        AcBit0jLabel3 = new javax.swing.JLabel();
        AcBit0jLabel4 = new javax.swing.JLabel();
        AcBit0jLabel5 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        BusjLabel1 = new javax.swing.JLabel();
        MarABusJL = new javax.swing.JLabel();
        PcABusJL = new javax.swing.JLabel();
        IrABusJL = new javax.swing.JLabel();
        RamABusJL = new javax.swing.JLabel();
        OutABusJL = new javax.swing.JLabel();
        BABusJL = new javax.swing.JLabel();
        AcABusJL = new javax.swing.JLabel();
        AluABusJL = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        AccPanel = new javax.swing.JPanel();
        AccBit7jLabel = new javax.swing.JLabel();
        AccBit0jLabel = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        AcABusJL1 = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("VELOCIDAD DE LA ANIMACIÓN");

        btnReiniciar.setText("REINICIAR");
        btnReiniciar.setActionCommand("reiniciar");

        btnPlayPause.setText("PLAY");
        btnPlayPause.setActionCommand("iniciarSimulacion");

        btnCargar.setText("CARGAR PROGRAMA");
        btnCargar.setActionCommand("loadProgram");

        jInternalFrame1.setVisible(true);

        PcPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PcPanel.setPreferredSize(new java.awt.Dimension(200, 60));

        PcBit3jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PcBit3jLabel.setText("0000");
        PcBit3jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PcPanelLayout = new javax.swing.GroupLayout(PcPanel);
        PcPanel.setLayout(PcPanelLayout);
        PcPanelLayout.setHorizontalGroup(
            PcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PcPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PcBit3jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        PcPanelLayout.setVerticalGroup(
            PcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PcPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(PcBit3jLabel)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        MarPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MarPanel.setPreferredSize(new java.awt.Dimension(200, 60));

        MarBit3jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MarBit3jLabel.setText("0000");
        MarBit3jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout MarPanelLayout = new javax.swing.GroupLayout(MarPanel);
        MarPanel.setLayout(MarPanelLayout);
        MarPanelLayout.setHorizontalGroup(
            MarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MarBit3jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        MarPanelLayout.setVerticalGroup(
            MarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(MarBit3jLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        IrPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IrPanel.setPreferredSize(new java.awt.Dimension(200, 60));

        IrBit7jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IrBit7jLabel.setText("00000000");
        IrBit7jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout IrPanelLayout = new javax.swing.GroupLayout(IrPanel);
        IrPanel.setLayout(IrPanelLayout);
        IrPanelLayout.setHorizontalGroup(
            IrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IrBit7jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        IrPanelLayout.setVerticalGroup(
            IrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IrPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(IrBit7jLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        RamPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RamBit7jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RamBit7jLabel.setText("00000000");
        RamBit7jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout RamPanelLayout = new javax.swing.GroupLayout(RamPanel);
        RamPanel.setLayout(RamPanelLayout);
        RamPanelLayout.setHorizontalGroup(
            RamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RamBit7jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        RamPanelLayout.setVerticalGroup(
            RamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RamPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(RamBit7jLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        AluTextPane.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        AluTextPane.setEnabled(false);
        jScrollPane1.setViewportView(AluTextPane);

        BPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BPanel.setPreferredSize(new java.awt.Dimension(200, 60));

        BBit7jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BBit7jLabel.setText("00000000");
        BBit7jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout BPanelLayout = new javax.swing.GroupLayout(BPanel);
        BPanel.setLayout(BPanelLayout);
        BPanelLayout.setHorizontalGroup(
            BPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BBit7jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        BPanelLayout.setVerticalGroup(
            BPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BBit7jLabel)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        UcTextPane.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        UcTextPane.setEnabled(false);
        UcTextPane.setMargin(new java.awt.Insets(3, 55, 3, 3));
        jScrollPane2.setViewportView(UcTextPane);

        ResultadoTextPane.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ResultadoTextPane.setEnabled(false);
        ResultadoTextPane.setMargin(new java.awt.Insets(3, 55, 3, 3));
        jScrollPane3.setViewportView(ResultadoTextPane);

        OutPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OutPanel.setPreferredSize(new java.awt.Dimension(200, 60));

        OutBit7jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OutBit7jLabel.setText("00000000");
        OutBit7jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout OutPanelLayout = new javax.swing.GroupLayout(OutPanel);
        OutPanel.setLayout(OutPanelLayout);
        OutPanelLayout.setHorizontalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OutBit7jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        OutPanelLayout.setVerticalGroup(
            OutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OutPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(OutBit7jLabel)
                .addGap(19, 19, 19))
        );

        AcPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AcPanel.setPreferredSize(new java.awt.Dimension(200, 60));

        AcBit7jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit7jLabel.setText("00000000");
        AcBit7jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout AcPanelLayout = new javax.swing.GroupLayout(AcPanel);
        AcPanel.setLayout(AcPanelLayout);
        AcPanelLayout.setHorizontalGroup(
            AcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AcPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AcBit7jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );
        AcPanelLayout.setVerticalGroup(
            AcPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(AcBit7jLabel)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel66.setText("PC");

        jLabel67.setText("MAR");

        jLabel68.setText("RAM");

        jLabel69.setText("IR");

        jLabel70.setText("UC");

        jLabel71.setText("AC");

        jLabel72.setText("ALU");

        jLabel73.setText("B");

        jLabel74.setText("OUT");

        jLabel75.setText("RESULTADO");

        label1.setText("Palabra de control");

        jLabel76.setText("BUS");

        clk2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clk2.setText("2");
        clk2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        clk1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clk1.setText("1");
        clk1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        clk5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clk5.setText("5");
        clk5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        clk4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clk4.setText("4");
        clk4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        clk3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clk3.setText("3");
        clk3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel77.setText("CLK");

        label2.setText("Palabra de control");

        BusBit5jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusBit5jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BusBit7jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusBit7jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BusBit6jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusBit6jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BusBit4jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusBit4jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BusBit3jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusBit3jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BusBit2jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusBit2jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BusBit1jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusBit1jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BusBit0jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BusBit0jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BusjLabel.setText("00000000");

        AcPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AcPanel1.setPreferredSize(new java.awt.Dimension(200, 60));

        AcBit7jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit7jLabel1.setText("0");
        AcBit7jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AcBit6jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit6jLabel1.setText("0");
        AcBit6jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AcBit5jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit5jLabel1.setText("0");
        AcBit5jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AcBit4jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit4jLabel1.setText("0");
        AcBit4jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AcBit3jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit3jLabel1.setText("0");
        AcBit3jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AcBit2jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit2jLabel1.setText("0");
        AcBit2jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AcBit1jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit1jLabel1.setText("0");
        AcBit1jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AcBit0jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit0jLabel1.setText("0");
        AcBit0jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel79.setText("CP");

        AcBit0jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit0jLabel2.setText("0");
        AcBit0jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AcBit0jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit0jLabel3.setText("0");
        AcBit0jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AcBit0jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit0jLabel4.setText("0");
        AcBit0jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AcBit0jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcBit0jLabel5.setText("0");
        AcBit0jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel80.setText("EP");

        jLabel81.setText("LM");

        jLabel82.setText("CE");

        jLabel83.setText("LI");

        jLabel84.setText("EI");

        jLabel85.setText("LA");

        jLabel86.setText("EA");

        jLabel87.setText("SU");

        jLabel88.setText("EU");

        jLabel89.setText("LB");

        jLabel90.setText("LO");

        javax.swing.GroupLayout AcPanel1Layout = new javax.swing.GroupLayout(AcPanel1);
        AcPanel1.setLayout(AcPanel1Layout);
        AcPanel1Layout.setHorizontalGroup(
            AcPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AcPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AcPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel86)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel88)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel90))
                    .addGroup(AcPanel1Layout.createSequentialGroup()
                        .addComponent(AcBit7jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcBit6jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcBit5jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcBit4jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcBit3jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcBit2jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcBit1jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcBit0jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcBit0jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcBit0jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcBit0jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcBit0jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AcPanel1Layout.setVerticalGroup(
            AcPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AcPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AcPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80)
                    .addComponent(jLabel81)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83)
                    .addComponent(jLabel84)
                    .addComponent(jLabel85)
                    .addComponent(jLabel86)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88)
                    .addComponent(jLabel89)
                    .addComponent(jLabel90))
                .addGap(1, 1, 1)
                .addGroup(AcPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcBit7jLabel1)
                    .addComponent(AcBit6jLabel1)
                    .addComponent(AcBit5jLabel1)
                    .addComponent(AcBit4jLabel1)
                    .addComponent(AcBit3jLabel1)
                    .addComponent(AcBit2jLabel1)
                    .addComponent(AcBit1jLabel1)
                    .addComponent(AcBit0jLabel1)
                    .addComponent(AcBit0jLabel2)
                    .addComponent(AcBit0jLabel3)
                    .addComponent(AcBit0jLabel4)
                    .addComponent(AcBit0jLabel5))
                .addGap(28, 28, 28))
        );

        BusjLabel1.setText("76543210");

        MarABusJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MarABusJL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PcABusJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PcABusJL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        IrABusJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IrABusJL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        RamABusJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RamABusJL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        OutABusJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OutABusJL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BABusJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BABusJL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AcABusJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcABusJL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AluABusJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AluABusJL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel91.setText("COp");

        AccPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AccPanel.setPreferredSize(new java.awt.Dimension(200, 60));

        AccBit7jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccBit7jLabel.setText("0");
        AccBit7jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AccBit0jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccBit0jLabel.setText("0");
        AccBit0jLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel93.setText("CF");

        jLabel94.setText("ZF");

        javax.swing.GroupLayout AccPanelLayout = new javax.swing.GroupLayout(AccPanel);
        AccPanel.setLayout(AccPanelLayout);
        AccPanelLayout.setHorizontalGroup(
            AccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(AccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccBit7jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94))
                .addGap(39, 39, 39)
                .addGroup(AccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel93)
                    .addComponent(AccBit0jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        AccPanelLayout.setVerticalGroup(
            AccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(AccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jLabel93))
                .addGap(5, 5, 5)
                .addGroup(AccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccBit7jLabel)
                    .addComponent(AccBit0jLabel))
                .addContainerGap())
        );

        jLabel92.setText("FLAGS");

        AcABusJL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AcABusJL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68)
                            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                                        .addComponent(PcPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(3, 3, 3)
                                                        .addComponent(PcABusJL, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(RamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(MarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(MarABusJL, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(RamABusJL, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(5, 5, 5)
                                                .addComponent(BusBit7jLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BusBit6jLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BusBit5jLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BusBit4jLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BusBit3jLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BusBit2jLabel))
                                            .addComponent(jLabel76))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BusBit1jLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BusBit0jLabel))
                                    .addComponent(BusjLabel1)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BusjLabel)))
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(OutABusJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BABusJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AcABusJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AluABusJL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(AcABusJL1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel69))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel91))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IrABusJL, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(clk1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clk2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clk3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clk4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clk5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(199, 199, 199)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel74)
                            .addComponent(jLabel75)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(AccPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel92))
                    .addComponent(AcPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(AcPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel71))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel72)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(clk3)
                                    .addComponent(clk2)
                                    .addComponent(clk1)
                                    .addComponent(clk4)
                                    .addComponent(clk5)))
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel76))
                    .addComponent(AcPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(AcABusJL)
                            .addGap(84, 84, 84)
                            .addComponent(AcABusJL1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AluABusJL)
                            .addGap(73, 73, 73)
                            .addComponent(BABusJL)
                            .addGap(82, 82, 82)
                            .addComponent(OutABusJL)
                            .addGap(114, 114, 114))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addComponent(BusjLabel1)
                                    .addGap(3, 3, 3)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BusBit7jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BusBit5jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BusBit6jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BusBit4jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BusBit3jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BusBit2jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BusBit1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BusBit0jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel71)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(AcPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel73))
                                        .addGap(20, 20, 20)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel74))
                                        .addGap(24, 24, 24)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel75)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel92)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PcPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel66))
                                        .addGap(42, 42, 42)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel67))
                                        .addGap(28, 28, 28)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel68)))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel72)
                                        .addGap(82, 82, 82))))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(PcABusJL)
                                .addGap(103, 103, 103)
                                .addComponent(MarABusJL)
                                .addGap(76, 76, 76)
                                .addComponent(RamABusJL)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel69)
                                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                                .addComponent(IrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel91)
                                                .addGap(2, 2, 2)
                                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel70)))))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(IrABusJL))))
                            .addComponent(AccPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BusjLabel)))
        );

        label1.getAccessibleContext().setAccessibleName("label1");

        btnStop.setText("STOP");
        btnStop.setActionCommand("detenerSimulacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFrame1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReiniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlayPause)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCargar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SlideVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReiniciar)
                        .addComponent(btnPlayPause)
                        .addComponent(btnCargar)
                        .addComponent(btnStop))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SlideVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AcABusJL;
    private javax.swing.JLabel AcABusJL1;
    private javax.swing.JLabel AcBit0jLabel1;
    private javax.swing.JLabel AcBit0jLabel2;
    private javax.swing.JLabel AcBit0jLabel3;
    private javax.swing.JLabel AcBit0jLabel4;
    private javax.swing.JLabel AcBit0jLabel5;
    private javax.swing.JLabel AcBit1jLabel1;
    private javax.swing.JLabel AcBit2jLabel1;
    private javax.swing.JLabel AcBit3jLabel1;
    private javax.swing.JLabel AcBit4jLabel1;
    private javax.swing.JLabel AcBit5jLabel1;
    private javax.swing.JLabel AcBit6jLabel1;
    private javax.swing.JLabel AcBit7jLabel;
    private javax.swing.JLabel AcBit7jLabel1;
    private javax.swing.JPanel AcPanel;
    private javax.swing.JPanel AcPanel1;
    private javax.swing.JLabel AccBit0jLabel;
    private javax.swing.JLabel AccBit7jLabel;
    private javax.swing.JPanel AccPanel;
    private javax.swing.JLabel AluABusJL;
    private javax.swing.JTextPane AluTextPane;
    private javax.swing.JLabel BABusJL;
    private javax.swing.JLabel BBit7jLabel;
    private javax.swing.JPanel BPanel;
    private javax.swing.JLabel BusBit0jLabel;
    private javax.swing.JLabel BusBit1jLabel;
    private javax.swing.JLabel BusBit2jLabel;
    private javax.swing.JLabel BusBit3jLabel;
    private javax.swing.JLabel BusBit4jLabel;
    private javax.swing.JLabel BusBit5jLabel;
    private javax.swing.JLabel BusBit6jLabel;
    private javax.swing.JLabel BusBit7jLabel;
    private javax.swing.JLabel BusjLabel;
    private javax.swing.JLabel BusjLabel1;
    private javax.swing.JLabel IrABusJL;
    private javax.swing.JLabel IrBit7jLabel;
    private javax.swing.JPanel IrPanel;
    private javax.swing.JLabel MarABusJL;
    private javax.swing.JLabel MarBit3jLabel;
    private javax.swing.JPanel MarPanel;
    private javax.swing.JLabel OutABusJL;
    private javax.swing.JLabel OutBit7jLabel;
    private javax.swing.JPanel OutPanel;
    private javax.swing.JLabel PcABusJL;
    private javax.swing.JLabel PcBit3jLabel;
    private javax.swing.JPanel PcPanel;
    private javax.swing.JLabel RamABusJL;
    private javax.swing.JLabel RamBit7jLabel;
    private javax.swing.JPanel RamPanel;
    private javax.swing.JTextPane ResultadoTextPane;
    private javax.swing.JSlider SlideVelocidad;
    private javax.swing.JTextPane UcTextPane;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnPlayPause;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel clk1;
    private javax.swing.JLabel clk2;
    private javax.swing.JLabel clk3;
    private javax.swing.JLabel clk4;
    private javax.swing.JLabel clk5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables

}
