/*
Crea un programa que pida la base y la altura de un triángulo y muestre su área
 */
package Aplicacion_01._1_14;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que introduzca la base del triángulo
        System.out.println("Introduzca la base del triangulo:");
        // Lee la base del triángulo introducida por el usuario
        double baseTriangulo = Double.parseDouble(scanner.nextLine());

        // Pide al usuario que introduzca la altura del triángulo
        System.out.println("Introduzca la altura del triangulo:");
        // Lee la altura del triángulo introducida por el usuario
        double alturaTriangulo = Double.parseDouble(scanner.nextLine());

        // Calcula el área del triángulo usando la fórmula (base * altura) / 2
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

        // Muestra el área del triángulo
        System.out.println("El area del triangulo es: " + areaTriangulo);
    }
}

