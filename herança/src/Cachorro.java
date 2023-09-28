public class Cachorro extends Animal {
    private String raca;
    private double peso;

    public Cachorro(String nome, boolean vivo, String som, int patas, String raca, double peso) {
        super(nome, vivo, som, patas);
        this.raca = raca;
        this.peso = peso;
    }

    public void emitirSom(){
        System.out.println("Au Au Au");
    }
}
