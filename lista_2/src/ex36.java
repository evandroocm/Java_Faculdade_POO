import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int inicio = scan.nextInt();
        System.out.print("Digite o valor final: ");
        int fim = scan.nextInt();

        if (inicio > fim) {
            System.out.println("Intervalo de valores inválido");
        } else {
            int soma = 0;
            for (int i = inicio; i <= fim; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
            System.out.printf("Soma dos ímpares neste intervalo: %d\n", soma);
        }

        scan.close();
    }
}