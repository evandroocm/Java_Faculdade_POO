import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto:");
        int codigo = sc.nextInt();

        System.out.println("Digite a quantidade:");
        int quantidade = sc.nextInt();

        double preco = 0;
        String produto = "";

        switch (codigo) {
            case 100:
                produto = "Hot Dog";
                preco = 12.00;
                break;
            case 102:
                produto = "X-Salada";
                preco = 18.50;
                break;
            case 103:
                produto = "X-Bacon";
                preco = 25.50;
                break;
            case 104:
                produto = "X-Burguer";
                preco = 17.00;
                break;
            case 105:
                produto = "Suco de Laranja";
                preco = 9.50;
                break;
            case 106:
                produto = "Refrigerante";
                preco = 6.00;
                break;
            default:
                System.out.println("Código inválido!");
                sc.close();
                return;
        }

        double total = preco * quantidade;

        System.out.printf("Você pediu %d %s. Valor total: R$ %.2f%n", quantidade, produto, total);

        sc.close();
    }
}
