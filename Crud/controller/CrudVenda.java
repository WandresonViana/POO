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
        List<Produto> produtos = new ArrayList<>();

        try {
            con = conexao.conexao();
            stmt = con.prepareStatement(sql);
            resultado = stmt.executeQuery();
            while (resultado.next()) {
                
            }
            
        } catch (SQLException e) {
            e.getMessage();
        }
        

        return venda;
    }

    public void cadastraVenda(){

    }

}
