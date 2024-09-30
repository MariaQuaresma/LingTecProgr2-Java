package main.java;

public abstract class Veiculo {
    private String nome;
    private String cor;
    private float peso;

    public Veiculo(){
        
    }

    public Veiculo(String nome, String cor, float peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public abstract void ligar();

    public abstract void desligar();

    public abstract void moverFrente();

    public abstract void re();

    public abstract void parar();
}
