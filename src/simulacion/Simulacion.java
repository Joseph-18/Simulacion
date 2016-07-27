/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.util.Formatter;


/**
 *
 * @author Joseph Perez
 */

class Medio {
        
    public int calcularm(int k){
        
        String y = "1";
        for (int i = 0; i < k; i++) {
            y = y+"0";
        }
        return Integer.parseInt(y);
    }
    public double[][] cuadrado(double x0, int k, int n){
        int m = calcularm(k);
        
        double r[][] = new double[n][4];
        for (int i = 0; i < n; i++) {
            r[i][0] = x0;
            r[i][1] = x0 * x0;
            r[i][2] = medio(Integer.toString((int)r[i][1]) ,k);
            r[i][3] = r[i][2]/m;
//            if (buscarCiclo(r[i][2],r) == true) {
//                i = n;
//            }
            x0 = r[i][2];
        }
        return r;
    }
    public int medio(String yn, int k){
        
        int x, m;
        int yl = yn.length();
        Formatter fmt = new Formatter();
        if (k%2 == 0) {
            if (yl%2 == 0) {
                if (yl > k) {
                    x = (yl-k)/2;
                    m = Integer.parseInt(yn.substring(x, yn.length()-x));
                } else {
                    yn = String.format("%0"+(yl+2)+"d", Integer.parseInt(yn));
                    x = (yn.length()-k)/2;
                    m = Integer.parseInt(yn.substring(x, yn.length()-x));
                }
            } else {
                yn = String.format("%0"+(yl+1)+"d", Integer.parseInt(yn));
                x = (yn.length()-k)/2;
                m = Integer.parseInt(yn.substring(x, yn.length()-x));
            }
        } else {
            if (yl%2 != 0) {
                if (yl > k) {
                    x = (yl-k)/2;
                    m = Integer.parseInt(yn.substring(x, yn.length()-x));
                } else {
                    yn = String.format("%0"+(yl+2)+"d", Integer.parseInt(yn));
                    x = (yn.length()-k)/2;
                    m = Integer.parseInt(yn.substring(x, yn.length()-x));
                }
            } else {
                yn = String.format("%0"+(yl+1)+"d", Integer.parseInt(yn));
                x = (yn.length()-k)/2;
                m = Integer.parseInt(yn.substring(x, yn.length()-x));
            }
        }
        return m;
    }
    public boolean buscarCiclo(int xn, int r[][]){
        
        return true;
    }    
    public void mostrar(double r[][]){
        
        for (int i = 0; i < r.length; i++) {
            System.out.println("i: "+(i+1));
            System.out.print("Xn: "+ (int)r[i][0]);
            System.out.print(" Yn: "+ (int)r[i][1]);
            System.out.print(" Xn+1: "+ (int)r[i][2]);
            System.out.print(" Rn+1: "+ r[i][3]);
            System.out.println("");
        }
    }
    
}


public class Simulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Medio obj1 = new Medio();
        obj1.mostrar(obj1.cuadrado(580, 3, 10));
    }
    
    
    
}
