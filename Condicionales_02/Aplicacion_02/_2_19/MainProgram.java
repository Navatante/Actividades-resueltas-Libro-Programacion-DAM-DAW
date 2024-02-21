/*
Crea una aplicación que solicite al usuario cuantos grados tiene un ángulo y muestre el equivalente en radianes.
Si el ángulo introducido por el usuario no se encuentra en el rango 0º o 360º, hay que transformarlo a dicho rango.
Nota: El operador modulo puede ayudarnos a convertir un ángulo a su equivalente en el rango comprendido d 0º a 360º.
 */
package Condicionales_02.Aplicacion_02._2_19;

import java.util.Scanner;

public class MainProgram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del ángulo en grados:");
        double anguloGrados = scanner.nextDouble();

        // Ajustar el ángulo al rango de 0 a 360 grados
        anguloGrados %= 360;
        if (anguloGrados < 0) {
            anguloGrados += 360;
        }

        // Convertir el ángulo a radianes
        double anguloRadianes = Math.toRadians(anguloGrados);

        System.out.println("El ángulo " + anguloGrados + " grados equivale a " + anguloRadianes + " radianes.");

        scanner.close();

    }
}
