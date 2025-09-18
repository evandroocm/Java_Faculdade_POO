import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) {
        int somaQuadrados = 0;
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            somaQuadrados += i * i;
            soma += i;
        }

        int quadradoSoma = soma * soma;
        int diferenca = quadradoSoma - somaQuadrados;

        System.out.printf("Diferença entre o quadrado da soma e a soma dos quadrados: %d\n", diferenca);
    }
}
