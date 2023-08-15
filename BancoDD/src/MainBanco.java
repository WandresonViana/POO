public class MainBanco {
    public static void main(String[] args) throws Exception {
        Cliente pedro = new Cliente(25858545, "Pedro Cardoso", "pedro@pedro.com", 'M');
        Conta cpedro = new Conta(25854, "PP", pedro);
        cpedro.abrirConta();
        cpedro.sacar(150);
    }
}
