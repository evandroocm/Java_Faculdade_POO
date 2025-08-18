import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço antigo do produto: ");
        double precoAntigo = sc.nextDouble();
        double precoNovo;
        double percentual;

        if (precoAntigo <= 50) {
            percentual = 0.05; // 5%
        } else if (precoAntigo <= 100) {
            percentual = 0.10; // 10%
        } else {
            percentual = 0.15; // 15%
        }

        precoNovo = precoAntigo + (precoAntigo * percentual);

        System.out.printf("Preço antigo: R$ %.2f%n", precoAntigo);
        System.out.printf("Percentual de aumento: %.0f%%%n", percentual * 100);
        System.out.printf("Preço novo: R$ %.2f%n", precoNovo);

        if (precoNovo <= 80) {
            System.out.println("Classificação: Barato");
        } else if (precoNovo <= 120) {
            System.out.println("Classificação: Normal");
        } else if (precoNovo <= 200) {
            System.out.println("Classificação: Caro");
        } else {
            System.out.println("Classificação: Muito caro");
        }

        sc.close();
    }
}
