/*
Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular el importe que hay que cobrar
en la taquilla por la compra de una serie de entradas (cuyo número será introducido por el usuario). Existen dos tipos de entrada:
infantiles, que cuestan 15.50€; y de adultos, que cuestan 20€.
En el caso de que el importe total sea igual o superior a 100€. se aplicará automaticamente un bono de descuento del 5%.
 */

package Aplicacion_01._1_19;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int adultos, ninhos;
        final double entradasAdultos = 20, entradasInfantiles = 15.50, descunto = 0.05;
        double importe, precioSinDescuento, precioConDescuento;
        System.out.println("¿Cuantos adultos son?");
        adultos = Integer.parseInt(scanner.nextLine());
        System.out.println("¿Cuantos ninhos son?");
        ninhos = Integer.parseInt(scanner.nextLine());

        precioSinDescuento = (adultos*entradasAdultos) + (ninhos*entradasInfantiles);
        precioConDescuento = precioSinDescuento - (precioSinDescuento*descunto);

        importe = precioSinDescuento >= 100 ? precioConDescuento : precioSinDescuento;

        System.out.println("Debe pagar un importe de " + importe + "€.");


    }
}
