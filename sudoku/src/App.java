public class App {
    public static void main(String[] args) throws Exception {
        String[][] tabuleiro = IniciarTabuleiro();

        ExibirTabuleiro(tabuleiro);
    }

    public static String[][] IniciarTabuleiro(){
       String[][] tabuleiro = new String[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                tabuleiro[i][j] = ".";
            }
        }

        return tabuleiro;
    }

    public static void ExibirTabuleiro(String[][] tabuleiro){
        String[] linha = {"A", "B", "C", "D", "E", "F", "G", "H", "I"}; 
        String[] coluna = {"A", "B", "C", "D", "E", "F", "G", "H", "I"}; 

        System.out.printf(" ");
        for(int i=0; i<9; i++){
            System.out.printf(" " + coluna[i]);
            if(i==2 || i==5 || i==8){
                System.out.printf("  ");
            }
        }
        System.out.println();
        for(int i=0; i<9; i++){
            System.out.printf(linha[i] + " ");
            for(int j=0; j<9; j++){
                System.out.printf(tabuleiro[i][j] + " ");
                if(j==2 || j==5 || j==8){
                    System.out.printf("| ");
                }
            }
            if(i==2 || i==5 || i== 8){
                System.out.println();
                System.out.printf("-- -- -- -- -- -- -- --");
            }
            System.out.println();
        }
    }
}
