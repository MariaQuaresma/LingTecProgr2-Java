package main.java;



public class Poder {
    private String poder;
    private float dano;
    private static int qtd = 0;

    public Poder(){

    }

    public Poder(String poder, float dano) {
        this.poder = poder;
        this.dano = dano;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public float getDano() {
        return dano;
    }

    public void setDano(float dano) {
        this.dano = dano;
    }

    public static int getQtd() {
        return qtd;
    }

    public static void setQtd(int qtd) {
        Poder.qtd = qtd;
    }

    public void imprimirPoder(){
        System.out.println("Poder:"+getPoder()+" e dano:"+getDano());
    }
}
