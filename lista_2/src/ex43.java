import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome do atleta: ");
        String atleta = scan.nextLine();

        double[] notas = new double[7];
        double soma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            notas[i] = scan.nextDouble();
            soma += notas[i];

            if (notas[i] > maior) maior = notas[i];
            if (notas[i] < menor) menor = notas[i];
        }

        double media = (soma - maior - menor) / 5;

        System.out.println("\nResultado final:");
        System.out.println("Atleta: " + atleta);
        System.out.printf("Melhor nota: %.1f\n", maior);
        System.out.printf("Pior nota: %.1f\n", menor);
        System.out.printf("Média: %.2f\n", media);

        scan.close();
    }
}