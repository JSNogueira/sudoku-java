import java.util.List;
import java.util.Scanner;

import model.Celula;
import model.Tabuleiro;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    private static Tabuleiro tabuleiro = new Tabuleiro();
    private static int[][] tab;
    private static List<Celula> celulas = tabuleiro.preencherCelulas();
 
    private static String mensagem = "";

    public static void main(String[] args) throws Exception {

        while (true){
            if(tab != null){
                clearConsole();
                tabuleiro.exibirTabuleiro(tab);
            }
            if(mensagem != ""){
                System.out.println("\n" + mensagem);
                mensagem = "";
            } 
            System.out.println();
            System.out.println("Selecione uma opção:\n");
            System.out.println("1 - Iniciar um novo jogo");
            System.out.println("2 - Inserir número");
            System.out.println("3 - Remover número");
            System.out.println("4 - Verificar status do jogo");
            System.out.println("5 - Reiniciar o jogo atual");
            System.out.println("6 - Finalizar jogo");
            System.out.println("7 - Sair");

            int option = scanner.nextInt();

            switch (option){
                case 1: 
                    iniciarJogo();
                    break;
                case 2: 
                    inserirNumero();
                    break;
                case 3: 
                    removerNumero();
                    break;
                case 4: 
                    exibirStatus();
                    break;
                case 5: 
                    reiniciarJogo();
                    break;
                case 6: 
                    finalizarJogo();
                    break;
                case 7:
                     System.exit(0);
                     break;
                default: 
                    clearConsole();
                    mensagem = "Opção inválida, selecione uma das opções do menu";
            }
        }

    }

    private static void iniciarJogo(){
        tab = tabuleiro.iniciarTabuleiro(celulas);
    }

    private static void inserirNumero() {
        if(tab != null){
            clearConsole();
            tabuleiro.exibirTabuleiro(tab);
            System.out.println("Digite a linha, a coluna e o valor a ser inserido:");
            String valores = scanner.next();
            int linha = Integer.parseInt(String.valueOf(valores.charAt(0)));
            int coluna = Integer.parseInt(String.valueOf(valores.charAt(1)));
            int valor = Integer.parseInt(String.valueOf(valores.charAt(2)));
            if(tabuleiro.verificarCelulaFixa(celulas, linha, coluna)){
                tab[linha][coluna] = valor;
                mensagem = "Valor inserido.";
            } else {
                mensagem = "Essa célula é fixa, selecione outra célula.";
            }
        } else {
            clearConsole();
            mensagem = "Jogo não iniciado! Inicie um jogo primeiro.";
        }
    }

    private static void removerNumero() {
        if(tab != null){
            clearConsole();
            tabuleiro.exibirTabuleiro(tab);
            System.out.println("Digite a linha e a coluna: ");
            String valores = scanner.next();
            int linha = Integer.parseInt(String.valueOf(valores.charAt(0)));
            int coluna = Integer.parseInt(String.valueOf(valores.charAt(1)));
            if(tabuleiro.verificarCelulaFixa(celulas, linha, coluna)){
                tab[linha][coluna] = 0;
                mensagem = "Valor removido.";
            } else {
                mensagem = "Essa célula é fixa, esse valor não pode ser removido.";
            }
        } else {
            clearConsole();
            mensagem = "Jogo não iniciado! Inicie um jogo primeiro.";
        }
    }

    private static void exibirStatus() {
        if(tab != null){
            clearConsole();
            tabuleiro.exibirTabuleiro(tab);
            
        } else {
            clearConsole();
            mensagem = "Jogo não iniciado! Inicie um jogo primeiro.";
        }
    }

    private static void reiniciarJogo() {
        if(tab != null){
            clearConsole();
            tabuleiro.exibirTabuleiro(tab);
            
        } else {
            clearConsole();
            mensagem = "Jogo não iniciado! Inicie um jogo primeiro.";
        }
    }

    private static void finalizarJogo() {
        if(tab != null){
            clearConsole();
            tabuleiro.exibirTabuleiro(tab);
            
        } else {
            clearConsole();
            mensagem = "Jogo não iniciado! Inicie um jogo primeiro.";
        }
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } 
        catch (final Exception e) {
        //  Handle any exceptions.
        System.out.println(e);
        }
    }

}
