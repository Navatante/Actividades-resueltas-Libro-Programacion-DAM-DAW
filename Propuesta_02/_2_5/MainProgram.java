/*
Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación solicitará el aforo máximo del local, el precio por entrada
(suponemos que todas las entradas tienen el mismo precio) y el número de entradas vendidas.

Hay que tener en cuenta que si el número de entradas vendidas no supera el 20% del aforo del local, se cancela el concierto.
Si el número de entradas vendidas no supera el 50% del aforo del local, se realiza una rebaja del 25% del precio de la entrada.
 */
package Propuesta_02._2_5;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aforoMax, entradasVendidas;
        double precioEntrada;

        System.out.println("Inserte el aforo máximo");
        aforoMax = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserte el precio por entrada");
        precioEntrada = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserte las entradas vendidas");
        entradasVendidas = Integer.parseInt(scanner.nextLine());

        if (entradasVendidas<(aforoMax*0.2)) {
            System.out.println("El concierto ha sido cancelado.");
        } else if (entradasVendidas<(aforoMax*0.5)){
            precioEntrada -= (precioEntrada*0.25);
            System.out.println("Se ha recaudado " + (precioEntrada*entradasVendidas) + " Euros.");
        } else {
            System.out.println("Se ha recaudado " + (precioEntrada*entradasVendidas) + " Euros.");
        }
    }
}
