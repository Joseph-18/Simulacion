/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulacion;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Rodriguez
 */
public class VentanaMetodos extends javax.swing.JFrame {

    private final JLabel jLabel1;
    private final JPanel jPanel1;
    private final JScrollPane jScrollPane1;

    public VentanaMetodos(int metodo, int k, double x0, int a, int c, int m, int n) {

        Generador gen = new Generador();
        double[][] tabla = null;
        String[] titulo = new String[]{"n", "Xn", "Yn", "Xn+1", "Rn+1"};;
        String parametros = "Parametros: ";
        switch (metodo) {
            case 0: {//Cuadrado Medio
                tabla = gen.cuadrado(x0, k, n);
                gen.mostrar(tabla);
                setTitle("Cuadrado Medio");
                parametros += "Xo = " + (int) x0 + ", K = " + k + ", n = " + n;
                break;
            }
            case 1: {//Producto Medio
                int x1 = a;// en la vista inicial se almacenara en la variable a el valor de x1
                tabla = gen.producto(x0, x1, k, n);
                setTitle("Producto Medio");
                break;
            }
            case 2: {//Producto Medio Variado
                gen.productoVariado(x0, a, k, n);
                setTitle("Producto Medio Variado");
                break;
            }
            case 3: {//Congruencial Multiplicativo
                gen.multiplicativo(x0, a, m, n);
                setTitle("Congruencial Multiplicativo");
                break;
            }
            case 4: {//Congruencial Mixto
                gen.mixto(x0, a, c, m, n);
                setTitle("Congruencial Mixto");
                break;
            }
        };

        // tabla(JPanel con GridLayout)
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setLayout(new java.awt.GridLayout(tabla.length + 1, titulo.length, 30, 30));
        for (int i = 0; i < titulo.length; i++) {
            jPanel1.add(new JLabel(String.valueOf(titulo[i]), 0));
        }
        for (int i = 0; i < tabla.length; i++) {
            jPanel1.add(new JLabel(String.valueOf(i), 0));
            for (int j = 0; j < tabla[0].length; j++) {
                jPanel1.add(new JLabel(String.valueOf(tabla[i][j]), 0));
            }
        }

        // configuracion de la ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        jPanel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14));

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setViewportView(jPanel1);
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText(parametros); // Vista de Parametros. 
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16));
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);
        pack();

    }
}