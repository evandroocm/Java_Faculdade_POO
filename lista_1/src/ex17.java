import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Peso ideal para homem: %.2f kg\n", pesoIdeal);
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal para mulher: %.2f kg\n", pesoIdeal);
        } else {
            System.out.println("Sexo inválido.");
        }

        scanner.close();
    }
}