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

    public List<Produto> lista() throws SQLException{
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
        }finally{
            conexao.desligarConexao(con);
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

    public void buscar(String valor) throws SQLException{
        String sql = "SELECT * FROM produto WHERE nome like ?";

        try {
            con = conexao.conexao();
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%"+ valor + "%");
            resultado = stmt.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt("id_produto");
                String nome = resultado.getString("nome");
                double preco = resultado.getDouble("preco");
                int quantidade = resultado.getInt("quantidade");
                
                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Preço: " + preco);
                System.out.println("Quantidade: " + quantidade);
            }
        } catch (SQLException e) {
            e.getMessage();
        }finally{
            conexao.desligarConexao(con);
        }
    }

    public void alterarProduto(int id, int quantidade){
        String sql = "UPDATE produto SET quantidade = ? WHERE id_produto=?";
         try {
            con = conexao.conexao();
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, quantidade);
            stmt.setInt(2, id);
         } catch (SQLException e) {
            e.getMessage();
         }

    }
    
}
