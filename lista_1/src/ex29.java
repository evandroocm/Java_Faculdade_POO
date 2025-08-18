import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite o estado de destino (MG, SP, RJ, MS): ");
        String estado = scanner.nextLine().trim().toUpperCase();

        double imposto = 0;
        boolean estadoValido = true;

        switch (estado) {
            case "MG":
                imposto = 0.07;
                break;
            case "SP":
                imposto = 0.12;
                break;
            case "RJ":
                imposto = 0.15;
                break;
            case "MS":
                imposto = 0.08;
                break;
            default:
                estadoValido = false;
                break;
        }

        if (estadoValido) {
            double precoFinal = valor + (valor * imposto);
            System.out.printf("O preço final do produto para %s é: R$ %.2f%n", estado, precoFinal);
        } else {
            System.out.println("Estado inválido. Por favor, digite MG, SP, RJ ou MS.");
        }

        scanner.close();
    }
}