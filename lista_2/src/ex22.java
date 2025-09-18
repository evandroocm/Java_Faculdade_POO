import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();
        int soma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos divisores de " + numero + " (excluindo ele próprio) é: " + soma);
        scan.close();
    }
}