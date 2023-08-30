import javax.swing.JFrame;

public class Tela extends JFrame{
    public static void main(String[] args) {
        Tela tp = new Tela();
    }

    public Tela(){
        this.montarTela();
    }

    public void montarTela(){
        this.setBounds(EXIT_ON_CLOSE, ABORT, 400, 200);
        this.setVisible(true);
    }
    
}
