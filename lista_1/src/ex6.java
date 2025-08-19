
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("M - Matutino ou V-Vespertino ou N - Noturno");
        System.out.println("Em que turno você estuda: ");
        String letter = scanner.nextLine().toUpperCase();

        if (letter.equalsIgnoreCase("M")) {
            System.out.println("M - Matutino");
        } else if (letter.equalsIgnoreCase("V")) {
            System.out.println("V-Vespertino");
        } else if (letter.equalsIgnoreCase("N")) {
            System.out.println("N - Noturno");
        } else {
            System.out.println("Valor Inválido!");
        }

        scanner.close();
    }
}
