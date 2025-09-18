import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int expoente = scan.nextInt();
        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        System.out.printf("%d elevado a %d é: %d\n", base, expoente, resultado);
        scan.close();
    }
}











