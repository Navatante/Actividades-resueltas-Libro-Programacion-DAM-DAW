/*
Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo, con el siguiente prototipo:
static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2)
La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes utilizados.

 */
package Funciones_04._4_15;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println(diferenciaMin(2,40,1,20));
    }

    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        final int minutosEnUnaHora = 60;
        int uno = (hora1*minutosEnUnaHora)+minuto1;
        int dos = (hora2*minutosEnUnaHora)+minuto2;
        return Math.abs(uno-dos);

    }
}
