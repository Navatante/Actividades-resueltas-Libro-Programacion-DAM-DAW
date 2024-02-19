/*
Utilizar el operador ternario para calcular el valor absoluto de un numero que se solicita al usuario por teclado.
 */

package Condicionales_02.Aplicacion_02._2_16;

import java.util.Scanner;

public class MainProgram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num, absoluto;

        System.out.print("Inserte un numero: ");
        num = Double.parseDouble(scanner.nextLine());

        absoluto = num < 0 ? num*-1 : num;

        System.out.println("El numero absoluto del numero introducido es: " + absoluto);

        scanner.close();
    }
}
