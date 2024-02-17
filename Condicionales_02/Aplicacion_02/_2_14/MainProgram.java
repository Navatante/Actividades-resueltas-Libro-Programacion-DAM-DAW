/*
Escribe un programa que solicite al usuario un numero comprendido entre 1 y 99.
El programa debe mostrarlo con letras, por ejemplo, para 56, se verá: <<cincuenta y seis>>.
 */

package Condicionales_02.Aplicacion_02._2_14;

import java.util.Scanner;

public class MainProgram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número entre 1 y 99: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 99) {
            System.out.println("Número fuera de rango");
        } else if (number < 20) {
            System.out.println("<<" + switch (number) {
                case 1 -> "uno";
                case 2 -> "dos";
                case 3 -> "tres";
                case 4 -> "cuatro";
                case 5 -> "cinco";
                case 6 -> "seis";
                case 7 -> "siete";
                case 8 -> "ocho";
                case 9 -> "nueve";
                case 10 -> "diez";
                case 11 -> "once";
                case 12 -> "doce";
                case 13 -> "trece";
                case 14 -> "catorce";
                case 15 -> "quince";
                case 16 -> "dieciséis";
                case 17 -> "diecisiete";
                case 18 -> "dieciocho";
                case 19 -> "diecinueve";
                default -> "";
            } + ">>");
        } else {
            int unit = number % 10;
            int ten = number / 10;
            if (unit == 0) {
                System.out.println("<<" + switch (ten) {
                    case 2 -> "veinte";
                    case 3 -> "treinta";
                    case 4 -> "cuarenta";
                    case 5 -> "cincuenta";
                    case 6 -> "sesenta";
                    case 7 -> "setenta";
                    case 8 -> "ochenta";
                    case 9 -> "noventa";
                    default -> "";
                } + ">>");
            } else {
                System.out.println("<<" + switch (ten) {
                    case 2 -> "veinti";
                    case 3 -> "treinta y ";
                    case 4 -> "cuarenta y ";
                    case 5 -> "cincuenta y ";
                    case 6 -> "sesenta y ";
                    case 7 -> "setenta y ";
                    case 8 -> "ochenta y ";
                    case 9 -> "noventa y ";
                    default -> "";
                } + switch (unit) {
                    case 1 -> "uno";
                    case 2 -> "dos";
                    case 3 -> "tres";
                    case 4 -> "cuatro";
                    case 5 -> "cinco";
                    case 6 -> "seis";
                    case 7 -> "siete";
                    case 8 -> "ocho";
                    case 9 -> "nueve";
                    default -> "";
                } + ">>");
            }
        }
    }
}