package Bucles_03.Propuesta_03.Aplicacion_03._3_11;

import java.util.Scanner;

public class MainProgram {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserte un numero decimal: ");
        String input = scanner.nextLine();
        double numeroDecimal = Double.parseDouble(input);

        int parteEntera = (int) numeroDecimal;
        String binarioParteEntera = Integer.toBinaryString(parteEntera);

        int decimalPlaces = input.contains(".") ? input.length() - 1 - input.indexOf(".") : 0;

        double parteFraccionaria = numeroDecimal - parteEntera;
        StringBuilder binarioParteFraccionaria = new StringBuilder(".");
        for (int i = 0; i < decimalPlaces; i++) {
            parteFraccionaria *= 2;
            int bit = (int) parteFraccionaria;
            binarioParteFraccionaria.append(bit);
            parteFraccionaria -= bit;
        }

        String binarioCompleto = binarioParteEntera + binarioParteFraccionaria.toString();

        System.out.println("El número decimal " + numeroDecimal + " en binario es: " + binarioCompleto);
    }
}
