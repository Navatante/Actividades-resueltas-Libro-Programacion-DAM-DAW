/*
Implementa la funcion
static double distancia (double x1, double y1, double x2, double y2)
que calcula y devuelve la distancia euclídea que separa los puntos (x1, y1) y (x2, y2).
 */
package Funciones_04._4_12;



public class MainProgram {

    static double distancia (double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
    }

    public static void main(String[] args) {

        double dis = distancia(3,1,5,7);
        System.out.println(dis);

    }
}
