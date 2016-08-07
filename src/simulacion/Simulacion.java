/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

/**
 *
 * @authores Joseph Perez, Gabriel Rodriguez
 */

class Generador {
        
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
    public double[][] producto(double x0, double x1, int k, int n) {
        
        int m = calcularm(k);
        
        double  r[][] = new double[n][5];
        for (int i = 0; i < n; i++) {
            r[i][0] = x0;
            r[i][1] = x1;
            r[i][2] = x0 * x1;
            r[i][3] = medio(Integer.toString((int)r[i][2]) ,k);
            r[i][4] = r[i][3]/m;
//            if (buscarCiclo(r[i][2],r) == true) {
//                i = n;
//            }
            x0 = x1;
            x1 = r[i][3];
        }
        return r;
    }
    public double[][] productoVariado(double x0, int a, int k, int n) {
        
        int m = calcularm(k);
        
        double  r[][] = new double[n][4];
        for (int i = 0; i < n; i++) {
            r[i][0] = x0;
            r[i][1] = a * x0;
            r[i][2] = medio(Integer.toString((int)r[i][1]) ,k);
            r[i][3] = r[i][2]/m;
//            if (buscarCiclo(r[i][2],r) == true) {
//                i = n;
//            }
            x0 = r[i][2];
        }
        return r;
    }
    public double[][] multiplicativo(double x0, int a, int m, int n) {
        
        double  r[][] = new double[n][4];
        for (int i = 0; i < n; i++) {
            r[i][0] = x0;
            r[i][1] = a * x0;
            r[i][2] = congruencial(r[i][1], m);
            r[i][3] = r[i][2]/m;
//            if (buscarCiclo(r[i][2],r) == true) {
//                i = n;
//            }
            x0 = r[i][2];
        }
        return r;
    }
    public double[][] mixto(double x0, int a, int c, int m, int n) {
        
        double  r[][] = new double[n][4];
        for (int i = 0; i < n; i++) {
            r[i][0] = x0;
            r[i][1] = (a*x0) + c;
            r[i][2] = congruencial(r[i][1], m);
            r[i][3] = r[i][2]/m;
//            if (buscarCiclo(r[i][2],r) == true) {
//                i = n;
//            }
            x0 = r[i][2];
        }
        return r;
    }
    public double congruencial(double yn, int m) {
        
        double r;
        r = yn % m;
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
            System.out.print(" Xn: "+ (int)r[i][0]);
            System.out.print(" Yn: "+ (int)r[i][1]);
            System.out.print(" Xn+1: "+ (int)r[i][2]);
            System.out.print(" Rn+1: "+ r[i][3]);
            System.out.println("");
        }
    }
}
// clases para almacenar los datos de las tablas del enunciado.
class Tablas {
    double[] F; // Declarado para aplicar la herencia de los metodos.
       
    /** metodo que devuelve los rangos para ser renderizados en las vistas.
    * @return: rangos en forma de arreglo de cadenas
    */
    public String[] getRangos(){ // a heredar
           String[] rangos = new String[8];
           String ant="000";
           for (int i = 0; i < F.length; i++) {
                rangos[i]= ant+" - "+String.valueOf((F[i]*1000)-1);
                ant=String.valueOf(F[i]*1000);
           }
           return null;
       };
    
    class numeroCamiones extends Tablas{
       double[] fx= {0.050,0.150,0.220,0.220,0.170,0.110,0.050,0.030};
       double[] F= {0.050,0.200,0.420,0.640,0.810,0.920,0.970,1.0};
         
       /** metodo que realiza el calculo del n° de camiones que llegan en un dia.
        * @param rn: Un numero pseudoaletorio
        * @return: N° de camiones que llegaron al dia
        */
       int getCamiones(double rn){
           rn*=1000;
           for (int i = 0; i < F.length; i++) {
                // se realiza el calculo del rango internamente
                if (rn <= ((F[i]*1000)-1)){
                    // solo para en este caso el valor el numero de camiones coincide con el valor de i
                    return i;// por esa razon retornamos i.  
                }
           }
           return -1; // error
       };  
    }
    class tipoCargas extends Tablas{
       char [] tcarga={'A','B','C'};
       double[] fx= {0.400,0.350,0.250};
       double[] F= {0.400,0.,0.420,0.640,0.810,0.920,0.970,1.0};
 
