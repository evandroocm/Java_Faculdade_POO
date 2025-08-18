import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a opção:");
        System.out.println("1- Soma de 2 números.");
        System.out.println("2- Diferença entre 2 números (maior pelo menor).");
        System.out.println("3- Produto entre 2 números.");
        System.out.println("4- Divisão entre 2 números (o denominador não pode ser zero).");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                double maior = Math.max(num1, num2);
                double menor = Math.min(num1, num2);
                System.out.println("Resultado: " + (maior - menor));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: o denominador não pode ser zero.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Erro: opção inválida.");
        }

        sc.close();
    }
}