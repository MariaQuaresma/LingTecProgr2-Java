package main.java;

public class MegaBob extends Personagens{
    public MegaBob(String nome, float energia) {
        super(nome, energia);
    }

    @Override
    public void imprimirPersonagem(){
        System.out.println("Inimigo [nome:"+getNome()+", energia:"+getEnergia()+"]");
    }
}
