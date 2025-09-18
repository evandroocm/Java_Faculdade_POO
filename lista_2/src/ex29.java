import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = scan.nextInt();
            soma += numeros[i];
        }

        System.out.printf("\nSomatório: %d\n", soma);
        System.out.println("Números digitados:");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d\n", numeros[i]);
        }

        scan.close();
    }
}