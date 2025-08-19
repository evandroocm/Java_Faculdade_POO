
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Antes da inversão:");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);

        int temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        System.out.println("Após a inversão:");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);

        scanner.close();
    }
}