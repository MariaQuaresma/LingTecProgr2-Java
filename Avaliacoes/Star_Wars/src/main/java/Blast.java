package main.java;

public class Blast extends Weapons {
    public  Blast(String descricao, int dano) {
        super(descricao, dano);
    }

    public void shot(){
        System.out.println("\n[Shot]"+getDescricao()+" atirou");
    }

    @Override
    public void drop(){
        System.out.println("\nDrop do blast!");
    }

}
