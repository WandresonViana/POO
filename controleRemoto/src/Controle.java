public class Controle implements InterControle {
   private int volume;
   private boolean ligado;
   private boolean tocando;

public Controle() {
    this.volume = 50;
    this.ligado = false;
    this.tocando = false;
}

public int getVolume() {
    return volume;
}

public void setVolume(int volume) {
    this.volume = volume;
}

public boolean isLigado() {
    return ligado;
}

public void setLigado(boolean ligado) {
    this.ligado = ligado;
}

public boolean isTocando() {
    return tocando;
}

public void setTocando(boolean tocando) {
    this.tocando = tocando;
}

@Override
public void ligar() {
    this.setLigado(true);
    
}

@Override
public void desligar() {
    this.setLigado(false);
    
}

@Override
public void abrirMenu() {
    System.out.println("Esta ligado? " + this.isLigado());
    System.out.println("Está tocando: " + this.isTocando());
    System.out.print("Volume: " + this.getVolume());
    for(int i = 0; i<= getVolume(); i+=10){
        System.out.print("||");
    }
    
}

@Override
public void fecharMenu() {
    System.out.println("Fechando menu!");
    
}

@Override
public void maisVolume() {
    if(this.isLigado()){

    }else{
        
    }
    
}

@Override
public void menosVolume() {
    
}

@Override
public void ligarMudo() {
   
}

@Override
public void desligarMudo() {
    
}

@Override
public void play() {
    
}

@Override
public void pause() {
    
} 
 
}
