import javax.swing.JFrame;


public class TelaMain extends JFrame{

    public static void main(String[] args){
       TelaMain nova = new TelaMain();

    }

    public TelaMain(){
        this.telaMontar();
    }

    public void telaMontar(){
        this.setBounds(300, 500, 450, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Login");

        this.setVisible(true);
    }
}
