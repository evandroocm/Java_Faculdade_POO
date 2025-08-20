public class ex16 {
    public static void main(String[] args) {
        int numero = 50;
        int soma = 0;

        for (int i = 0; i <= numero; i++){
                soma += i;
        }
        System.out.print("Soma dos 50 primeiros numeros até " + numero + " é: "+ soma);
    }
}