import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scan.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        int somaPares = 0;
        int multImpares = 1;

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            } else {
                multImpares *= i;
            }
        }

        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Multiplicação dos ímpares: " + multImpares);

        scan.close();
    }
}
