import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro maior que zero: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido");
            return;
        }

        int soma = 0;
        int n = numero;
        while (n > 0) {
            soma += n % 10;
            n /= 10;
        }

        System.out.println("A soma dos algarismos é: " + soma);
    }
}