public class Cachorro extends Animal {
    private String raca;
    private boolean peso;
    
    public Cachorro(String nome, boolean vivo, String som, int patas, String raca, boolean peso) {
        super(nome, vivo, som, patas);
        this.raca = raca;
        this.peso = peso;
    }
    
   
}
