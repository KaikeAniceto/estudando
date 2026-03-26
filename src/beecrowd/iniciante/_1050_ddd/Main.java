package beecrowd.iniciante._1050_ddd;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Integer ddd = scanner.nextInt();
        Map<Integer, String> MapaDDD = new HashMap<>();

        MapaDDD.put(61, "Brasilia");
        MapaDDD.put(71, "Salvador");
        MapaDDD.put(11,"Sao Paulo");
        MapaDDD.put(21,"Rio de Janeiro");
        MapaDDD.put(32,"Juiz de Fora");
        MapaDDD.put(19,"Campinas");
        MapaDDD.put(27,"Vitoria");
        MapaDDD.put(31,"Belo Horizonte");

        if (MapaDDD.containsKey(ddd)) {
            System.out.println(MapaDDD.get(ddd));
        } else {
            System.out.println("DDD nao cadastrado");
        }

    }

}