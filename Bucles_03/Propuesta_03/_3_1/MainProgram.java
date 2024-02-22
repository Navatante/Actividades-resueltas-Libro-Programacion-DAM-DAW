/*
Diseña una aplicación que muestre la edad máxima y mínima de un grupo de alumnos. El usuario introduce las edades y termina escribiendo un -1.
 */
package Bucles_03.Propuesta_03._3_1;

import java.util.Scanner;

public class MainProgram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edadMax = -1, edadMin = -1;

        System.out.println("Introduzca las edades, pulse -1 para finalizar");

        while (true) {
            int edadInput = Integer.parseInt(scanner.nextLine());
            if (edadInput == -1) {
                break;
            } else {
                if (edadMax == -1 && edadMin == -1) {
                    edadMax = edadInput;
                    edadMin = edadInput;
                } else {
                    if (edadInput > edadMax) {
                        edadMax = edadInput;
                    } else if (edadInput < edadMin) {
                        edadMin = edadInput;
                    }
                }
            }
        }
        System.out.println("Edad maxima: " + edadMax + "\nEdad minima: " + edadMin);
    }
}

