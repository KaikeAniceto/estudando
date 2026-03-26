package beecrowd.iniciante._1048_aumento_salario;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double percentual = 0;

        if (salario >= 0 && salario <= 400.00) {
            percentual = 1.15;
        } else if (salario >= 400.01 && salario <= 800.00) {
            percentual = 1.12;
        } else if (salario >= 800.01 && salario <= 1200.00) {
            percentual = 1.10;
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            percentual = 1.07;
        } else if (salario > 2000.00) {
            percentual = 1.04;
        }
        System.out.println(String.format("Novo salario: %.2f", (salario * percentual)));
        System.out.println(String.format("Reajuste ganho: %.2f", (salario * percentual) - salario));
        System.out.println(String.format("Em percentual: %.0f %%", (percentual - 1) * 100));


    }
}