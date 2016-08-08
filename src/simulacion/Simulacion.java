/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;
/**
 *
 * @authores Joseph Pérez, Gabriel Rodríguez, Jesús Salazar.
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
    class numeroCamiones {
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
    class tipoCargas {
       char [] tcarga={'A','B','C'};
       double[] fx= {0.400,0.350,0.250};
       double[] F= {0.400,0.750,1.0};
       double[] V = {4000,3500,2500};
       
 
        /** metodo que realiza el calculo del n° de camiones que llegan en un dia.
        * @param rn: Un numero pseudoaletorio
        * @return: N° de camiones que llegaron al dia
        */
        int getTcarga(double rn){
           rn*=1000;
           for (int i = 0; i < F.length; i++) {
                // se realiza el calculo del rango internamente
                if (rn <= ((F[i]*1000)-1)){
                    return i;
                }
           }
           return '#'; // error
       };
    }
    class kilogramos {
       int [] kg={5000,10000,15000,20000,25000,30000,35000};// se puede sustituir por una multipliacion de (i+1)+5000
       double[] fx= {0.080,0.110,0.150,0.230,0.200,0.130,0.100};
       double[] F= {0.080,0.190,0.340,0.570,0.770,0.900,1.000};
 
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
// Clase para generar las tablas de resultado aplicando el metodo de montecarlos
class Resultado extends Tablas {
    int x0,k,n,x1,a,m,c,g;
    double[][] t1,t2,t3,t4,t5;
    
    Resultado(int x0, int k, int n, int x1, int a, int m, int c, int g) {
        
        this.x0 = x0;
        this.k = k;
        this.n = n;
        this.x1 = x1;
        this.a = a;
        this.m = m;
        this.c = c;
        this.g = g;
    }
    
    void tablaCamiones(int cantDias) {
        t1 = new double[cantDias][3];
        numeroCamiones nc = new numeroCamiones();
        
        for (int i = 0; i < cantDias; i++) {
            t1[i][0] = i;
            t1[i][1] = tipoGenerador(g);
            t1[i][2] = nc.getCamiones(t1[i][1]);
        }
    }
    void tablaTipoCarga(int cantCamiones, int cantDias) {
        t2 = new double[cantCamiones][5];
        tipoCargas tc = new tipoCargas();
        int k = 0;
        for (int j = 0; j < cantDias; j++) {
            for (int i = 0; i < t1[j][2]; i++) {
                t2[k][0] = j+1;
                t2[k][1] = i+1;
                t2[k][2] = tipoGenerador(g);
                t2[k][3] = tc.getTcarga(t2[k][2]);
                t2[k][4] = tc.V[(int) t2[k][3]];
                k +=1;
            }
        }
    }
    void tablaKilogramos(int cantCamiones, int cantDias) {
        t3 = new double[cantCamiones][5];
        kilogramos k1 = new kilogramos();
        int k = 0;
        
        for (int j = 0; j < cantDias; j++) {
            for (int i = 0; i < t1[j][2]; i++) {
                t3[k][0] = j+1;
                t3[k][1] = i+1;
                t3[k][2] = t2[k][3];
                t3[k][3] = tipoGenerador(g);
                t3[k][4] = k1.getKilogramos(t3[k][3]);
                k += 1;
            }
        }
    }
    void tablaCuadrilla(int cantCamiones, int cantDias) {
        t4 = new double[cantCamiones][7];
        double c1 = 0,c2 = 0,c3 = 0;
        int k = 0;
        
        for (int j = 0; j < cantDias; j++) {
            for (int i = 0; i < t1[j][2]; i++) {
                t4[k][0] = j+1;
                t4[k][1] = j+2;
                t4[k][2] = t2[k][3];
                t4[k][3] = t2[k][4];
                t4[k][4] = t3[k][4];
                t4[k][5] = t4[k][4]/t4[k][3];
                if (c1 <= c2 && c1 <= c3) {
                    c1 += t4[k][5];
                    t4[k][6] = 1;
                } else {
                    if (c2 <= c1 && c2 <= c3) {
                        c2 += t4[k][5];
                        t4[k][6] = 2;
                    } else {
                        c3 += t4[k][5];
                        t4[k][6] = 3;
                    }
                }
                k += 1;
            }
            c1 = 0;
            c2 = 0;
            c3 = 0;
        }
    }
    void tablaCuadrillaHora(int cantCamiones, int cantDias) {
        t5 = new double[cantCamiones][6];
        int k = 0;
        double c1 = 0, c2 = 0, c3 = 0;
        
        for (int j = 0; j < cantDias; j++) {
            for (int i = 0; i < t1[j][2]; i++) {
                t5[k][0] = j+2;
                t5[k][1] = t4[k][6];
                t5[k][2] = t4[k][5];
                if (t5[k][1] == 1) {
                    c1 += t5[k][2];
                } else {
                    if (t5[k][1] == 2) {
                        c2 += t5[k][2];
                    } else {
                        c3 += t5[k][2];
                    }
                }
                k += 1;
            }
            int w = k-(int)t1[j][2];
            for (int i = 0; i < t1[j][2]; i++) {
                if (t5[w][1] == 1 && c1 <= 8) {
                    t5[w][3] = c1 * 6600;
                    t5[w][4] = 0;
                    t5[w][5] = 0;
                    c1 = 0;
                } else {
                    if (c1 > 8) {
                        t5[w][3] = 8 * 6600;
                        t5[w][4] = c1 - 8;
                        t5[w][5] = t5[w][4] * 9900;
                        c1 = 0;
                    }else{
                    
                        if (t5[w][1] == 2 && c2 <= 8) {
                            t5[w][3] = c2 * 6600;
                            t5[w][4] = 0;
                            t5[w][5] = 0;
                            c2 = 0;
                        } else {
                            if (c2 > 8) {
                                t5[w][3] = 8 * 6600;
                                t5[w][4] = c2 - 8;
                                t5[w][5] = t5[w][4] * 9900;
                                c2 = 0;
                            }else{
                                if (t5[w][1] == 3 && c3 <= 8) {
                                    t5[w][3] = c3 * 6600;
                                    t5[w][4] = 0;
                                    t5[w][5] = 0;
                                    c3 = 0;
                                } else {
                                    t5[w][3] = 8 * 6600;
                                    t5[w][4] = c3 - 8;
                                    t5[w][5] = t5[w][4] * 9900;
                                    c3 = 0;
                                }
                            }    
                        }
                    }    
                }
//                if (c2 == 0 || c3 == 0) {
//                    i = (int) t1[j][2];
//                }
                w += 1;
            }
        } 
    }
    double tipoGenerador(int g) {
        double [][] r;
        Generador obj1 = new Generador();
        
        switch (g) {
            case 1:
                r = obj1.cuadrado(x0,k,1);
                x0 = (int) r[0][0];
                return r[0][2];
            case 2:
                r = obj1.producto(x0,x1,k,1);
                x0 = (int) r[0][3];
                return r[0][4];
            case 3:
                r = obj1.productoVariado(x0,a,k,1);
                x0 = (int) r[0][2];
                return r[0][3];
            case 4:
                r = obj1.multiplicativo(x0,a,m,1);
                x0 = (int) r[0][2];
                return r[0][3];
            case 5:
                r = obj1.mixto(x0,a,c,m,1);
                x0 = (int) r[0][2];
                return r[0][3];
            default:
                return -1.0;
        }
    }
    int cantidadCamiones(double[][] t) {
        int v = 0;
        
        for (int i = 0; i < t.length; i++) {
            v += (int)t[i][2];
        }
        return v;
    }
    int[] tipoCamiones() {
        int[] tipo = new int[3];
        
        for (int i = 0; i < t2.length; i++) {
            if (t2[i][3] == 0) {
                tipo[0] += 1;
            } else {
                if (t2[i][3] == 1) {
                    tipo[1] += 1;
                } else {
                    tipo[2] += 1;
                }
            }
        }
        return tipo;
    }
    double[] horasExtrasCuadrillas() {
        double[] cuadrillas = new double[3];
        
        for (int i = 0; i < t5.length; i++) {
            if (t5[i][1] == 1) {
                cuadrillas[0] += t5[i][4];
            } else {
                if (t5[i][1] == 2) {
                    cuadrillas[1] += t5[i][4];
                } else {
                    cuadrillas[2] += t5[i][4];
                }
            }
        }
        return cuadrillas;
    }
    double[] bsCuadrillas() {
        double[] cuadrillas = new double[3];
        
        for (int i = 0; i < t5.length; i++) {
            if (t5[i][1] == 1) {
                cuadrillas[0] += t5[i][3] + t5[i][5];
            } else {
                if (t5[i][1] == 2) {
                    cuadrillas[1] += t5[i][3] + t5[i][5];
                } else {
                    cuadrillas[2] += t5[i][3] + t5[i][5];
                }
            }
        }
        return cuadrillas;
    }
    void simulacion(int cantDias) {
        int cantC;
        
        tablaCamiones(cantDias);
        cantC = cantidadCamiones(t1);
        tablaTipoCarga(cantC,cantDias);
        tablaKilogramos(cantC,cantDias);
        tablaCuadrilla(cantC,cantDias);
        tablaCuadrillaHora(cantC,cantDias);
        int[] y = tipoCamiones();
        System.out.println("Tipo : "+ y[0] + " "+ y[1]+" "+ y[2]);
        double[] q = horasExtrasCuadrillas();
        System.out.println("");
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
        
//        // Interfaz grafica
        configStyleGUI("Windows"); //Estilo o Diseño
        // Orden de los parametros de la ventana: (ancho,altura,titulo)
        SimulacionGUI GUI = new SimulacionGUI(800,600,"Simulación");
        mostrarGUI(GUI);
        
        Generador obj1 = new Generador();        
        Resultado R1 = new Resultado(21, 0, 0, 0, 17, 1000, 23, 5);
        R1.simulacion(8);
//        obj1.mostrar(obj1.cuadrado(580, 3, 10));
//        obj1.mostrar(obj1.producto(420, 180, 3, 10));
//        obj1.mostrar(obj1.productoVariado(382, 125, 3, 10));
//        obj1.mostrar(obj1.multiplicativo(461, 261, 512, 50));
//        obj1.mostrar(obj1.mixto(17, 47, 43, 1000, 6));
    }
}
