
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite F ou M:");
        String letter = scanner.nextLine().toUpperCase();

        if (letter.equalsIgnoreCase("F")) {
            System.out.println("F - Feminino");
        } else if (letter.equalsIgnoreCase("M")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Invalido");
        }

        scanner.close();
    }
}
