
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            int quadrado = numero * numero;
            double raizQuadrada = Math.sqrt(numero);

            System.out.println("O número ao quadrado é: " + quadrado);
            System.out.println("A raiz quadrada do número é: " + raizQuadrada);
        } else {
            System.out.println("O número não é positivo.");
        }

        scanner.close();
    }
}