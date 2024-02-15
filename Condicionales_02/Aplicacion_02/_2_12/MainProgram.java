/*
El DNI consta de un entero de 8 digitos seguido de una letra que se obtiene a partir del numero de la siguiente forma
letra = numero DNI modulo 22
Basandote en esta informacion, elige la letra a partir de la numeracion de la siguiente tabla:
0-T,1-R,2-W,3-A,4-G,5-M,6-Y,7-F,8-P,9-D,10-X,11-B,12-N,13-J,14-Z,15-S,16-Q,17-V,18-H,19-L,20-C,21-K,22-E
y disena una aplicacion en la que, dado un numero de DNI, calcule la letra que le corresponde.
Observa que un numero de 8 digitos esta dentro del rango del tipo int.
 */

package Condicionales_02.Aplicacion_02._2_12;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserte el numero del DNI:");
        int dniNumber = Integer.parseInt(scanner.nextLine());
            char dniLetter;
            int index = dniNumber % 23; // El libro tiene un fallo, hay que utilizar el modulo de 23, en lugar de 22.
        dniLetter = switch (index) {
            case 0 -> 'T';
            case 1 -> 'R';
            case 2 -> 'W';
            case 3 -> 'A';
            case 4 -> 'G';
            case 5 -> 'M';
            case 6 -> 'Y';
            case 7 -> 'F';
            case 8 -> 'P';
            case 9 -> 'D';
            case 10 -> 'X';
            case 11 -> 'B';
            case 12 -> 'N';
            case 13 -> 'J';
            case 14 -> 'Z';
            case 15 -> 'S';
            case 16 -> 'Q';
            case 17 -> 'V';
            case 18 -> 'H';
            case 19 -> 'L';
            case 20 -> 'C';
            case 21 -> 'K';
            default -> 'E';
        };
            System.out.println("The letter for DNI number " + dniNumber + " is " + dniLetter);
        }
}
