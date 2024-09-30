public class Ventilador {
    private boolean ligado;
    private int velocidade1;
    private int velocidade2;
    private int velocidade3;

    public Ventilador(boolean ligado, int velocidade1) {
        this.ligado = ligado;
        this.velocidade1 = velocidade1;
    }
    
    public Ventilador(boolean ligado, int velocidade1, int velocidade2, int velocidade3) {
        this.ligado = ligado;
        this.velocidade1 = velocidade1;
        this.velocidade2 = velocidade2;
        this.velocidade3 = velocidade3;
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void mudarVelocidade(int novaVelocidade){
        if(ligado && novaVelocidade >= 0 && novaVelocidade <= 3){
            velocidade1 = novaVelocidade;
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVelocidade1() {
        return velocidade1;
    }

    public void setVelocidade1(int velocidade1) {
        this.velocidade1 = velocidade1;
    }

    public int getVelocidade2() {
        return velocidade2;
    }

    public void setVelocidade2(int velocidade2) {
        this.velocidade2 = velocidade2;
    }

    public int getVelocidade3() {
        return velocidade3;
    }

    public void setVelocidade3(int velocidade3) {
        this.velocidade3 = velocidade3;
    }
}