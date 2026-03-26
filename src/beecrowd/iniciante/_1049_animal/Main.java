package beecrowd.iniciante._1049_animal;
import java.io.IOException;
import java.util.Scanner;


    public class Main {

        public static void main(String[] args) throws IOException {

            Scanner scanner = new Scanner(System.in);

            String subfilo = scanner.next();
            String classe = scanner.next();
            String dieta = scanner.next();

            if (subfilo.equals("vertebrado")) {

                //Aves
                if (classe.equals("ave")){

                    if (dieta.equals("carnivoro")) {
                        System.out.println("aguia");
                    } else if (dieta.equals("onivoro")) {
                        System.out.println("pomba");
                    }

                    //Mamiferos
                } else if (classe.equals("mamifero")) {
                    if (dieta.equals("onivoro")) {
                        System.out.println("homem");
                    } else if (dieta.equals("herbivoro")) {
                        System.out.println("vaca");
                    }
                }
            }

            if (subfilo.equals("invertebrado")) {

                //Insetos
                if (classe.equals("inseto")) {

                    if (dieta.equals("hematofago")){
                        System.out.println("pulga");
                    } else if (dieta.equals("herbivoro")) {
                        System.out.println("lagarta");
                    }

                //Anelideos
                } else if (classe.equals("anelideo")) {
                    if (dieta.equals("hematofago")) {
                        System.out.println("sanguessuga");
                    } else if (dieta.equals("onivoro")) {
                        System.out.println("minhoca");
                    }

                }
            }
        }
    }