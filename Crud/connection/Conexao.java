package Crud.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private final String classDriver = "com.mysql.cj.jdbc.Driver";
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/mercado";
    private final String USERNAME = "root";
    private final String PASSWORD = "";
    Connection conect = null;

    public Connection conexao(){
        

        try {
            //Carregando Driver
            Class.forName(classDriver);

            //Obter conexão
            this.conect = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
            System.out.println("Conectado!");

        } catch (ClassNotFoundException | SQLException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return conect;
    }

    public void desligarConexao(Connection con) throws SQLException{
        con.close();
    }    
}
