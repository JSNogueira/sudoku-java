import model.Tabuleiro;

public class App {
 
    public static void main(String[] args) throws Exception {

        Tabuleiro tabuleiro = new Tabuleiro();

        int[][] tab = tabuleiro.iniciarTabuleiro();
        
        tabuleiro.exibirTabuleiro(tab);
    }
}
