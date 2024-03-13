/*
Crea la funcion muestraPares(int n) que muestre por consola los primeros n numeros pares.
 */
package Funciones_04._4_13;

public class MainProgram {

    public static void muestraPares(int n) {
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        muestraPares(10);
    }

}
