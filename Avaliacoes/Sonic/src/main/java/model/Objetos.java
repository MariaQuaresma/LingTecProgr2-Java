package main.java.model;


public class Objetos {
    private String nome;
    private String cor;
    private double peso;
    private double alturaObjX;
    private double alturaObjY;
    private double larguraObjX;
    private double larguraObjY;

    public Objetos(){

    }

    public Objetos(String nome, String cor, double peso, double alturaObjX, double alturaObjY, double larguraObjX,
            double larguraObjY) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.alturaObjX = alturaObjX;
        this.alturaObjY = alturaObjY;
        this.larguraObjX = larguraObjX;
        this.larguraObjY = larguraObjY;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAlturaObjX() {
        return alturaObjX;
    }

    public void setAlturaObjX(double alturaObjX) {
        this.alturaObjX = alturaObjX;
    }

    public double getAlturaObjY() {
        return alturaObjY;
    }

    public void setAlturaObjY(double alturaObjY) {
        this.alturaObjY = alturaObjY;
    }

    public double getLarguraObjX() {
        return larguraObjX;
    }

    public void setLarguraObjX(double larguraObjX) {
        this.larguraObjX = larguraObjX;
    }

    public double getLarguraObjY() {
        return larguraObjY;
    }

    public void setLarguraObjY(double larguraObjY) {
        this.larguraObjY = larguraObjY;
    }

    public void imprimirObjeto(){
        System.out.println("\nObjetos [nome:"+getNome()+", cor:"+getCor()+", peso:"+getPeso()+", alturaObjX:"+getAlturaObjX()+
        ", alturaObjY:"+getAlturaObjY()+", larguraObjX:"+getLarguraObjX()+", larguraObjY:"+getLarguraObjY()+"]");

    }
}
