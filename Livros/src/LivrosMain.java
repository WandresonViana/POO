public class LivrosMain {
    public static void main(String[] args){
        Pessoa p[] = new Pessoa[3];
        Livro l[] = new Livro[3];
        
        //Pessoas
        p[0] = new Pessoa("Carlos", 25, "M");
        p[1] = new Pessoa("Maria", 45, "F");

        //Livros
        l[0] =  new Livro("O alto da aparecida", "Miranda Mirado", 250, p[0]);
        l[1] = new Livro("Carlota Carolina", "Cleia Correia", 600, p[1]);
    }
}
