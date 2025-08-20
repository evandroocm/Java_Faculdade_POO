import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo par N: ");
        int n = scanner.nextInt();
        
        if(n > 0){
            for ( int i = 0; i <= n; i+=2){
                System.out.print(i + "  ");
            }
        }
    }
}
