/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulacion;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * @author Gabriel Rodriguez
 */

public class SimulacionGUI extends JFrame {
    
        public SimulacionGUI (int altura, int ancho,String titulo){
            Dimension tamaño = new Dimension(ancho,altura); 
            configFrame(tamaño,titulo);
        }
    
        private void configFrame(Dimension tamaño,String titulo) {
        // salir al cerrar ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // Nombre de ventana
        setTitle(titulo);
        // layout de la ventana(la forma como se van a ubicar los paneles en la ventana)
         getContentPane().setLayout(new java.awt.BorderLayout(0, 0));
        // Tamaño de Ventana
        setMaximumSize(tamaño);
        setMinimumSize(tamaño);
        setPreferredSize(tamaño);
        // Resize
        setResizable(false);
        pack();
    }
       
}
