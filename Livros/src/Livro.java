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
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + ", paginaAtual="
                + paginaAtual + ", aberto=" + aberto + ", leitor=" + leitor + "]";
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
        
    }


    @Override
    public void fechar() {
        
    }


    @Override
    public void folhear() {
       
    }


    @Override
    public void avancarPag() {
        
    }


    @Override
    public void voltarPag() {
       
    }

    

    
    
}
