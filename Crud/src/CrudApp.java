import java.sql.Connection;

import Crud.connection.Conexao;

public class CrudApp {
    public static void main(String[] args) throws Exception {
      Conexao conexao = new Conexao();
      Connection con = null;
      con = conexao.conexao();
      System.out.println(con.isClosed());
    
    }
}
