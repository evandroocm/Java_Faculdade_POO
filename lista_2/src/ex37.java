import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o valor de R1 (0 para sair): ");
            double r1 = scan.nextDouble();
            if (r1 == 0) break;

            System.out.print("Digite o valor de R2 (0 para sair): ");
            double r2 = scan.nextDouble();
            if (r2 == 0) break;

            double paralelo = (r1 * r2) / (r1 + r2);
            System.out.printf("Resistência equivalente em paralelo: %.2f\n\n", paralelo);
        }

        scan.close();
    }
}