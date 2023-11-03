package Crud.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Crud.connection.Conexao;
import Crud.model.Produto;

public class CrudProduto {
        Connection con = null;
        Conexao conexao = new Conexao();
        PreparedStatement stmt;
        ResultSet resultado;

    public List<Produto> lista(){
        String sql = "SELECT * FROM produto";
        List<Produto> produtos = new ArrayList<>();

        try {
            con = conexao.conexao();
            stmt = con.prepareStatement(sql);
            resultado = stmt.executeQuery();
            while (resultado.next()) {
                Produto produto = new Produto();
                produto.setId_produto(resultado.getInt("id_produto"));
                produto.setNome(resultado.getString("nome"));
                produto.setPreco(resultado.getDouble("preco"));
                produto.setQuantidade(resultado.getInt("quantidade"));
                produtos.add(produto);
                
            }
        } catch (SQLException e) {
            e.getMessage();
        }


        return produtos;
    }

    public void adicionarProduto(){
        String sql = "insert into produto(nome, preco, quantidade) values (?,?,?)";

        try {
            con = conexao.conexao();
            stmt = con.prepareStatement(sql);
            
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    public void buscar(String valor){
        String sql = "Select * from produto where noem LIKE = ?";

        try {
            con = conexao.conexao();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, valor);
            resultado = stmt.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt("id_produto");
                String nome = resultado.getString("nome");
                
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }
    
}
