/*
Escribe un programa que come como entrada un numero entero e indique que cantidad hay que sumarle para que el resultado sea múltiplo de 7.
 */
package Aplicacion_01._1_12;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que introduzca un número entero
        System.out.println("Introduzca un numero entero: ");
        // Lee el número entero introducido por el usuario
        int numeroEntero = Integer.parseInt(scanner.nextLine());

        // Calcula el residuo de la división del número entero por 7
        int residuo = numeroEntero % 7;
        // Calcula el número que se debe sumar para que el número entero sea múltiplo de 7
        // Si el residuo es 0, el número ya es múltiplo de 7, por lo que no se debe sumar nada (0)
        // Si el residuo no es 0, se debe sumar 7 - residuo para hacer que el número sea múltiplo de 7
        int numeroAsumar = (residuo == 0) ? 0 : 7 - residuo;

        // Muestra el número que se debe sumar para que el número entero sea múltiplo de 7
        System.out.println("Debe sumar " + numeroAsumar + " para que el numero " + numeroEntero + " sea múltiplo de 7.");
    }
}

