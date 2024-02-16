/*
En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales. El numero de animales que alimentar (todos de la misma especie) es numAnimales, y sabemos que cada animal come una media de kilosPorAnimal.
Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para cada animal. En caso negativo, ha de calcular cual es la ración que corresponde a cada uno de los animales.
Nota: Evitar que la aplicación realice divisiones por cero.
 */

package Condicionales_02.Aplicacion_02._2_13;

import java.util.Scanner;

public class MainProgram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAnimales;
        double comidaDiaria, kilosPorAnimal, repartoDiarioPorAnimal;

        System.out.println("Inserte el numero de animales: ");
        numAnimales = Integer.parseInt(scanner.nextLine());
        System.out.println("Inserte la comida diaria: ");
        comidaDiaria = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserte los kilos por animal: ");
        kilosPorAnimal = Double.parseDouble(scanner.nextLine());

        repartoDiarioPorAnimal = numAnimales*kilosPorAnimal;
        if (comidaDiaria < repartoDiarioPorAnimal) {
            double reduccionDiariaComida = 0;
            if (!(numAnimales==0)) {
                reduccionDiariaComida = comidaDiaria/numAnimales;
            } else {
                System.out.println("Parece que hoy no hay animales que alimentar...");
            }
            System.out.println("Hoy no hay suficiente comida, la racion diaria para hoy se reduce a " + reduccionDiariaComida +" kg por animal.");
        } else {
            double racionPorAnimal = comidaDiaria/numAnimales;
            System.out.println("Hoy cada animal puede comer una racion de " + racionPorAnimal + " kg.");
        }
    scanner.close();
    }
}
