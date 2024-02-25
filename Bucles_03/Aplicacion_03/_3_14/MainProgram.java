/*
Realiza un programa que nos pida un numero n, y nos diga cuantos números hay entre 1 y n que sean primos.
Un numero primo es aquel que solo es divisible por 1 y por el mismo.
 */
package Bucles_03.Aplicacion_03._3_14;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserta un numero:");
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                count++;
            }
        }

        System.out.println("Hay " + count + " numeros primeros entre 1 y " + n);
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}