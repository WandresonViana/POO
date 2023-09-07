import javax.swing.JFrame;


public class TelaMain extends JFrame{

    public static void main(String[] args){
       

    }

    public TelaMain(){
        this.telaMontar();
    }

    public void telaMontar(){
        this.setBounds(300, 300, 300, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
