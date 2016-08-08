/**
 */
package simulacion;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 * @author Gabriel Rodriguez
 */
public class SimulacionGUI extends JFrame {

    // VARIABLES
    // titulo de la vista principal
    private String titulo;

    // variable y metodo que modifica el tamaño de la ventana y actualiza la vista.
    private Dimension tamaño;

    public void setTamaño(int ancho, int altura) {
        this.tamaño = new Dimension(ancho, altura);
        setMaximumSize(tamaño);
        setMinimumSize(tamaño);
        setPreferredSize(tamaño);
        pack();
    }

    // VISTAS(JPanels)
    // PANEL PRINCIPAL - VISTA 1
    JPanel VistaPrincipal;

    private void oncreateVistaPrincipal() {
        VistaPrincipal = new JPanel();
        JButton BtnSalir = new JButton();
        JButton BtnProyecto = new JButton();
        JButton BtnMetodos = new JButton();

        VistaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        VistaPrincipal.setForeground(new java.awt.Color(0, 51, 51));
        // Se le asigna el tamaño de la ventana.
        VistaPrincipal.setMaximumSize(tamaño);
        VistaPrincipal.setMinimumSize(tamaño);
        VistaPrincipal.setPreferredSize(tamaño);
        VistaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnProyecto.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        BtnMetodos.setForeground(new java.awt.Color(0, 0, 0));
        BtnProyecto.setText("Proyecto");
        BtnProyecto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        //metodo
        BtnProyecto.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("Proyectos");
                // Removiendo de la ventana (Sacandola, no eliminandola) la vista actual
                removeComponent(VistaPrincipal);
                // Para Añadir (Cargar o enlazar) la vista a donde se quiere ir.
                addComponent(VistaProyecto1, "Center", "Proyecto");
                updateView();
            }
        });

        BtnMetodos.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        BtnMetodos.setForeground(new java.awt.Color(0, 102, 0));
        BtnMetodos.setText("Metodos");
        BtnMetodos.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("Metodos");
                System.out.println("Proyectos");
                // Removiendo de la ventana (Sacandola, no eliminandola) la vista actual
                removeComponent(VistaPrincipal);
                // Para Añadir (Cargar o enlazar) la vista a donde se quiere ir.
                addComponent(VistaMetodos1, "Center", "Metodos");
                updateView();
            }
        });

        BtnSalir.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(102, 0, 51));
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });

        int pos_inicialY = 200;
        int pos_inicialX = 280;
        int AlturaBtn = 40;
        // Recordar ubicar los elementos en los ejes X y Y.
        // AbsoluteLayout: AbsoluteConstraints(posicion en x, posicion en y, ancho del elemento,altura de elemento)
        VistaPrincipal.add(BtnProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(pos_inicialX + 30, pos_inicialY, 160, AlturaBtn));
        VistaPrincipal.add(BtnMetodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(pos_inicialX + 0, pos_inicialY += 50, 220, AlturaBtn));
        VistaPrincipal.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(pos_inicialX + 50, pos_inicialY += 50, 120, AlturaBtn));

    }

    JPanel VistaProyecto1;

    private void oncreateVistaProyecto1() {
        VistaProyecto1 = new JPanel();
        JLabel text2p1 = new javax.swing.JLabel();
        JComboBox cboxmetodop1 = new javax.swing.JComboBox();
        JLabel titlep1 = new javax.swing.JLabel();
        JSpinner spinnerdiasp1 = new javax.swing.JSpinner();
        JButton btnatrasp1 = new javax.swing.JButton();
        JButton btnsimularp1 = new javax.swing.JButton();
        JLabel text1p2 = new javax.swing.JLabel();
        JLabel text1p3 = new javax.swing.JLabel();
        JPanel formK = new javax.swing.JPanel();
        JLabel formKtext = new javax.swing.JLabel();
        JSpinner formKsp = new javax.swing.JSpinner();
        JPanel formXo = new javax.swing.JPanel();
        JLabel formXotext = new javax.swing.JLabel();
        JSpinner formXoSp = new javax.swing.JSpinner();
        JPanel formA = new javax.swing.JPanel();
        JLabel formAtext = new javax.swing.JLabel();
        JSpinner formAsp = new javax.swing.JSpinner();
        JPanel formC = new javax.swing.JPanel();
        JLabel formCtext = new javax.swing.JLabel();
        JSpinner formCsp = new javax.swing.JSpinner();
        JPanel formM = new javax.swing.JPanel();
        JLabel formMtext = new javax.swing.JLabel();
        JSpinner formMsp = new javax.swing.JSpinner();

        VistaProyecto1.setMaximumSize(new java.awt.Dimension(800, 600));
        VistaProyecto1.setMinimumSize(new java.awt.Dimension(800, 600));
        VistaProyecto1.setName("Form"); // NOI18N
        VistaProyecto1.setPreferredSize(new java.awt.Dimension(800, 600));
        VistaProyecto1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text2p1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        text2p1.setText("Seleccione el Numeros de Dias de Simulacion:");
        VistaProyecto1.add(text2p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 370, 30));

        /* Cuadrado Medio Vista Inicial
        formK.setVisible(true);
        formXo.setVisible(true);
        formA.setVisible(false);
        formC.setVisible(false);
        formM.setVisible(false);*/
           
        cboxmetodop1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        cboxmetodop1.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Cuadrado Medio", "Producto Medio", "Producto Medio Variado","Congruencial Multiplicativo", "Congruencial Mixto"}));
        cboxmetodop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println(cboxmetodop1.getSelectedIndex());
                switch (cboxmetodop1.getSelectedIndex()) {
                    case 0: {//Cuadrado Medio                   
                        formK.setVisible(true);
                        formXo.setVisible(true);
                        formA.setVisible(false);
                        formC.setVisible(false);
                        formM.setVisible(false);
                        break;
                    }
                    case 1: {//Producto Medio
                        formK.setVisible(true);
                        formXo.setVisible(true);
                        formA.setVisible(true);
                        formAtext.setText("X1:");
                        formC.setVisible(false);
                        formM.setVisible(false);
                        break;
                    }
                    case 2: {//Producto Medio Variado
                        formK.setVisible(true);
                        formXo.setVisible(true);
                        formA.setVisible(true);
                        formAtext.setText("a: ");
                        formC.setVisible(false);
                        formM.setVisible(false);
                        break;
                    }
                    case 3: {//Congruencial Multiplicativo
                        formK.setVisible(false);
                        formXo.setVisible(true);
                        formA.setVisible(true);
                        formAtext.setText("a: ");
                        formC.setVisible(false);
                        formM.setVisible(true);
                        break;
                    }
                    case 4: {//Congruencial Mixto
                        formK.setVisible(false);
                        formXo.setVisible(true);
                        formA.setVisible(true);
                        formAtext.setText("a: ");
                        formC.setVisible(true);
                        formM.setVisible(true);
                        break;
                    }
                }
            }
        });
        VistaProyecto1.add(cboxmetodop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 240, 30));

        titlep1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        titlep1.setForeground(new java.awt.Color(102, 102, 102));
        titlep1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlep1.setText("Proyecto");
        titlep1.setName("titlep1"); // NOI18N
        VistaProyecto1.add(titlep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 510, 60));

        spinnerdiasp1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        spinnerdiasp1.setModel(new javax.swing.SpinnerNumberModel(8, 1, 30, 1));
        spinnerdiasp1.setEditor(new javax.swing.JSpinner.NumberEditor(spinnerdiasp1, ""));
        VistaProyecto1.add(spinnerdiasp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 130, 30));

        btnatrasp1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnatrasp1.setText("Cancelar");
        btnatrasp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("Principal");
                // Removiendo de la ventana (Sacandola, no eliminandola) la vista actual
                removeComponent(VistaProyecto1);
                // Para Añadir (Cargar o enlazar) la vista a donde se quiere ir.
                addComponent(VistaPrincipal, "Center", "Menu Principal");
                updateView();
            }
        });
        VistaProyecto1.add(btnatrasp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 150, 40));

        btnsimularp1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnsimularp1.setText("Simular");
        btnsimularp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                  
                int x0 =(int) formXoSp.getValue();
                int k = (int)formKsp.getValue();
                int n = (int) spinnerdiasp1.getValue();
                int x1= (int) formAsp.getValue();
                int a = (int) formAsp.getValue();
                int m = (int) formMsp.getValue();
                int c = (int) formCsp.getValue();
                int g = (int) cboxmetodop1.getSelectedIndex()+1;
                
                Resultado R1 = new Resultado(x0, k, n, x1, a, m, c, g);
                R1.simulacion(n);
                new VentanaResultados(R1).setVisible(true);
                
            }
        });
        VistaProyecto1.add(btnsimularp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 150, 40));

        text1p2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        text1p2.setText("Seleccione el Metodo Generador:");
        VistaProyecto1.add(text1p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 260, 30));

        text1p3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        text1p3.setText("Parametros:");
        VistaProyecto1.add(text1p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, 30));

        formK.setMaximumSize(new java.awt.Dimension(70, 32));
        formK.setMinimumSize(new java.awt.Dimension(70, 32));
        formK.setPreferredSize(new java.awt.Dimension(70, 32));
        formK.setLayout(new javax.swing.BoxLayout(formK, javax.swing.BoxLayout.LINE_AXIS));

        formKtext.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formKtext.setText("K:  ");
        formK.add(formKtext);

        formKsp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formKsp.setModel(new javax.swing.SpinnerNumberModel(3, 2, 5, 1));
        formKsp.setMaximumSize(new java.awt.Dimension(45, 32));
        formKsp.setMinimumSize(new java.awt.Dimension(45, 32));
        formKsp.setPreferredSize(new java.awt.Dimension(45, 32));
        formKsp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                int lim = ((int) Math.pow(10,(int) formKsp.getValue()));
                System.out.println("lim "+ lim);
                formXoSp.setModel(new javax.swing.SpinnerNumberModel(lim-1, 0,lim-1, 1));
                formAsp.setModel(new javax.swing.SpinnerNumberModel(lim-1, 0,lim-1, 1));
            }
        });
        formK.add(formKsp);

        VistaProyecto1.add(formK, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 70, 30));

        formXo.setLayout(new javax.swing.BoxLayout(formXo, javax.swing.BoxLayout.LINE_AXIS));

        formXotext.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formXotext.setText(" Xo: ");
        formXo.add(formXotext);

        formXoSp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formXoSp.setModel(new javax.swing.SpinnerNumberModel(999, 0, 999, 1));
        formXoSp.setMaximumSize(new java.awt.Dimension(60, 32));
        formXoSp.setMinimumSize(new java.awt.Dimension(60, 32));
        formXoSp.setPreferredSize(new java.awt.Dimension(60, 32));
        formXo.add(formXoSp);

        VistaProyecto1.add(formXo, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 190, -1, 30));

        formA.setLayout(new javax.swing.BoxLayout(formA, javax.swing.BoxLayout.LINE_AXIS));

        formAtext.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formAtext.setText(" a: ");
        formA.add(formAtext);

        formAsp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formAsp.setModel(new javax.swing.SpinnerNumberModel(999, 0, 999, 1));
        formAsp.setMaximumSize(new java.awt.Dimension(60, 32));
        formAsp.setMinimumSize(new java.awt.Dimension(60, 32));
        formAsp.setPreferredSize(new java.awt.Dimension(60, 32));
        formA.add(formAsp);

        VistaProyecto1.add(formA, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 188, 90, -1));

        formC.setLayout(new javax.swing.BoxLayout(formC, javax.swing.BoxLayout.LINE_AXIS));

        formCtext.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formCtext.setText(" c: ");
        formC.add(formCtext);

        formCsp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formCsp.setModel(new javax.swing.SpinnerNumberModel(999, 0, 999, 1));
        formCsp.setMaximumSize(new java.awt.Dimension(60, 32));
        formCsp.setMinimumSize(new java.awt.Dimension(60, 32));
        formCsp.setPreferredSize(new java.awt.Dimension(60, 32));
        formC.add(formCsp);

        VistaProyecto1.add(formC, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 100, 30));

        formM.setLayout(new javax.swing.BoxLayout(formM, javax.swing.BoxLayout.LINE_AXIS));

        formMtext.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formMtext.setText(" m: ");
        formM.add(formMtext);

        formMsp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formMsp.setModel(new javax.swing.SpinnerNumberModel(1000, 0, 1000, 1));
        formMsp.setMaximumSize(new java.awt.Dimension(70, 32));
        formMsp.setMinimumSize(new java.awt.Dimension(70, 32));
        formM.add(formMsp);

        VistaProyecto1.add(formM, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 100, 30));
        
        // Mixto Vista Inicial
        formK.setVisible(true);
        formXo.setVisible(true);
        formA.setVisible(true);
        formC.setVisible(true);
        formAtext.setText("a: ");
        formM.setVisible(true);
        
  
         // Valores de prueba eliminar al terminar
         formXoSp.setModel(new javax.swing.SpinnerNumberModel(21, 0, 999, 1));
         spinnerdiasp1.setModel(new javax.swing.SpinnerNumberModel(8, 1, 30, 1));
         formAsp.setModel(new javax.swing.SpinnerNumberModel(17, 0, 999, 1));
         formCsp.setModel(new javax.swing.SpinnerNumberModel(23, 0, 999, 1));
         cboxmetodop1.setSelectedIndex(5-1);
        
    }

    JPanel VistaMetodos1;

    private void oncreateVistaMetodos1() {
        
        VistaMetodos1 = new JPanel();
        JComboBox cboxmetodop1 = new javax.swing.JComboBox();
        JLabel titlep1 = new javax.swing.JLabel();
        JButton btnatrasp1 = new javax.swing.JButton();
        JButton btngenerarp1 = new javax.swing.JButton();
        JLabel text1p2 = new javax.swing.JLabel();
        JLabel text1p3 = new javax.swing.JLabel();
        JPanel formK = new javax.swing.JPanel();
        JLabel formKtext = new javax.swing.JLabel();
        JSpinner formKsp = new javax.swing.JSpinner();
        JPanel formXo = new javax.swing.JPanel();
        JLabel formXotext = new javax.swing.JLabel();
        JSpinner formXosp = new javax.swing.JSpinner();
        JPanel formA = new javax.swing.JPanel();
        JLabel formAtext = new javax.swing.JLabel();
        JSpinner formAsp = new javax.swing.JSpinner();
        JPanel formC = new javax.swing.JPanel();
        JLabel formCtext = new javax.swing.JLabel();
        JSpinner formCsp = new javax.swing.JSpinner();
        JPanel formM = new javax.swing.JPanel();
        JLabel formMtext = new javax.swing.JLabel();
        JSpinner formMsp = new javax.swing.JSpinner();
        JLabel text3m1 = new javax.swing.JLabel();
        JSpinner spcantidadm1 = new javax.swing.JSpinner();
        
        // Cuadrado Medio Vista Inicial
        formK.setVisible(true);
        formXo.setVisible(true);
        formA.setVisible(false);
        formC.setVisible(false);
        formM.setVisible(false);

        VistaMetodos1.setMaximumSize(new java.awt.Dimension(800, 600));
        VistaMetodos1.setMinimumSize(new java.awt.Dimension(800, 600));
        VistaMetodos1.setPreferredSize(new java.awt.Dimension(800, 600));
        VistaMetodos1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboxmetodop1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        cboxmetodop1.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Cuadrado Medio", "Producto Medio", "Producto Medio Variado", "Congruencial Multiplicativo","Congruencial Mixto"}));
        cboxmetodop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println(cboxmetodop1.getSelectedIndex());
                switch (cboxmetodop1.getSelectedIndex()) {
                    case 0: {//Cuadrado Medio
                        formK.setVisible(true);
                        formXo.setVisible(true);
                        formA.setVisible(false);
                        formC.setVisible(false);
                        formM.setVisible(false);
                        break;
                    }
                    case 1: {//Producto Medio
                        formK.setVisible(true);
                        formXo.setVisible(true);
                        formA.setVisible(true);
                        formAtext.setText("X1:");
                        formC.setVisible(false);
                        formM.setVisible(false);
                        break;
                    }
                    case 2: {//Producto Medio Variado
                        formK.setVisible(true);
                        formXo.setVisible(true);
                        formA.setVisible(true);
                        formAtext.setText("a: ");
                        formC.setVisible(false);
                        formM.setVisible(false);
                        break;
                    }
                    case 3: {//Congruencial Multiplicativo
                        formK.setVisible(false);
                        formXo.setVisible(true);
                        formA.setVisible(true);
                        formAtext.setText("a: ");
                        formC.setVisible(false);
                        formM.setVisible(true);
                        break;
                    }
                    case 4: {//Congruencial Mixto
                        formK.setVisible(false);
                        formXo.setVisible(true);
                        formA.setVisible(true);
                        formAtext.setText("a: ");
                        formC.setVisible(true);
                        formM.setVisible(true);
                        break;
                    }

                };
            }
        });

        VistaMetodos1.add(cboxmetodop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 240, 30));

        titlep1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        titlep1.setForeground(new java.awt.Color(102, 102, 102));
        titlep1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlep1.setText("Metodos");
        titlep1.setName("titlep1"); // NOI18N
        VistaMetodos1.add(titlep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 510, 60));

        btnatrasp1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnatrasp1.setText("Cancelar");
        btnatrasp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("Principal");
                // Removiendo de la ventana (Sacandola, no eliminandola) la vista actual
                removeComponent(VistaMetodos1);
                // Para Añadir (Cargar o enlazar) la vista a donde se quiere ir.
                addComponent(VistaPrincipal, "Center", "Menu Principal");
                updateView();
            }
        });
        VistaMetodos1.add(btnatrasp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 150, 40));

        btngenerarp1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btngenerarp1.setText("Generar");
        btngenerarp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                int k = (int)formKsp.getValue();
                double xo = Double.valueOf(String.valueOf(formXosp.getValue()));
                int a = (int) formAsp.getValue();
                int c = (int) formCsp.getValue();
                int m = (int) formMsp.getValue();
                int n = (int) spcantidadm1.getValue();
                 
                new VentanaMetodos(cboxmetodop1.getSelectedIndex(),k,xo,a,c,m,n).setVisible(true); 
                System.out.println("");
            }
        });

        VistaMetodos1.add(btngenerarp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 150, 40));

        text1p2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        text1p2.setText("Seleccione el Metodo Generador:");
        VistaMetodos1.add(text1p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 260, 30));
       
        text1p3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        text1p3.setText("Parametros:");
        VistaMetodos1.add(text1p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, 30));
        
        formK.setPreferredSize(new java.awt.Dimension(70, 32));
        formK.setLayout(new javax.swing.BoxLayout(formK, javax.swing.BoxLayout.LINE_AXIS));
        formKtext.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formKtext.setText("K:  ");
        formK.add(formKtext);
        formKsp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formKsp.setModel(new javax.swing.SpinnerNumberModel(3, 2, 5, 1));
        formKsp.setMaximumSize(new java.awt.Dimension(45, 32));
        formKsp.setMinimumSize(new java.awt.Dimension(45, 32));
        formKsp.setPreferredSize(new java.awt.Dimension(45, 32));
        formK.add(formKsp);
        VistaMetodos1.add(formK, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 70, 30));
        
        formXo.setLayout(new javax.swing.BoxLayout(formXo, javax.swing.BoxLayout.LINE_AXIS));
        formXotext.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formXotext.setText(" Xo: ");
        formXo.add(formXotext);
        formXosp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formXosp.setModel(new javax.swing.SpinnerNumberModel(999, 0, 999, 1));
        formXosp.setMaximumSize(new java.awt.Dimension(60, 32));
        formXosp.setMinimumSize(new java.awt.Dimension(60, 32));
        formXosp.setPreferredSize(new java.awt.Dimension(60, 32));
        formXo.add(formXosp);
        VistaMetodos1.add(formXo, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 190, -1, 30));
        
        formA.setLayout(new javax.swing.BoxLayout(formA, javax.swing.BoxLayout.LINE_AXIS));
        formAtext.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formAtext.setText("a: ");
        formA.add(formAtext);   
        formAsp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formAsp.setModel(new javax.swing.SpinnerNumberModel(999, 0, 999, 1));
        formAsp.setMaximumSize(new java.awt.Dimension(60, 32));
        formAsp.setMinimumSize(new java.awt.Dimension(60, 32));
        formAsp.setPreferredSize(new java.awt.Dimension(60, 32));
        formA.add(formAsp);
        VistaMetodos1.add(formA, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 188, 90, -1));    
        
        formM.setLayout(new javax.swing.BoxLayout(formM, javax.swing.BoxLayout.LINE_AXIS));
        formMtext.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formMtext.setText(" m: ");
        formM.add(formMtext);
        formMsp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formMsp.setModel(new javax.swing.SpinnerNumberModel(1000, 0, 1000, 1));
        formMsp.setMaximumSize(new java.awt.Dimension(70, 32));
        formMsp.setMinimumSize(new java.awt.Dimension(70, 32));
        formM.add(formMsp);
        VistaMetodos1.add(formM, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 100, 30));
          
        formC.setLayout(new javax.swing.BoxLayout(formC, javax.swing.BoxLayout.LINE_AXIS));
        formCtext.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formCtext.setText(" c: ");
        formC.add(formCtext);
        formCsp.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        formCsp.setModel(new javax.swing.SpinnerNumberModel(999, 0, 999, 1));
        formCsp.setMaximumSize(new java.awt.Dimension(60, 32));
        formCsp.setMinimumSize(new java.awt.Dimension(60, 32));
        formCsp.setPreferredSize(new java.awt.Dimension(60, 32));
        formC.add(formCsp);
        VistaMetodos1.add(formC, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 100, 30));

        text3m1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        text3m1.setText("Seleccione la cantidad de n° pseudoaletorios a generar:");
        VistaMetodos1.add(text3m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 430, 30));
  
        spcantidadm1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        spcantidadm1.setModel(new javax.swing.SpinnerNumberModel(10, 1, 1000, 1));
        spcantidadm1.setEditor(new javax.swing.JSpinner.NumberEditor(spcantidadm1, ""));
        VistaMetodos1.add(spcantidadm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 70, 30));
        
    }
    // METODOS DE LA GUI

    // metodo para asignar los valores iniciales de la ventana.
    private void initFrame(int ancho, int altura, String inittitulo) {
        this.titulo = inittitulo;
        setTitle(titulo);// Nombre de ventana
        setLocationByPlatform(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);    // salir al cerrar ventana
        // layout de la ventana(la forma como se van a ubicar los paneles en la ventana)
        getContentPane().setLayout(new java.awt.BorderLayout(0, 0));
        setTamaño(ancho, altura); // asignado el tamaño de la ventana
        setResizable(false); // tamaño fijo
        pack(); // construye las vistas y aplica cambios visuales
    }

    // metodo que renderiza la vista luego de agregar o eliminar un elemento a la ventana.
    private void updateView() {
        pack();
        repaint();
    }

    /**
     * metodo que agrega una vista a la ventana.
     *
     * @param c: type: JPanel
     * @param ubicacion: values:
     * North,South,East,West,Center,First,Last,Before,After.
     */
    private void addComponent(JPanel c, String ubicacion, String title) {
        // Component + valor de la constante del BorderLayout
        getContentPane().add(c, ubicacion);
        setTitle(title);
    }

    // metodo que elimina una vista
    private void removeComponent(JPanel c) {
        getContentPane().remove(c);
    }

    // CONSTRUCTOR
    public SimulacionGUI(int ancho, int altura, String titulo) {
        // se crean las vistas
        oncreateVistaPrincipal();
        oncreateVistaProyecto1();
        oncreateVistaMetodos1();
        initFrame(ancho, altura, titulo);
        addComponent(VistaPrincipal, "Center", titulo);
    }

}