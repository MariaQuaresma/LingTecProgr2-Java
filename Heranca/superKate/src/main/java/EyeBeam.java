package main.java;

public class EyeBeam extends Poder {
    public EyeBeam(String poder, float dano) {
        super(poder, dano);
    }

    @Override
    public void imprimirPoder(){
        System.out.println("Poder:"+getPoder()+"e dano:"+(getDano()*20)/100);
    }
}
