package main.java;

public class Saber extends Weapons {
    public  Saber(String descricao, int dano) {
        super(descricao, dano);
    }

    public void slash(){
        System.out.println("\n[Slash]"+getDescricao()+" atacou");
    }
}
