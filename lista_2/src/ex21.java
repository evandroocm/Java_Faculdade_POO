import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota = 0;
        int qnt = 1;
        double notas = 0;
        double media = 0;

        while(true){
            System.out.printf("Informe a %dº nota: ", qnt);
            nota = scan.nextDouble();

            if(nota>=0){
                notas = notas + nota;
                qnt++;
            }else{
                media = notas/(qnt-1);
                System.out.printf("\nForam %d notas, a média é %.2f", qnt, media);
                break;
            }
        }
        scan.close();
    }
}
