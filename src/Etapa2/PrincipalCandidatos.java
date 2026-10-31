package Etapa2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class PrincipalCandidatos {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> partidos = new ArrayList<>();
        
        try(BufferedReader brNomes = new BufferedReader(new FileReader("/src/Etapa2/nomes.txt"));
        BufferedReader brPartidos = new BufferedReader(new FileReader("src/Etapa2/partidos.txt"))) {
            String linha;
            while((linha = brNomes.readLine()) != null) {
                if(!linha.isBlank()) nomes.add(linha);
            }
            while((linha = brPartidos.readLine()) != null) {
                if(!linha.isBlank()) partidos.add(linha);
            }
        } catch(IOException e) {
            throw new IllegalArgumentException("Erro: " + e.getMessage());
        }

        Random numAleatorio = new Random();
        Candidato[] candidatos = new Candidato[100];
    }
}