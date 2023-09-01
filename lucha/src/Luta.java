public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado; 

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
           this.aprovado = true;
           this.desafiado = l1;
           this.desafiante = l2; 
        }

    }
}
