package Crud.model;
public class Venda {
    private int id_venda;
    private String data_venda;
    private double quantidade_venda;
    private int id_produto;
    
    public Venda(int id_venda, String data_venda, double quantidade_venda, int id_produto) {
        this.id_venda = id_venda;
        this.data_venda = data_venda;
        this.quantidade_venda = quantidade_venda;
        this.id_produto = id_produto;
    }
    public Venda(){
        
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public String getData_vanda() {
        return data_venda;
    }

    public void setData_vanda(String data_venda) {
        this.data_venda = data_venda;
    }

    public double getQuantidade_venda() {
        return quantidade_venda;
    }

    public void setQuantidade_venda(double quantidade_venda) {
        this.quantidade_venda = quantidade_venda;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

}
