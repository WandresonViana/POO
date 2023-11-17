import java.sql.Connection;

import Crud.connection.Conexao;
import Crud.controller.CrudProduto;
import Crud.model.Produto;

public class CrudApp {
    public static void main(String[] args) throws Exception {
      CrudProduto crudP= new CrudProduto();
      crudP.buscar("S");
      
      /*for(Produto produto : crudproduto.lista()){
            System.out.println("ID: " + produto.getId_produto());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade());
       } */
    }
}
