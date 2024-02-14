/*
Escribe una aplicacion que solicite al usuario un numero comprendido entre 0 y 99999.
La aplicacion tendra que indicar si el numero introducido es capicua.
 */
package Condicionales_02.Aplicacion_02._2_11;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte un numero comprendido entre 0 y 99999");
        int numero = scanner.nextInt();

        // Variable para almacenar el número invertido
        int numeroInvertido = 0;
        int numeroTemporal = numero; // Guardamos una copia del número original

        // Invertimos el número
        while (numeroTemporal != 0) {
            int digito = numeroTemporal % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numeroTemporal /= 10;
        }

        // Comparamos el número original con el número invertido para determinar si es capicúa
        if (numero == numeroInvertido) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }

        scanner.close();

    }
}
