public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

   
    public String detalhes() {
        return "Livro [titulo= " + titulo + "\n, autor= " + autor + "\n, totPaginas= " + totPaginas + "\n, paginaAtual= " + paginaAtual + "\n, aberto= " + aberto + "\n, leitor= " + leitor.getNome() + "]";
    }




    //Get e Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Métodos da interface
    @Override
    public void abrir() {
        this.aberto = true;
    }


    @Override
    public void fechar() {
        this.aberto =false;
        
    }


    @Override
    public void folhear(int p) {
        this.paginaAtual = p;
       
    }

    @Override
    public void avancarPag() {
        this.paginaAtual ++;
        
    }


    @Override
    public void voltarPag() {
        this.paginaAtual--;
       
    }    
}
