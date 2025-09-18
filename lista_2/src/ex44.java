import java.util.Scanner;

public class ex44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade, maiorIdade = 0;
        double altura, peso, maiorAltura = 0, maiorPeso = 0;
        double somaAltura = 0, somaIMC = 0;
        int masc = 0, fem = 0;

        for (int i = 1; i <= 25; i++) {
            System.out.printf("Pessoa %d\n", i);

            System.out.print("Idade: ");
            idade = scan.nextInt();
            if (idade > maiorIdade) maiorIdade = idade;

            System.out.print("Sexo (M/F): ");
            char sexo = scan.next().toUpperCase().charAt(0);
            if (sexo == 'M') masc++;
            else if (sexo == 'F') fem++;

            System.out.print("Altura (m): ");
            altura = scan.nextDouble();
            if (altura > maiorAltura) maiorAltura = altura;
            somaAltura += altura;

            System.out.print("Peso (kg): ");
            peso = scan.nextDouble();
            if (peso > maiorPeso) maiorPeso = peso;

            double imc = peso / (altura * altura);
            somaIMC += imc;

            System.out.println();
        }

        double mediaAltura = somaAltura / 25;
        double mediaIMC = somaIMC / 25;
        double percMasc = (masc * 100.0) / 25;
        double percFem = (fem * 100.0) / 25;

        System.out.printf("Mais velho: %d anos\n", maiorIdade);
        System.out.printf("Mais alto: %.2f m\n", maiorAltura);
        System.out.printf("Maior peso: %.2f kg\n", maiorPeso);
        System.out.printf("Média de altura: %.2f m\n", mediaAltura);
        System.out.printf("Média de IMC: %.2f\n", mediaIMC);
        System.out.printf("Percentual masculino: %.2f%%\n", percMasc);
        System.out.printf("Percentual feminino: %.2f%%\n", percFem);

        scan.close();
    }
}