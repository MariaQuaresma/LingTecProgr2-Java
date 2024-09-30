package main.java;

public class RearRocket extends Poder{
    public RearRocket(String poder, float dano) {
        super(poder, dano);
    }

    @Override
    public void imprimirPoder(){
        System.out.println("Poder:"+getPoder()+"e dano:"+(getDano()*50)/100);
    }
}
