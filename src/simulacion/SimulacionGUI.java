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

        BtnProyecto.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        BtnMetodos.setForeground(new java.awt.Color(0, 0, 0));
        BtnProyecto.setText("Proyecto");
        BtnProyecto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        //metodo
        BtnProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("Proyectos");
                // Removiendo de la ventana (Sacandola, no eliminandola) la vista actual
                removeComponent(VistaPrincipal);
                // Para Añadir (Cargar o enlazar) la vista a donde se quiere ir.
                addComponent(VistaProyecto, "Center", "Proyecto");
                updateView();
            }
        });

        BtnMetodos.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        BtnMetodos.setForeground(new java.awt.Color(0, 102, 0));
        BtnMetodos.setText("Metodos");
        BtnMetodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("Metodos");
            }
        });

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
        // Recordar ubicar los elementos en los ejes X y Y.
        // AbsoluteLayout: AbsoluteConstraints(posicion en x, posicion en y, ancho del elemento,altura de elemento)
        VistaPrincipal.add(BtnProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, pos_inicalY, 160, AlturaBtn));
        VistaPrincipal.add(BtnMetodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, pos_inicalY += 50, 220, AlturaBtn));
        VistaPrincipal.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, pos_inicalY += 50, 120, AlturaBtn));

    }

    JPanel VistaProyecto;

    private void oncreateVistaProyecto() {
        VistaProyecto = new JPanel();
        JButton BtnAtras = new JButton();

        VistaProyecto.setBackground(new java.awt.Color(100, 100, 100));
        VistaProyecto.setForeground(new java.awt.Color(0, 51, 51));
        // Se le asigna el tamaño de la ventana.
        VistaProyecto.setMaximumSize(tamaño);
        VistaProyecto.setMinimumSize(tamaño);
        VistaProyecto.setPreferredSize(tamaño);
        VistaProyecto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAtras.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        BtnAtras.setForeground(new java.awt.Color(102, 0, 51));
        BtnAtras.setText("Atras");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("Principal");
                // Removiendo de la ventana (Sacandola, no eliminandola) la vista actual
                removeComponent(VistaProyecto);
                // Para Añadir (Cargar o enlazar) la vista a donde se quiere ir.
                addComponent(VistaPrincipal, "Center", "Menu Principal");
                updateView();
            }
        });

        int pos_inicalY = 250;
        int AlturaBtn = 40;
        // Recordar ubicar los elementos en los ejes X y Y.
        // AbsoluteLayout: AbsoluteConstraints(posicion en x, posicion en y, ancho del elemento,altura de elemento)
        VistaProyecto.add(BtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, pos_inicalY += 50, 120, AlturaBtn));

    }

    JPanel VistaMetodos;

    private void oncreateVistaMetodos() {
        VistaMetodos = new JPanel();

        VistaMetodos.setBackground(new java.awt.Color(58, 200, 48));
        VistaMetodos.setForeground(new java.awt.Color(0, 51, 51));
        // Se le asigna el tamaño de la ventana.
        VistaMetodos.setMaximumSize(tamaño);
        VistaMetodos.setMinimumSize(tamaño);
        VistaMetodos.setPreferredSize(tamaño);
        VistaMetodos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }

    // METODOS DE LA VENTANA
    // metodo para asignar los valores iniciales de la ventana.
    private void initFrame(int ancho, int altura, String inittitulo) {
        this.titulo = inittitulo;
        setTitle(titulo);// Nombre de ventana
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

    //metodo que elimina una vista
    private void removeComponent(JPanel c) {
        getContentPane().remove(c);
    }

    // CONSTRUCTOR
    public SimulacionGUI(int ancho, int altura, String titulo) {
        // se crean las vistas
        oncreateVistaPrincipal();
        oncreateVistaProyecto();
        oncreateVistaMetodos();
        initFrame(ancho, altura, titulo);
        addComponent(VistaPrincipal, "Center", titulo);
    }

}
