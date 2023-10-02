public class Operacoes {
    private double valor01;
    private double valor02;
    private double ress;

    public Operacoes(double valor1, double valor2){
        this.valor01 = valor1;
        this.valor02 = valor2;
        this.ress = 0;
    }

    public void somar(double valor1, double valor2){
       this.setRess(this.getValor01() + this.getValor02());

    }

    public double getValor01() {
        return valor01;
    }

    public void setValor01(double valor01) {
        this.valor01 = valor01;
    }

    public double getValor02() {
        return valor02;
    }

    public void setValor02(double valor02) {
        this.valor02 = valor02;
    }

    public double getRess() {
        return ress;
    }

    public void setRess(double ress) {
        this.ress = ress;
    }
    
    
}
