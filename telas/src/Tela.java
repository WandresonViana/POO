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
        this.setLayout(null);
        this.setTitle("Tela login");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        //Definindo componentes
        login.setBounds(40, 40, 80, 25);
        senha.setBounds(40, 70, 80, 25);
        jLogin.setBounds(130, 40, 130, 25);
        jSenha.setBounds(130, 70, 130, 25);
        b1.setBounds(40, 120, 100, 25);
        b2.setBounds(160, 120, 100, 25);

        

        //Adicionando a tela
        this.add(login);
        this.add(senha);
        this.add(jLogin);
        this.add(jSenha);
        this.add(b1);
        this.add(b2);


        this.setVisible(true);
    }
    
}
