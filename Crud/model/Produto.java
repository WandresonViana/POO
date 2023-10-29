package Crud.model;
public class Produto {
    private int id_produto;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(int id_produto, String nome, double preco, int quantidade) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }    
}
