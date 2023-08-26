public class Lutador {
    //Atributos
    private String nomeLutador;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Construtor
    public Lutador(String nomeLutador, String nacionalidade, int idade, float altura, float peso,int vitorias, int derrotas, int empates) {
        this.nomeLutador = nomeLutador;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Métodos
    public void apresentar(){
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNomeLutador());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade()+ " anos e medindo " + this.getAltura());
        System.out.println("pesando " + this.getPeso());
    }

    public void status(){

    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);

    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);

    }

    //Métodos especiais
    public String getNomeLutador() {
        return nomeLutador;
    }


    public void setNomeLutador(String nomeLutador) {
        this.nomeLutador = nomeLutador;
    }


    public String getNacionalidade() {
        return nacionalidade;
    }


    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }


    public float getPeso() {
        return peso;
    }


    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }


    public String getCategoria() {
        return categoria;
    }


    private void setCategoria() {
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido";
        }else if(this.getPeso() <=70){
            this.categoria = "Leve";
        }else if(this.getPeso() <= 80.9){
            this.categoria = "Médio";
        }else if(this.getPeso() <= 120.2){
            this.categoria = "Pesado";
            }else{
                this.categoria = "Inválido";
                }
    }
    
        
    


    public int getVitorias() {
        return vitorias;
    }


    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }


    public int getDerrotas() {
        return derrotas;
    }


    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }


    public int getEmpates() {
        return empates;
    }


    public void setEmpates(int empates) {
        this.empates = empates;
    }
 
}
