import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        if (idade >= 5 && idade <= 12) {
            System.out.println("Categoria: Infantil");
        } else if (idade > 12 && idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } else if (idade > 17) {
            System.out.println("Categoria: Sênior");
        } else {
            System.out.println("Idade fora das categorias.");
        }

        scanner.close();
    }
}