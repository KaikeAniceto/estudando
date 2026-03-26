package beecrowd.iniciante._1045_tipos_triangulo;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        double[] lados = new double[3];

        for (int i = 0; i < lados.length; i++) {

            lados[i] = scanner.nextDouble();

            if (lados[i] <= 0) {
                scanner.close();
                return;
            }
        }
        Arrays.sort(lados);

        double A = lados[2];
        double B = lados[1];
        double C = lados[0];

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((A * A) == (B * B) + (C * C)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if ((A * A) > (B * B) + (C * C)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        scanner.close();
    }
}