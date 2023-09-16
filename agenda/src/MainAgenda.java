import java.util.Scanner;

public class MainAgenda {
    
    public static void main(String[] args){
        Contato agendei[] = new Contato[5];
        agendei[0] = new Contato(1, "Maria", "86959529", "maria@maria.com");
        agendei[1] = new Contato(2, "Carlos", "86995298418", "carlos@carlos.com");
        agendei[2] = new Contato(3,"Carlos", "868585989589", "carlos@carlos.com");
        
        agendei[0].infoContato();
        agendei[1].infoContato();
       

    }
}
