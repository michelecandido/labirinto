package Etapa1;

public class PrincipalLabirinto {
    public static void main(String[] args) {
        Labirinto labirinto = new Labirinto();
        labirinto.criaLabirinto("src/Etapa1/labirinto.txt");

        System.out.println("Etapa1.Labirinto");
        labirinto.imprimeLabirinto();
        
        if(labirinto.percorreLabirinto()) {
            System.out.println("Solução encontrada!");
        } else {
            System.out.println("Não encontrou a saída :(");
        }

        System.out.println("Resultado final:");
        labirinto.imprimeLabirinto();
    }
}