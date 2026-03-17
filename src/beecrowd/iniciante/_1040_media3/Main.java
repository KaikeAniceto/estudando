package beecrowd.iniciante._1040_media3;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
        double N1 = ler.nextDouble();
        double N2 = ler.nextDouble();
        double N3 = ler.nextDouble();
        double N4 = ler.nextDouble();

        double media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10.0;
        media = Math.floor(media * 10)/10.0;

        System.out.println("Media: " + String.format("%.1f", media));

        if (media < 5.0){
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            double Nexame = ler.nextDouble();
            System.out.println("Nota do exame: " + String.format("%.1f", Nexame));
            media = (Nexame + media)/2;

            if (media >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + String.format("%.1f", media));
            } else {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + String.format("%.1f", media));
            }

        } else {
            System.out.println("Aluno aprovado.");
        }
    }
}
