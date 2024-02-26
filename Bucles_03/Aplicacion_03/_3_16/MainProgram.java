/*
Solicita al usuario un numero n y dibuja un triángulo de base y altura n.
 */
package Bucles_03.Aplicacion_03._3_16;
import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserte 'n': ");
        int n = Integer.parseInt(scanner.nextLine());
        imprimeTriangulo(n);
    }

    static void imprimeTriangulo(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
