// Faça um algoritmo utilizando o comando while que mostra uma contagem regressiva na tela, 
// iniciando em 10 e terminando em 0. Mostrar uma mensagem “FIM!” após contagem.

public class ex1 {
    public static void main(String[] args) {
        int contador = 10;

        while (contador >= 0) {
            System.out.println(contador);
            contador--;
        }

        System.out.println("FIM!");
    }
}
