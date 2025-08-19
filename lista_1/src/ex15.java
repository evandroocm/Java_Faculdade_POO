
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double VALOR_HORA = 40.50;
        final double LIMITE_IMPOSTO = 2500.00;
        final double TAXA_IMPOSTO = 0.11;

        System.out.print("Informe o número de horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = horasTrabalhadas * VALOR_HORA;

        double imposto = salarioBruto > LIMITE_IMPOSTO ? salarioBruto * TAXA_IMPOSTO : 0.0;
        double salarioLiquido = salarioBruto - imposto;

        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Imposto: R$ %.2f%n", imposto);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}