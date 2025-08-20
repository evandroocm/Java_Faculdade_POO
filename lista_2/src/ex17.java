import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int numero;
        int qntd = 0;
        
        System.out.print("Digite a quantidade de números: ");
        qntd = scanner.nextInt();

        for(int i = 0; i < qntd; i++){
            System.out.println("");
        }
        

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.printf("O menor valor lido é: %d\n", menor);
        System.out.printf("O maior valor lido é: %d\n", maior);

        scanner.close();
    }
}