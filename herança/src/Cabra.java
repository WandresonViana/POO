public class Cabra extends Animal{
    private String cor;

    public Cabra(String nome,boolean vivo, String som, int patas, String cor){
        super(nome, vivo, som, patas);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
