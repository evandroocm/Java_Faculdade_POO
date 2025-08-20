import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo ímpar N: ");
        int n = scanner.nextInt();
        
        if(n > 0){
            for ( int i = 1; i <= n; i+=2){
                System.out.print(i + "  ");
            }
        }
    }
}
