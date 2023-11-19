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
                
                
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public void cadastraVenda(){
        String sql = "";
    }

    public void excluirVenda(){
        String sql = "";
    }

}
