/*
Realiza un programa que almacene la evaluación de distintas expresiones relacionales en variables booleanas, y muestra el valor de dichas variables.
 */
package Propuesta_02._2_1;

public class MainProgram {
    public static void main(String[] args) {
        // Definición de las expresiones relacionales
        boolean expresion_1 = (5 == 5);
        boolean expresion_2 = (10 > 20);
        boolean expresion_3 = (15 <= 15);
        boolean expresion_4 = (7 != 7);

        // Mostrar el valor de las expresiones
        System.out.println("Valor de expresion_1: " + expresion_1);
        System.out.println("Valor de expresion_2: " + expresion_2);
        System.out.println("Valor de expresion_3: " + expresion_3);
        System.out.println("Valor de expresion_4: " + expresion_4);
    }
}
