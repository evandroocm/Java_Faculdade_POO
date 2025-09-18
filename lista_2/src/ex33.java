import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] medias = new double[10];
        int alunosAprovados = 0;

        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 1; j <= 4; j++) {
                System.out.printf("Digite a %dª nota do aluno %d: ", j, i + 1);
                soma += scan.nextDouble();
            }
            medias[i] = soma / 4;
            if (medias[i] >= 7.0) {
                alunosAprovados++;
            }
        }

        System.out.printf("\nNúmero de alunos com média >= 7.0: %d\n", alunosAprovados);

        scan.close();
    }
}