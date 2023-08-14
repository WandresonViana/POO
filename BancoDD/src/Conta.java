public class Conta {
    private int numeroConta;
    private String tipo;
    private Cliente dono;
    private float saldo;
    private boolean status;

    

    public Conta(int numeroConta, String tipo, Cliente dono) {
        this.numeroConta = numeroConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(){
        if(this.status == false){
            this.setStatus(true);

        }else{
            System.out.println("A conta já esta aberta!");
        }

    }

    public void fecharConta(){
        if(this.isStatus() && this.getSaldo() == 0){
            this.setStatus(false);
        }else{
            System.out.println("A conta está fechada!");
        }
    }

    public void sacar(float valor){
        if(this.isStatus() && getSaldo() > valor){
            if(valor > 0){
                this.setSaldo(this.getSaldo() - valor);
            }else{
                System.out.println("Saldo insuficiente!");
            }

        }else{
            System.out.println("A conta está fechada!");
        }

    }

    public void depositar(float valor){
        if(this.isStatus() && valor > 0){

        }

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    
}
