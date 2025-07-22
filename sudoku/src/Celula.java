public class Celula {

    private String linha;
    private String coluna;
    private int valor;
    private boolean fixo;
    
    public Celula(String linha, String coluna, int valor, boolean fixo) {
        this.linha = linha;
        this.coluna = coluna;
        this.valor = valor;
        this.fixo = fixo;
    }

    public String getLinha() {
        return linha;
    }

    public String getColuna() {
        return coluna;
    }

    public int getValor() {
        return valor;
    }

    public boolean isFixo() {
        return fixo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
