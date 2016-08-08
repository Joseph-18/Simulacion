
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulacion;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Joseph Pérez, Gabriel Rodríguez, Jesús Salazar
 */
public class VentanaMetodos extends javax.swing.JFrame {
    
    static final String fonts ="Segoe UI"; 
    private final JLabel jLabel1;
    private final JPanel jPanel1;
    private final JScrollPane jScrollPane1;

    public VentanaMetodos(int metodo, int k, double x0, int a, int c, int m, int n) {

        Generador gen = new Generador();
        double[][] tabla = null;
        String[] titulo = new String[]{"n","Xn","Yn","Xn+1","Rn+1"};
        String parametros = "Parametros: ";
        switch (metodo){
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
                titulo = new String[]{"n", "Xn-1","Xn","Yn", "Xn+1", "Rn+1"};
                parametros += "Xo = " + (int) x0 + ", X1 = " + (int) x1 + ", K = " + k + ", n = " + n;
                break;
            }
            case 2: {//Producto Medio Variado
                tabla = gen.productoVariado(x0, a, k, n);
                setTitle("Producto Medio Variado");
                parametros += "Xo = " + (int) x0 + ", a = " + (int) a + ", K = " + k + ", n = " + n;
                break;
            }
            case 3: {//Congruencial Multiplicativo
                tabla = gen.multiplicativo(x0, a, m, n);
                setTitle("Congruencial Multiplicativo");
                parametros += "Xo = " + (int) x0 + ", a = " + (int) a + ", m = " + m + ", n = " + n;
                break;
            }
            case 4: {//Congruencial Mixto
                tabla = gen.mixto(x0, a, c, m, n);
                setTitle("Congruencial Mixto");
                parametros += "Xo = " + (int) x0 + ", a = " + (int) a + ", c = " + (int) c + ", m = " + m + ", n = " + n;
                break;
            }
        };

        // tabla(JPanel con GridLayout)
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(Color.DARK_GRAY);
        
        jPanel1.setLayout(new java.awt.GridLayout(tabla.length + 1,titulo.length, 2, 2));
        for (int i = 0; i < titulo.length; i++) {
            jPanel1.add(nuevocampo(String.valueOf(titulo[i])));
        }
        for (int i = 0; i < tabla.length; i++) {
            if(metodo==1){
                jPanel1.add(nuevocampo(String.valueOf(i+1)));
            }else{
                jPanel1.add(nuevocampo(String.valueOf(i)));
            }
            for (int j = 0; j < tabla[0].length; j++) {
                
                if (j!=tabla[0].length-1) {
                    jPanel1.add(nuevocampo(entero(tabla[i][j])));
                }else{
                    jPanel1.add(nuevocampo(String.valueOf(tabla[i][j])));
                }
                
            }
        }

        // configuracion de la ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setViewportView(jPanel1);
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText(parametros); // Vista de Parametros. 
        jLabel1.setFont(new java.awt.Font(fonts, 0, 20)); 
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);
        pack();

    }
    
    static JLabel nuevocampo(String value){
        JLabel elem = new JLabel(value, 0);
        elem.setBackground(Color.WHITE);
        elem.setMinimumSize(new java.awt.Dimension(100, 20));
        elem.setPreferredSize(new java.awt.Dimension(100, 20));
        elem.setFont(new java.awt.Font(fonts,0, 18));
        elem.setOpaque(true);
        return elem;
    }
    
    static String entero(double value){   
        return String.valueOf((int)value);
    }

}