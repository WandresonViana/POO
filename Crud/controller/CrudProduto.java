package Crud.controller;

import java.sql.PreparedStatement;
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
        } catch (Exception e) {
            // TODO: handle exception
        }


        return produtos;
    }
    
}
