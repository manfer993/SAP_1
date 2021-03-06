package SAP_1_SIMPLE_COMPUTER_PRESENTATION;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class View_load_program extends javax.swing.JFrame {

    private Model myModel;
    private ControllerViewLoadProgram myControl;
    private int indexOfMemory;

    public View_load_program(Model aThis) {
        myModel = aThis;
        initComponents();
        interno_f.setVisible(false);
        capture_events();
    }

    public ControllerViewLoadProgram getControl() {
        if (myControl == null) {
            myControl = new ControllerViewLoadProgram(this);
        }
        return myControl;
    }

    public Model getModel() {
        return myModel;
    }

    public int getIndexOfMemory() {
        return indexOfMemory;
    }
    
    public void saveMemory(){
        this.dispose();
    }
    
    public void loadInst(){
        this.interno_f.setVisible(false);        
    }
    
    public void loadData(){
        this.interno_f.setVisible(false);
    }

    public JComboBox<String> getInstruccionComboBox() {
        return InstruccionComboBox;
    }

    public JTextField getTextfieldDato() {
        return textfieldDato;
    }

    public JTextField getPosicionRamTextField() {
        return PosicionRamTextField;
    }

    public void capture_events() {
        CargarDatoBtn.addActionListener(getControl());
        ProgramaDefectoBtn.addActionListener(getControl());
        BorrarProgramaBtn.addActionListener(getControl());
        CargarInstBtn.addActionListener(getControl());
        CargarDatoBtn.addActionListener(getControl());
        GuardarProgramaBtn.addActionListener(getControl());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        M0 = new javax.swing.JButton();
        M1 = new javax.swing.JButton();
        M2 = new javax.swing.JButton();
        M3 = new javax.swing.JButton();
        M4 = new javax.swing.JButton();
        M5 = new javax.swing.JButton();
        M6 = new javax.swing.JButton();
        M7 = new javax.swing.JButton();
        M8 = new javax.swing.JButton();
        M9 = new javax.swing.JButton();
        M10 = new javax.swing.JButton();
        M11 = new javax.swing.JButton();
        M12 = new javax.swing.JButton();
        M13 = new javax.swing.JButton();
        M14 = new javax.swing.JButton();
        M15 = new javax.swing.JButton();
        pos1 = new javax.swing.JLabel();
        pos2 = new javax.swing.JLabel();
        pos3 = new javax.swing.JLabel();
        pos4 = new javax.swing.JLabel();
        pos5 = new javax.swing.JLabel();
        pos6 = new javax.swing.JLabel();
        pos7 = new javax.swing.JLabel();
        pos9 = new javax.swing.JLabel();
        pos10 = new javax.swing.JLabel();
        pos11 = new javax.swing.JLabel();
        pos12 = new javax.swing.JLabel();
        pos13 = new javax.swing.JLabel();
        pos14 = new javax.swing.JLabel();
        pos15 = new javax.swing.JLabel();
        BorrarProgramaBtn = new javax.swing.JButton();
        GuardarProgramaBtn = new javax.swing.JButton();
        ProgramaDefectoBtn = new javax.swing.JButton();
        interno_f = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResumenDatoInstruccionTextPane = new javax.swing.JTextPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        InstruccionPanel = new javax.swing.JPanel();
        InstruccionComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PosicionRamTextField = new javax.swing.JTextField();
        CargarInstBtn = new javax.swing.JButton();
        CancelarInstBtn = new javax.swing.JButton();
        DatoPanel = new javax.swing.JPanel();
        textfieldDato = new javax.swing.JTextField();
        CargarDatoBtn = new javax.swing.JButton();
        CancelarDatoBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pos8 = new javax.swing.JLabel();
        pos0 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        M0.setText("0");
        M0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M0ActionPerformed(evt);
            }
        });

        M1.setText("1");
        M1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M1ActionPerformed(evt);
            }
        });

        M2.setText("2");
        M2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M2ActionPerformed(evt);
            }
        });

        M3.setText("3");
        M3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M3ActionPerformed(evt);
            }
        });

        M4.setText("4");
        M4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M4ActionPerformed(evt);
            }
        });

        M5.setText("5");
        M5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M5ActionPerformed(evt);
            }
        });

        M6.setText("6");
        M6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M6ActionPerformed(evt);
            }
        });

        M7.setText("7");
        M7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M7ActionPerformed(evt);
            }
        });

        M8.setText("8");
        M8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M8ActionPerformed(evt);
            }
        });

        M9.setText("9");
        M9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M9ActionPerformed(evt);
            }
        });

        M10.setText("10");
        M10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M10ActionPerformed(evt);
            }
        });

        M11.setText("11");
        M11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M11ActionPerformed(evt);
            }
        });

        M12.setText("12");
        M12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M12ActionPerformed(evt);
            }
        });

        M13.setText("13");
        M13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M13ActionPerformed(evt);
            }
        });

        M14.setText("14");
        M14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M14ActionPerformed(evt);
            }
        });

        M15.setText("15");
        M15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M15ActionPerformed(evt);
            }
        });

        pos1.setBackground(new java.awt.Color(255, 255, 0));
        pos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos1.setText("00000000");
        pos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos2.setText("00000000");
        pos2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos3.setText("00000000");
        pos3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos4.setText("00000000");
        pos4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos5.setText("00000000");
        pos5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos6.setText("00000000");
        pos6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos7.setText("00000000");
        pos7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos9.setText("00000000");
        pos9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos10.setText("00000000");
        pos10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos11.setText("00000000");
        pos11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos12.setText("00000000");
        pos12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos13.setText("00000000");
        pos13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos14.setText("00000000");
        pos14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos15.setText("00000000");
        pos15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BorrarProgramaBtn.setText("Limpiar Memoria");
        BorrarProgramaBtn.setActionCommand("eraseMemory");

        GuardarProgramaBtn.setActionCommand("saveMemory");
        GuardarProgramaBtn.setLabel("Guardar Memoria");
        GuardarProgramaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarProgramaBtnActionPerformed(evt);
            }
        });

        ProgramaDefectoBtn.setText("Cargar Programa Estandar");
        ProgramaDefectoBtn.setActionCommand("loadProgramDefault");

        interno_f.setVisible(true);

        ResumenDatoInstruccionTextPane.setEnabled(false);
        jScrollPane1.setViewportView(ResumenDatoInstruccionTextPane);

        InstruccionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOP", "LDA", "ADD", "SUB", "STA", "LDI", "JMP", "JC", "JZ", "OUT", "HLT" }));

        jLabel1.setText("Ingrese la posicion de memoria");

        jLabel2.setText("Seleccione Instrucci??n");

        PosicionRamTextField.setText("0");
        PosicionRamTextField.setToolTipText("");
        PosicionRamTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosicionRamTextFieldActionPerformed(evt);
            }
        });
        PosicionRamTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PosicionRamTextFieldKeyTyped(evt);
            }
        });

        CargarInstBtn.setText("Cargar");
        CargarInstBtn.setActionCommand("cargarInst");
        CargarInstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarInstBtnActionPerformed(evt);
            }
        });

        CancelarInstBtn.setText("Cancelar");
        CancelarInstBtn.setActionCommand("cancelarInst");
        CancelarInstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarInstBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InstruccionPanelLayout = new javax.swing.GroupLayout(InstruccionPanel);
        InstruccionPanel.setLayout(InstruccionPanelLayout);
        InstruccionPanelLayout.setHorizontalGroup(
            InstruccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstruccionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InstruccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InstruccionPanelLayout.createSequentialGroup()
                        .addComponent(CancelarInstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(CargarInstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InstruccionPanelLayout.createSequentialGroup()
                        .addGroup(InstruccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(InstruccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PosicionRamTextField)
                            .addComponent(InstruccionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        InstruccionPanelLayout.setVerticalGroup(
            InstruccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstruccionPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(InstruccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InstruccionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InstruccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PosicionRamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(InstruccionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CargarInstBtn)
                    .addComponent(CancelarInstBtn))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        CargarInstBtn.getAccessibleContext().setAccessibleName("Aceptar");

        jTabbedPane1.addTab("      Instrucci??n      ", null, InstruccionPanel, "");

        textfieldDato.setText("0");
        textfieldDato.setToolTipText("");
        textfieldDato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textfieldDatoKeyTyped(evt);
            }
        });

        CargarDatoBtn.setText("Cargar");
        CargarDatoBtn.setActionCommand("cargarDato");

        CancelarDatoBtn.setText("Cancelar");
        CancelarDatoBtn.setActionCommand("cancelarDato");
        CancelarDatoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarDatoBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese el dato n??merico");

        javax.swing.GroupLayout DatoPanelLayout = new javax.swing.GroupLayout(DatoPanel);
        DatoPanel.setLayout(DatoPanelLayout);
        DatoPanelLayout.setHorizontalGroup(
            DatoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatoPanelLayout.createSequentialGroup()
                        .addComponent(CancelarDatoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CargarDatoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(textfieldDato, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        DatoPanelLayout.setVerticalGroup(
            DatoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatoPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(DatoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(DatoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CargarDatoBtn)
                    .addComponent(CancelarDatoBtn))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("           Dato           ", DatoPanel);

        javax.swing.GroupLayout interno_fLayout = new javax.swing.GroupLayout(interno_f.getContentPane());
        interno_f.getContentPane().setLayout(interno_fLayout);
        interno_fLayout.setHorizontalGroup(
            interno_fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jTabbedPane1)
        );
        interno_fLayout.setVerticalGroup(
            interno_fLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interno_fLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Informacion");

        pos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos8.setText("00000000");
        pos8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pos0.setBackground(new java.awt.Color(255, 255, 0));
        pos0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pos0.setText("00000000");
        pos0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(M15)
                                .addComponent(M14))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pos14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pos15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(M10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(M11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(M12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(M13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(M9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pos9, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(pos10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pos11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pos12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pos13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(M0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(M1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(M2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(M3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(M4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(M5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(M6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(M7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(M8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pos2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pos3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pos4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pos5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pos6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pos7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pos0, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pos1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pos8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BorrarProgramaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarProgramaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ProgramaDefectoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interno_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(interno_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProgramaDefectoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BorrarProgramaBtn)
                            .addComponent(GuardarProgramaBtn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M0)
                            .addComponent(pos0, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M2)
                            .addComponent(pos2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M3)
                            .addComponent(pos3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M4)
                            .addComponent(pos4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M5)
                            .addComponent(pos5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M6)
                            .addComponent(pos6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M7)
                            .addComponent(pos7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M8)
                            .addComponent(pos8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M9)
                            .addComponent(pos9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M10)
                            .addComponent(pos10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(M11)
                            .addComponent(pos11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pos12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pos13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pos14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pos15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M15))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void M0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M0ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 0 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 0;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M0ActionPerformed

    private void GuardarProgramaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarProgramaBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_GuardarProgramaBtnActionPerformed

    private void PosicionRamTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosicionRamTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PosicionRamTextFieldActionPerformed

    private void CancelarInstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarInstBtnActionPerformed
        this.interno_f.setVisible(false);
    }//GEN-LAST:event_CancelarInstBtnActionPerformed

    private void CancelarDatoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarDatoBtnActionPerformed
        this.interno_f.setVisible(false);
    }//GEN-LAST:event_CancelarDatoBtnActionPerformed

    private void textfieldDatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldDatoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(DatoPanel, "Ingresar solo un n??mero entre 0 y 255");
        }
    }//GEN-LAST:event_textfieldDatoKeyTyped

    private void PosicionRamTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PosicionRamTextFieldKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            evt.consume();
            JOptionPane.showMessageDialog(InstruccionPanel, "Ingresar la posicion de memoria entre 0 y 15");
        }
    }//GEN-LAST:event_PosicionRamTextFieldKeyTyped

    private void M1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M1ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 1 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 1;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M1ActionPerformed

    private void M2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M2ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 2 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 2;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M2ActionPerformed

    private void M3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M3ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 3 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 3;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M3ActionPerformed

    private void M4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M4ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 4 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 4;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M4ActionPerformed

    private void M5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M5ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 5 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 5;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M5ActionPerformed

    private void M6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M6ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 6 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 6;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M6ActionPerformed

    private void M7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M7ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 7 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 7;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M7ActionPerformed

    private void M8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M8ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 8 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 8;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M8ActionPerformed

    private void M9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M9ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 9 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 9;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M9ActionPerformed

    private void M10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M10ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 10 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 10;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M10ActionPerformed

    private void M11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M11ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 11 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 11;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M11ActionPerformed

    private void M12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M12ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 12 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 12;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M12ActionPerformed

    private void M13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M13ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 13 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 13;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M13ActionPerformed

    private void M14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M14ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 14 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 14;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M14ActionPerformed

    private void M15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M15ActionPerformed
        this.ResumenDatoInstruccionTextPane.setText("Direcci??n de memoria seleccionada: 15 \nInstrucci??n: LDA 0 \nPara modificar esta direcci??n de memoria,\n pulsa el boton correespondiente.");
        this.indexOfMemory = 15;
        this.interno_f.setVisible(true);
    }//GEN-LAST:event_M15ActionPerformed

    private void CargarInstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarInstBtnActionPerformed

    }//GEN-LAST:event_CargarInstBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarProgramaBtn;
    private javax.swing.JButton CancelarDatoBtn;
    private javax.swing.JButton CancelarInstBtn;
    private javax.swing.JButton CargarDatoBtn;
    private javax.swing.JButton CargarInstBtn;
    private javax.swing.JPanel DatoPanel;
    private javax.swing.JButton GuardarProgramaBtn;
    private javax.swing.JComboBox<String> InstruccionComboBox;
    private javax.swing.JPanel InstruccionPanel;
    private javax.swing.JButton M0;
    private javax.swing.JButton M1;
    private javax.swing.JButton M10;
    private javax.swing.JButton M11;
    private javax.swing.JButton M12;
    private javax.swing.JButton M13;
    private javax.swing.JButton M14;
    private javax.swing.JButton M15;
    private javax.swing.JButton M2;
    private javax.swing.JButton M3;
    private javax.swing.JButton M4;
    private javax.swing.JButton M5;
    private javax.swing.JButton M6;
    private javax.swing.JButton M7;
    private javax.swing.JButton M8;
    private javax.swing.JButton M9;
    private javax.swing.JTextField PosicionRamTextField;
    private javax.swing.JButton ProgramaDefectoBtn;
    private javax.swing.JTextPane ResumenDatoInstruccionTextPane;
    private javax.swing.JInternalFrame interno_f;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JLabel pos0;
    public javax.swing.JLabel pos1;
    private javax.swing.JLabel pos10;
    private javax.swing.JLabel pos11;
    private javax.swing.JLabel pos12;
    private javax.swing.JLabel pos13;
    private javax.swing.JLabel pos14;
    private javax.swing.JLabel pos15;
    private javax.swing.JLabel pos2;
    private javax.swing.JLabel pos3;
    private javax.swing.JLabel pos4;
    private javax.swing.JLabel pos5;
    private javax.swing.JLabel pos6;
    private javax.swing.JLabel pos7;
    private javax.swing.JLabel pos8;
    private javax.swing.JLabel pos9;
    private javax.swing.JTextField textfieldDato;
    // End of variables declaration//GEN-END:variables

    void paintMemErase() {
        pos0.setText("00000000");
        pos0.setBackground(Color.yellow);
        pos0.setForeground(Color.black);
        
        pos1.setText("00000000");
        pos1.setBackground(Color.yellow);
        pos1.setForeground(Color.black);
        
        pos2.setText("00000000");
        pos2.setBackground(Color.yellow);
        pos2.setForeground(Color.black);
        
        pos3.setText("00000000");
        pos3.setBackground(Color.yellow);
        pos3.setForeground(Color.black);
        
        pos4.setText("00000000");
        pos4.setBackground(Color.yellow);
        pos4.setForeground(Color.black);
        
        pos5.setText("00000000");
        pos5.setBackground(Color.yellow);
        pos5.setForeground(Color.black);
        
        pos6.setText("00000000");
        pos6.setBackground(Color.yellow);
        pos6.setForeground(Color.black);
        
        pos7.setText("00000000");
        pos7.setBackground(Color.yellow);
        pos7.setForeground(Color.black);
        
        pos8.setText("00000000");
        pos8.setBackground(Color.yellow);
        pos8.setForeground(Color.black);
        
        pos9.setText("00000000");
        pos9.setBackground(Color.yellow);
        pos9.setForeground(Color.black);
        
        pos10.setText("00000000");
        pos10.setBackground(Color.yellow);
        pos10.setForeground(Color.black);
        
        pos11.setText("00000000");
        pos11.setBackground(Color.yellow);
        pos11.setForeground(Color.black);
        
        pos12.setText("00000000");
        pos12.setBackground(Color.yellow);
        pos12.setForeground(Color.black);
        
        pos13.setText("00000000");
        pos13.setBackground(Color.yellow);
        pos13.setForeground(Color.black);
        
        pos14.setText("00000000");
        pos14.setBackground(Color.yellow);
        pos14.setForeground(Color.black);
        
        pos15.setText("00000000");
        pos15.setBackground(Color.yellow);
        pos15.setForeground(Color.black);

    }
    
    void paintMem(int i, String binaryRepresentation) {
        switch (i) {
            case 0:
                pos0.setText(binaryRepresentation);
                pos0.setBackground(Color.yellow);
                pos0.setForeground(Color.red);
                break;
            case 1:
                pos1.setText(binaryRepresentation);
                pos1.setBackground(Color.yellow);
                pos1.setForeground(Color.red);
                break;
            case 2:
                pos2.setText(binaryRepresentation);
                pos2.setBackground(Color.yellow);
                pos2.setForeground(Color.red);
                break;
            case 3:
                pos3.setText(binaryRepresentation);
                pos3.setBackground(Color.yellow);
                pos3.setForeground(Color.red);
                break;
            case 4:
                pos4.setText(binaryRepresentation);
                pos4.setBackground(Color.yellow);
                pos4.setForeground(Color.red);
                break;
            case 5:
                pos5.setText(binaryRepresentation);
                pos5.setBackground(Color.yellow);
                pos5.setForeground(Color.red);
                break;
            case 6:
                pos6.setText(binaryRepresentation);
                pos6.setBackground(Color.yellow);
                pos6.setForeground(Color.red);
                break;
            case 7:
                pos7.setText(binaryRepresentation);
                pos7.setBackground(Color.yellow);
                pos7.setForeground(Color.red);
                break;
            case 8:
                pos8.setText(binaryRepresentation);
                pos8.setBackground(Color.yellow);
                pos8.setForeground(Color.red);
                break;
            case 9:
                pos9.setText(binaryRepresentation);
                pos9.setBackground(Color.yellow);
                pos9.setForeground(Color.red);
                break;
            case 10:
                pos10.setText(binaryRepresentation);
                pos10.setBackground(Color.yellow);
                pos10.setForeground(Color.red);
                break;
            case 11:
                pos11.setText(binaryRepresentation);
                pos11.setBackground(Color.yellow);
                pos11.setForeground(Color.red);
                break;
            case 12:
                pos12.setText(binaryRepresentation);
                pos12.setBackground(Color.yellow);
                pos12.setForeground(Color.red);
                break;
            case 13:
                pos13.setText(binaryRepresentation);
                pos13.setBackground(Color.yellow);
                pos13.setForeground(Color.red);
                break;
            case 14:
                pos14.setText(binaryRepresentation);
                pos14.setBackground(Color.yellow);
                pos14.setForeground(Color.red);
                break;
            case 15:
                pos15.setText(binaryRepresentation);
                pos15.setBackground(Color.yellow);
                pos15.setForeground(Color.red);
                break;
            default:
                System.out.println("Error out of memory range ");
                break;
        }
    }
}
