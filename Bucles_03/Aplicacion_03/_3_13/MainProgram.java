package Bucles_03.Propuesta_03.Aplicacion_03._3_13;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserte la hora: ");
        int hora = Integer.parseInt(scanner.nextLine());
        System.out.print("Inserte los minutos: ");
        int minutos = Integer.parseInt(scanner.nextLine());
        System.out.print("Inserte los segundos: ");
        int segundos = Integer.parseInt(scanner.nextLine());
        System.out.print("Inserte los segundos a incrementar:");
        int incrementoSegundos = Integer.parseInt(scanner.nextLine());

        AgujaReloj agujaHora = new AgujaReloj(hora);
        AgujaReloj agujaMinutos = new AgujaReloj(minutos);
        AgujaReloj agujaSegundos = new AgujaReloj(segundos);

        segundos += incrementoSegundos;
        minutos += segundos / 60;
        hora += minutos / 60;

        agujaSegundos.avanceAguja(segundos % 60);
        agujaMinutos.avanceAguja(minutos % 60);
        agujaHora.avanceAguja(hora % 24);

        System.out.println("La nueva hora es: " + agujaHora + ":" + agujaMinutos + ":" + agujaSegundos);
    }
}