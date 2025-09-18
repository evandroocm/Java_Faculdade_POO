import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] letras = new String[10];
        int contConsoantes = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite a %dª letra: ", i + 1);
            letras[i] = scan.next().toLowerCase();

            if (!letras[i].equals("a") && !letras[i].equals("e") &&
                !letras[i].equals("i") && !letras[i].equals("o") &&
                !letras[i].equals("u")) {
                contConsoantes++;
            }
        }

        System.out.printf("\nQuantidade de consoantes: %d\n", contConsoantes);
        System.out.println("Consoantes digitadas:");
        for (int i = 0; i < 10; i++) {
            if (!letras[i].equals("a") && !letras[i].equals("e") &&
                !letras[i].equals("i") && !letras[i].equals("o") &&
                !letras[i].equals("u")) {
                System.out.printf("%s ", letras[i]);
            }
        }

        scan.close();
    }
}