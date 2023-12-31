public class Caneta {
    String modelo;
    String cor;
    int carca;
    float ponta;
    boolean tampada;
    //construtor
    public Caneta(String modelo, String cor, int carca, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.carca = carca;
        this.ponta = ponta;
        this.tampada = true;
    }

    //Metodos

    public void status(){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carca + "%");
        System.out.println("Ponta: " + this.ponta);
        if(tampada == true){
            System.out.println("Tampada");
        }else{
            System.out.println("Destampada");
        }

    }
    public void rabiscar(){
        if(this.tampada == false && this.carca > 0){
            System.out.println("A caneta " + this.modelo + " está rabiscando!");
        }else{
            System.out.println("A caneta " + this.modelo + " está tampada, não posso rabiscar!");
        }
    }

    public void tampar(){
        if(tampada == true){
            System.out.println("A caneta" + this.modelo + " já está tampada!");
        }else{
            tampada = true;
        }

    }

    public void destampar(){
        if(tampada == true){
            tampada = false;
        }else{
            System.out.println("A caneta" + this.modelo + " já está tampada!");
        } 
    }

   

   
}
