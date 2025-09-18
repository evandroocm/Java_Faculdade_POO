import java.util.Scanner;
import java.util.Random;

public class ex39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int numero = rand.nextInt(100) + 1;
        int tentativa = 0;
        int chute;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu chute: ");
            chute = scan.nextInt();
            tentativa++;

            if (chute < numero) {
                System.out.println("O número é maior.");
            } else if (chute > numero) {
                System.out.println("O número é menor.");
            }
        } while (chute != numero);

        System.out.printf("Parabéns! Você acertou em %d tentativas.\n", tentativa);

        scan.close();
    }
}