import java.util.ArrayList;

public class ArrayMain {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numeros = new ArrayList();
        ArrayList<String> nomes = new ArrayList<>();
        
        numeros.add(5);
        numeros.add(4);
        numeros.add(18);
        numeros.add(14);
        numeros.sort(null);

        for(int con:numeros){
            System.out.println(con);
        }

        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Teresa");
        nomes.add("Vitor");

        for(String n:nomes){
            System.out.println(n);
        }
        
    }
}
