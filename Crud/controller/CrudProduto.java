package Crud.controller;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import Crud.model.Produto;

public class CrudProduto {

    public List<Produto> lista(){
        String sql = "SELECT * FROM produto";
        List<Produto> produtos = new ArrayList<>();

        try {
            PreparedStatement stmt = 
        } catch (Exception e) {
            // TODO: handle exception
        }


        return produtos;
    }
    
}
