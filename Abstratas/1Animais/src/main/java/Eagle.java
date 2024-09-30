package main.java;

public class Eagle extends Animal {
    public Eagle(String nome, String cor, float peso) {
        super(nome, cor, peso);
    }

    @Override
    public void respirar(){
        System.out.println(getNome()+" está respirando.");
    }

    @Override
    public void dormir(){
        System.out.println(getNome()+" está dormindo.");
    }

    @Override
    public void comer(){
        System.out.println(getNome()+" está comendo.");
    }

    @Override
    public void andar(){
        System.out.println(getNome()+" está andando.");
    }

    public void voar(){
        System.out.println(getNome()+" está voando.");
    }
}
