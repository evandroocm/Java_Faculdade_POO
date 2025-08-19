import java.util.Scanner;

public class matrizPersonalizada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = scanner.nextInt();
        
        System.out.print("Digite o número de colunas: ");
        int colunas = scanner.nextInt();

        int matriz[][] = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz: ");
        for(int i=0; i < linhas; i++){
            for(int j=0; j < colunas; j++){
                System.out.print("Elemento ["+ i +"]["+ j +"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz preenchida: ");
        for(int i=0; i < linhas; i++){
            for(int j=0; j < colunas; j++){
                System.out.printf("%d   ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}