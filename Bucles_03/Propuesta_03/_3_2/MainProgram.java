/*
Implementa la aplicación Eco, que pide al usuario un numero y muestra en pantalla la salida:
Eco…
Eco…
Eco…
Se muestra Eco… tantas veces como indique el numero introducido. La salida anterior seria para el numero 3.

 */

package Bucles_03.Propuesta_03._3_1._3_2;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el numero de <<Eco...>> que desea: ");
        int numeroEcos = Integer.parseInt(scanner.nextLine());

        for (int i = 0 ; numeroEcos > i; i++) {
            System.out.println("Eco...");
        }
    }
}
