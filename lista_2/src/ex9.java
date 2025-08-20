// Escreva um programa que leia 10 números e escreva o menor valor lido e o maior valor lido.  
public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int numero;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.printf("O menor valor lido é: %d\n", menor);
        System.out.printf("O maior valor lido é: %d\n", maior);

        scanner.close();
    }
}
