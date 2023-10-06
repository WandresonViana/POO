public class HerancaMain {
    public static void main(String[] args) throws Exception {
        Cachorro dog = new Cachorro("Fido",true, "Latido", 4, "PitBull", 25);
        Cabra lulu = new Cabra("Lulu", true, "Bee", 4, "Branca");

        dog.emitirSom();
        dog.informacao();
        lulu.emitirSom();
        lulu.informacao();
    }
}
