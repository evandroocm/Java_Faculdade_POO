import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int funcao = 1;
        int cont_par = 0;
        int cont_numeros = 0;

        while(funcao!=0){
            cont_numeros++;
            System.out.print("\nInforme um valor para saber se é par (0 para encerrar): ");
            double numero = scan.nextDouble();

            if(numero % 2 == 0){
                System.out.printf("\n%.2f é par!", numero);
                cont_par++;
            }
            if(numero % 2 != 0){
                System.out.printf("\n%.2f é ímpar!",numero);
            }
            if(numero==0){
                break;
            }
        }
        System.out.printf("\nForam %d números pares e %d números", cont_par, cont_numeros);

        scan.close();
    }
}