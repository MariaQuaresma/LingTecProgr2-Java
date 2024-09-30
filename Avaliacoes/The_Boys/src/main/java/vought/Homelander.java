package main.java.vought;

public class Homelander extends Hero{
    public Homelander(){

    }

    public Homelander(String name, String surname, String nickname, int energy, int strenght, int speed) {
        super(name, surname, nickname, energy, strenght, speed);  
    }

    public void raioVisao(){
        System.out.println(getName()+" tem poder de raio!\n");
    }
}
