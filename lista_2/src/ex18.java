import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número entre 100 e 9999: ");
        int numero = scan.nextInt();

        if(numero >= 100 && numero <= 9999){
            String numeroString = Integer.toString(numero);
    
            for(int i = 0; i < numeroString.length(); i++){
                System.out.println(numeroString.charAt(i));
            }
    
            scan.close();
        }
        else{
            System.out.println("Valor Invalido!");
        }
    }
}