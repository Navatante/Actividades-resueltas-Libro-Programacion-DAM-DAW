/*
Implementa un programa que pida al usuario un numero positivo y lo muestre guarismo a guarismo.
Por ejemplo, para el numero 123, debe mostrar primero el 3, a continuación, el 2 y por último el 1.
 */

package Bucles_03.Propuesta_03._3_3;

import java.util.Scanner;

public class MainProgram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserte un numero positivo: ");
        String numero = scanner.nextLine();

        for (int i = numero.length() - 1; i >= 0; i--) {
            System.out.println(numero.charAt(i));
        }
    }
}
