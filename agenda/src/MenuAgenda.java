import java.util.Scanner;

public class MenuAgenda {
    private String sair = " ";


    Scanner entra = new Scanner(System.in);


    public void menuAgenda(){
        do{
            System.out.println("Bem vindo a agenda!");

            System.out.print("Digite [S] para sair: ");
            this.sair = entra.nextLine();
        }while(sair.equals(" "));
    }

}
