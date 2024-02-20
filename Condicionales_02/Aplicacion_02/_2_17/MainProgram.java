/*
Realiza el <<juego de la suma>>, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar.
La aplicación debe indicar si el resultado de la operación es correcto o incorrecto.
 */

package Condicionales_02.Aplicacion_02._2_17;

import java.util.Scanner;
import java.util.Random;

public class MainProgram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numAleatorio1, numAleatorio2, resultadoUsuario, resultadoPrograma;
        String comparacion;
        numAleatorio1 = random.nextInt(1,9);
        numAleatorio2 = random.nextInt(1,9);
        resultadoPrograma = numAleatorio1 + numAleatorio2;
        System.out.println("Sume " + numAleatorio1 + " + " + numAleatorio2);
        resultadoUsuario = scanner.nextInt();

        comparacion = resultadoUsuario == resultadoPrograma ? "Correcto" : "Incorrecto";
        System.out.println(comparacion);




    }
}
