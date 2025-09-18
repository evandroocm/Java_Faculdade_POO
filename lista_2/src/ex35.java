import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int n = scan.nextInt();
        int soma = 0;
        int contador = 0;
        int num = 2;

        while (contador < n) {
            boolean primo = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                soma += num;
                contador++;
            }
            num++;
        }

        System.out.printf("A soma dos %d primeiros números primos é: %d\n", n, soma);

        scan.close();
    }
}