package Crud.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private final String classDriver = "com.mysql.cj.jdbc.Driver";
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/mercado";
    private final String USERNAME = "root";
    private final String PASSWORD = "";
    

    public Connection conexao(){
        Connection conect = null;

        try {
            //Carregando Driver
            Class.forName(classDriver);

            //Obter conexão
            conect = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        } catch (Exception e) {
            // TODO: handle exception
        }
        return conect;
    }


    
    
}
