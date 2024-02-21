/*
Modifica la Actividad de aplicación 2.17 para que, además de los dos números aleatorios,
también aparezca la operación que debe realizar el jugador: suma, resta o multiplicación.
 */
package Condicionales_02.Aplicacion_02._2_18;

import java.util.Random;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numAleatorio1, numAleatorio2, eleccion, resultadoUsuario, resultadoPrograma;
        String comparacion;
        numAleatorio1 = random.nextInt(1,99);
        numAleatorio2 = random.nextInt(1,99);
        System.out.println("Bienvenido a la calculadora sencilla. Seleccione operacion:\n (1) Sumar.\n (2) Restar. \n (3) Multiplicar.");
        eleccion = Integer.parseInt(scanner.nextLine());
        resultadoPrograma = switch (eleccion) {
            case 1 -> numAleatorio1 + numAleatorio2;
            case 2 -> numAleatorio1 - numAleatorio2;
            default -> numAleatorio1 * numAleatorio2;
        };
        if (eleccion == 1) {
            System.out.println("Sume " + numAleatorio1 + " + " + numAleatorio2);
        } else if (eleccion == 2) {
            System.out.println("Reste " + numAleatorio1 + " - " + numAleatorio2);
        } else if (eleccion == 3) {
            System.out.println("Multiplique " + numAleatorio1 + " * " + numAleatorio2);
        } else {
            System.out.println("Opcion no valida");
        }
        resultadoUsuario = scanner.nextInt();

        comparacion = resultadoUsuario == resultadoPrograma ? "Correcto" : "Incorrecto";
        System.out.println(comparacion);
    }
}
