public class Visibilidade {
    public static void main(String[] args) throws Exception {
        Pessoa maria = new Pessoa("Maria", 55, 1.60f, 55.6f);
        maria.setNomePe("Teresa");
        maria.informacoes();

        Carro gol = new Carro("Gol", maria);
        
    }
}
