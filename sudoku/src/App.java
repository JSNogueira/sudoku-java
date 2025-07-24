import java.util.Scanner;

import model.Tabuleiro;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    private static Tabuleiro tabuleiro = new Tabuleiro();
    private static int[][] tab;
 
    public static void main(String[] args) throws Exception {

         while (true){
            System.out.println();
            System.out.println("Selecione uma opção");
            System.out.println("1 - Iniciar um novo jogo");
            System.out.println("2 - Inserir número");
            System.out.println("3 - Remover número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - Reiniciar o jogo atual");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");

            int option = scanner.nextInt();

            switch (option){
                case 1 -> iniciarJogo();
                case 2 -> inserirNumero();
                case 3 -> removerNumero();
                case 4 -> exibirTabuleiro();
                case 5 -> exibirStatus();
                case 6 -> reiniciarJogo();
                case 7 -> finalizarJogo();
                case 8 -> System.exit(0);
                default -> System.out.println("Opção inválida, selecione uma das opções do menu");
            }
        }

    }

    private static void iniciarJogo(){
        clearConsole();
        tab = tabuleiro.iniciarTabuleiro();
        tabuleiro.exibirTabuleiro(tab);
    }

    private static void inserirNumero() {
        if(tab != null){
            clearConsole();
            tabuleiro.exibirTabuleiro(tab);
            System.out.println("Digite a linha, a coluna e o valor a ser inserido:");
            String valor = scanner.next();
        } else {
            clearConsole();
            System.out.println("Jogo não iniciado! Inicie um jogo primeiro.");
        }
    }

    private static void removerNumero() {
        if(tab != null){
            clearConsole();
            
        } else {
            clearConsole();
            System.out.println("Jogo não iniciado! Inicie um jogo primeiro.");
        }
    }

    private static void exibirTabuleiro() {
        if(tab != null){
            clearConsole();
            
        } else {
            clearConsole();
            System.out.println("Jogo não iniciado! Inicie um jogo primeiro.");
        }
    }

    private static void exibirStatus() {
        if(tab != null){
            clearConsole();
            
        } else {
            clearConsole();
            System.out.println("Jogo não iniciado! Inicie um jogo primeiro.");
        }
    }

    private static void reiniciarJogo() {
        if(tab != null){
            clearConsole();
            
        } else {
            clearConsole();
            System.out.println("Jogo não iniciado! Inicie um jogo primeiro.");
        }
    }

    private static void finalizarJogo() {
        if(tab != null){
            clearConsole();
            
        } else {
            clearConsole();
            System.out.println("Jogo não iniciado! Inicie um jogo primeiro.");
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
