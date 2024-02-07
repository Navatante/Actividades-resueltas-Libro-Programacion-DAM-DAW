/*
Solicita al usuario un número real y calcula su raíz cuadrada. Implementa el programa utilizando el nombre cualificado
de las clases, en lugar de utilizar ninguna importación.
 */
package Aplicacion_01._1_20;

// No importo ninguna clase. En su lugar utilizo el nombre cualificado.

public class MainProgram {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double real, raizCuadrada;

        System.out.println("Introduzca un número real:");
        real = Double.parseDouble(scanner.nextLine());
        raizCuadrada = Math.sqrt(real);

        System.out.println("La raíz cuadrada de " + real + " es: " + raizCuadrada);

    }
}
