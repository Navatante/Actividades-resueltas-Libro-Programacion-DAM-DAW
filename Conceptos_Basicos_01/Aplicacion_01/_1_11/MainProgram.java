/*
Un economista te ha encargado un programa para realizar cálculos con el IVA.
La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
Muestra en pantalla el importe correspondiente al IVA y al total.
 */
package Aplicacion_01._1_11;

import java.util.Scanner; // Importamos la clase Scanner para obtener la entrada del usuario

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario

        // Solicitamos al usuario que introduzca la base imponible
        System.out.println("Introduzca la base imponible:");
        double baseImponible = Double.parseDouble(scanner.nextLine()); // Convertimos la entrada del usuario a un número decimal

        // Solicitamos al usuario que introduzca el IVA
        System.out.println("Introduzca el IVA:");
        double iva = Double.parseDouble(scanner.nextLine()); // Convertimos la entrada del usuario a un número decimal

        // Calculamos el importe del IVA
        double importeIVA = (iva/100)*baseImponible;
        // Calculamos el total sumando la base imponible y el importe del IVA
        double total = importeIVA + baseImponible;

        // Imprimimos el importe del IVA y el total
        System.out.println("El importe correspondiente al IVA es de: " + importeIVA + "$ lo que resulta en un TOTAL de: " + total + "$");
    }
}

