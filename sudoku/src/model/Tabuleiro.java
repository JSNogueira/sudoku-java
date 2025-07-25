package model;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

    private String[] jogoInicial = {"004 false", "107 false", "209 true", "305 false", "408 true", "506 true", "602 true", "703 false", "801 false", "011 false", "113 true", "215 false", "314 false", "417 true", "512 false", "618 false", "719 true", "816 true", "022 false", "126 true", "228 false", "329 false", "421 true", "523 false", "627 false", "724 false", "825 true", "035 true", "131 false", "233 true", "337 false", "436 false", "534 false", "639 false", "738 true", "832 false", "048 false", "149 true", "247 false", "341 true", "442 true", "545 true", "643 false", "746 true", "844 false", "056 false", "154 true", "252 false", "353 false", "459 false", "558 false", "651 true", "755 false", "857 true", "067 true", "165 false", "264 false", "362 false", "463 true", "569 false", "666 false", "761 true", "868 false", "079 true", "178 true", "271 false", "376 false", "474 true", "577 false", "675 false", "772 true", "873 false", "083 false", "182 false", "286 true", "388 true", "485 true", "581 false", "684 true", "787 false", "889 false"};

    public int[][] iniciarTabuleiro(List<Celula> celulas){
        int[][] tabuleiro = new int[9][9];

        for(int i=0; i<jogoInicial.length; i++){
            if(celulas.get(i).isFixo()){
                tabuleiro[celulas.get(i).getLinha()][celulas.get(i).getColuna()] = celulas.get(i).getValor();
            }
        }
        return tabuleiro;
    }

    public void exibirTabuleiro(int[][] tabuleiro){ 

        System.out.println();
        System.out.printf("   ");
        for(int i=0; i<9; i++){
            System.out.printf(" " + i);
            if(i==2 || i==5 || i==8){
                System.out.printf("  ");
            }
        }

        System.out.println();
        System.out.println("   -----------------------");
        
        for(int i=0; i<9; i++){
            System.out.printf(i + " | ");
            for(int j=0; j<9; j++){
                System.out.printf(tabuleiro[i][j] + " ");
                if(j==2 || j==5 || j==8){
                    System.out.printf("| ");
                }
            }
            if(i==2 || i==5 || i== 8){
                System.out.println();
                System.out.printf("   -----------------------");
            }
            System.out.println();
        }
    }

    public List<Celula> preencherCelulas(){
        List<Celula> celulas = new ArrayList<Celula>();

        for(int i=0; i<jogoInicial.length; i++){

            Celula celula = new Celula();

            celula.setLinha(Integer.parseInt(String.valueOf(jogoInicial[i].charAt(0))));
            celula.setColuna(Integer.parseInt(String.valueOf(jogoInicial[i].charAt(1))));
            celula.setValor(Integer.parseInt(String.valueOf(jogoInicial[i].charAt(2))));
            if(jogoInicial[i].contains("true")){
                celula.setFixo(true);
            }
            celulas.add(celula);
        }
        return celulas;
    }

    public boolean verificarCelulaFixa(List<Celula> celulas, int linha, int coluna){
        for(int i=0; i<celulas.size(); i++){
            if(celulas.get(i).getLinha() == linha && celulas.get(i).getColuna() == coluna){
                if (celulas.get(i).isFixo()) {
                    return false;   
                } else {
                    return true;
                }
            } 
        }
        return false;
    }

    public void exibirCelulas(List<Celula> celulas){
        for(int i=0; i<celulas.size(); i++){
            System.out.printf(celulas.get(i).getLinha() + " " + celulas.get(i).getColuna() + " " + celulas.get(i).getValor() + " " + celulas.get(i).isFixo() + "\n");
        }
    }

}
