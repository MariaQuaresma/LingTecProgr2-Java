package main.java;

public class BadFish extends Personagens {
    public BadFish(String nome, float energia) {
        super(nome, energia);
    }

    @Override
    public void imprimirPersonagem(){
        System.out.println("Inimigo [nome:"+getNome()+", energia:"+getEnergia()+"]");
    }
}
