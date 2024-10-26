import java.util.Scanner;
public class Lesson2 {

        public static void main(String[] args) {
            System.out.println("Witam w programie");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę");7
            int number = scanner.nextInt();

            System.out.println("Podana liczba to: " +number );

            if (number < 10) {
                System.out.println("Podana liczba jest mniejsza od 10");
            } else if (number == 10){
                System.out.println("Podana liczba jest równa 10");}

                else {
                    System.out.println("Podana liczba jest większa od 10");}





    }
}
