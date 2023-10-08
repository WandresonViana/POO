public class Periquito extends Animal{
    private String cor;
    private int peso;
    public Periquito(String nome, boolean vivo, String som, int patas, String cor, int peso) {
        super(nome, vivo, som, patas);
        this.cor = cor;
        this.peso = peso;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    
}
