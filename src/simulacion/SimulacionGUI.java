/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Gabriel Rodriguez
 */
public class SimulacionGUI extends JFrame {

    // VARIABLES
    // variable y metodo que modifica el nombre de la ventana.
    private String titulo;

    public void setTitulo(String nuevotitulo) {
        titulo = nuevotitulo;
        setTitle(titulo);
    }

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
    void oncreatePanelPrincipal() {
        VistaPrincipal = new JPanel();
        JButton BtnSalir = new javax.swing.JButton();
        JButton BtnProyecto = new javax.swing.JButton();
        JButton BtnMetodos = new javax.swing.JButton();

        VistaPrincipal.setBackground(new java.awt.Color(101, 101, 255));
        VistaPrincipal.setForeground(new java.awt.Color(0, 51, 51));
        VistaPrincipal.setMaximumSize(tamaño);
        VistaPrincipal.setMinimumSize(tamaño);
        VistaPrincipal.setPreferredSize(tamaño);
        VistaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnProyecto.setBackground(new java.awt.Color(110, 110, 255));
        BtnProyecto.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        BtnMetodos.setForeground(new java.awt.Color(0, 0, 0));
        BtnProyecto.setText("Proyecto");
        BtnProyecto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        //metodo
        BtnProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("Proyectos");
                removeComponent(VistaPrincipal);
                addComponent(VistaProyecto, "Center");
            }
        });

        BtnMetodos.setBackground(new java.awt.Color(110, 110, 255));
        BtnMetodos.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        BtnMetodos.setForeground(new java.awt.Color(0, 102, 0));
        BtnMetodos.setText("Metodos");
        BtnMetodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("Metodos");
            }
        });

        BtnSalir.setBackground(new java.awt.Color(110, 110, 255));
        BtnSalir.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(102, 0, 51));
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });
        int pos_inicalY = 100;
        int AlturaBtn = 40;

        VistaPrincipal.add(BtnProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, pos_inicalY, 160, AlturaBtn));
        VistaPrincipal.add(BtnMetodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, pos_inicalY += 50, 220, AlturaBtn));
        VistaPrincipal.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, pos_inicalY += 50, 120, AlturaBtn));

    }
    
    JPanel VistaProyecto;

    // METODOS DE LA VENTANA
    // metodo para asignar los valores iniciales de la ventana.
    private void initFrame(int ancho, int altura, String titulo) {
        setTitulo(titulo);// Nombre de ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);    // salir al cerrar ventana
        // layout de la ventana(la forma como se van a ubicar los paneles en la ventana)
        getContentPane().setLayout(new java.awt.BorderLayout(0, 0));
        setTamaño(ancho, altura); // asignado el tamaño de la ventana
        setResizable(false); // tamaño fijo
        pack(); // construye las vistas y aplica cambios visuales
    }

    //metodo que renderiza la vista luego de agregar o eliminar un elemento a la ventana.
    private void updateView() {
        pack();
        repaint();
    }

    /** metodo que agrega una vista a la ventana.
     * @param c: type: JPanel
     * @param ubicacion: values: North,South,East,West,Center,First,Last,Before,After.
    */
    private void addComponent(JPanel c, String ubicacion) {
        // Component + valor de la constante del BorderLayout
        getContentPane().add(c, ubicacion);
    }
    
    //metodo que elimina una vista
    private void removeComponent(JPanel c) {
        getContentPane().remove(c);
    }
    
    // CONSTRUCTOR
    public SimulacionGUI(int ancho, int altura, String titulo) {
        initFrame(ancho, altura, titulo);
    }

}
