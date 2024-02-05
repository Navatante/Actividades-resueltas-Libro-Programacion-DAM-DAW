/*
Modifica la Actividad de la Aplicación 1.12 para que, indicando dos números n y m, diga que cantidad hay que sumarle a n para que sea múltiplo de m.
 */
package Aplicacion_01._1_13;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que introduzca n y m como números enteros
        System.out.println("Introduzca un numero entero 'n': ");
        int numeroN = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduzca un numero entero 'm': ");
        int numeroM = Integer.parseInt(scanner.nextLine());

        // Calcula el residuo de la división del número entero por 7
        int residuo = numeroN % numeroM;
        // Calcula el número que se debe sumar para que el número 'n' sea múltiplo del numero 'm'
        // Si el residuo es 0, el número ya es múltiplo de 'm', por lo que no se debe sumar nada (0)
        // Si el residuo no es 0, se debe sumar 'numeroM' - residuo para hacer que el número 'n' sea múltiplo de numero 'm'
        int numeroAsumar = (residuo == 0) ? 0 : numeroM - residuo;

        // Muestra el número que se debe sumar para que el número 'n' sea múltiplo de numero 'm'
        System.out.println("Debe sumar " + numeroAsumar + " para que el numero " + numeroN + " sea múltiplo de " + numeroM);
    }
}
