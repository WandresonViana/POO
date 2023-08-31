public class MainRing {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy","França", 31, 1.75f, 68.9f, 11, 2, 1);

        l[1] = new Lutador("Putscrip", "Braisl", 29, 1.68f, 57.8f, 14, 2, 3);

        l[0].apresentar();
        l[0].status();
    }
}
