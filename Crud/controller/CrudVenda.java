package Crud.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Crud.connection.Conexao;
import Crud.model.Produto;
import Crud.model.Venda;

public class CrudVenda {
    Connection con = null;
    Conexao conexao = new Conexao();
    PreparedStatement stmt;
    ResultSet resultado;


    public List<Venda> listarVendas(){
        String sql = "SELECT * FROM venda LIKE ?";
        List<Venda> vendas = new ArrayList<>();

        try {
            con = conexao.conexao();
            stmt = con.prepareStatement(sql);
            resultado = stmt.executeQuery();
            while (resultado.next()) {
                Venda venda = new Venda();
                venda.setId_venda(resultado.getInt("id_venda"));
                venda.setData_vanda(resultado.getString("data_venda"));
                venda.setQuantidade_venda(resultado.getDouble("quantidade_venda"));
                venda.setId_produto(resultado.getInt("id_produto"));
                vendas.add(venda);

            }
            
        } catch (SQLException e) {
            e.getMessage();
        }
        return vendas;
    }

    public void buscarVenda(int id){
        String sql = "SELECT * FROM vendas WHERE id_venda = ?";

        try {
            con = conexao.conexao();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            resultado = stmt.executeQuery();

            while (resultado.next()) {
                int id_venda = resultado.getInt("id_venda");
                
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public void cadastraVenda(String data, int quantidade, int id){
        String sql = "insert into venda(data_venda, quantidade_venda, id_produto) values (?,?,?)";
        String dataString = data;

        try {
            con = conexao.conexao();
            stmt = con.prepareStatement(sql);
        } catch (SQLException e) {
            
        }
    }

    public void alteraVenda(int id){
        String sql = "UPDATE venda SET quantidade_venda WHERE id_venda = ?";

        try {
            con = conexao.conexao();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeQuery();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
        }

    }

    public void excluirVenda(){
        String sql = "DELETE FROM venda";

        try {
            
        } catch (Exception e) {
            
        }
    }

}
