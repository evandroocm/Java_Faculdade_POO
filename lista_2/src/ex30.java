import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[10];
        boolean encontrado = false;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = scan.nextInt();
        }

        System.out.print("\nDigite um valor para verificar: ");
        int valor = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == valor) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.printf("O valor %d está no vetor.\n", valor);
        } else {
            System.out.printf("O valor %d não foi encontrado no vetor.\n", valor);
        }

        scan.close();
    }
}