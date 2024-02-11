/*
Realiza un programa que informe al usuario (mostrando true) si un primer número es múltiplo de otro número.
Ambos números se piden por teclado.
 */
package Propuesta_02._2_4;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Inserte un primer número");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserte un segundo número");
        num2 = Integer.parseInt(scanner.nextLine());

        if(num1%num2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);;
        }
    }
}
