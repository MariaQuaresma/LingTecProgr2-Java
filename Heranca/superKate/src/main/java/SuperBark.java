package main.java;

public class SuperBark extends Poder {
    public SuperBark(String poder, float dano) {
        super(poder, dano);
    }

    @Override
    public void imprimirPoder(){
        System.out.println("Poder:"+getPoder()+"e dano:"+getDano());
    }
}
