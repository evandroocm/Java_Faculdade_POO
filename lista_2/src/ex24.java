import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        int idade, soma = 0, contador = 0;

        while (true) {
            idade = scan.nextInt();
            if (idade == 0) break;
            soma += idade;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("A idade média do grupo é: %.2f\n", media);
        } else {
            System.out.printf("Nenhuma idade foi informada.\n");
        }

        scan.close();
    }
}