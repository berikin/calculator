/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import operations.*;

/**
 *
 * @author berik
 */
public class AquaCalculator extends javax.swing.JFrame {
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="ATRIBUTOS DE CLASE">

    private int keyID;
    private int decimalCounter = 8;
    private String showNumber = "";
    private String txAHistoryStr = "";
    private OperationType operation = OperationType.NONE;
    private OperationType subOperation = OperationType.NONE;
    private double operateOne = Double.MAX_VALUE;
    private double operateTwo = Double.MAX_VALUE;
    private double result = Double.MAX_VALUE;
    private double memory = Double.MAX_VALUE;
    // </editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * Creates new form BasicCalculator
     */
    public AquaCalculator() {
        initComponents();
        if (javax.swing.UIManager.getLookAndFeel().getName().startsWith("Quaqua") || javax.swing.UIManager.getLookAndFeel().getName().startsWith("Windows") || javax.swing.UIManager.getLookAndFeel().getName().startsWith("Mac")) {
            setAquaColors();
        } else if (javax.swing.UIManager.getLookAndFeel().getName().startsWith("Metal")) {
            setMetalStyle();
            getContentPane().setBackground(new java.awt.Color(51, 51, 51));
        } else {
            setStyle();
            getContentPane().setBackground(new java.awt.Color(64, 40, 89)); //COLOR DE FONDO DEL JFRAME
        }
        if (!System.getProperty("os.name").equals("Mac OS X")) {
            jMenuItemAqua.setForeground(new java.awt.Color(204, 204, 204));
            jMenuItemAqua.setEnabled(false);
            jMenuItemAqua.setToolTipText("Deshabilitado en entornos " + System.getProperty("os.name"));
            jMenuItemAquaSnow.setForeground(new java.awt.Color(204, 204, 204));
            jMenuItemAquaSnow.setEnabled(false);
            jMenuItemAquaSnow.setToolTipText("Deshabilitado en entornos " + System.getProperty("os.name"));
        }
        if (!System.getProperty("os.name").equals("Windows")) {
            jMenuItemWindows.setForeground(new java.awt.Color(204, 204, 204));
            jMenuItemWindows.setEnabled(false);
            jMenuItemWindows.setToolTipText("Deshabilitado en entornos " + System.getProperty("os.name"));
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        // <editor-fold defaultstate="collapsed" desc="BOTONES DE PRECISIÓN DECIMAL AGRUPADOS">
        precisionDecimalsGroup.add(jRadioButtonNoDecimals);
        precisionDecimalsGroup.add(jRadioButtonOneDecimal);
        precisionDecimalsGroup.add(jRadioButtonTwoDecimals);
        precisionDecimalsGroup.add(jRadioButtonThreeDecimals);
        precisionDecimalsGroup.add(jRadioButtonFourDecimals);
        precisionDecimalsGroup.add(jRadioButtonFiveDecimals);
        precisionDecimalsGroup.add(jRadioButtonSixDecimals);
        precisionDecimalsGroup.add(jRadioButtonSevenDecimals);
        precisionDecimalsGroup.add(jRadioButtonEightDecimals);
        // </editor-fold>
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        // <editor-fold defaultstate="collapsed" desc="FORZADO DE FOCO AL JFRAME">
        TxfKMH.setFocusable(false);
        TxfMPH.setFocusable(false);
        TxfKnot.setFocusable(false);
        TxfCDegrees.setFocusable(false);
        TxfFDegrees.setFocusable(false);
        TxfKDegrees.setFocusable(false);
        this.requestFocus();
        // </editor-fold>
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        precisionDecimalsGroup = new javax.swing.ButtonGroup();
        aboutDialog = new javax.swing.JFrame();
        jPanelAbout = new javax.swing.JPanel();
        jLabelImage = new javax.swing.JLabel();
        jLabelCalculator = new javax.swing.JLabel();
        jScrollInfo = new javax.swing.JScrollPane();
        jTextAreaInfo = new javax.swing.JTextArea();
        jButtonTwo = new javax.swing.JButton();
        jButtonOne = new javax.swing.JButton();
        jButtonComma = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButtonSix = new javax.swing.JButton();
        jButtonFour = new javax.swing.JButton();
        jButtonFive = new javax.swing.JButton();
        jButtonNine = new javax.swing.JButton();
        jButtonSeven = new javax.swing.JButton();
        jButtonEight = new javax.swing.JButton();
        jButtonTrhee = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonMultiply = new javax.swing.JButton();
        jButtonLess = new javax.swing.JButton();
        jButtonReciproc = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jButtonClearEnd = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        TxfLive = new javax.swing.JTextField();
        jScrollHistory = new javax.swing.JScrollPane();
        TxAHistory = new javax.swing.JTextArea();
        TxfScreen = new javax.swing.JTextField();
        jButtonClearHistory = new javax.swing.JButton();
        jButtonChangeSign = new javax.swing.JButton();
        jToggleConverters = new javax.swing.JToggleButton();
        jTabbedPaneConversors = new javax.swing.JTabbedPane();
        jPanelDegrees = new javax.swing.JPanel();
        TxfCDegrees = new javax.swing.JTextField();
        TxfFDegrees = new javax.swing.JTextField();
        TxfKDegrees = new javax.swing.JTextField();
        jLabelCelsius = new javax.swing.JLabel();
        jLabelFarenheit = new javax.swing.JLabel();
        jLabelKelvin = new javax.swing.JLabel();
        jPanelDistances = new javax.swing.JPanel();
        TxfKMH = new javax.swing.JTextField();
        TxfMPH = new javax.swing.JTextField();
        TxfKnot = new javax.swing.JTextField();
        jLabelKMH = new javax.swing.JLabel();
        jLabelMPH = new javax.swing.JLabel();
        jLabelKN = new javax.swing.JLabel();
        jButtonMemorySave = new javax.swing.JButton();
        jButtonMemoryClear = new javax.swing.JButton();
        jButtonMemoryLess = new javax.swing.JButton();
        jButtonMemoryAdd = new javax.swing.JButton();
        jButtonRecoverMemory = new javax.swing.JButton();
        TxfMemory = new javax.swing.JTextField();
        jButtonSQRT = new javax.swing.JButton();
        jButtonPercent = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuEdit = new javax.swing.JMenu();
        jMenuCopy = new javax.swing.JMenuItem();
        jMenuPaste = new javax.swing.JMenuItem();
        jMenuPrecision = new javax.swing.JMenu();
        jRadioButtonNoDecimals = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonOneDecimal = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonTwoDecimals = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonThreeDecimals = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonFourDecimals = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonFiveDecimals = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonSixDecimals = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonSevenDecimals = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonEightDecimals = new javax.swing.JRadioButtonMenuItem();
        jMenuCalculator = new javax.swing.JMenu();
        jMenuAbout = new javax.swing.JMenuItem();
        jMenuAppereance = new javax.swing.JMenu();
        jMenuItemAqua = new javax.swing.JMenuItem();
        jMenuItemAquaPanther = new javax.swing.JMenuItem();
        jMenuItemAquaSnow = new javax.swing.JMenuItem();
        jMenuItemMetal = new javax.swing.JMenuItem();
        jMenuItemNimbus = new javax.swing.JMenuItem();
        jMenuItemWindows = new javax.swing.JMenuItem();

        aboutDialog.setTitle("Acerca de");
        aboutDialog.setAlwaysOnTop(true);
        aboutDialog.setBackground(new java.awt.Color(204, 204, 255));
        aboutDialog.setResizable(false);
        aboutDialog.setLocationRelativeTo(null);
        aboutDialog.setSize(new java.awt.Dimension(419, 423));

        jPanelAbout.setBackground(new java.awt.Color(204, 204, 255));

        jLabelImage.setBackground(new java.awt.Color(204, 204, 255));
        jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/about.png"))); // NOI18N

        jLabelCalculator.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabelCalculator.setForeground(new java.awt.Color(106, 68, 138));
        jLabelCalculator.setText("Calculadora Java 1.0");

        jTextAreaInfo.setEditable(false);
        jTextAreaInfo.setBackground(new java.awt.Color(204, 204, 255));
        jTextAreaInfo.setColumns(20);
        jTextAreaInfo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jTextAreaInfo.setForeground(new java.awt.Color(106, 68, 138));
        jTextAreaInfo.setRows(3);
        jTextAreaInfo.setText("Diseñada por José Antonio Yáñez Jiménez\nDesarrollo de Aplicaciones Web, IES Galileo\nMarzo de 2013");
        jTextAreaInfo.setAutoscrolls(false);
        jTextAreaInfo.setBorder(null);
        jTextAreaInfo.setCaretColor(new java.awt.Color(204, 204, 255));
        jTextAreaInfo.setDragEnabled(false);
        jTextAreaInfo.setFocusTraversalKeysEnabled(false);
        jTextAreaInfo.setFocusable(false);
        jScrollInfo.setViewportView(jTextAreaInfo);

        org.jdesktop.layout.GroupLayout jPanelAboutLayout = new org.jdesktop.layout.GroupLayout(jPanelAbout);
        jPanelAbout.setLayout(jPanelAboutLayout);
        jPanelAboutLayout.setHorizontalGroup(
            jPanelAboutLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelAboutLayout.createSequentialGroup()
                .add(jPanelAboutLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelAboutLayout.createSequentialGroup()
                        .add(16, 16, 16)
                        .add(jScrollInfo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 385, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanelAboutLayout.createSequentialGroup()
                        .add(77, 77, 77)
                        .add(jLabelImage)))
                .addContainerGap(18, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelAboutLayout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jLabelCalculator)
                .add(32, 32, 32))
        );
        jPanelAboutLayout.setVerticalGroup(
            jPanelAboutLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelAboutLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabelImage)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabelCalculator, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollInfo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 69, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(51, 51, 51))
        );

        org.jdesktop.layout.GroupLayout aboutDialogLayout = new org.jdesktop.layout.GroupLayout(aboutDialog.getContentPane());
        aboutDialog.getContentPane().setLayout(aboutDialogLayout);
        aboutDialogLayout.setHorizontalGroup(
            aboutDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelAbout, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        aboutDialogLayout.setVerticalGroup(
            aboutDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelAbout, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(153, 51, 255));
        setPreferredSize(new java.awt.Dimension(510, 530));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AquaCalculator.this.keyPressed(evt);
            }
        });

        jButtonTwo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonTwo.setText("2");
        jButtonTwo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTwo.setFocusable(false);
        jButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberClick(evt);
            }
        });

        jButtonOne.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonOne.setText("1");
        jButtonOne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOne.setFocusable(false);
        jButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberClick(evt);
            }
        });

        jButtonComma.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jButtonComma.setText(",");
        jButtonComma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonComma.setFocusable(false);
        jButtonComma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCommaActionPerformed(evt);
            }
        });

        jButtonZero.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonZero.setText("0");
        jButtonZero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonZero.setFocusable(false);
        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberClick(evt);
            }
        });

        jButtonSix.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonSix.setText("6");
        jButtonSix.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSix.setFocusable(false);
        jButtonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberClick(evt);
            }
        });

        jButtonFour.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonFour.setText("4");
        jButtonFour.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFour.setFocusable(false);
        jButtonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberClick(evt);
            }
        });

        jButtonFive.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonFive.setText("5");
        jButtonFive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFive.setFocusable(false);
        jButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberClick(evt);
            }
        });

        jButtonNine.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonNine.setText("9");
        jButtonNine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNine.setFocusable(false);
        jButtonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberClick(evt);
            }
        });

        jButtonSeven.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonSeven.setText("7");
        jButtonSeven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSeven.setFocusable(false);
        jButtonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberClick(evt);
            }
        });

        jButtonEight.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonEight.setText("8");
        jButtonEight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEight.setFocusable(false);
        jButtonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberClick(evt);
            }
        });

        jButtonTrhee.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonTrhee.setText("3");
        jButtonTrhee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTrhee.setFocusable(false);
        jButtonTrhee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberClick(evt);
            }
        });

        jButtonPlus.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonPlus.setText("+");
        jButtonPlus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPlus.setFocusable(false);
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestOperation(evt);
            }
        });

        jButtonDivide.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonDivide.setText("/");
        jButtonDivide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDivide.setFocusable(false);
        jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestOperation(evt);
            }
        });

        jButtonMultiply.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonMultiply.setText("*");
        jButtonMultiply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMultiply.setFocusable(false);
        jButtonMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestOperation(evt);
            }
        });

        jButtonLess.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonLess.setText("-");
        jButtonLess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLess.setFocusable(false);
        jButtonLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestOperation(evt);
            }
        });

        jButtonReciproc.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jButtonReciproc.setText("↺");
        jButtonReciproc.setToolTipText("Número inverso (1/número)");
        jButtonReciproc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonReciproc.setFocusable(false);
        jButtonReciproc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciproc(evt);
            }
        });

        jButtonEquals.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButtonEquals.setText("=");
        jButtonEquals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEquals.setFocusable(false);
        jButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualsActionPerformed(evt);
            }
        });

        jButtonClearEnd.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jButtonClearEnd.setText("CE");
        jButtonClearEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClearEnd.setFocusable(false);
        jButtonClearEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearEndActionPerformed(evt);
            }
        });

        jButtonBack.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jButtonBack.setText("←");
        jButtonBack.setToolTipText("");
        jButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBack.setFocusable(false);
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonClear.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jButtonClear.setText("C");
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClear.setFocusable(false);
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        TxfLive.setEditable(false);
        TxfLive.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        TxfLive.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxfLive.setToolTipText("Historial de operación actual");
        TxfLive.setDisabledTextColor(new java.awt.Color(102, 0, 153));
        TxfLive.setFocusTraversalKeysEnabled(false);
        TxfLive.setFocusable(false);
        TxfLive.setSelectionColor(new java.awt.Color(102, 0, 153));

        jScrollHistory.setFocusable(false);

        TxAHistory.setEditable(false);
        TxAHistory.setColumns(20);
        TxAHistory.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        TxAHistory.setRows(4);
        TxAHistory.setToolTipText("Historial de operaciones");
        TxAHistory.setFocusTraversalKeysEnabled(false);
        TxAHistory.setFocusable(false);
        jScrollHistory.setViewportView(TxAHistory);

        TxfScreen.setEditable(false);
        TxfScreen.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TxfScreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxfScreen.setText("0");
        TxfScreen.setToolTipText("Interfaz de operaciones");
        TxfScreen.setFocusTraversalKeysEnabled(false);
        TxfScreen.setFocusable(false);

        jButtonClearHistory.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButtonClearHistory.setText("C");
        jButtonClearHistory.setToolTipText("Borrar historial");
        jButtonClearHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClearHistory.setFocusable(false);
        jButtonClearHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearHistoryActionPerformed(evt);
            }
        });

        jButtonChangeSign.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jButtonChangeSign.setText("+/-");
        jButtonChangeSign.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonChangeSign.setFocusable(false);
        jButtonChangeSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeSignActionPerformed(evt);
            }
        });

        jToggleConverters.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jToggleConverters.setText("Conversores");
        jToggleConverters.setToolTipText("El cálculo combinado espera a que se presione el botón de resultado para evaluar una operación compleja combinando varias operaciones simples");
        jToggleConverters.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleConverters.setFocusable(false);
        jToggleConverters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleConvertersActionPerformed(evt);
            }
        });

        jTabbedPaneConversors.setEnabled(false);
        jTabbedPaneConversors.setFocusable(false);
        jTabbedPaneConversors.setRequestFocusEnabled(false);
        jTabbedPaneConversors.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelListener(evt);
            }
        });

        jPanelDegrees.setFocusable(false);
        jPanelDegrees.setName("Degrees");

        TxfCDegrees.setEditable(false);
        TxfCDegrees.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TxfCDegrees.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxfCDegrees.setText("0");
        TxfCDegrees.setFocusTraversalKeysEnabled(false);
        TxfCDegrees.setFocusable(false);
        TxfCDegrees.setName("CDegrees");
        TxfCDegrees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AquaCalculator.this.keyPressed(evt);
            }
        });

        TxfFDegrees.setEditable(false);
        TxfFDegrees.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TxfFDegrees.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxfFDegrees.setText("32");
        TxfFDegrees.setFocusTraversalKeysEnabled(false);
        TxfFDegrees.setFocusable(false);
        TxfFDegrees.setName("FDegrees");
        TxfFDegrees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AquaCalculator.this.keyPressed(evt);
            }
        });

        TxfKDegrees.setEditable(false);
        TxfKDegrees.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TxfKDegrees.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxfKDegrees.setText("273,15");
        TxfKDegrees.setFocusTraversalKeysEnabled(false);
        TxfKDegrees.setFocusable(false);
        TxfKDegrees.setName("KDegrees");
        TxfKDegrees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AquaCalculator.this.keyPressed(evt);
            }
        });

        jLabelCelsius.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelCelsius.setText("Grados Centígrados");

        jLabelFarenheit.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelFarenheit.setText("Grados Farenheit");

        jLabelKelvin.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelKelvin.setText("Grados Kelvin");

        org.jdesktop.layout.GroupLayout jPanelDegreesLayout = new org.jdesktop.layout.GroupLayout(jPanelDegrees);
        jPanelDegrees.setLayout(jPanelDegreesLayout);
        jPanelDegreesLayout.setHorizontalGroup(
            jPanelDegreesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelDegreesLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelDegreesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(TxfFDegrees, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, TxfCDegrees)
                    .add(jLabelCelsius, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabelFarenheit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(TxfKDegrees, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .add(jLabelKelvin, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelDegreesLayout.setVerticalGroup(
            jPanelDegreesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelDegreesLayout.createSequentialGroup()
                .add(44, 44, 44)
                .add(jLabelCelsius, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TxfCDegrees, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(40, 40, 40)
                .add(jLabelFarenheit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TxfFDegrees, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 44, Short.MAX_VALUE)
                .add(jLabelKelvin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TxfKDegrees, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(38, 38, 38))
        );

        TxfCDegrees.getAccessibleContext().setAccessibleName("");

        jTabbedPaneConversors.addTab("Grados", jPanelDegrees);

        jPanelDistances.setFocusable(false);
        jPanelDistances.setName("Distances");

        TxfKMH.setEditable(false);
        TxfKMH.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TxfKMH.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxfKMH.setText("0");
        TxfKMH.setFocusTraversalKeysEnabled(false);
        TxfKMH.setFocusable(false);
        TxfKMH.setName("KMH");
        TxfKMH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AquaCalculator.this.keyPressed(evt);
            }
        });

        TxfMPH.setEditable(false);
        TxfMPH.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TxfMPH.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxfMPH.setText("0");
        TxfMPH.setFocusTraversalKeysEnabled(false);
        TxfMPH.setFocusable(false);
        TxfMPH.setName("MPH");
        TxfMPH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AquaCalculator.this.keyPressed(evt);
            }
        });

        TxfKnot.setEditable(false);
        TxfKnot.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TxfKnot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxfKnot.setText("0");
        TxfKnot.setFocusTraversalKeysEnabled(false);
        TxfKnot.setFocusable(false);
        TxfKnot.setName("Knot");
        TxfKnot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AquaCalculator.this.keyPressed(evt);
            }
        });

        jLabelKMH.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelKMH.setText("Kilómetros por hora");

        jLabelMPH.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelMPH.setText("Millas por hora");

        jLabelKN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabelKN.setText("Nudos");

        org.jdesktop.layout.GroupLayout jPanelDistancesLayout = new org.jdesktop.layout.GroupLayout(jPanelDistances);
        jPanelDistances.setLayout(jPanelDistancesLayout);
        jPanelDistancesLayout.setHorizontalGroup(
            jPanelDistancesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelDistancesLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelDistancesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(TxfMPH, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, TxfKMH)
                    .add(jLabelKMH, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabelMPH, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(TxfKnot, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .add(jLabelKN, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelDistancesLayout.setVerticalGroup(
            jPanelDistancesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelDistancesLayout.createSequentialGroup()
                .add(44, 44, 44)
                .add(jLabelKMH, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TxfKMH, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(40, 40, 40)
                .add(jLabelMPH, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TxfMPH, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 44, Short.MAX_VALUE)
                .add(jLabelKN, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(TxfKnot, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(38, 38, 38))
        );

        jTabbedPaneConversors.addTab("Distancias", jPanelDistances);

        jButtonMemorySave.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jButtonMemorySave.setText("MS");
        jButtonMemorySave.setToolTipText("Guarda el valor actual de la interfaz de cálculo en una memoria");
        jButtonMemorySave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMemorySave.setFocusable(false);
        jButtonMemorySave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMemorySaveActionPerformed(evt);
            }
        });

        jButtonMemoryClear.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jButtonMemoryClear.setText("MC");
        jButtonMemoryClear.setToolTipText("Borra la memoria");
        jButtonMemoryClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMemoryClear.setFocusable(false);
        jButtonMemoryClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMemoryClearActionPerformed(evt);
            }
        });

        jButtonMemoryLess.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jButtonMemoryLess.setText("M-");
        jButtonMemoryLess.setToolTipText("Realiza una resta entre el valor actual de la interfaz de operaciones y la memoria");
        jButtonMemoryLess.setActionCommand("=");
        jButtonMemoryLess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMemoryLess.setFocusable(false);
        jButtonMemoryLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMemoryLessActionPerformed(evt);
            }
        });

        jButtonMemoryAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jButtonMemoryAdd.setText("M+");
        jButtonMemoryAdd.setToolTipText("Realiza una suma entre el valor actual de la interfaz de operaciones y la memoria");
        jButtonMemoryAdd.setActionCommand("=");
        jButtonMemoryAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMemoryAdd.setFocusable(false);
        jButtonMemoryAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMemoryAddActionPerformed(evt);
            }
        });

        jButtonRecoverMemory.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jButtonRecoverMemory.setText("MR");
        jButtonRecoverMemory.setToolTipText("Devuelve la memoria a la interfaz de cálculo");
        jButtonRecoverMemory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRecoverMemory.setFocusable(false);
        jButtonRecoverMemory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecoverMemoryActionPerformed(evt);
            }
        });

        TxfMemory.setEditable(false);
        TxfMemory.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        TxfMemory.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxfMemory.setToolTipText("Memoria");
        TxfMemory.setFocusTraversalKeysEnabled(false);
        TxfMemory.setFocusable(false);

        jButtonSQRT.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonSQRT.setText("√");
        jButtonSQRT.setToolTipText("");
        jButtonSQRT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSQRT.setFocusable(false);
        jButtonSQRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSQRTActionPerformed(evt);
            }
        });

        jButtonPercent.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButtonPercent.setText("%");
        jButtonPercent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPercent.setFocusable(false);
        jButtonPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestOperation(evt);
            }
        });

        jMenuBar1.setForeground(new java.awt.Color(88, 65, 115));

        jMenuEdit.setText("Edición");

        jMenuCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuCopy.setText("Copiar");
        jMenuCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCopy(evt);
            }
        });
        jMenuEdit.add(jMenuCopy);

        jMenuPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuPaste.setText("Pegar");
        jMenuPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPaste(evt);
            }
        });
        jMenuEdit.add(jMenuPaste);

        jMenuBar1.add(jMenuEdit);

        jMenuPrecision.setText("Precisión");

        jRadioButtonNoDecimals.setText("Sin decimales");
        jRadioButtonNoDecimals.setActionCommand("0");
        jRadioButtonNoDecimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDecimalPrecision(evt);
            }
        });
        jMenuPrecision.add(jRadioButtonNoDecimals);

        jRadioButtonOneDecimal.setText("1 decimal");
        jRadioButtonOneDecimal.setActionCommand("1");
        jRadioButtonOneDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDecimalPrecision(evt);
            }
        });
        jMenuPrecision.add(jRadioButtonOneDecimal);

        jRadioButtonTwoDecimals.setText("2 decimales");
        jRadioButtonTwoDecimals.setActionCommand("2");
        jRadioButtonTwoDecimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDecimalPrecision(evt);
            }
        });
        jMenuPrecision.add(jRadioButtonTwoDecimals);

        jRadioButtonThreeDecimals.setText("3 decimales");
        jRadioButtonThreeDecimals.setActionCommand("3");
        jRadioButtonThreeDecimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDecimalPrecision(evt);
            }
        });
        jMenuPrecision.add(jRadioButtonThreeDecimals);

        jRadioButtonFourDecimals.setText("4 decimales");
        jRadioButtonFourDecimals.setActionCommand("4");
        jMenuPrecision.add(jRadioButtonFourDecimals);

        jRadioButtonFiveDecimals.setText("5 decimales");
        jRadioButtonFiveDecimals.setActionCommand("5");
        jMenuPrecision.add(jRadioButtonFiveDecimals);

        jRadioButtonSixDecimals.setText("6 decimales");
        jRadioButtonSixDecimals.setActionCommand("6");
        jMenuPrecision.add(jRadioButtonSixDecimals);

        jRadioButtonSevenDecimals.setText("7 decimales");
        jRadioButtonSevenDecimals.setActionCommand("7");
        jMenuPrecision.add(jRadioButtonSevenDecimals);

        jRadioButtonEightDecimals.setSelected(true);
        jRadioButtonEightDecimals.setText("8 decimales");
        jRadioButtonEightDecimals.setActionCommand("8");
        jRadioButtonEightDecimals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDecimalPrecision(evt);
            }
        });
        jMenuPrecision.add(jRadioButtonEightDecimals);

        jMenuBar1.add(jMenuPrecision);

        jMenuCalculator.setText("Calculadora");

        jMenuAbout.setText("Acerca de");
        jMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAboutDialog(evt);
            }
        });
        jMenuCalculator.add(jMenuAbout);

        jMenuBar1.add(jMenuCalculator);

        jMenuAppereance.setText("Apariencia");

        jMenuItemAqua.setText("Aqua");
        jMenuItemAqua.setToolTipText("Tema Mac OS X 10.7");
        jMenuItemAqua.setActionCommand("X");
        jMenuItemAqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAquaActionPerformed(evt);
            }
        });
        jMenuAppereance.add(jMenuItemAqua);

        jMenuItemAquaPanther.setText("Aqua Panther");
        jMenuItemAquaPanther.setToolTipText("Tema Mac OS X 10.3");
        jMenuItemAquaPanther.setActionCommand("3");
        jMenuItemAquaPanther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAquaActionPerformed(evt);
            }
        });
        jMenuAppereance.add(jMenuItemAquaPanther);

        jMenuItemAquaSnow.setText("Aqua Snow Leopard");
        jMenuItemAquaSnow.setToolTipText("Tema Mac OS X 10.6");
        jMenuItemAquaSnow.setActionCommand("6");
        jMenuItemAquaSnow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAquaActionPerformed(evt);
            }
        });
        jMenuAppereance.add(jMenuItemAquaSnow);

        jMenuItemMetal.setText("Metal");
        jMenuItemMetal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMetalActionPerformed(evt);
            }
        });
        jMenuAppereance.add(jMenuItemMetal);

        jMenuItemNimbus.setText("Nimbus");
        jMenuItemNimbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNimbusActionPerformed(evt);
            }
        });
        jMenuAppereance.add(jMenuItemNimbus);

        jMenuItemWindows.setText("Windows");
        jMenuItemWindows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemWindowsActionPerformed(evt);
            }
        });
        jMenuAppereance.add(jMenuItemWindows);

        jMenuBar1.add(jMenuAppereance);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(jScrollHistory, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 431, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButtonClearHistory, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createSequentialGroup()
                                .add(jButtonRecoverMemory, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(jButtonMemoryAdd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(jButtonMemoryLess, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(jButtonMemoryClear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(jButtonMemorySave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jToggleConverters, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(TxfMemory, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 171, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(jButtonSQRT, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(jButtonChangeSign, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(jButtonReciproc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(28, 28, 28)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(layout.createSequentialGroup()
                                .add(jButtonBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(jButtonClearEnd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jButtonSeven, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonOne, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(12, 12, 12)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonEight, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonTwo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(12, 12, 12)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jButtonNine, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonTrhee, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(layout.createSequentialGroup()
                                .add(jButtonFour, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(jButtonFive, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(12, 12, 12)
                                .add(jButtonSix, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jButtonZero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 171, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(12, 12, 12)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jButtonComma, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonPercent, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonPlus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonMultiply, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jButtonEquals, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonDivide, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonLess, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jButtonClear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(TxfScreen)
                    .add(TxfLive))
                .add(18, 18, 18)
                .add(jTabbedPaneConversors, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 196, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(6, 6, 6)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jScrollHistory, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jButtonClearHistory, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(TxfLive, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(TxfScreen, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jButtonClearEnd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonClear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonBack, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(layout.createSequentialGroup()
                                                .add(63, 63, 63)
                                                .add(jButtonPlus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonDivide, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(8, 8, 8)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jButtonEquals, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(layout.createSequentialGroup()
                                                .add(jButtonPercent, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(8, 8, 8)
                                                .add(jButtonComma, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .add(9, 9, 9)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonEight, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                                .add(jButtonNine, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(jButtonMultiply, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                                .add(jButtonLess, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonSeven, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(6, 6, 6)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                            .add(jButtonFive, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jButtonSix, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jButtonFour, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(8, 8, 8)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonTwo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonTrhee, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonOne, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .add(8, 8, 8)
                                        .add(jButtonZero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(layout.createSequentialGroup()
                                .add(jToggleConverters, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(8, 8, 8)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jButtonReciproc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonChangeSign, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonSQRT, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(8, 8, 8)
                                .add(TxfMemory, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(8, 8, 8)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jButtonMemoryLess, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonMemoryAdd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonRecoverMemory, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(8, 8, 8)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jButtonMemorySave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButtonMemoryClear, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(layout.createSequentialGroup()
                        .add(2, 2, 2)
                        .add(jTabbedPaneConversors, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="TRATAMIENTO DEL PANEL DE CONVERSIÓN DE GRADOS">

    private void degreeConvert(JTextField field, int type) {
        String aux;
        double res1, res2;
        switch (type) {
            case 1:
                /////////////////////////////////////
                /////////////////////////////////////
                //CONVIRTIENDO DESDE CELSIUS
                /////////////////////////////////////
                /////////////////////////////////////
                aux = field.getText();
                aux = aux.replace(",", ".");
                res1 = Double.parseDouble(aux);
                res2 = res1;
                res1 = ((1.8) * res1) + 32;
                res1 = roundToDecimals(res1, decimalCounter);
                aux = Double.toString(res1);
                aux = aux.replace(".", ",");
                TxfFDegrees.setText(aux);
                res2 = res2 + 273.15;
                res2 = roundToDecimals(res2, decimalCounter);
                aux = Double.toString(res2);
                aux = aux.replace(".", ",");
                TxfKDegrees.setText(aux);
                break;
            case 2:
                /////////////////////////////////////
                /////////////////////////////////////
                //CONVIRTIENDO DESDE FARENHEIT
                /////////////////////////////////////
                /////////////////////////////////////
                aux = field.getText();
                aux = aux.replace(",", ".");
                res1 = Double.parseDouble(aux);
                res1 = (res1 - 32) / 1.8;
                res1 = roundToDecimals(res1, decimalCounter);
                aux = Double.toString(res1);
                aux = aux.replace(".", ",");
                TxfCDegrees.setText(aux);
                res2 = res1 + 273.15;
                res2 = roundToDecimals(res2, decimalCounter);
                aux = Double.toString(res2);
                aux = aux.replace(".", ",");
                TxfKDegrees.setText(aux);
                break;
            case 3:
                /////////////////////////////////////
                /////////////////////////////////////
                //CONVIRTIENDO DESDE KELVIN
                /////////////////////////////////////
                /////////////////////////////////////
                aux = field.getText();
                aux = aux.replace(",", ".");
                res1 = Double.parseDouble(aux);
                res1 = res1 - 273.15;
                res1 = roundToDecimals(res1, decimalCounter);
                aux = Double.toString(res1);
                aux = aux.replace(".", ",");
                TxfCDegrees.setText(aux);
                res2 = res1;
                res2 = ((1.8) * res2) + 32;
                res2 = roundToDecimals(res2, decimalCounter);
                aux = Double.toString(res2);
                aux = aux.replace(".", ",");
                TxfFDegrees.setText(aux);
                break;
            default:
                throw new AssertionError();
        }
    }

    private void numberClickDegree(ActionEvent evt, String focus) {
        String aux = "";
        switch (focus) {
            case "CDegrees":
                aux = TxfCDegrees.getText();
                break;
            case "FDegrees":
                aux = TxfFDegrees.getText();
                break;
            case "KDegrees":
                aux = TxfKDegrees.getText();
                break;
        }

        if ((evt.getActionCommand().equals("0") && aux.indexOf(",") != -1) || !evt.getActionCommand().equals("0") || (evt.getActionCommand().equals("0") && aux.length() != 0)) {
            switch (focus) {
                case "CDegrees":
                    if (aux.equals("0")) {
                        TxfCDegrees.setText(evt.getActionCommand());
                    } else {
                        TxfCDegrees.setText((TxfCDegrees.getText() + evt.getActionCommand()));
                    }
                    if (!TxfCDegrees.getText().endsWith(",") && !TxfCDegrees.getText().endsWith("-")) {
                        degreeConvert(TxfCDegrees, 1);
                    }
                    break;
                case "FDegrees":
                    if (aux.equals("0")) {
                        TxfFDegrees.setText(evt.getActionCommand());
                    } else {
                        TxfFDegrees.setText((TxfFDegrees.getText() + evt.getActionCommand()));
                    }
                    if (!TxfFDegrees.getText().endsWith(",") && !TxfFDegrees.getText().endsWith("-")) {
                        degreeConvert(TxfFDegrees, 2);
                    }
                    break;
                case "KDegrees":
                    if (aux.equals("0")) {
                        TxfKDegrees.setText(evt.getActionCommand());
                    } else {
                        TxfKDegrees.setText((TxfKDegrees.getText() + evt.getActionCommand()));
                    }
                    if (!TxfKDegrees.getText().endsWith(",") && !TxfKDegrees.getText().endsWith("-")) {
                        degreeConvert(TxfKDegrees, 3);
                    }
                    break;
            }




        }
    }

    private void commaDegree(String focus) {
        switch (focus) {

            case "CDegrees":
                if (TxfCDegrees.getText().indexOf(",") == -1) {
                    if (TxfCDegrees.getText().equals("")) {
                        TxfCDegrees.setText("0,");
                    } else {
                        TxfCDegrees.setText(TxfCDegrees.getText() + ",");
                    }
                }
                break;
            case "FDegrees":
                if (TxfFDegrees.getText().indexOf(",") == -1) {
                    if (TxfFDegrees.getText().equals("")) {
                        TxfFDegrees.setText("0,");
                    } else {
                        TxfFDegrees.setText(TxfFDegrees.getText() + ",");
                    }
                }
                break;
            case "KDegrees":
                if (TxfKDegrees.getText().indexOf(",") == -1) {
                    if (TxfKDegrees.getText().equals("")) {
                        TxfKDegrees.setText("0,");
                    } else {
                        TxfKDegrees.setText(TxfKDegrees.getText() + ",");
                    }
                }
                break;
        }
    }

    private void backDegree(String focus) {
        switch (focus) {

            case "CDegrees":
                if (!TxfCDegrees.getText().equals("")) {
                    if (TxfCDegrees.getText().length() == 1) {
                        TxfCDegrees.setText("0");
                        degreeConvert(TxfCDegrees, 1);
                    } else {
                        TxfCDegrees.setText(TxfCDegrees.getText().substring(0, (TxfCDegrees.getText().length() - 1)));
                        degreeConvert(TxfCDegrees, 1);
                    }
                }
                break;
            case "FDegrees":
                if (TxfFDegrees.getText().length() == 1) {
                    TxfFDegrees.setText("0");
                    degreeConvert(TxfFDegrees, 2);
                } else {
                    TxfFDegrees.setText(TxfFDegrees.getText().substring(0, (TxfFDegrees.getText().length() - 1)));
                    degreeConvert(TxfFDegrees, 2);
                }
                break;
            case "KDegrees":
                if (TxfKDegrees.getText().length() == 1) {
                    TxfKDegrees.setText("0");
                    degreeConvert(TxfKDegrees, 3);
                } else {
                    TxfKDegrees.setText(TxfKDegrees.getText().substring(0, (TxfKDegrees.getText().length() - 1)));
                    degreeConvert(TxfKDegrees, 3);
                }
                break;
        }
    }
    // </editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="TRATAMIENTO DEL PANEL DE CONVERSIÓN DE DISTANCIAS">
    private void distancesConvert(JTextField field, int type) {
        String aux;
        double res1, res2;
        switch (type) {
            case 1:
                /////////////////////////////////////
                /////////////////////////////////////
                //CONVIRTIENDO DESDE KMH
                /////////////////////////////////////
                /////////////////////////////////////
                aux = field.getText();
                aux = aux.replace(",", ".");
                res1 = Double.parseDouble(aux);
                res2 = res1;
                res1 = res1 * 0.62137111;
                res1 = roundToDecimals(res1, decimalCounter);
                if (res1 < 0) {
                    res1 = 0.0;
                }
                aux = Double.toString(res1);
                aux = aux.replace(".", ",");
                TxfMPH.setText(aux);
                res2 = res2 * 0.53995694;
                res2 = roundToDecimals(res2, decimalCounter);
                if (res2 < 0) {
                    res2 = 0.0;
                }
                aux = Double.toString(res2);
                aux = aux.replace(".", ",");
                TxfKnot.setText(aux);
                break;
            case 2:
                /////////////////////////////////////
                /////////////////////////////////////
                //CONVIRTIENDO DESDE MPH
                /////////////////////////////////////
                /////////////////////////////////////
                aux = field.getText();
                aux = aux.replace(",", ".");
                res1 = Double.parseDouble(aux);
                res2 = res1;
                res1 = res1 * 1.60934421;
                res1 = roundToDecimals(res1, decimalCounter);
                if (res1 < 0) {
                    res1 = 0.0;
                }
                aux = Double.toString(res1);
                aux = aux.replace(".", ",");
                TxfKMH.setText(aux);
                res2 = res2 * 0.86897658;
                res2 = roundToDecimals(res2, decimalCounter);
                if (res2 < 0) {
                    res2 = 0.0;
                }
                aux = Double.toString(res2);
                aux = aux.replace(".", ",");
                TxfKnot.setText(aux);
                break;
            case 3:
                /////////////////////////////////////
                /////////////////////////////////////
                //CONVIRTIENDO DESDE Knot
                /////////////////////////////////////
                /////////////////////////////////////
                aux = field.getText();
                aux = aux.replace(",", ".");
                res1 = Double.parseDouble(aux);
                res2 = res1;
                res1 = res1 * 1.85199952;
                res1 = roundToDecimals(res1, decimalCounter);
                if (res1 < 0) {
                    res1 = 0.0;
                }
                aux = Double.toString(res1);
                aux = aux.replace(".", ",");
                TxfKMH.setText(aux);
                res2 = res2 * 1.150779;
                res2 = roundToDecimals(res2, decimalCounter);
                if (res2 < 0) {
                    res2 = 0.0;
                }
                aux = Double.toString(res2);
                aux = aux.replace(".", ",");
                TxfMPH.setText(aux);
                break;
        }
    }

    private void numberClickDistances(ActionEvent evt, String focus) {
        String aux = "";
        switch (focus) {
            case "KMH":
                aux = TxfKMH.getText();
                break;
            case "MPH":
                aux = TxfMPH.getText();
                break;
            case "Knot":
                aux = TxfKnot.getText();
                break;
        }
        if ((evt.getActionCommand().equals("0") && aux.indexOf(",") != -1) || !evt.getActionCommand().equals("0") || (evt.getActionCommand().equals("0") && aux.length() != 0)) {
            switch (focus) {
                case "KMH":
                    if (aux.equals("0")) {
                        TxfKMH.setText(evt.getActionCommand());
                    } else {
                        TxfKMH.setText((TxfKMH.getText() + evt.getActionCommand()));
                    }
                    if (!TxfKMH.getText().endsWith(",") && !TxfKMH.getText().endsWith("-")) {
                        distancesConvert(TxfKMH, 1);
                    }
                    break;
                case "MPH":
                    if (aux.equals("0")) {
                        TxfMPH.setText(evt.getActionCommand());
                    } else {
                        TxfMPH.setText((TxfMPH.getText() + evt.getActionCommand()));
                    }
                    if (!TxfMPH.getText().endsWith(",") && !TxfMPH.getText().endsWith("-")) {
                        distancesConvert(TxfMPH, 2);
                    }
                    break;
                case "Knot":
                    if (aux.equals("0")) {
                        TxfKnot.setText(evt.getActionCommand());
                    } else {
                        TxfKnot.setText((TxfKnot.getText() + evt.getActionCommand()));
                    }
                    if (!TxfKnot.getText().endsWith(",") && !TxfKnot.getText().endsWith("-")) {
                        distancesConvert(TxfKnot, 3);
                    }
                    break;
            }
        }
    }

    private void commaDistance(String focus) {
        switch (focus) {

            case "KMH":
                if (TxfKMH.getText().indexOf(",") == -1) {
                    if (TxfKMH.getText().equals("")) {
                        TxfKMH.setText("0,");
                    } else {
                        TxfKMH.setText(TxfKMH.getText() + ",");
                    }
                }
                break;
            case "MPH":
                if (TxfMPH.getText().indexOf(",") == -1) {
                    if (TxfMPH.getText().equals("")) {
                        TxfMPH.setText("0,");
                    } else {
                        TxfMPH.setText(TxfMPH.getText() + ",");
                    }
                }
                break;
            case "Knot":
                if (TxfKnot.getText().indexOf(",") == -1) {
                    if (TxfKnot.getText().equals("")) {
                        TxfKnot.setText("0,");
                    } else {
                        TxfKnot.setText(TxfKnot.getText() + ",");
                    }
                }
                break;
        }
    }

    private void backDistance(String focus) {
        switch (focus) {
            case "KMH":
                if (!TxfKMH.getText().equals("")) {
                    if (TxfKMH.getText().length() == 1) {
                        TxfKMH.setText("0");
                        distancesConvert(TxfKMH, 1);
                    } else {
                        TxfKMH.setText(TxfKMH.getText().substring(0, (TxfKMH.getText().length() - 1)));
                        distancesConvert(TxfKMH, 1);
                    }
                }
                break;
            case "MPH":
                if (!TxfMPH.getText().equals("")) {
                    if (TxfMPH.getText().length() == 1) {
                        TxfMPH.setText("0");
                        distancesConvert(TxfMPH, 2);
                    } else {
                        TxfMPH.setText(TxfMPH.getText().substring(0, (TxfMPH.getText().length() - 1)));
                        distancesConvert(TxfMPH, 2);
                    }
                }
                break;
            case "Knot":
                if (!TxfKnot.getText().equals("")) {
                    if (TxfKnot.getText().length() == 1) {
                        TxfKnot.setText("0");
                        distancesConvert(TxfKnot, 3);
                    } else {
                        TxfKnot.setText(TxfMPH.getText().substring(0, (TxfKnot.getText().length() - 1)));
                        distancesConvert(TxfKnot, 3);
                    }
                }
                break;
        }
    }
    // </editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="REDONDEO, NÚMERO">
    private static double roundToDecimals(double num, int dec) {
        return Math.round(num * Math.pow(10, dec)) / Math.pow(10, dec);
    }

    private void numberClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberClick
        String focus = this.getFocusOwner().getName();
        //System.out.println(jTabbedPaneConversors.getSelectedComponent().getName());
        switch (focus) {
            case "CDegrees":
            case "FDegrees":
            case "KDegrees":
                numberClickDegree(evt, focus);
                break;
            case "KMH":
            case "MPH":
            case "Knot":
                numberClickDistances(evt, focus);
                break;
            default:
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                //o el número 0 si ya hay algún digito introducido
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                if (!subOperation.equals(OperationType.RECIPROC) && !subOperation.equals(OperationType.SQRT)) {
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    //El sistema solo acepta el número 0 si ya hay una coma (por tanto es un número decimal)
                    //o el número 0 si ya hay algún digito introducido
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    if ((evt.getActionCommand().equals("0") && showNumber.indexOf(",") != -1) || !evt.getActionCommand().equals("0") || (evt.getActionCommand().equals("0") && showNumber.length() != 0)) {
                        showNumber = showNumber + evt.getActionCommand();
                        txAHistoryStr = txAHistoryStr + (evt.getActionCommand());
                        TxfLive.setText(txAHistoryStr);
                        TxfScreen.setText(showNumber);
                    }
                }
                break;
        }

    }//GEN-LAST:event_numberClick
    // </editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="COMA, IGUAL, CE, ATRÁS, C, CH">
    private void jButtonCommaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCommaActionPerformed
        String focus = this.getFocusOwner().getName();
        switch (focus) {
            case "CDegrees":
            case "FDegrees":
            case "KDegrees":
                commaDegree(focus);
                break;
            case "KMH":
            case "MPH":
            case "Knot":
                commaDistance(focus);
                break;
            default:
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                //Solo escribe la coma si aún no existe. Si nuestro número está vacío y pulsamos coma asume que
                //será un número decimal inferior a 1.
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                if (showNumber.indexOf(",") == -1) {
                    if (showNumber.equals("")) {
                        showNumber = "0,";
                        txAHistoryStr = txAHistoryStr + ("0,");
                    } else {
                        showNumber = showNumber + ",";
                        txAHistoryStr = txAHistoryStr + (",");
                    }
                    TxfScreen.setText(showNumber);
                    TxfLive.setText(txAHistoryStr);
                }
                break;
        }
    }//GEN-LAST:event_jButtonCommaActionPerformed

    private void jButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualsActionPerformed
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //Si nos encontramos en un reciproc/SQRT debemos esperar a que se pulse un signo de operación
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        if (!operation.equals(OperationType.NONE) && operateOne != Double.MAX_VALUE && !showNumber.equals("") && !showNumber.equals("-") && !showNumber.equals("0,")) {
            showNumber = showNumber.replace(",", ".");
            operateTwo = Double.parseDouble(showNumber);
            txAHistoryStr = txAHistoryStr + (evt.getActionCommand());
            result = BasicOperations.makeOperation(operation, operateOne, operateTwo, decimalCounter);
            if (result % 1.0 == 0) {
                showNumber = Integer.toString(((int) (result)));
            } else {
                showNumber = Double.toString((result));
            }
            showNumber = showNumber.replace(".", ",");
            TxfScreen.setText(showNumber);
            txAHistoryStr = txAHistoryStr + (showNumber);
            TxfLive.setText(txAHistoryStr);
            TxAHistory.append(txAHistoryStr + "\n");
            showNumber = "";
            txAHistoryStr = "";
            operation = OperationType.NONE;
            subOperation = OperationType.NONE;
            operateTwo = Double.MAX_VALUE;
            operateOne = result;
        }

    }//GEN-LAST:event_jButtonEqualsActionPerformed

    private void jButtonClearEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearEndActionPerformed
        // TODO add your handling code here:
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //Comprobamos si tenemos que borrar un reciproc/SQRT
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        if (!TxfLive.getText().equals("")) {
            switch (TxfLive.getText().substring((TxfLive.getText().length() - 1), TxfLive.getText().length())) {
                case "}": {
                    int first = TxfLive.getText().lastIndexOf("R");
                    txAHistoryStr = txAHistoryStr.substring(0, first);
                    TxfLive.setText(txAHistoryStr);
                    TxfScreen.setText("0");
                    showNumber = "";
                    subOperation = OperationType.NONE;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    //Solo realizamos operación de borrado si hay algo en la cadena
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    ////////////////////////////////////////////////////////////////////////////////////////////////////
                    break;
                }
                case "]": {
                    int first = TxfLive.getText().lastIndexOf("√");
                    txAHistoryStr = txAHistoryStr.substring(0, first);
                    TxfLive.setText(txAHistoryStr);
                    TxfScreen.setText("0");
                    showNumber = "";
                    subOperation = OperationType.NONE;
                    break;
                }
            }
        }
        if (!showNumber.equals("")) {

            if (txAHistoryStr.length() == 1) {
                txAHistoryStr = "";
            } else {
                txAHistoryStr = txAHistoryStr.substring(0, (txAHistoryStr.length() - showNumber.length()));
            }
            showNumber = "";
            TxfLive.setText(txAHistoryStr);
            TxfScreen.setText("0");
        }
    }//GEN-LAST:event_jButtonClearEndActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        String focus = this.getFocusOwner().getName();
        switch (focus) {
            case "CDegrees":
            case "FDegrees":
            case "KDegrees":
                backDegree(focus);
                break;
            case "KMH":
            case "MPH":
            case "Knot":
                backDistance(focus);
                break;
            default:
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                //Comprobamos si tenemos que borrar un reciproc
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////////////
                if (!TxfLive.getText().equals("")) {
                    switch (TxfLive.getText().substring((TxfLive.getText().length() - 1), TxfLive.getText().length())) {
                        case "}": {
                            int first = TxfLive.getText().lastIndexOf("R");
                            txAHistoryStr = txAHistoryStr.substring(0, first);
                            TxfLive.setText(txAHistoryStr);
                            TxfScreen.setText("0");
                            showNumber = "";
                            subOperation = OperationType.NONE;
                            ////////////////////////////////////////////////////////////////////////////////////////////////////
                            ////////////////////////////////////////////////////////////////////////////////////////////////////
                            //Solo realizamos operación de borrado si hay algo en la cadena
                            ////////////////////////////////////////////////////////////////////////////////////////////////////
                            ////////////////////////////////////////////////////////////////////////////////////////////////////
                            break;
                        }
                        case "]": {
                            int first = TxfLive.getText().lastIndexOf("√");
                            txAHistoryStr = txAHistoryStr.substring(0, first);
                            TxfLive.setText(txAHistoryStr);
                            TxfScreen.setText("0");
                            showNumber = "";
                            subOperation = OperationType.NONE;
                            ////////////////////////////////////////////////////////////////////////////////////////////////////
                            ////////////////////////////////////////////////////////////////////////////////////////////////////
                            //Solo realizamos operación de borrado si hay algo en la cadena
                            ////////////////////////////////////////////////////////////////////////////////////////////////////
                            ////////////////////////////////////////////////////////////////////////////////////////////////////
                            break;
                        }
                    }
                }
                if (!showNumber.equals("")) {
                    if (showNumber.length() == 1) {
                        showNumber = "";
                        if (txAHistoryStr.length() == 1) {
                            txAHistoryStr = "";
                        } else {
                            txAHistoryStr = txAHistoryStr.substring(0, (txAHistoryStr.length() - 1));
                        }
                        TxfLive.setText(txAHistoryStr);
                        TxfScreen.setText("0");


                    } else {
                        showNumber = showNumber.substring(0, (showNumber.length() - 1));
                        txAHistoryStr = txAHistoryStr.substring(0, (txAHistoryStr.length() - 1));
                        TxfLive.setText(txAHistoryStr);
                        TxfScreen.setText(showNumber);
                    }
                }
                break;
        }
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:

        showNumber = "";
        txAHistoryStr = "";
        operateOne = Double.MAX_VALUE;
        operateTwo = Double.MAX_VALUE;
        TxfLive.setText("");
        TxfScreen.setText("0");
        operation = OperationType.NONE;
        subOperation = OperationType.NONE;
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonClearHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearHistoryActionPerformed
        // TODO add your handling code here:
        TxAHistory.setText("");
    }//GEN-LAST:event_jButtonClearHistoryActionPerformed
    // </editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="OPERACIONES(+ - / * % 1/x), SELECTOR PRECISIÓN, ACERCA DE">
    private void RequestOperation(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestOperation
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //La tecla - permite establecer un valor que será negativo
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        if (evt.getActionCommand().matches("-") && showNumber.equals("") && ((operation.equals(OperationType.NONE) && operateOne != result) || (!operation.equals(OperationType.NONE)))) {
            showNumber = "-";
            txAHistoryStr = txAHistoryStr + (evt.getActionCommand());
            TxfLive.setText(txAHistoryStr);
            TxfScreen.setText(showNumber);
        } else {
            if ((!showNumber.equals("") && !showNumber.equals("-") && !showNumber.equals("0,")) || (showNumber.equals("") && result != Double.MAX_VALUE)) {
                subOperation = OperationType.NONE;
                showNumber = showNumber.replace(",", ".");
                if ((!operation.equals(OperationType.NONE))) {
                    operateTwo = Double.parseDouble(showNumber);
                    txAHistoryStr = txAHistoryStr + (evt.getActionCommand());
                    result = BasicOperations.makeOperation(operation, operateOne, operateTwo, decimalCounter);
                    if (result % 1.0 == 0) {
                        showNumber = Integer.toString(((int) (result)));

                    } else {
                        showNumber = Double.toString((result));
                    }
                    TxfScreen.setText(showNumber);
                    showNumber = "";
                    TxfLive.setText(txAHistoryStr);
                    operateOne = result;
                } else {
                    if (showNumber.equals("") && result != Double.MAX_VALUE) {
                        operateOne = result;
                        if (result % 1.0 == 0) {
                            showNumber = Integer.toString(((int) (result)));
                        } else {
                            showNumber = Double.toString((result));
                        }
                    } else {
                        operateOne = Double.parseDouble(showNumber);
                    }
                    if (txAHistoryStr.equals("")) {
                        txAHistoryStr = showNumber;
                    }
                    showNumber = showNumber.replace(".", ",");
                    txAHistoryStr = txAHistoryStr + (evt.getActionCommand());
                    showNumber = "";
                    TxfLive.setText(txAHistoryStr);
                    operateTwo = Double.MIN_VALUE;
                }
                switch (evt.getActionCommand()) {
                    case "*":
                        operation = OperationType.MULTIPLY;
                        break;
                    case "+":
                        operation = OperationType.ADD;
                        break;
                    case "-":
                        operation = OperationType.LESS;
                        break;
                    case "/":
                        operation = OperationType.DIVIDE;
                        break;
                    case "%":
                        operation = OperationType.PERCENT;
                        break;
                    default:
                        operation = OperationType.NONE;
                }
            }
        }
    }//GEN-LAST:event_RequestOperation

    private void reciproc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciproc
        // TODO add your handling code here:
        if (!showNumber.equals("")) {
            String aux = showNumber;
            showNumber = showNumber.replace(",", ".");
            result = Double.parseDouble(showNumber);
            jButtonClearEndActionPerformed(evt);
            txAHistoryStr = txAHistoryStr + ("Reciproc{" + aux + "}");
            TxfLive.setText(txAHistoryStr);
            result = 1 / result;
            if (result % 1.0 == 0) {
                showNumber = Integer.toString(((int) (result)));
                TxfScreen.setText(showNumber);
            } else {
                showNumber = Double.toString((result));
                TxfScreen.setText(showNumber);
            }
            subOperation = OperationType.RECIPROC;
        }
    }//GEN-LAST:event_reciproc

    private void selectDecimalPrecision(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDecimalPrecision
        // TODO add your handling code here:
        decimalCounter = Integer.parseInt(evt.getActionCommand());
    }//GEN-LAST:event_selectDecimalPrecision

    private void showAboutDialog(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAboutDialog
        // TODO add your handling code here:
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_showAboutDialog

    private void jButtonChangeSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeSignActionPerformed
        // TODO add your handling code here:
        if (showNumber.equals("") && result != Double.MAX_VALUE) {
            if (result % 1.0 == 0) {
                showNumber = Integer.toString(((int) (result)));
            } else {
                showNumber = Double.toString((result));
            }
            if (showNumber.charAt(0) == '-') {
                showNumber = showNumber.substring(1, showNumber.length());
            } else {
                showNumber = "-" + showNumber;
            }
            txAHistoryStr = showNumber;
            TxfLive.setText(txAHistoryStr);
            TxfScreen.setText(showNumber);
        } else if (!showNumber.equals("")) {
            if (showNumber.charAt(0) == '-') {
                int aux = showNumber.length();
                txAHistoryStr = txAHistoryStr.substring(0, (txAHistoryStr.length() - aux));
                showNumber = showNumber.substring(1, showNumber.length());
                txAHistoryStr = txAHistoryStr + showNumber;
                TxfLive.setText(txAHistoryStr);
                TxfScreen.setText(showNumber);
            } else {
                int aux = showNumber.length();
                txAHistoryStr = txAHistoryStr.substring(0, (txAHistoryStr.length() - aux));
                showNumber = "-" + showNumber;
                txAHistoryStr = txAHistoryStr + showNumber;
                TxfLive.setText(txAHistoryStr);
                TxfScreen.setText(showNumber);
            }
        }
    }//GEN-LAST:event_jButtonChangeSignActionPerformed
    // </editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="COPIAR, PEGAR, TECLAS, CONVERSORES">
    private void jMenuCopy(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCopy
        // TODO add your handling code here:
        if (!TxfScreen.getText().equals("")) {
            TxfScreen.selectAll();
            TxfScreen.copy();
            TxfScreen.select(0, 0);
        }

    }//GEN-LAST:event_jMenuCopy

    private void jMenuPaste(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPaste
        // TODO add your handling code here:
        try {
            int aux_show = showNumber.length();
            JTextField TxfPaste = new JTextField();
            TxfPaste.paste();
            String aux = TxfPaste.getText();
            showNumber = showNumber.replace(",", ".");
            double aux_num = Double.parseDouble(aux);
            if (aux_num % 1.0 == 0) {
                showNumber = Integer.toString(((int) (aux_num)));
            } else {
                showNumber = Double.toString((aux_num));
            }
            showNumber = showNumber.replace(".", ",");
            TxfScreen.setText(showNumber);
            txAHistoryStr = txAHistoryStr.substring(0, (txAHistoryStr.length() - aux_show));
            txAHistoryStr = txAHistoryStr + showNumber;
            TxfLive.setText(txAHistoryStr);
        } catch (Exception s) {
        }
    }//GEN-LAST:event_jMenuPaste

    private void keyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyPressed
        // TODO add your handling code here:
        keyID = evt.getKeyChar();
        if (keyID == 97 || keyID == 49) {
            // 1
            jButtonOne.doClick();
        } else if (keyID == 98 || keyID == 50) {
            // 2
            jButtonTwo.doClick();
        } else if (keyID == 99 || keyID == 51) {
            // 3
            jButtonTrhee.doClick();
        } else if (keyID == 100 || keyID == 52) {
            // 4
            jButtonFour.doClick();
        } else if (keyID == 101 || keyID == 53) {
            // 5
            jButtonFive.doClick();
        } else if (keyID == 102 || keyID == 54) {
            // 6
            jButtonSix.doClick();
        } else if (keyID == 103 || keyID == 55) {
            // 7
            jButtonSeven.doClick();
        } else if (keyID == 104 || keyID == 56) {
            // 8 
            jButtonEight.doClick();
        } else if (keyID == 105 || keyID == 57) {
            // 9
            jButtonNine.doClick();
        } else if (keyID == 110 || keyID == 46 || keyID == 44) {
            // .
            jButtonComma.doClick();
        } else if (keyID == 10) {
            // =
            jButtonEquals.doClick();
        } else if (keyID == 107 || keyID == 43) {
            // +
            jButtonPlus.doClick();
        } else if (keyID == 109 || keyID == 45) {
            // -
            jButtonLess.doClick();
        } else if (keyID == 106 || keyID == 42) {
            // *
            jButtonMultiply.doClick();
        } else if (keyID == 111 || keyID == 47) {
            // /
            jButtonDivide.doClick();
        } else if (keyID == 67 || keyID == 99) {
            // C
            jButtonClear.doClick();
        } else if (keyID == 48) {
            // 0 
            jButtonZero.doClick();
        } else if (keyID == 8 || keyID == 127) {
            // 0 
            jButtonBack.doClick();
        }
    }//GEN-LAST:event_keyPressed

    private void jToggleConvertersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleConvertersActionPerformed
        // TODO add your handling code here:
        if (jToggleConverters.getModel().isSelected()) {
            Dimension size = new Dimension(this.getSize());
            size.setSize((size.getWidth() + 230), size.getHeight());
            this.setSize(size);
            activatePanel();
        } else {
            Dimension size = new Dimension(this.getSize());
            size.setSize((size.getWidth() - 230), size.getHeight());
            jTabbedPaneConversors.setEnabled(false);
            TxfKMH.setFocusable(false);
            TxfMPH.setFocusable(false);
            TxfKnot.setFocusable(false);
            TxfCDegrees.setFocusable(false);
            TxfFDegrees.setFocusable(false);
            TxfKDegrees.setFocusable(false);
            this.requestFocus();
            this.setSize(size);
        }
    }//GEN-LAST:event_jToggleConvertersActionPerformed
    private void activatePanel() {
        // TODO add your handling code here:
        jTabbedPaneConversors.setEnabled(true);
        if (jTabbedPaneConversors.getSelectedComponent().getName().equals("Degrees")) {
            TxfKMH.setFocusable(false);
            TxfMPH.setFocusable(false);
            TxfKnot.setFocusable(false);
            TxfCDegrees.setFocusable(true);
            TxfFDegrees.setFocusable(true);
            TxfKDegrees.setFocusable(true);
            TxfCDegrees.requestFocus();
        }
        if (jTabbedPaneConversors.getSelectedComponent().getName().equals("Distances")) {
            TxfKMH.setFocusable(true);
            TxfMPH.setFocusable(true);
            TxfKnot.setFocusable(true);
            TxfCDegrees.setFocusable(false);
            TxfFDegrees.setFocusable(false);
            TxfKDegrees.setFocusable(false);
            TxfKMH.requestFocus();
        }
    }
    private void panelListener(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelListener
        // TODO add your handling code here:
        if (jTabbedPaneConversors.getSelectedComponent().getName().equals("Degrees")) {
            TxfKMH.setFocusable(false);
            TxfMPH.setFocusable(false);
            TxfKnot.setFocusable(false);
            TxfCDegrees.setFocusable(true);
            TxfFDegrees.setFocusable(true);
            TxfKDegrees.setFocusable(true);
            TxfCDegrees.requestFocus();
        }
        if (jTabbedPaneConversors.getSelectedComponent().getName().equals("Distances")) {
            TxfKMH.setFocusable(true);
            TxfMPH.setFocusable(true);
            TxfKnot.setFocusable(true);
            TxfCDegrees.setFocusable(false);
            TxfFDegrees.setFocusable(false);
            TxfKDegrees.setFocusable(false);
            TxfKMH.requestFocus();
        }
    }//GEN-LAST:event_panelListener
    // </editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="MS, MC, M-, M+, MR, SQRT">
    private void jButtonMemorySaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMemorySaveActionPerformed
        // TODO add your handling code here:
        if (showNumber.equals("") && result != Double.MAX_VALUE) {
            if (result % 1.0 == 0) {
                TxfMemory.setText(Integer.toString(((int) (result))));
            } else {
                TxfMemory.setText(Double.toString(result));
            }
            TxfMemory.setText(Double.toString(result));
            TxfMemory.setText(TxfMemory.getText().replace(".", ","));
            memory = result;
            jButtonClearEndActionPerformed(evt);
        } else if (!showNumber.equals("")) {
            TxfMemory.setText(showNumber);
            showNumber = showNumber.replace(",", ".");
            memory = Double.parseDouble(showNumber);
            jButtonClearEndActionPerformed(evt);
        }
    }//GEN-LAST:event_jButtonMemorySaveActionPerformed

    private void jButtonMemoryClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMemoryClearActionPerformed
        // TODO add your handling code here:
        memory = Double.MAX_VALUE;
        TxfMemory.setText("");

    }//GEN-LAST:event_jButtonMemoryClearActionPerformed

    private void jButtonMemoryLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMemoryLessActionPerformed
        // TODO add your handling code here:
        if (!showNumber.equals("")) {
            showNumber = showNumber.replace(",", ".");
            operateOne = Double.parseDouble(showNumber);
            operation = OperationType.LESS;
            if (memory % 1.0 == 0) {
                showNumber = Integer.toString(((int) (memory)));
            } else {
                showNumber = Double.toString((memory));
            }
            txAHistoryStr += ("-" + showNumber);
            jButtonEqualsActionPerformed(evt);
        }
    }//GEN-LAST:event_jButtonMemoryLessActionPerformed

    private void jButtonMemoryAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMemoryAddActionPerformed
        // TODO add your handling code here:
        if (!showNumber.equals("")) {
            showNumber = showNumber.replace(",", ".");
            operateOne = Double.parseDouble(showNumber);
            operation = OperationType.ADD;
            if (memory % 1.0 == 0) {
                showNumber = Integer.toString(((int) (memory)));
            } else {
                showNumber = Double.toString((memory));
            }
            txAHistoryStr += ("+" + showNumber);
            jButtonEqualsActionPerformed(evt);
        }
    }//GEN-LAST:event_jButtonMemoryAddActionPerformed

    private void jButtonRecoverMemoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecoverMemoryActionPerformed
        // TODO add your handling code here:
        if (!showNumber.equals("")) {
            txAHistoryStr = txAHistoryStr.substring(0, (txAHistoryStr.length()) - showNumber.length());
        }
        if (memory % 1.0 == 0) {
            showNumber = Integer.toString(((int) (memory)));
        } else {
            showNumber = Double.toString((memory));

        }
        TxfScreen.setText(showNumber);
        showNumber = showNumber.replace(".", ",");
        txAHistoryStr = txAHistoryStr + showNumber;
        TxfLive.setText(txAHistoryStr);
        TxfScreen.setText(showNumber);
    }//GEN-LAST:event_jButtonRecoverMemoryActionPerformed

    private void jButtonSQRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSQRTActionPerformed
        // TODO add your handling code here:
        if (!showNumber.equals("")) {
            String aux = showNumber;
            showNumber = showNumber.replace(",", ".");
            result = Double.parseDouble(showNumber);
            jButtonClearEndActionPerformed(evt);
            txAHistoryStr = txAHistoryStr + ("√[" + aux + "]");
            TxfLive.setText(txAHistoryStr);
            result = Math.sqrt(result);
            if (result % 1.0 == 0) {
                showNumber = Integer.toString(((int) (result)));
                TxfScreen.setText(showNumber);
            } else {
                showNumber = Double.toString((result));
                TxfScreen.setText(showNumber);
            }
            subOperation = OperationType.SQRT;
        }
    }//GEN-LAST:event_jButtonSQRTActionPerformed
    // </editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="SWITCHERS TEMAS">
    private void jMenuItemAquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAquaActionPerformed
        // TODO add your handling code here:

        setAqua(evt.getActionCommand());
    }//GEN-LAST:event_jMenuItemAquaActionPerformed

    private void jMenuItemNimbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNimbusActionPerformed
        // TODO add your handling code here:
        setNimbus();
    }//GEN-LAST:event_jMenuItemNimbusActionPerformed

    private void jMenuItemMetalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMetalActionPerformed
        // TODO add your handling code here:
        setMetal();
    }//GEN-LAST:event_jMenuItemMetalActionPerformed

    private void jMenuItemWindowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemWindowsActionPerformed
        // TODO add your handling code here:
        setWindows();
    }//GEN-LAST:event_jMenuItemWindowsActionPerformed
    // </editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="TEMA AQUA">  
    private void setAqua(String aquaType) {
        switch (aquaType) {
            case "3":
                System.setProperty("Quaqua.design", "Panther");
                System.setProperty(
                        "Quaqua.tabLayoutPolicy", "wrap");
                // System.setProperty("Quaqua.design", "Lion");
                // set the Quaqua Look and Feel in the UIManager
                try {
                    UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager.getLookAndFeel());
                    // set UI manager properties here that affect Quaqua

                } catch (Exception e) {
                    // take an appropriate action here
                }
                break;
            case "6":
                System.setProperty("Quaqua.design", "Snow Leopard");
                System.setProperty(
                        "Quaqua.tabLayoutPolicy", "wrap");
                // System.setProperty("Quaqua.design", "Lion");
                // set the Quaqua Look and Feel in the UIManager
                try {
                    UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager.getLookAndFeel());
                    // set UI manager properties here that affect Quaqua

                } catch (Exception e) {
                    // take an appropriate action here
                }
                break;
            case "X":
                try {
                    UIManager.setLookAndFeel("com.apple.laf.AquaLookAndFeel");

                } catch (Exception e) {
                    // take an appropriate action here
                }
                break;
            default:
                throw new AssertionError();
        }

        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setVisible(false);
        this.dispose();
        new AquaCalculator().setVisible(true);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAquaColors();
    }

    private void setWindows() {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            // set UI manager properties here that affect Quaqua

        } catch (Exception e) {
            // take an appropriate action here
        }
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setVisible(false);
        this.dispose();
        new AquaCalculator().setVisible(true);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAquaColors();
    }
    //</editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="COLORES AQUA">  
    private void setAquaColors() {
        jButtonBack.setForeground(new java.awt.Color(0, 0, 0));
        jButtonChangeSign.setForeground(new java.awt.Color(0, 0, 0));
        jButtonClear.setForeground(new java.awt.Color(0, 0, 0));
        jButtonClearEnd.setForeground(new java.awt.Color(0, 0, 0));
        jButtonClearHistory.setForeground(new java.awt.Color(0, 0, 0));
        jButtonComma.setForeground(new java.awt.Color(0, 0, 0));
        jButtonDivide.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEight.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEquals.setForeground(new java.awt.Color(0, 0, 0));
        jButtonFive.setForeground(new java.awt.Color(0, 0, 0));
        jButtonFour.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLess.setForeground(new java.awt.Color(0, 0, 0));
        jButtonMemoryAdd.setForeground(new java.awt.Color(0, 0, 0));
        jButtonMemoryClear.setForeground(new java.awt.Color(0, 0, 0));
        jButtonMemoryLess.setForeground(new java.awt.Color(0, 0, 0));
        jButtonMemorySave.setForeground(new java.awt.Color(0, 0, 0));
        jButtonMultiply.setForeground(new java.awt.Color(0, 0, 0));
        jButtonNine.setForeground(new java.awt.Color(0, 0, 0));
        jButtonOne.setForeground(new java.awt.Color(0, 0, 0));
        jButtonPercent.setForeground(new java.awt.Color(0, 0, 0));
        jButtonPlus.setForeground(new java.awt.Color(0, 0, 0));
        jButtonReciproc.setForeground(new java.awt.Color(0, 0, 0));
        jButtonReciproc.setFont(new java.awt.Font("TrebuchetMS", 1, 12));
        jButtonRecoverMemory.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSQRT.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSeven.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSix.setForeground(new java.awt.Color(0, 0, 0));
        jButtonTrhee.setForeground(new java.awt.Color(0, 0, 0));
        jButtonTwo.setForeground(new java.awt.Color(0, 0, 0));
        jButtonZero.setForeground(new java.awt.Color(0, 0, 0));
        jToggleConverters.setForeground(new java.awt.Color(0, 0, 0));
        jMenuEdit.setForeground(new java.awt.Color(0, 0, 0));
        jMenuPrecision.setForeground(new java.awt.Color(0, 0, 0));
        jMenuCalculator.setForeground(new java.awt.Color(0, 0, 0));
        jMenuAppereance.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItemAqua.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItemMetal.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItemNimbus.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonNoDecimals.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonOneDecimal.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonTwoDecimals.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonThreeDecimals.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonFourDecimals.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonFiveDecimals.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonSixDecimals.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonSevenDecimals.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonEightDecimals.setForeground(new java.awt.Color(0, 0, 0));
        jMenuCopy.setForeground(new java.awt.Color(0, 0, 0));
        jMenuPaste.setForeground(new java.awt.Color(0, 0, 0));
        TxAHistory.setBackground(new java.awt.Color(255, 255, 255));
        TxAHistory.setForeground(new java.awt.Color(0, 0, 0));
    }

    //</editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="COLORES METAL">  
    private void setMetalStyle() {
        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        aboutDialog.setBackground(new java.awt.Color(51, 51, 51));
        jPanelAbout.setBackground(new java.awt.Color(51, 51, 51));
        jLabelImage.setBackground(new java.awt.Color(51, 51, 51));
        jLabelCalculator.setForeground(new java.awt.Color(238, 238, 238));
        jTextAreaInfo.setBackground(new java.awt.Color(51, 51, 51));
        jTextAreaInfo.setForeground(new java.awt.Color(238, 238, 238));
        this.setBackground(new java.awt.Color(51, 51, 51));
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.setForeground(new java.awt.Color(238, 238, 238));
        jButtonTwo.setBackground(new java.awt.Color(51, 51, 51));
        jButtonTwo.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonTwo.setForeground(new java.awt.Color(238, 238, 238));
        jButtonOne.setBackground(new java.awt.Color(51, 51, 51));
        jButtonOne.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonOne.setForeground(new java.awt.Color(238, 238, 238));
        jButtonComma.setBackground(new java.awt.Color(51, 51, 51));
        jButtonComma.setFont(new java.awt.Font("Trebuchet MS", 1, 13));
        jButtonComma.setForeground(new java.awt.Color(238, 238, 238));
        jButtonZero.setBackground(new java.awt.Color(51, 51, 51));
        jButtonZero.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonZero.setForeground(new java.awt.Color(238, 238, 238));
        jButtonSix.setBackground(new java.awt.Color(51, 51, 51));
        jButtonSix.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonSix.setForeground(new java.awt.Color(238, 238, 238));
        jButtonFour.setBackground(new java.awt.Color(51, 51, 51));
        jButtonFour.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonFour.setForeground(new java.awt.Color(238, 238, 238));
        jButtonFive.setBackground(new java.awt.Color(51, 51, 51));
        jButtonFive.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonFive.setForeground(new java.awt.Color(238, 238, 238));
        jButtonNine.setBackground(new java.awt.Color(51, 51, 51));
        jButtonNine.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonNine.setForeground(new java.awt.Color(238, 238, 238));
        jButtonSeven.setBackground(new java.awt.Color(51, 51, 51));
        jButtonSeven.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonSeven.setForeground(new java.awt.Color(238, 238, 238));
        jButtonEight.setBackground(new java.awt.Color(51, 51, 51));
        jButtonEight.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonEight.setForeground(new java.awt.Color(238, 238, 238));
        jButtonTrhee.setBackground(new java.awt.Color(51, 51, 51));
        jButtonTrhee.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonTrhee.setForeground(new java.awt.Color(238, 238, 238));
        jButtonPlus.setBackground(new java.awt.Color(51, 51, 51));
        jButtonPlus.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonPlus.setForeground(new java.awt.Color(238, 238, 238));
        jButtonDivide.setBackground(new java.awt.Color(51, 51, 51));
        jButtonDivide.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonDivide.setForeground(new java.awt.Color(238, 238, 238));
        jButtonMultiply.setBackground(new java.awt.Color(51, 51, 51));
        jButtonMultiply.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonMultiply.setForeground(new java.awt.Color(238, 238, 238));
        jButtonLess.setBackground(new java.awt.Color(51, 51, 51));
        jButtonLess.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonLess.setForeground(new java.awt.Color(238, 238, 238));
        jButtonReciproc.setBackground(new java.awt.Color(51, 51, 51));
        jButtonReciproc.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonReciproc.setForeground(new java.awt.Color(238, 238, 238));
        jButtonEquals.setBackground(new java.awt.Color(51, 51, 51));
        jButtonEquals.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jButtonEquals.setForeground(new java.awt.Color(238, 238, 238));
        jButtonClearEnd.setBackground(new java.awt.Color(51, 51, 51));
        jButtonClearEnd.setFont(new java.awt.Font("Trebuchet MS", 1, 13));
        jButtonClearEnd.setForeground(new java.awt.Color(238, 238, 238));
        jButtonBack.setBackground(new java.awt.Color(51, 51, 51));
        jButtonBack.setFont(new java.awt.Font("Trebuchet MS", 1, 13));
        jButtonBack.setForeground(new java.awt.Color(238, 238, 238));
        jButtonClear.setBackground(new java.awt.Color(51, 51, 51));
        jButtonClear.setFont(new java.awt.Font("Trebuchet MS", 1, 13));
        jButtonClear.setForeground(new java.awt.Color(238, 238, 238));
        TxfLive.setBackground(new java.awt.Color(51, 51, 51));
        TxfLive.setFont(new java.awt.Font("Monospaced", 1, 12));
        TxfLive.setForeground(new java.awt.Color(238, 238, 238));
        TxAHistory.setBackground(new java.awt.Color(51, 51, 51));
        TxAHistory.setColumns(20);
        TxAHistory.setFont(new java.awt.Font("Monospaced", 1, 12));
        TxAHistory.setForeground(new java.awt.Color(238, 238, 238));
        TxfScreen.setBackground(new java.awt.Color(51, 51, 51));
        TxfScreen.setForeground(new java.awt.Color(238, 238, 238));
        TxfScreen.setFont(new java.awt.Font("Monospaced", 1, 18));
        jButtonClearHistory.setBackground(new java.awt.Color(51, 51, 51));
        jButtonClearHistory.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jButtonClearHistory.setForeground(new java.awt.Color(238, 238, 238));
        jButtonChangeSign.setBackground(new java.awt.Color(51, 51, 51));
        jButtonChangeSign.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonChangeSign.setForeground(new java.awt.Color(238, 238, 238));
        jToggleConverters.setBackground(new java.awt.Color(51, 51, 51));
        jToggleConverters.setFont(new java.awt.Font("Trebuchet MS", 1, 13));
        jToggleConverters.setForeground(new java.awt.Color(238, 238, 238));
        jTabbedPaneConversors.setBackground(new java.awt.Color(51, 51, 51));
        jPanelDegrees.setBackground(new java.awt.Color(51, 51, 51));
        jPanelDistances.setBackground(new java.awt.Color(51, 51, 51));
        TxfCDegrees.setForeground(new java.awt.Color(238, 238, 238));
        TxfCDegrees.setFont(new java.awt.Font("Monospaced", 1, 18));
        TxfFDegrees.setForeground(new java.awt.Color(238, 238, 238));
        TxfFDegrees.setFont(new java.awt.Font("Monospaced", 1, 18));
        TxfKDegrees.setForeground(new java.awt.Color(238, 238, 238));
        TxfKDegrees.setFont(new java.awt.Font("Monospaced", 1, 18));
        TxfCDegrees.setBackground(new java.awt.Color(51, 51, 51));
        TxfFDegrees.setBackground(new java.awt.Color(51, 51, 51));
        TxfKDegrees.setBackground(new java.awt.Color(51, 51, 51));
        jLabelFarenheit.setForeground(new java.awt.Color(238, 238, 238));
        jLabelKelvin.setForeground(new java.awt.Color(238, 238, 238));
        jLabelCelsius.setForeground(new java.awt.Color(238, 238, 238));
        jLabelCelsius.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabelFarenheit.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabelKelvin.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        TxfKMH.setForeground(new java.awt.Color(238, 238, 238));
        TxfKMH.setBackground(new java.awt.Color(51, 51, 51));
        TxfKMH.setFont(new java.awt.Font("Monospaced", 1, 18));
        TxfMPH.setBackground(new java.awt.Color(51, 51, 51));
        TxfMPH.setForeground(new java.awt.Color(238, 238, 238));
        TxfMPH.setFont(new java.awt.Font("Monospaced", 1, 18));
        TxfKnot.setBackground(new java.awt.Color(51, 51, 51));
        TxfKnot.setForeground(new java.awt.Color(238, 238, 238));
        TxfKnot.setFont(new java.awt.Font("Monospaced", 1, 18));
        jLabelKMH.setForeground(new java.awt.Color(238, 238, 238));
        jLabelMPH.setForeground(new java.awt.Color(238, 238, 238));
        jLabelKN.setForeground(new java.awt.Color(238, 238, 238));
        jLabelKMH.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabelMPH.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabelKN.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonMemorySave.setBackground(new java.awt.Color(51, 51, 51));
        jButtonMemorySave.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonMemorySave.setForeground(new java.awt.Color(238, 238, 238));
        jButtonMemoryClear.setBackground(new java.awt.Color(51, 51, 51));
        jButtonMemoryClear.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonMemoryClear.setForeground(new java.awt.Color(238, 238, 238));
        jButtonMemoryLess.setBackground(new java.awt.Color(51, 51, 51));
        jButtonMemoryLess.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonMemoryLess.setForeground(new java.awt.Color(238, 238, 238));
        jButtonMemoryAdd.setBackground(new java.awt.Color(51, 51, 51));
        jButtonMemoryAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonMemoryAdd.setForeground(new java.awt.Color(238, 238, 238));
        jButtonRecoverMemory.setBackground(new java.awt.Color(51, 51, 51));
        jButtonRecoverMemory.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonRecoverMemory.setForeground(new java.awt.Color(238, 238, 238));
        TxfMemory.setBackground(new java.awt.Color(51, 51, 51));
        TxfMemory.setForeground(new java.awt.Color(238, 238, 238));
        TxfMemory.setFont(new java.awt.Font("Monospaced", 1, 18));
        jButtonSQRT.setBackground(new java.awt.Color(51, 51, 51));
        jButtonSQRT.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonSQRT.setForeground(new java.awt.Color(238, 238, 238));
        jButtonPercent.setBackground(new java.awt.Color(51, 51, 51));
        jButtonPercent.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonPercent.setForeground(new java.awt.Color(238, 238, 238));
        jMenuBar1.setForeground(new java.awt.Color(238, 238, 238));
        jMenuEdit.setForeground(new java.awt.Color(238, 238, 238));
        jMenuCopy.setForeground(new java.awt.Color(238, 238, 238));
        jMenuPaste.setForeground(new java.awt.Color(238, 238, 238));
        jMenuPrecision.setForeground(new java.awt.Color(238, 238, 238));
        jRadioButtonNoDecimals.setForeground(new java.awt.Color(238, 238, 238));
        jRadioButtonOneDecimal.setForeground(new java.awt.Color(238, 238, 238));
        jRadioButtonTwoDecimals.setForeground(new java.awt.Color(238, 238, 238));
        jRadioButtonThreeDecimals.setForeground(new java.awt.Color(238, 238, 238));
        jRadioButtonFourDecimals.setForeground(new java.awt.Color(238, 238, 238));
        jRadioButtonFiveDecimals.setForeground(new java.awt.Color(238, 238, 238));
        jRadioButtonSixDecimals.setForeground(new java.awt.Color(238, 238, 238));
        jRadioButtonSevenDecimals.setForeground(new java.awt.Color(238, 238, 238));
        jRadioButtonEightDecimals.setForeground(new java.awt.Color(238, 238, 238));
        jMenuCalculator.setForeground(new java.awt.Color(238, 238, 238));
        jMenuAbout.setForeground(new java.awt.Color(238, 238, 238));
        jMenuAppereance.setForeground(new java.awt.Color(238, 238, 238));
        jMenuItemAquaSnow.setForeground(new java.awt.Color(238, 238, 238));
        jMenuItemAquaPanther.setForeground(new java.awt.Color(238, 238, 238));
        jMenuItemAqua.setForeground(new java.awt.Color(238, 238, 238));
        jMenuItemMetal.setForeground(new java.awt.Color(238, 238, 238));
        jMenuItemNimbus.setForeground(new java.awt.Color(238, 238, 238));
        jMenuItemWindows.setForeground(new java.awt.Color(238, 238, 238));
        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuEdit.setBackground(new java.awt.Color(51, 51, 51));
        jMenuCopy.setBackground(new java.awt.Color(51, 51, 51));
        jMenuPaste.setBackground(new java.awt.Color(51, 51, 51));
        jMenuPrecision.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButtonNoDecimals.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButtonOneDecimal.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButtonTwoDecimals.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButtonThreeDecimals.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButtonFourDecimals.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButtonFiveDecimals.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButtonSixDecimals.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButtonSevenDecimals.setBackground(new java.awt.Color(51, 51, 51));
        jRadioButtonEightDecimals.setBackground(new java.awt.Color(51, 51, 51));
        jMenuCalculator.setBackground(new java.awt.Color(51, 51, 51));
        jMenuAbout.setBackground(new java.awt.Color(51, 51, 51));
        jMenuAppereance.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItemAquaSnow.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItemAquaPanther.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItemAqua.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItemMetal.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItemNimbus.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItemWindows.setBackground(new java.awt.Color(51, 51, 51));

    }
    //</editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="COLORES ESTANDAR">  
    private void setStyle() {
        aboutDialog.setBackground(new java.awt.Color(204, 204, 255));
        jPanelAbout.setBackground(new java.awt.Color(204, 204, 255));
        jLabelImage.setBackground(new java.awt.Color(204, 204, 255));
        jLabelCalculator.setForeground(new java.awt.Color(106, 68, 138));
        jTextAreaInfo.setBackground(new java.awt.Color(204, 204, 255));
        jTextAreaInfo.setForeground(new java.awt.Color(106, 68, 138));
        this.setBackground(new java.awt.Color(64, 40, 89));
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.setForeground(new java.awt.Color(153, 51, 255));
        jButtonTwo.setBackground(new java.awt.Color(108, 81, 136));
        jButtonTwo.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonTwo.setForeground(new java.awt.Color(204, 204, 255));
        jButtonOne.setBackground(new java.awt.Color(108, 81, 136));
        jButtonOne.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonOne.setForeground(new java.awt.Color(204, 204, 255));
        jButtonComma.setBackground(new java.awt.Color(53, 32, 83));
        jButtonComma.setFont(new java.awt.Font("Trebuchet MS", 1, 13));
        jButtonComma.setForeground(new java.awt.Color(204, 204, 255));
        jButtonZero.setBackground(new java.awt.Color(108, 81, 136));
        jButtonZero.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonZero.setForeground(new java.awt.Color(204, 204, 255));
        jButtonSix.setBackground(new java.awt.Color(108, 81, 136));
        jButtonSix.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonSix.setForeground(new java.awt.Color(204, 204, 255));
        jButtonFour.setBackground(new java.awt.Color(108, 81, 136));
        jButtonFour.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonFour.setForeground(new java.awt.Color(204, 204, 255));
        jButtonFive.setBackground(new java.awt.Color(108, 81, 136));
        jButtonFive.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonFive.setForeground(new java.awt.Color(204, 204, 255));
        jButtonNine.setBackground(new java.awt.Color(108, 81, 136));
        jButtonNine.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonNine.setForeground(new java.awt.Color(204, 204, 255));
        jButtonSeven.setBackground(new java.awt.Color(108, 81, 136));
        jButtonSeven.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonSeven.setForeground(new java.awt.Color(204, 204, 255));
        jButtonEight.setBackground(new java.awt.Color(108, 81, 136));
        jButtonEight.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonEight.setForeground(new java.awt.Color(204, 204, 255));
        jButtonTrhee.setBackground(new java.awt.Color(108, 81, 136));
        jButtonTrhee.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonTrhee.setForeground(new java.awt.Color(204, 204, 255));
        jButtonPlus.setBackground(new java.awt.Color(165, 151, 184));
        jButtonPlus.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonPlus.setForeground(new java.awt.Color(90, 48, 115));
        jButtonDivide.setBackground(new java.awt.Color(165, 151, 184));
        jButtonDivide.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonDivide.setForeground(new java.awt.Color(90, 48, 115));
        jButtonMultiply.setBackground(new java.awt.Color(165, 151, 184));
        jButtonMultiply.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonMultiply.setForeground(new java.awt.Color(90, 48, 115));
        jButtonLess.setBackground(new java.awt.Color(165, 151, 184));
        jButtonLess.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonLess.setForeground(new java.awt.Color(90, 48, 115));
        jButtonReciproc.setBackground(new java.awt.Color(165, 151, 184));
        jButtonReciproc.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonReciproc.setForeground(new java.awt.Color(90, 48, 115));
        jButtonEquals.setBackground(new java.awt.Color(165, 151, 184));
        jButtonEquals.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jButtonEquals.setForeground(new java.awt.Color(90, 48, 115));
        jButtonClearEnd.setBackground(new java.awt.Color(165, 151, 184));
        jButtonClearEnd.setFont(new java.awt.Font("Trebuchet MS", 1, 13));
        jButtonClearEnd.setForeground(new java.awt.Color(90, 48, 115));
        jButtonBack.setBackground(new java.awt.Color(165, 151, 184));
        jButtonBack.setFont(new java.awt.Font("Trebuchet MS", 1, 13));
        jButtonBack.setForeground(new java.awt.Color(90, 48, 115));
        jButtonClear.setBackground(new java.awt.Color(165, 151, 184));
        jButtonClear.setFont(new java.awt.Font("Trebuchet MS", 1, 13));
        jButtonClear.setForeground(new java.awt.Color(90, 48, 115));
        TxfLive.setBackground(new java.awt.Color(108, 81, 136));
        TxfLive.setFont(new java.awt.Font("Monospaced", 1, 12));
        TxfLive.setForeground(new java.awt.Color(204, 204, 255));
        TxAHistory.setBackground(new java.awt.Color(108, 81, 136));
        TxAHistory.setColumns(20);
        TxAHistory.setFont(new java.awt.Font("Monospaced", 1, 12));
        TxAHistory.setForeground(new java.awt.Color(204, 204, 255));
        TxfScreen.setBackground(new java.awt.Color(165, 151, 184));
        TxfScreen.setFont(new java.awt.Font("Monospaced", 1, 18));
        TxfScreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jButtonClearHistory.setBackground(new java.awt.Color(108, 81, 136));
        jButtonClearHistory.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jButtonClearHistory.setForeground(new java.awt.Color(204, 204, 255));
        jButtonChangeSign.setBackground(new java.awt.Color(53, 32, 83));
        jButtonChangeSign.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonChangeSign.setForeground(new java.awt.Color(204, 204, 255));
        jToggleConverters.setBackground(new java.awt.Color(165, 151, 184));
        jToggleConverters.setFont(new java.awt.Font("Trebuchet MS", 1, 13));
        jToggleConverters.setForeground(new java.awt.Color(90, 48, 115));
        jTabbedPaneConversors.setBackground(new java.awt.Color(204, 204, 255));
        jPanelDegrees.setBackground(new java.awt.Color(165, 151, 184));
        jPanelDegrees.setFocusable(false);
        jPanelDegrees.setName("Degrees");
        TxfCDegrees.setBackground(new java.awt.Color(165, 151, 184));
        TxfCDegrees.setFont(new java.awt.Font("Monospaced", 1, 18));
        TxfFDegrees.setEditable(false);
        TxfFDegrees.setBackground(new java.awt.Color(165, 151, 184));
        TxfFDegrees.setFont(new java.awt.Font("Monospaced", 1, 18));
        TxfKDegrees.setBackground(new java.awt.Color(165, 151, 184));
        TxfKDegrees.setFont(new java.awt.Font("Monospaced", 1, 18));
        jLabelCelsius.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabelCelsius.setText("Grados Centígrados");
        jLabelFarenheit.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabelFarenheit.setText("Grados Farenheit");
        jLabelKelvin.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabelKelvin.setText("Grados Kelvin");
        jPanelDistances.setBackground(new java.awt.Color(165, 151, 184));
        jPanelDistances.setFocusable(false);
        jPanelDistances.setName("Distances");
        TxfKMH.setBackground(new java.awt.Color(165, 151, 184));
        TxfKMH.setFont(new java.awt.Font("Monospaced", 1, 18));
        TxfMPH.setBackground(new java.awt.Color(165, 151, 184));
        TxfMPH.setFont(new java.awt.Font("Monospaced", 1, 18));
        TxfMPH.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxfKnot.setBackground(new java.awt.Color(165, 151, 184));
        TxfKnot.setFont(new java.awt.Font("Monospaced", 1, 18));
        jLabelKMH.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabelKMH.setText("Kilómetros por hora");
        jLabelMPH.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabelMPH.setText("Millas por hora");
        jLabelKN.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabelKN.setText("Nudos");
        jButtonMemorySave.setBackground(new java.awt.Color(225, 204, 255));
        jButtonMemorySave.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonMemorySave.setForeground(new java.awt.Color(90, 48, 115));
        jButtonMemoryClear.setBackground(new java.awt.Color(225, 204, 255));
        jButtonMemoryClear.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonMemoryClear.setForeground(new java.awt.Color(90, 48, 115));
        jButtonMemoryLess.setBackground(new java.awt.Color(225, 204, 255));
        jButtonMemoryLess.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonMemoryLess.setForeground(new java.awt.Color(90, 48, 115));
        jButtonMemoryAdd.setBackground(new java.awt.Color(225, 204, 255));
        jButtonMemoryAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonMemoryAdd.setForeground(new java.awt.Color(90, 48, 115));
        jButtonRecoverMemory.setBackground(new java.awt.Color(225, 204, 255));
        jButtonRecoverMemory.setFont(new java.awt.Font("Trebuchet MS", 1, 11));
        jButtonRecoverMemory.setForeground(new java.awt.Color(90, 48, 115));
        TxfMemory.setEditable(false);
        TxfMemory.setBackground(new java.awt.Color(165, 151, 184));
        TxfMemory.setFont(new java.awt.Font("Monospaced", 1, 18));
        jButtonSQRT.setBackground(new java.awt.Color(165, 151, 184));
        jButtonSQRT.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonSQRT.setForeground(new java.awt.Color(90, 48, 115));
        jButtonPercent.setBackground(new java.awt.Color(165, 151, 184));
        jButtonPercent.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jButtonPercent.setForeground(new java.awt.Color(90, 48, 115));
        jMenuBar1.setForeground(new java.awt.Color(88, 65, 115));
        jMenuEdit.setForeground(new java.awt.Color(88, 65, 115));
        jMenuCopy.setForeground(new java.awt.Color(88, 65, 115));
        jMenuPaste.setForeground(new java.awt.Color(88, 65, 115));
        jMenuPrecision.setForeground(new java.awt.Color(88, 65, 115));
        jRadioButtonNoDecimals.setForeground(new java.awt.Color(88, 65, 115));
        jRadioButtonOneDecimal.setForeground(new java.awt.Color(88, 65, 115));
        jRadioButtonTwoDecimals.setForeground(new java.awt.Color(88, 65, 115));
        jRadioButtonThreeDecimals.setForeground(new java.awt.Color(88, 65, 115));
        jRadioButtonFourDecimals.setForeground(new java.awt.Color(88, 65, 115));
        jRadioButtonFiveDecimals.setForeground(new java.awt.Color(88, 65, 115));
        jRadioButtonSixDecimals.setForeground(new java.awt.Color(88, 65, 115));
        jRadioButtonSevenDecimals.setForeground(new java.awt.Color(88, 65, 115));
        jRadioButtonEightDecimals.setForeground(new java.awt.Color(88, 65, 115));
        jMenuCalculator.setForeground(new java.awt.Color(88, 65, 115));
        jMenuAbout.setForeground(new java.awt.Color(88, 65, 115));
        jMenuAppereance.setForeground(new java.awt.Color(88, 65, 115));
        jMenuItemAquaSnow.setForeground(new java.awt.Color(88, 65, 115));
        jMenuItemAquaPanther.setForeground(new java.awt.Color(88, 65, 115));
        jMenuItemAqua.setForeground(new java.awt.Color(88, 65, 115));
        jMenuItemMetal.setForeground(new java.awt.Color(88, 65, 115));
        jMenuItemNimbus.setForeground(new java.awt.Color(88, 65, 115));
        jMenuItemWindows.setForeground(new java.awt.Color(88, 65, 115));
    }
    //</editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="TEMA METAL">  
    private void setMetal() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AquaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setVisible(false);
        this.dispose();
        new AquaCalculator().setVisible(true);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    //</editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="TEMA NIMBUS">
    private void setNimbus() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AquaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setVisible(false);
        this.dispose();
        new AquaCalculator().setVisible(true);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //SwingUtilities.updateComponentTreeUI(this);

    }
    // </editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AquaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // set system properties here that affect Quaqua
        // for example the default layout policy for tabbed
        // panes:

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AquaCalculator().setVisible(true);
            }
        });
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    // <editor-fold defaultstate="collapsed" desc="DECLARACIÓN DE ELEMENTOS GRÁFICOS">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TxAHistory;
    private javax.swing.JTextField TxfCDegrees;
    private javax.swing.JTextField TxfFDegrees;
    private javax.swing.JTextField TxfKDegrees;
    private javax.swing.JTextField TxfKMH;
    private javax.swing.JTextField TxfKnot;
    private javax.swing.JTextField TxfLive;
    private javax.swing.JTextField TxfMPH;
    private javax.swing.JTextField TxfMemory;
    private javax.swing.JTextField TxfScreen;
    private javax.swing.JFrame aboutDialog;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonChangeSign;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonClearEnd;
    private javax.swing.JButton jButtonClearHistory;
    private javax.swing.JButton jButtonComma;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonEight;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonFive;
    private javax.swing.JButton jButtonFour;
    private javax.swing.JButton jButtonLess;
    private javax.swing.JButton jButtonMemoryAdd;
    private javax.swing.JButton jButtonMemoryClear;
    private javax.swing.JButton jButtonMemoryLess;
    private javax.swing.JButton jButtonMemorySave;
    private javax.swing.JButton jButtonMultiply;
    private javax.swing.JButton jButtonNine;
    private javax.swing.JButton jButtonOne;
    private javax.swing.JButton jButtonPercent;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonReciproc;
    private javax.swing.JButton jButtonRecoverMemory;
    private javax.swing.JButton jButtonSQRT;
    private javax.swing.JButton jButtonSeven;
    private javax.swing.JButton jButtonSix;
    private javax.swing.JButton jButtonTrhee;
    private javax.swing.JButton jButtonTwo;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JLabel jLabelCalculator;
    private javax.swing.JLabel jLabelCelsius;
    private javax.swing.JLabel jLabelFarenheit;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelKMH;
    private javax.swing.JLabel jLabelKN;
    private javax.swing.JLabel jLabelKelvin;
    private javax.swing.JLabel jLabelMPH;
    private javax.swing.JMenuItem jMenuAbout;
    private javax.swing.JMenu jMenuAppereance;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCalculator;
    private javax.swing.JMenuItem jMenuCopy;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenuItem jMenuItemAqua;
    private javax.swing.JMenuItem jMenuItemAquaPanther;
    private javax.swing.JMenuItem jMenuItemAquaSnow;
    private javax.swing.JMenuItem jMenuItemMetal;
    private javax.swing.JMenuItem jMenuItemNimbus;
    private javax.swing.JMenuItem jMenuItemWindows;
    private javax.swing.JMenuItem jMenuPaste;
    private javax.swing.JMenu jMenuPrecision;
    private javax.swing.JPanel jPanelAbout;
    private javax.swing.JPanel jPanelDegrees;
    private javax.swing.JPanel jPanelDistances;
    private javax.swing.JRadioButtonMenuItem jRadioButtonEightDecimals;
    private javax.swing.JRadioButtonMenuItem jRadioButtonFiveDecimals;
    private javax.swing.JRadioButtonMenuItem jRadioButtonFourDecimals;
    private javax.swing.JRadioButtonMenuItem jRadioButtonNoDecimals;
    private javax.swing.JRadioButtonMenuItem jRadioButtonOneDecimal;
    private javax.swing.JRadioButtonMenuItem jRadioButtonSevenDecimals;
    private javax.swing.JRadioButtonMenuItem jRadioButtonSixDecimals;
    private javax.swing.JRadioButtonMenuItem jRadioButtonThreeDecimals;
    private javax.swing.JRadioButtonMenuItem jRadioButtonTwoDecimals;
    private javax.swing.JScrollPane jScrollHistory;
    private javax.swing.JScrollPane jScrollInfo;
    private javax.swing.JTabbedPane jTabbedPaneConversors;
    private javax.swing.JTextArea jTextAreaInfo;
    private javax.swing.JToggleButton jToggleConverters;
    private javax.swing.ButtonGroup precisionDecimalsGroup;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
    ////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////
}