public class Animal {
    private String nome;
    private boolean vivo;
    private String som;
    private int patas;

   

    public Animal(String nome, boolean vivo, String som, int patas) {
        this.nome = nome;
        this.vivo = vivo;
        this.som = som;
        this.patas = patas;
    }

    public void informacao(){
        System.out.println("Nome: " + this.getNome());
        
    }

    public void emitirSom(){
        System.out.println("Emitindo som!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    
     public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
}
