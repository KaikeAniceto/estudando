package beecrowd.iniciante._1043_triangulo;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

     Locale.setDefault(Locale.US);
     Scanner scanner = new Scanner(System.in);

     double A = scanner.nextDouble();
     double B = scanner.nextDouble();
     double C = scanner.nextDouble();

     if(A + B <= C || B + C <= A || A + C <= B) {
         double area_trapezio = ((A+B) * C)/ 2;
         System.out.printf("Area = %.1f%n", area_trapezio);
     } else {
         System.out.printf("Perimetro = %.1f%n", (A + B + C));
         }
    }
}