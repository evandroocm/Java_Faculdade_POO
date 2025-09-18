import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que 1: ");
        int num = scan.nextInt();
        boolean primo = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.printf("O número %d é primo.\n", num);
        } else {
            System.out.printf("O número %d não é primo.\n", num);
        }

        scan.close();
    }
}