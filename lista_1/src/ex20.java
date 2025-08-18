import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota do Trabalho de Laboratório (0 a 10): ");
        double notaLab = scanner.nextDouble();
        System.out.print("Nota da Avaliação Semestral (0 a 10): ");
        double notaSem = scanner.nextDouble();
        System.out.print("Nota do Exame Final (0 a 10): ");
        double notaFinal = scanner.nextDouble();

        if (!isNotaValida(notaLab) || !isNotaValida(notaSem) || !isNotaValida(notaFinal)) {
            System.out.println("Todas as notas devem estar entre 0 e 10.");
            scanner.close();
            return;
        }

        double media = (notaLab * 2 + notaSem * 3 + notaFinal * 5) / 10.0;

        System.out.printf("Média final: %.2f\n", media);
        if (media >= 0 && media <= 2.9) {
            System.out.println("Aluno REPROVADO.");
        } else if (media >= 3 && media <= 5.9) {
            System.out.println("Aluno em RECUPERAÇÃO.");
        } else if (media >= 6 && media <= 10) {
            System.out.println("Aluno APROVADO.");
        } else {
            System.out.println("Média fora do intervalo esperado.");
        }

        scanner.close();
    }

    private static boolean isNotaValida(double nota) {
        return nota >= 0 && nota <= 10;
    }
}