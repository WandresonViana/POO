import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Numero num1 =new Numero();
        Numero num2 = new Numero();
        Numero resultado = new Numero();

        System.out.print("Digite o valor 1");
        num1.setValor(scan.nextDouble());

        System.out.print("Digite o valor 2: ");
        num2.setValor(scan.nextDouble());

    }
}
