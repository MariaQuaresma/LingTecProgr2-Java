package main.java;

public class Weapons {
    private String descricao;
    private int dano;

    public Weapons(){

    }

    public Weapons(String descricao, int dano) {
        this.descricao = descricao;
        this.dano = dano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void imprimirWeapons(){
        System.out.println("\nWeapons [descricao:"+getDescricao()+", dano:"+getDano()+"]");
    }

    public void drop(){
       
    }

    public Weapons pickUp(){
        return this;
    }
}
