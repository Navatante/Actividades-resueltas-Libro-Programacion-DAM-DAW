/*
Solicita al usuario tres distancias:
- La primera, medida en milimetros.
- La segunda, medida en centimetros.
- La ultima, medida en metros.
Disena un programa que muestre la suma de las tres longitudes introducidas (medidas en centimetros)._
 */
package Aplicacion_01._1_17;

import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mmInput, cmInput, mInput, suma;

        System.out.println("Inserte una medida en mm:");
        mmInput = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserte una medida en cm:");
        cmInput = Double.parseDouble(scanner.nextLine());
        System.out.println("Inserte una medida en m:");
        mInput = Double.parseDouble(scanner.nextLine());

        suma = (mmInput/10) + cmInput + (mInput*100);

        System.out.println("La suma en cm de las tres longitudes es: " + suma + "cm.");
    }
}
