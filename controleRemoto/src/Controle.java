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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'ligar'");
}

@Override
public void desligar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'desligar'");
}

@Override
public void abrirMenu() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'abrirMenu'");
}

@Override
public void fecharMenu() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'fecharMenu'");
}

@Override
public void maisVolume() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'maisVolume'");
}

@Override
public void menosVolume() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'menosVolume'");
}

@Override
public void ligarMudo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'ligarMudo'");
}

@Override
public void desligarMudo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'desligarMudo'");
}

@Override
public void play() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'play'");
}

@Override
public void pause() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pause'");
} 


   
}
