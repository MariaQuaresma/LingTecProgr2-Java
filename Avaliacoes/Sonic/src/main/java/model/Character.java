package main.java.model;

public class Character {
    private String nome;
    private String cor;
    private int level;
    private int vidas;
    private int rings;
    protected double alturaX;
    protected double alturaY;
    protected double larguraX;
    protected double larguraY;
    private boolean pulando;

    public Character(){

    }

    public Character(String nome, String cor, int level, int vidas, int rings, double alturaX, double alturaY,
            double larguraX, double larguraY, boolean pulando) {
        this.nome = nome;
        this.cor = cor;
        this.level = level;
        this.vidas = vidas;
        this.rings = rings;
        this.alturaX = alturaX;
        this.alturaY = alturaY;
        this.larguraX = larguraX;
        this.larguraY = larguraY;
        this.pulando = false;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getRings() {
        return rings;
    }

    public void setRings(int rings) {
        this.rings = rings;
    }

    public double getAlturaX() {
        return alturaX;
    }

    public void setAlturaX(double alturaX) {
        this.alturaX = alturaX;
    }

    public double getAlturaY() {
        return alturaY;
    }

    public void setAlturaY(double alturaY) {
        this.alturaY = alturaY;
    }

    public double getLarguraX() {
        return larguraX;
    }

    public void setLarguraX(double larguraX) {
        this.larguraX = larguraX;
    }

    public double getLarguraY() {
        return larguraY;
    }

    public void setLarguraY(double larguraY) {
        this.larguraY = larguraY;
    }

    public boolean isPulando() {
        return pulando;
    }

    public void setPulando(boolean pulando) {
        this.pulando = pulando;
    }

    public void imprimirCharacter(){
        System.out.println("\nCharacter [nome:"+getNome()+", cor:"+getCor()+", level:"+getLevel()+", vidas:"+getVidas()+
        ", rings:"+getRings()+", alturaX:"+getAlturaX()+", alturaY:"+getAlturaY()+
        ", larguraX:"+getLarguraX()+", larguraY:"+getLarguraY()+"]");
    }
    
    public void moverFrente(int i){
        System.out.println(getNome()+" está movendo para frente!\n quantidade de unidade andada:"+ i++);
    }

    public void moverTras(int i){
        System.out.println(getNome()+ " está movendo para trás!\n quantidade de unidade andada:"+ i--);
    }

    public void moverCima(int j){
        System.err.println(getNome()+ " está escalando árvores!\n quantidade de unidade andada:"+ j++);
    }

    public void moverBaixo(int j){
        System.out.println(getNome()+ " está movendo para baixo!\n quantidade de unidade andada:"+ j--);
    }
}
