public class HerancaMain {
    public static void main(String[] args) throws Exception {
       Cachorro dog = new Cachorro("Fido",true, "Latido", 4, "PitBull", 25);
       Cachorro lulu = new Cachorro("Lulu", true, "Latido", 4, "Pudu", 15);

       dog.emitirSom();
    }
}
