/*
Escribe un programa que solicite al usuario las distintas cantidades de dinero de las que dispone.
Por ejemplo: la cantidad de dinero que tiene en el banco, en una hucha, en un cajón y en los bolsillos. La aplicación mostrara la suma total de dinero de la que dispone el usuario.
La manera de especificar que no se desea introducir mas cantidades es mediante el cero.
 */
package Bucles_03.Aplicacion_03._3_20;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        while (true) {
            System.out.println("Introduce una cantidad de dinero (0 para terminar):");
            double amount = scanner.nextDouble();
            if (amount == 0) {
                break;
            }
            total += amount;
        }
        System.out.println("La suma total de dinero es: " + total);
    }
}
