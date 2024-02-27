/*
Para dos números dados, a y b, es posible buscar el máximo común divisor (el numero mas grande que divide a ambos) mediante un algoritmo ineficiente pero sencillo:
desde el menor de a y b, ir buscando, de forma decreciente, el primer numero que divide a ambos simultáneamente. Realiza un programa que calcule el máximo común divisor de dos números.
 */
package Bucles_03.Aplicacion_03._3_17;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte un numero");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserte otro numero");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("El MCD de " + a + " y " + b + " es " + mcd(a, b));
    }

    public static int mcd(int a, int b) {
        int min = Math.min(a, b);
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

