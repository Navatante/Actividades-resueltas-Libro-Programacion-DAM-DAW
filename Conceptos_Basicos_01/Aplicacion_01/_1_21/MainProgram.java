/*
Pide dos números al usuario: a y b. Deberá mostrar true si ambos números son iguales, y falso en caso contrario.
 */

package Aplicacion_01._1_21;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        boolean result;

        System.out.println("Inserte el numero 'a':");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserte el numero 'b':");
        b = Integer.parseInt(scanner.nextLine());

        result = a == b;

        System.out.println(result);
    }
}
