package Crud.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Crud.connection.Conexao;
import Crud.model.Produto;

public class CrudProduto {

    public List<Produto> lista(){
        Conexao con = new Conexao();
        String sql = "SELECT * FROM produto";
        Produto produto = new Produto();
        List<Produto> produtos = new ArrayList<>();

        try {
            PreparedStatement stmt = con.PreparedStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                produto.setId_produto(resultado.getInt("id"));
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
    
}
