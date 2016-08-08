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
    int ctc;
    public VentanaResultados(Resultado R1) {
        
        this.t1 = new Object[R1.t1.length][R1.t1[0].length];
        for (int i = 0; i < R1.t1.length; i++) {
        this.t1[i]= new Object[]{(int)R1.t1[i][0]+1,R1.t1[i][1],(int)R1.t1[i][2]};
        }
        ctc = R1.cantidadCamiones(R1.t1);
        initComponents();
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VistaResultado1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cantidadtotalcamiones = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        siguiente2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
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

        VistaResultado1.setMaximumSize(null);
        VistaResultado1.setMinimumSize(new java.awt.Dimension(800, 700));
        VistaResultado1.setPreferredSize(new java.awt.Dimension(800, 700));
        VistaResultado1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setText("Resultados");
        VistaResultado1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        cantidadtotalcamiones.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        cantidadtotalcamiones.setText(ctc +" Cam/día");
        VistaResultado1.add(cantidadtotalcamiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 120, 20));

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

        siguiente2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        siguiente2.setText("Siguiente");
        VistaResultado1.add(siguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setText("Tabla #4 resultados");
        VistaResultado1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        VistaEnunciado.setMaximumSize(null);
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


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel VistaEnunciado;
    private javax.swing.JPanel VistaResultado1;
    private javax.swing.JLabel cantidadtotalcamiones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton siguiente1;
    private javax.swing.JButton siguiente2;
    // End of variables declaration//GEN-END:variables
}
