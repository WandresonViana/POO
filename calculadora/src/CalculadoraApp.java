import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) throws Exception {
        String op = "S";
        Scanner scan = new Scanner(System.in);

        Numero num1 =new Numero();
        Numero num2 = new Numero();
        Numero resultado = new Numero();

        System.out.print("Digite o valor 1 ");
        num1.setValor(scan.nextDouble());

        System.out.print("Digite o valor 2: ");
        num2.setValor(scan.nextDouble());

        Operacoes nn = new Operacoes(num1.getValor(), num2.getValor());

        System.out.println("Digite a operação desejada: ");
        op = scan.next();

         switch(op){
            case "+":
                resultado.setValor(nn.somar());
                break;
            case "-":
                resultado.setValor(nn.subtrair());
                break;
            case "*":
                resultado.setValor(nn.multiplicar());
            case "/":
                resultado.setValor(nn.dividir());
                break;
            default:
                System.out.println("Operador inválido");
        }

        
        System.out.println("O resultado vale " + resultado.getValor());

        resultado.setValor(nn.subtrair());
        System.out.println("A subtração vale: " + resultado.getValor());

    }
}
