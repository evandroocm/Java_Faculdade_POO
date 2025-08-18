import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da venda mensal: R$ ");
        double venda = sc.nextDouble();
        double comissao = 0;

        if (venda >= 100000) {
            comissao = 700 + (venda * 0.16);
        } else if (venda >= 80000) {
            comissao = 650 + (venda * 0.14);
        } else if (venda >= 60000) {
            comissao = 600 + (venda * 0.14);
        } else if (venda >= 40000) {
            comissao = 550 + (venda * 0.14);
        } else if (venda >= 20000) {
            comissao = 500 + (venda * 0.14);
        } else {
            comissao = 400 + (venda * 0.14);
        }

        System.out.printf("Venda mensal: R$ %.2f%n", venda);
        System.out.printf("Comissão a pagar: R$ %.2f%n", comissao);

        sc.close();
    }
}