/*
Escribe una función en la que se pase como parámetros de entrada una cantidad de días, horas y minutos. La función calculará y devolverá el número de segundos que existen en los datos de entrada.
 */
package Funciones_04._4_14;

import java.util.Scanner;



public class MainProgram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserte los dias, horas y minutos separado por un espacio.");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int inputDias = Integer.parseInt(parts[0]);
        int inputHoras = Integer.parseInt(parts[1]);
        int inputMinutos = Integer.parseInt(parts[2]);

        int resultado = totalDeSegundos(inputDias,inputHoras,inputMinutos);

        System.out.println("En los datos introducidos hay " + resultado +" segundos.");

    }

   public static int totalDeSegundos(int dias, int horas, int minutos) {
        int numSegundos = 0;

        numSegundos+= (dias*86400);
        numSegundos+= (horas*3600);
        numSegundos+= (minutos*60);

        return numSegundos;
    }
}
