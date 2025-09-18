import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor;

        while (true) {
            System.out.print("Digite um valor (0 ou negativo para sair): ");
            valor = scan.nextDouble();
            if (valor <= 0) break;

            double quadrado = Math.pow(valor, 2);
            double cubo = Math.pow(valor, 3);
            double raiz = Math.sqrt(valor);

            System.out.printf("Valor: %.2f | Quadrado: %.2f | Cubo: %.2f | Raiz quadrada: %.2f\n\n", valor, quadrado, cubo, raiz);
        }

        scan.close();
    }
}