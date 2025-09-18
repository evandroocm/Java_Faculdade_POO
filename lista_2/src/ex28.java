import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salario = 4000;
        double aumento = 0.015;

        System.out.print("Digite o ano atual: ");
        int anoAtual = scan.nextInt();

        for (int i = 2020; i <= anoAtual; i++) {
            salario += salario * aumento;
            if (i > 2020) {
                aumento *= 2;
            }
        }

        System.out.printf("O salário em %d é: R$ %.2f\n", anoAtual, salario);

        scan.close();
    }
}