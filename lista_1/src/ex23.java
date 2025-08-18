import java.util.Scanner;

public class ex23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double baseMaior, baseMenor, altura, area;

		do {
			System.out.print("Digite o valor da base maior (> 0): ");
			baseMaior = scanner.nextDouble();
			if (baseMaior <= 0) {
				System.out.println("A base maior deve ser maior que zero.");
			}
		} while (baseMaior <= 0);

		do {
			System.out.print("Digite o valor da base menor (> 0): ");
			baseMenor = scanner.nextDouble();
			if (baseMenor <= 0) {
				System.out.println("A base menor deve ser maior que zero.");
			}
		} while (baseMenor <= 0);

		System.out.print("Digite o valor da altura: ");
		altura = scanner.nextDouble();

		area = ((baseMaior + baseMenor) * altura) / 2;

		System.out.printf("A área do trapézio é: %.2f\n", area);

		scanner.close();
	}
}
