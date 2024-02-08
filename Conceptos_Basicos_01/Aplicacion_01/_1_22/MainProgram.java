/*
La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición donde cada participante escribe un algoritmo en un papel
y lo lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros
(con tantos decimales como se desee), pero para el ranking solo se tiene en cuenta la longitud en centímetros (sin decimales).
Por ejemplo, para un lanzamiento de 12.3456 m (que son 1234.56 cm) solo se contabilizarán 1234 cm.

Realizar un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte entera correspondiente en centímetros.
 */

package Aplicacion_01._1_22;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metros;
        int centimetrosSinDecimales;

        System.out.println("Inserte la longitud del lanzamiento en metros:");
        metros = Double.parseDouble(scanner.nextLine());

        centimetrosSinDecimales = (int)(metros*100);

        System.out.println("Ha realizado un lanzamiento de " + centimetrosSinDecimales + " cm.");

    }
}
