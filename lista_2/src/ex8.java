import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        for (int i = 0; i < 10; i++) {
            if (i > 0){
                System.out.print("Digite um número: ");
                numero = scanner.nextInt();
                soma += numero;
            }
            else{
                continue;
            }
        }

        double media = soma / 10.0;
        System.out.printf("A média dos números digitados é: %.2f\n", media);

        scanner.close();
    }
}