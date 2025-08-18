import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriadorDeArquivos {
    public static void main(String[] args) {
        String pasta = "lista_1/src";
        int inicio = 10;
        int fim = 41;

        File diretorio = new File(pasta);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

        for (int i = inicio; i <= fim; i++) {
            String nomeArquivo = "ex" + i + ".java";
            File arquivo = new File(diretorio, nomeArquivo);

            if (arquivo.exists()) {
                System.out.println(nomeArquivo + " já existe, pulando...");
                continue;
            }

            String conteudo = "public class ex" + i + " {\n"
                            + "    public static void main(String[] args) {\n"
                            + "        System.out.println(\"Hello from ex" + i + "!\");\n"
                            + "    }\n"
                            + "}\n";

            try (FileWriter writer = new FileWriter(arquivo)) {
                writer.write(conteudo);
                System.out.println(nomeArquivo + " criado com sucesso!");
            } catch (IOException e) {
                System.out.println("Erro ao criar o arquivo " + nomeArquivo);
                e.printStackTrace();
            }
        }
    }
}