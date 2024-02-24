package Bucles_03.Propuesta_03.Aplicacion_03._3_12;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserte un numero binario: ");
        String numeroBinario = scanner.nextLine();

        String[] partes = numeroBinario.split("\\.");
        String parteEnteraBinaria = partes[0];
        String parteFraccionariaBinaria = partes.length > 1 ? partes[1] : "";

        int parteEnteraDecimal = Integer.parseInt(parteEnteraBinaria, 2);

        double parteFraccionariaDecimal = 0;
        for (int i = 0; i < parteFraccionariaBinaria.length(); i++) {
            char bit = parteFraccionariaBinaria.charAt(i);
            if (bit == '1') {
                parteFraccionariaDecimal += Math.pow(2, -(i + 1));
            }
        }

        double numeroDecimal = parteEnteraDecimal + parteFraccionariaDecimal;

        System.out.println("El número binario " + numeroBinario + " en decimal es: " + numeroDecimal);
    }
}
