/*
Solicita por teclado un número de tipo int al usuario y escribe un programa que muestre true o false. dependiendo de si el número es positivo.
 */
package Propuesta_02._2_2;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput;

        System.out.println("Inserte un número entero:");
        numInput = Integer.parseInt(scanner.nextLine());

        //Opción A
        boolean result = numInput > -1;
        System.out.println(result);

        //Opción B
        if(numInput>-1)
            System.out.println(true);
         else
            System.out.println(false);
    }
}
