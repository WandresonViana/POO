import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TelaMain extends JFrame{
    JLabel lLogin = new JLabel("Login");
    JTextField jTesT = new JTextField("");

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

        lLogin.setBounds(50, 50, 50, 50);
        jTesT.setBounds(100, 40, 80, 30);


        this.add(lLogin);
        this.add(jTesT);

        this.setVisible(true);
    }
}
