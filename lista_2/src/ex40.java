import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        double num1, num2, resultado;

        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                num1 = scan.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scan.nextDouble();

                if (opcao == 1) {
                    resultado = num1 + num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                } else if (opcao == 2) {
                    resultado = num1 - num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                } else if (opcao == 3) {
                    resultado = num1 * num2;
                    System.out.printf("Resultado: %.2f\n", resultado);
                } else if (opcao == 4) {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.printf("Resultado: %.2f\n", resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                }

            } else if (opcao != 5) {
                System.out.println("Opção inválida, tente novamente.");
            }

        } while (opcao != 5);

        System.out.println("Programa encerrado.");
        scan.close();
    }
}