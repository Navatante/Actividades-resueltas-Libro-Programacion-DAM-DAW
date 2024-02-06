/*
Un biólogo esta realizando un estudio de distintas especies de invertebrados y necesita una aplicación que le ayude a contabilizar el número de patas que tienen
en total todos los animales capturados durante una jornada de trabajo. Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar:
- El numero de hormigas capturadas (6 patas).
- El número de arañas capturadas (8 patas).
- El numero de cochinillas capturadas (14 patas).
La aplicación debe mostrar el número total de patas.

 */
package Aplicacion_01._1_18;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hormigas, aranas, cochinillas, sumaPatas;

        System.out.println("Inserte el numero de hormigas capturadas:");
        hormigas = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserte el numero de aranas capturadas:");
        aranas = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserte el numero de cochinillas capturadas:");
        cochinillas = Integer.parseInt(scanner.nextLine());

        sumaPatas = (hormigas * 6) + (aranas * 8) + (cochinillas * 14);

        System.out.println("Ha capturado un total de " + sumaPatas + " patas.");
    }
}
