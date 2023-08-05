public class Caneta {
    String modelo;
    String cor;
    int carca;
    float ponta;
    boolean tampada = true;

    public Caneta(String modelo, String cor, int carca, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.carca = carca;
        this.ponta = ponta;
    }


    public void rabiscar(){
        if(tampada == false){
            
        }
    }

    public void tampar(){
        if(tampada == true){
            System.out.println("A caneta já está tampada");
        }else{
            tampada = true;
        }

    }

    public void destampar(){
        if(tampada == true){
            tampada = false;
        }else{
            System.out.println("A caneta já está destampada!");
        }

    }

   

   
}
