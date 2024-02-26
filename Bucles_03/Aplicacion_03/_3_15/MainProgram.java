/*
Diseña una aplicación que dibuje el triangulo de Pascal, para n filas. Numerando las filas y elementos desde 0, la formula para obtener el m-esimo elemento de la n-esima fila es:
E (n,m) = n! / ( m!(n-m)!
Donde n! es el factorial de n.
Un ejemplo de triangulo de Pascal con 5 filas (n = 4) es:
1
11
121
1331
14641

 */
package Bucles_03.Aplicacion_03._3_15;

public class MainProgram {
    public static void main(String[] args) {
        printPascalTriangle(5);
    }

    static void printPascalTriangle(int n) {
        for (int line = 0; line < n; line++) {
            for (int i = 0; i <= line; i++)
                System.out.print(binomialCoeff(line, i) + " ");
            System.out.println();
        }
    }

    static int binomialCoeff(int n, int k) {
        int res = 1;

        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }

        return res;
    }
}

