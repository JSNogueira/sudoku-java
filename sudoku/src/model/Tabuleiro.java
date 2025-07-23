package model;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {

    private String[] jogoInicial = {"004 false", "107 false", "209 true", "305 false"};

    public int[][] iniciarTabuleiro(){
        int[][] tabuleiro = new int[9][9];

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

        for(int i=0; i<jogoInicial.length; i++){
            tabuleiro[celulas.get(i).getLinha()][celulas.get(i).getColuna()] = celulas.get(i).getValor();
        }

        //tabuleiro[0][0] = celula[0].getValor();

        // for(int i=0; i<9; i++){
        //     for(int j=0; j<9; j++){
        //         tabuleiro[i][j] = 0;
        //     }
        // } 

        return tabuleiro;
    }

    public void exibirTabuleiro(int[][] tabuleiro){ 

        System.out.printf(" ");
        for(int i=0; i<9; i++){
            System.out.printf(" " + i);
            if(i==2 || i==5 || i==8){
                System.out.printf("  ");
            }
        }
        System.out.println();
        for(int i=0; i<9; i++){
            System.out.printf(i + " ");
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
