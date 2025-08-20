// Escreva um programa que leia 10 inteiros e imprima sua média
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            soma += numero;
        }

        double media = soma / 10.0;
        System.out.printf("A média dos números digitados é: %.2f\n", media);

        scanner.close();
    }
}