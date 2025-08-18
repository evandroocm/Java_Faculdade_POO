import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do trabalhador: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o tempo de serviço (em anos): ");
        int tempoServico = scanner.nextInt();

        boolean podeAposentar = idade >= 65 ||
                                tempoServico >= 30 ||
                                (idade >= 60 && tempoServico >= 25);

        if (podeAposentar) {
            System.out.println("Pode se aposentar.");
        } else {
            System.out.println("Não pode se aposentar.");
        }

        scanner.close();
    }
}