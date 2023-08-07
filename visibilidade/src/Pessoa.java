public class Pessoa {
    private String nomePe;
    private int idade;
    public float altura;
    private float peso;

    //construtor
    public Pessoa(String nomePe, int idade, float altura, float peso) {
        this.nomePe = nomePe;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }



    
    //metodos acessores
    public String getNomePe() {
        return nomePe;
    }

    public void setNomePe(String nomePe) {
        this.nomePe = nomePe;
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
    }

}
