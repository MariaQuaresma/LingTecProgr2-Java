package main.java.vought;

public class StarLight extends Hero{
    public StarLight(String name, String surname, String nickname, int energy, int strenght, int speed) {
        super(name, surname, nickname, energy, strenght, speed);  
    }

    public void eletricidade(){
        System.out.println(getName()+" tem poder de eletricidade!\n");
    }
}
