/*
Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos.
La aplicación debe mostrar cuantas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.
 */

package Aplicacion_01._1_16;

import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double horas, minutos, segundos;
        System.out.println("Introduzca los segundos:");
        segundos = Integer.parseInt(scanner.nextLine());

        horas = segundos/3600;
        minutos = segundos/60;
        System.out.println("En " + segundos + " segundos, hay " + horas + " horas y " + minutos +" minutos.");

    }
}
