/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulacion;

import javax.swing.JPanel;

/**
 *
 * @author Rodriguez
 */
public class VentanaResultados extends javax.swing.JFrame {
    private String diassimulacion;
    private String camionestotales;
    private String camionesA;
    private String camionesB;
    private String camionesC;
    private String horaset;
    private String horaset1;
    private String horaset2;
    private String horaset3;
    private String pagosc1;
    private String pagosc2;
    private String pagosc3;
    private String pagost;

   
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

    Object[][] t1;
    Object[][] t2;
    Object[][] t3;
    Object[][] t4;
    Object[][] t5;
    int ctc;
    public VentanaResultados(Resultado R1) {
        
        this.t1 = new Object[R1.t1.length][R1.t1[0].length];
        for (int i = 0; i < R1.t1.length; i++) {
        this.t1[i]= new Object[]{(int)R1.t1[i][0]+1,R1.t1[i][1],(int)R1.t1[i][2]};
        }
        ctc = R1.cantidadCamiones(R1.t1);
        
        this.t2 = new Object[R1.t2.length][R1.t2[0].length];
        for (int i = 0; i < R1.t2.length; i++) {
            
            Double tc = R1.t2[i][3];
            String tipo="-";
            switch(tc.intValue()){
                case 0:{
                  tipo="A"; 
                  break;
                }
                case 1:{
                  tipo="B"; 
                  break;  
                }
                case 2:{
                  tipo="C"; 
                  break;  
                }
            }
            this.t2[i]= new Object[]{(int)R1.t2[i][0],(int)R1.t2[i][1],R1.t2[i][2],tipo,(int)R1.t2[i][4]};
        }
        
        this.t3= new Object[R1.t3.length][R1.t3[0].length];
        for (int i = 0; i < R1.t3.length; i++) {
            
            Double tc = R1.t3[i][2];
            String tipo="-";
            switch(tc.intValue()){
                case 0:{
                  tipo="A"; 
                  break;
                }
                case 1:{
                  tipo="B"; 
                  break;  
                }
                case 2:{
                  tipo="C"; 
                  break;  
                }
            }
            this.t3[i]= new Object[]{(int)R1.t3[i][0],(int)R1.t3[i][1],tipo,R1.t3[i][3],(int)R1.t3[i][4]};
        }
        
        this.t4= new Object[R1.t4.length][R1.t4[0].length];
        for (int i = 0; i < R1.t4.length; i++) {    
            Double tc = R1.t4[i][2];
            String tipo="-";
            int ncamion = new Double(R1.t3[i][1]).intValue();
            switch(tc.intValue()){
                case 0:{
                  tipo="A"; 
                  break;
                }
                case 1:{
                  tipo="B"; 
                  break;  
                }
                case 2:{
                  tipo="C"; 
                  break;  
                }
            }
            this.t4[i]= new Object[]{(int)R1.t4[i][0],(int)R1.t4[i][1],ncamion,tipo,(int)R1.t4[i][3],(int)R1.t4[i][4],R1.t4[i][5],(int)R1.t4[i][6]};
        }
        
//        this.t5= new Object[R1.t5.length][R1.t5[0].length];
//        for (int i = 0; i < R1.t5.length; i++) {    
//            this.t5[i]= new Object[]{(int)R1.t5[i][0],(int)R1.t5[i][1],R1.t5[i][2],R1.t5[i][3],R1.t5[i][4],(int)R1.t5[i][5]};
//        }
        initComponents();
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VistaResultado3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        atras4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        siguiente5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        VistaResultado2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        atras3 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        siguiente4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        VistaResultado1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cantidadtotalcamiones = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        atras2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        siguiente3 = new javax.swing.JButton();
        VistaEnunciado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        siguiente1 = new javax.swing.JButton();

        VistaResultado3.setMinimumSize(new java.awt.Dimension(800, 700));
        VistaResultado3.setPreferredSize(new java.awt.Dimension(800, 700));
        VistaResultado3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel11.setText("Resultados - Respuestas");
        VistaResultado3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        atras4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        atras4.setText("Atras");
        atras4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atras4ActionPerformed(evt);
            }
        });
        VistaResultado3.add(atras4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 130, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("3. ¿Cuantas horas extras totales fueron trabajadas por las cuadrillas en el experimento?");
        VistaResultado3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 880, -1));

        siguiente5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        siguiente5.setText("Finalizar");
        siguiente5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente5ActionPerformed(evt);
            }
        });
        VistaResultado3.add(siguiente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 130, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("R:");
        VistaResultado3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 30, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("2. ¿Cuantas horas extras totales fueron trabajadas por las cuadrillas en el experimento?");
        VistaResultado3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 880, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("En los ("+diassimulacion+") dias de simulación llegaron al terminal ("+camionestotales+") camiones: ("+camionesA+") de tipo A, ("+camionesB+") de Tipo B y ("+camionesC+") de tipo C");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane10.setViewportView(jTextArea2);

        VistaResultado3.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 600, 90));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("1. ¿Que cantidad de camiones por tipo de carga llegaron a la terminal en los dias de simulación?");
        VistaResultado3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 880, -1));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("En los ("+diassimulacion+") dias de simulación se trabajaron ("+horaset+") horas extras totales. La cuadrilla 1 trabajo ("+horaset1+") horas extras, la cuadrilla 2 trabajo ("+horaset2+") horas extras y la cuadrilla 3 trabajo ("+horaset3+") horas extras. ");
        jTextArea3.setWrapStyleWord(true);
        jScrollPane11.setViewportView(jTextArea3);

        VistaResultado3.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 600, 90));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("R:");
        VistaResultado3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 30, -1));

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("En los ("+diassimulacion+") dias de simulación se genero un costo por pago a la cuadrilla 1 de ("+pagosc1+") bs, a la cuadrilla 2 ("+pagosc2+") bs y a la cuadrilla 3 de ("+pagosc3+") bs. Para un total de ("+pagost+") bs a cancelar por lo la empresa.");
        jTextArea4.setWrapStyleWord(true);
        jScrollPane12.setViewportView(jTextArea4);

        VistaResultado3.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 600, 90));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("R:");
        VistaResultado3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 30, -1));

        VistaResultado2.setMinimumSize(new java.awt.Dimension(800, 700));
        VistaResultado2.setPreferredSize(new java.awt.Dimension(800, 700));
        VistaResultado2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel7.setText("Resultados");
        VistaResultado2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        atras3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        atras3.setText("Atras");
        atras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atras3ActionPerformed(evt);
            }
        });
        VistaResultado2.add(atras3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 130, -1));

        jTable8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(t4
            ,
            new String [] {
                "Dia", "Dia de Descarga", "N° Camion/Dia", "Tipo de Carga", "Velocidad", "Kilogramos", "Horas/Descargas", "Cuadrilla"
            }
        ));
        jScrollPane7.setViewportView(jTable8);

        VistaResultado2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 740, 220));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel12.setText("Tabla #7 resultados");
        VistaResultado2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, -1));

        siguiente4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        siguiente4.setText("Siguiente");
        siguiente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente4ActionPerformed(evt);
            }
        });
        VistaResultado2.add(siguiente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, 130, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel13.setText("Tabla #8 resultados");
        VistaResultado2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, -1));

        jTable9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            t5,
            new String [] {
                "Dia Descarga", "Cuadrilla", "Horas Totales", "Bs x H", "horas Extras", "Bs x H.extras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable9);

        VistaResultado2.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 740, 220));

        VistaResultado1.setMinimumSize(new java.awt.Dimension(800, 700));
        VistaResultado1.setPreferredSize(new java.awt.Dimension(800, 700));
        VistaResultado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setText("Resultados");
        VistaResultado1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        cantidadtotalcamiones.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        cantidadtotalcamiones.setText(ctc +" Camiones en total"
        );
        cantidadtotalcamiones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        VistaResultado1.add(cantidadtotalcamiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 220, 20));

        jTable6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(t1
            ,
            new String [] {
                "Dia", "Rn", "N° Camiones/dia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable6);

        VistaResultado1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 220, 240));

        atras2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        atras2.setText("Atras");
        atras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atras2ActionPerformed(evt);
            }
        });
        VistaResultado1.add(atras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setText("Tabla #6 resultados");
        VistaResultado1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, 30));

        jTable4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(t3,
            new String [] {
                "Dia", "N° Camión/dia", "Tipo de Carga", "Rn", "Kilogramos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable4);

        VistaResultado1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 510, 240));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setText("Tabla #4 resultados");
        VistaResultado1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTable5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(t2,
            new String [] {
                "Dia", "N°Camion", "Rn", "Tipo de Carga", "Velocidad(Kg/h)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable5);

        VistaResultado1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 510, 240));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setText("Tabla #5 resultados");
        VistaResultado1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        siguiente3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        siguiente3.setText("Siguiente");
        siguiente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente3ActionPerformed(evt);
            }
        });
        VistaResultado1.add(siguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, 130, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        VistaEnunciado.setMinimumSize(new java.awt.Dimension(800, 700));
        VistaEnunciado.setPreferredSize(new java.awt.Dimension(800, 700));
        VistaEnunciado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel3.setText("Enunciado");
        VistaEnunciado.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setHorizontalScrollBar(null);

        jTextArea1.setColumns(1);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Los Camiones llegan en forma aleatoria al terminal para descagar. Despues de analizar los datos historicos, se concluyo que porcentaje de llegadas diarias sigue una distribucion de poisson con una media de 3 camiones por dias, ver tabla #1. El peso (Kg) de la carga es un factor decarga es un factor importante en referete al tiempo de descarga. Los registrso pasados muestran que los pesos de la carga(independiente del tipo) estan distribuidos como lo indica la tabla #2. La cantidad de kilogramos por hora que una cuadrilla puede descargar tambien varia y es una funcion del tipo de carga. La probabilidad de cada tipo de  carga y la velocidad de descarga para cada uno de estos se muestran en la tabla #3 la compañia posee 3 cuadrilla en donde c/u consta de 3 personas, un operador de elevador de carga, aquien se le paga Bs. 3000,00 la hora y dos obreros a quien se les paga a c/u Bs. 1800,00 la hora. La politica de la compañia es descargar los camiones un dia despues de su llegada y terminar toda descarga iniciada del los camiones sin importar los costos de tiempo extra. El contrato de sindicato demanda una bonificacion del 50% del valor de la hora por cada hora que exceda de las 8 trabajadas en el dia.");
        jScrollPane4.setViewportView(jTextArea1);

        VistaEnunciado.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 340, 560));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setText("Tabla #1");
        VistaEnunciado.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Short((short) 0),  new Double(0.05),  new Double(0.05), "000-049"},
                { new Short((short) 1),  new Double(0.15),  new Double(0.2), "050-199"},
                { new Short((short) 2),  new Double(0.22),  new Double(0.42), "200-419"},
                { new Short((short) 3),  new Double(0.22),  new Double(0.64), "420-639"},
                { new Short((short) 4),  new Double(0.17),  new Double(0.81), "64-809"},
                { new Short((short) 5),  new Double(0.11),  new Double(0.92), "810-919"},
                { new Short((short) 6),  new Double(0.05),  new Double(0.97), "920-969"},
                { new Short((short) 7),  new Double(0.03),  new Double(1.0), "970-999"}
            },
            new String [] {
                "N° Camiones/Dia", "f(x)", "F(x)", "I-C"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        VistaEnunciado.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 380, 160));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel5.setText("Tabla #2");
        VistaEnunciado.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Long(5000),  new Double(0.08),  new Double(0.08), "000-079"},
                { new Long(10000),  new Double(0.11),  new Double(0.19), "080-189"},
                { new Long(15000),  new Double(0.15),  new Double(0.34), "190-339"},
                { new Long(20000),  new Double(0.23),  new Double(0.57), "340-569"},
                { new Long(25000),  new Double(0.2),  new Double(0.77), "570-769"},
                { new Long(30000),  new Double(0.13),  new Double(0.9), "770-899"},
                { new Long(35000),  new Double(0.1),  new Double(1.0), "900-999"}
            },
            new String [] {
                "Kilogramos", "f(x)", "F(x)", "I-C"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        VistaEnunciado.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 380, 140));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setText("Tabla #3");
        VistaEnunciado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, -1, -1));

        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A",  new Double(0.4),  new Double(0.4), "000-399",  new Long(4000)},
                {"B",  new Double(0.35),  new Double(0.75), "400-749",  new Long(3500)},
                {"C",  new Double(0.25),  new Double(1.0), "750-999",  new Long(2500)}
            },
            new String [] {
                "Tipo de Carga", "f(x)", "F(x)", "CI", "Velocidad Kg/H"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        VistaEnunciado.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 380, 80));

        siguiente1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        siguiente1.setText("Siguiente");
        siguiente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente1ActionPerformed(evt);
            }
        });
        VistaEnunciado.add(siguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, 130, -1));

        getContentPane().add(VistaEnunciado, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguiente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente1ActionPerformed
        System.out.println("Principal");
                // Removiendo de la ventana (Sacandola, no eliminandola) la vista actual
        removeComponent(VistaEnunciado);
                // Para Añadir (Cargar o enlazar) la vista a donde se quiere ir.
        addComponent(VistaResultado1, "Center", "Resultados");
        updateView();
        
        
        
    }//GEN-LAST:event_siguiente1ActionPerformed

    private void atras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atras2ActionPerformed
       System.out.println("Principal");           
       removeComponent(VistaResultado1);
       addComponent(VistaEnunciado, "Center", "Enunciado");
       updateView();
    }//GEN-LAST:event_atras2ActionPerformed

    private void atras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atras3ActionPerformed
       System.out.println("Principal");           
       removeComponent(VistaResultado2);
       addComponent(VistaResultado1, "Center", "Resultados 1");
       updateView();
    }//GEN-LAST:event_atras3ActionPerformed

    private void siguiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente3ActionPerformed
       System.out.println("Principal");           
       removeComponent(VistaResultado1);
       addComponent(VistaResultado2, "Center", "Resultados 2");
       updateView();
    }//GEN-LAST:event_siguiente3ActionPerformed

    private void atras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atras4ActionPerformed
       System.out.println("Principal");           
       removeComponent(VistaResultado3);
       addComponent(VistaResultado2, "Center", "Resultados 2");
       updateView();
    }//GEN-LAST:event_atras4ActionPerformed

    private void siguiente5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente5ActionPerformed
            setVisible(false);
    }//GEN-LAST:event_siguiente5ActionPerformed

    private void siguiente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente4ActionPerformed
       System.out.println("Principal");           
       removeComponent(VistaResultado2);
       addComponent(VistaResultado3, "Center", "Resultados 3");
       updateView();
    }//GEN-LAST:event_siguiente4ActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel VistaEnunciado;
    private javax.swing.JPanel VistaResultado1;
    private javax.swing.JPanel VistaResultado2;
    private javax.swing.JPanel VistaResultado3;
    private javax.swing.JButton atras2;
    private javax.swing.JButton atras3;
    private javax.swing.JButton atras4;
    private javax.swing.JLabel cantidadtotalcamiones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JButton siguiente1;
    private javax.swing.JButton siguiente3;
    private javax.swing.JButton siguiente4;
    private javax.swing.JButton siguiente5;
    // End of variables declaration//GEN-END:variables
}
