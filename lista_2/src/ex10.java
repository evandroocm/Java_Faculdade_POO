import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int N = scanner.nextInt();

        System.out.println("Os " + N + " primeiros números ímpares são:");

        for (int i = 1; i <= 2 * N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}   