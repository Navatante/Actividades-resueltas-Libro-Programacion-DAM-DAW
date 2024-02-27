/*
De forma similar a la Actividad de aplicación 3.17, implementa un algoritmo que calcule el mínimo común múltiplo de dos números dados.
 */
package Bucles_03.Aplicacion_03._3_18;

import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte un numero");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserte otro numero");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("El MCM de " + a + " y " + b + " es " + mcm(a, b));
    }

    public static int mcm(int a, int b) {
        int max = Math.max(a, b);
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        }
    }
}
