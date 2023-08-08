public class Carro {
    private String modelo;
    private Pessoa motorista;
    private float velocidade;
    private boolean ligado;

    public Carro(String modelo, Pessoa motorista) {
        this.modelo = modelo;
        this.motorista = motorista;
        this.velocidade = 0.0f;
        this.ligado = false;
    }

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
