
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        if (nota1 < 0.0 || nota1 > 10.0) {
            System.out.println("Nota 1 inválida. O programa será encerrado.");
            return;
        }

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        if (nota2 < 0.0 || nota2 > 10.0) {
            System.out.println("Nota 2 inválida. O programa será encerrado.");
            return;
        }

        double media = (nota1 + nota2) / 2;
        System.out.printf("A média das notas é: %.2f%n", media);
    }
}