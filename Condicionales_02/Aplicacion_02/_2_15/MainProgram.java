/*
Escribe una aplicación que solicite por consola dos números reales que corresponden a la base y la altura de un triángulo.
Deberá mostrarse su área, comprobando que los números introducidos por el usuario no son negativos, algo que no tendría sentido.
 */

package Condicionales_02.Aplicacion_02._2_15;

import java.util.Scanner;

public class MainProgram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.print("Introduce el primer numero: ");
        num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Introduce el segundo numero: ");
        num2 = Double.parseDouble(scanner.nextLine());

        if (num1 < 0 || num2 < 0) {
            System.out.println("No se aceptan numeros negativos");
        } else {
            double area = ((num1*num2)/2);
            System.out.println("La area del triangulo es: " + area);
        }
    }
}
