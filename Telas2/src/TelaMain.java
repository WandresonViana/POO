import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TelaMain extends JFrame{
    JLabel lLogin = new JLabel("Usuario");
    JTextField jTesT = new JTextField("");
    JLabel lSenha = new JLabel("Senha");

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

        lLogin.setBounds(40, 50, 50, 30);
        jTesT.setBounds(100, 50, 250, 30);
        lSenha.setBounds(40, 120, 50, 50);


        this.add(lLogin);
        this.add(jTesT);
        this.add(lSenha);

        this.setVisible(true);
    }
}
