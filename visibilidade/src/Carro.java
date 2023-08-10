public class Carro {
    private String modelo;
    private Pessoa motorista;
    private float velocidade;
    private boolean ligado;
    
    //Construtor
    public Carro(String modelo, Pessoa motorista) {
        this.modelo = modelo;
        this.motorista = motorista;
        this.velocidade = 0.0f;
        this.ligado = false;
    }

    public void infoCarro(){
        System.out.println("Modelo do carro: " + this.getModelo());
        System.out.println("Proprietário: " + motorista.getNomePe());
        System.out.println("Carro ligado?" + this.isLigado());
        System.out.println("Velocidade: " + this.getVelocidade() +  "Km/s");
    }
    public void ligarCarro(){
        if(this.isLigado() == true){
            System.out.println("O carro está ligado!");
        }else{
            this.setLigado(true);
            System.out.println("Frummmm....");
        }
    }

    public void acelerar(){
        if(this.ligado == true){
            this.setVelocidade(this.getVelocidade()+ 20);
        }
    }

    

    //Metodos Get e set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Pessoa getMotorista() {
        return motorista;
    }

    public void setMotorista(Pessoa motorista) {
        this.motorista = motorista;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    

    

    
}
