public class CanetaApp {
    public static void main(String[] args) throws Exception {
        Caneta bic = new Caneta("Bic", "Azul", 100, 0.7f);
        Caneta comp = new Caneta("Compacta", "Presta", 50, 1.1f);
        bic.destampar();
        bic.rabiscar();

        comp.rabiscar();


    }
}
