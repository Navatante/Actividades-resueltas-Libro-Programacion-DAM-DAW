/*
Calcula la raíz cuadrada de un numero natural mediante aproximaciones.
En el caso de que no sea exacta, muestra el resto.
 */
package Bucles_03.Aplicacion_03._3_19;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int number = scanner.nextInt();
        int root = 0;
        int square = 0;

        while (square <= number) {
            root++;
            square = root * root;
        }

        // Como nos hemos pasado, restamos uno a la raíz y calculamos el cuadrado correcto
        root--;
        square = root * root;

        int remainder = number - square;

        System.out.println("La raíz cuadrada de " + number + " es " + root + " con un resto de " + remainder);
    }
}

