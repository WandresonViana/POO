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
        if(this.status == true){
            
        }

    }

    public void fecharConta(){
        
    }

    public void sacar(){

    }

    public void depositar(){

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
