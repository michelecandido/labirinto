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

    private boolean resolverLabirinto(int x, int y) {
        if(x < 0 || x >= labirinto.length || y < 0 || y >= labirinto[x].length) return false;
        if(labirinto[x][y] == PAREDE || labirinto[x][y] == CAMINHO_SOLUCAO) return false;
        if(labirinto[x][y] == SAIDA) return true;
        
        labirinto[x][y] = CAMINHO_SOLUCAO;
        
        if(resolverLabirinto(x - 1, y) || resolverLabirinto(x + 1, y)
            || resolverLabirinto(x, y - 1) || resolverLabirinto(x, y + 1)) return true;
        
        labirinto[x][y] = CAMINHO_ABERTO;
        return false;
    }

    public boolean percorreLabirinto() {
        return resolverLabirinto(0, 0);
    }

    public void imprimeLabirinto() {
        for(int i = 0; i < labirinto.length; i++) {
            for(int j = 0; j < labirinto[i].length; j++) {
                System.out.println(labirinto[i][j]);
            }
            System.out.println();
        }
    }
}