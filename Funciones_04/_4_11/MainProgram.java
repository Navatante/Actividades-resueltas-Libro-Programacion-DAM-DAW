/*
Diseña una función que calcule y muestre la superficie y el volumen de una esfera.
 */
package Funciones_04._4_11;

public class MainProgram {

    public static void superficieYvolumenEsfera (double radio) {
        double superficieEsfera = (4*Math.PI)*Math.pow(radio,2);
        double volumenEsfera = ((4*Math.PI/3))*Math.pow(radio,3);
        System.out.println("Superficie: " + superficieEsfera+"\nVolumen: " + volumenEsfera);
    }

    public static void main(String[] args) {
        superficieYvolumenEsfera(3);

    }
}
