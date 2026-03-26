package beecrowd.iniciante._1047_tempo_jogo_minutos;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int hora_inicio = scanner.nextInt();
        int minuto_inicio = scanner.nextInt();
        int hora_fim = scanner.nextInt();
        int minuto_fim = scanner.nextInt();

        int total_inicio_minutos = (hora_inicio * 60) + minuto_inicio;
        int total_fim_minutos = (hora_fim * 60) + minuto_fim;
        int duracao_minutos;


        if (total_inicio_minutos < total_fim_minutos) {
            duracao_minutos = total_fim_minutos - total_inicio_minutos;
        } else {
            duracao_minutos = (1440 - total_inicio_minutos) + total_fim_minutos;
        }
        System.out.println("O JOGO DUROU " + (duracao_minutos/60) + " HORA(S) " + "E " + (duracao_minutos % 60) + " MINUTO(S)");

        scanner.close();
    }
}

