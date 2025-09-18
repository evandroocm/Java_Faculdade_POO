import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número (negativo para sair): ");
            num = scan.nextInt();

            if (num < 0) {
                break;
            }

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número válido foi digitado.");
        } else {
            System.out.printf("Maior número: %d\n", maior);
            System.out.printf("Menor número: %d\n", menor);
        }

        scan.close();
    }
}