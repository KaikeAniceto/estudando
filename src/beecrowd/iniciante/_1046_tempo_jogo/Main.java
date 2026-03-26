package beecrowd.iniciante._1046_tempo_jogo;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        int hora_inicio = scanner.nextInt();
        int hora_fim = scanner.nextInt();
        int duracao;

        if (hora_inicio < hora_fim) {
            duracao = hora_fim - hora_inicio;
        }
        else {
            duracao = (24 - hora_inicio) + hora_fim;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        scanner.close();
    }
}