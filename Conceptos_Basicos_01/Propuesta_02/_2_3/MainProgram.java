/*
Escribe una aplicación que pida al usuario dos números enteros y muestre:
- true, si ambos números son distintos entre si, o alguno de ellos es cero.
- false, en caso contrario.
 */
package Propuesta_02._2_3;

import java.util.Scanner;

public class MainProgram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2;

        System.out.println("Introduzca el primer número");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduzca el segundo número");
        num2 = Integer.parseInt(scanner.nextLine());

        if(num1 != num2 || num1 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
