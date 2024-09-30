package main.java;

public abstract class Animal {
    private String nome;
    private String cor;
    private float peso;

    public Animal(){
        
    }

    public Animal(String nome, String cor, float peso) {
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

    public void imprimirAnimal(){
        System.out.println("\nAnimal [nome: "+getNome()+", cor: "+getCor()+", peso: "+getPeso()+"]");
    }

    public abstract void respirar();

    public abstract void dormir();

    public abstract void comer();

    public abstract void andar();

}
