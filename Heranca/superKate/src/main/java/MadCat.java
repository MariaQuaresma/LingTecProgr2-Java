package main.java;

public class MadCat extends Personagens {
    public MadCat(String nome, float energia) {
        super(nome, energia);
    }

    @Override
    public void imprimirPersonagem(){
        System.out.println("Inimigo [nome:"+getNome()+", energia:"+getEnergia()+"]");
    } 
}
