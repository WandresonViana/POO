import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Tela extends JFrame{
    JLabel login = new JLabel("Login");
    JTextField jLogin = new JTextField("");
    JLabel senha = new JLabel("Senha");
    JPasswordField jSenha = new JPasswordField();
    JButton b1 = new JButton("OK");
    JButton b2 = new JButton("CANCELAR");


    public static void main(String[] args) {
        Tela tp = new Tela();
    }

    public Tela(){
        this.montarTela();
    }

    public void montarTela(){
        this.setBounds(EXIT_ON_CLOSE, 100, 400, 200);
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("Tela login");

        login.setBounds(30, 40, 80, 25);

        

        //Adicionando a tela
        this.add(login);
    }
    
}
