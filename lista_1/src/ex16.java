import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o valor da prestação: ");
        double prestacao = scanner.nextDouble();

        if (prestacao > 0.2 * salario) {
            System.out.println("Empréstimo não concedido");
        } else {
            System.out.println("Empréstimo concedido");
        }

        scanner.close();
    }
}