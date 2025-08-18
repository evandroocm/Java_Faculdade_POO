import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mini Calculadora");
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o primeiro valor: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacaoValida = true;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                operacaoValida = false;
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}