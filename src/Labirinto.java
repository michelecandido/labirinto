import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Labirinto {
    private static final char PAREDE = 'X';
    private static final char CAMINHO_ABERTO = ' ';
    private static final char SAIDA = 'D';
    private static final char CAMINHO_SOLUCAO = '#';
    private char[][] labirinto;

    public void criaLabirinto(String filename) {
        ArrayList<String> linhas = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String linha;
            while((linha = br.readLine())!= null) {
                linhas.add(linha);
            }

            labirinto = new char[linhas.size()][];

            for(int i = 0; i < linhas.size(); i++) {
                labirinto[i] = linhas.get(i).toCharArray();
            }

        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void percorreLabirinto() {

    }

    public void imprimeLabirinto() {

    }
}