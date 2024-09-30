package main.java.model;

public class Sonic extends Character{
    public Sonic(){

    }

    public Sonic(String nome, String cor, int level, int vidas, int rings, 
    double alturaX, double alturaY,double larguraX, double larguraY, boolean pulando) {
        super(nome, cor, level, vidas, rings, alturaX, alturaY, larguraX, larguraY, pulando);
    }

    @Override
    public void moverFrente(int i){
        System.out.println(getNome()+" está movendo para frente! quantidade de unidade andada:"+ i++);
    }

    @Override
    public void moverTras(int i){
        System.out.println(getNome()+ " está movendo para trás! quantidade de unidade andada:"+ i--);
    }

    @Override
    public void moverCima(int j){
        System.err.println(getNome()+ " está escalando árvores! quantidade de unidade andada:"+ j++);
    }

    @Override
    public void moverBaixo(int j){
        System.out.println(getNome()+ " está movendo para baixo! quantidade de unidade andada:"+ j--);
    }
}

