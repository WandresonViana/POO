import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame{
    JLabel login = new JLabel("Login");
    JTextField senha = new JTextField("");
    JLabel jSenha = new JLabel("Senha");
    
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