       /** metodo que realiza el calculo del n° de camiones que llegan en un dia.
        * @param rn: Un numero pseudoaletorio
        * @return: N° de camiones que llegaron al dia
        */
       char getTcarga(double rn){
           rn*=1000;
           for (int i = 0; i < F.length; i++) {
                // se realiza el calculo del rango internamente
                if (rn <= ((F[i]*1000)-1)){
                    return tcarga[i];
                }
           }
           return '#'; // error
       };
    }
    class kilogramos extends Tablas{
       int [] kg={5000,10000,15000,20000,25000,30000,35000};// se puede sustituir por una multipliacion de (i+1)+5000
       double[] fx= {0.080,0.110,0.150,0.230,0.200,0.130,0.100};
       double[] F= {0.80,0.190,0.340,0.570,0.770,0.900,1.000};
 
       /** metodo que realiza el calculo del n° de Kilogramos que llegan en un dia.
        * @param rn: Un numero pseudoaletorio
        * @return: N° de camiones que llegaron al dia
        */
       int getKilogramos(double rn){
           rn*=1000;
           for (int i = 0; i < F.length; i++) {
                // se realiza el calculo del rango internamente
                if (rn <= ((F[i]*1000)-1)){
                    return kg[i];
                }
           }
           return -1; // error
       };
    }
}

class Resultado {
    int x0,k,n,x1,a,m,c;
    Generador obj1 = new Generador();
    Tablas t1 = new Tablas();
    
    public int tabla(int n, int g, int t) {
        
        int cant = 0;
        double rn;
        
        for (int i = 0; i < n; i++) {
            rn = generador(g);
            cant += get(t,rn);
        }
        return cant;
    }
    public double[][] generador(int g) {
        double [][] r = new double[n][];
        switch (g) {
            case 1:
                r = obj1.cuadrado(x0,k,n);
                break;
            case 2:
                r = obj1.producto(x0,x1,k,n);
                break;
            case 3:
                r = obj1.productoVariado(x0,a,k,n);
                break;
            case 4:
                r = obj1.multiplicativo(x0,a,m,n);
                break;
            case 5:
                r = obj1.mixto(x0,a,c,m,n);
                break;
            default:
                return r;
        }
        return r;
    }
    public int get(int t, double rn) {
        
        switch (t) {
            case 1:
                return t1.(rn);
                break;
            case 2:
                return getCargas(rn);
                break;
            case 3:
                return getKilogramos(rn);
                break;
            default:
                return -1;
        }
        return 0;
    }
}

public class Simulacion {

     /** metodo que determina el estilo de la GUI. 
     * Cada elemento adopta el estilo determinado.
     * @param style. posibles valores: (Metal, Nimbus, CDE/Motif, Windows)
     */
    static void configStyleGUI(String style) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                System.out.println(info.getName());
                if (style.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            //  Para ver los log del sistema. Descomente siguiente linea. 
            //  java.util.logging.Logger.getLogger(ProyectoSimulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println(" Error al agregar un estilo a la ventana.");
        }
    }
    
    //  metodo que hace visible la ventana.
    static void mostrarGUI(SimulacionGUI obj) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                obj.setVisible(true);
            }
        });  
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Interfaz grafica
        configStyleGUI("Windows"); //Estilo o Diseño
        // Orden de los parametros de la ventana: (ancho,altura,titulo)
        SimulacionGUI GUI = new SimulacionGUI(800,600,"Simulación");
        mostrarGUI(GUI);
        // Fin
        Generador obj1 = new Generador();        
//        obj1.mostrar(obj1.cuadrado(580, 3, 10));
//        obj1.mostrar(obj1.producto(420, 180, 3, 10));
//        obj1.mostrar(obj1.productoVariado(382, 125, 3, 10));
//        obj1.mostrar(obj1.multiplicativo(9, 11, 128, 10));
        obj1.mostrar(obj1.mixto(522, 47, 61, 1000, 10));
        
    }
    
}
