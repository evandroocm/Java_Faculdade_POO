import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        int i = 0;
        while (i < 10){
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            soma = soma + numero;
            i++;
        }
        System.out.printf("Soma: %d", soma);
    }
}
