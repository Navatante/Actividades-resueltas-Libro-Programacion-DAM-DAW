/*
Dado el siguiente polinomio de segundo grado:
y= ax^2 + bx + c
crea un programa que pida los coeficientes a,b y c, asi como el valor de x, y calcula el valor correspondiente de y.
 */

package Aplicacion_01._1_15;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte el valor de 'x':");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserte el valor de 'a':");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserte el valor de 'b':");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserte el valor de 'c':");
        double c = Double.parseDouble(scanner.nextLine());

        double y = (a*(x*x)) + (b*x) + c;

        System.out.println("El valor de 'y' es: " + y);

    }
}
