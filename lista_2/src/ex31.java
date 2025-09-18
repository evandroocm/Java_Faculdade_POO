import java.util.ArrayList;
import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            int num = scan.nextInt();
            numeros.add(num);

            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        System.out.println("\nLista completa:");
        for (int n : numeros) {
            System.out.printf("%d ", n);
        }

        System.out.println("\n\nLista de pares:");
        for (int n : pares) {
            System.out.printf("%d ", n);
        }

        System.out.println("\n\nLista de ímpares:");
        for (int n : impares) {
            System.out.printf("%d ", n);
        }

        scan.close();
    }
}