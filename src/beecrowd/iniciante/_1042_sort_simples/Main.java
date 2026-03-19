package beecrowd.iniciante._1042_sort_simples;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = scanner.nextInt();

        }
        int[] arrayoriginal = numeros.clone();

        Arrays.sort(numeros);

        for (int k = 0; k < numeros.length; k++) {
            System.out.println(numeros[k]);
        }

        System.out.println();

        for (int j = 0; j < arrayoriginal.length; j++) {
            System.out.println(arrayoriginal[j]);
        }
    }
}