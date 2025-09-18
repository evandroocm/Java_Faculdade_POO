import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int voto;
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, nulos = 0, brancos = 0;
        int totalVotos = 0;

        System.out.println("Candidatos:");
        System.out.println("1 - Jose");
        System.out.println("2 - João");
        System.out.println("3 - Maria");
        System.out.println("4 - Ana");
        System.out.println("5 - Nulo");
        System.out.println("6 - Branco");

        while (true) {
            System.out.print("Digite o voto (0 para encerrar): ");
            voto = scan.nextInt();
            if (voto == 0) break;

            totalVotos++;

            if (voto == 1) c1++;
            else if (voto == 2) c2++;
            else if (voto == 3) c3++;
            else if (voto == 4) c4++;
            else if (voto == 5) nulos++;
            else if (voto == 6) brancos++;
            else System.out.println("Código inválido!");
        }

        System.out.printf("\nVotos de cada candidato:\nJose: %d\nJoão: %d\nMaria: %d\nAna: %d\n", c1, c2, c3, c4);
        System.out.printf("Votos nulos: %d\nVotos em branco: %d\n", nulos, brancos);

        if (totalVotos > 0) {
            double percNulos = (nulos * 100.0) / totalVotos;
            double percBrancos = (brancos * 100.0) / totalVotos;
            System.out.printf("Percentual de votos nulos: %.2f%%\n", percNulos);
            System.out.printf("Percentual de votos em branco: %.2f%%\n", percBrancos);
        }

        scan.close();
    }
}