package main.java.vought;
import main.java.vought.interfaces.BasicPower;
import main.java.vought.interfaces.SpecialPower;

public class StarLightCompoundV extends Hero implements BasicPower<StarLight>, SpecialPower<StarLight>{
    public StarLightCompoundV(String name, String surname, String nickname, int energy, int strenght, int speed) {
        super(name, surname, nickname, energy, strenght, speed);
    }

    public void activateDurability(StarLight object){
        int energiaAtual = getEnergy();
        while (getEnergy() < 90) {
            energiaAtual++;
            setEnergy(energiaAtual); 
        }
        System.out.println("\nActivateDurability do "+getName()+ " aumenta para "+ energiaAtual) ;
    }

    public void giveStrenght(StarLight object){
        int strenghtAtual = getStrenght();
        while (strenghtAtual < 80) {
            strenghtAtual++;
            setStrenght(strenghtAtual); 
        }
        System.out.println("\nGiveStrenght do "+getName()+" aumenta para "+ strenghtAtual);
    }

    public void maxSpeed(StarLight object){
        int speedAtual = getSpeed();
        while (speedAtual < 100) {
            speedAtual++;
            setSpeed(speedAtual);
        }
        System.out.println("\nMaxSpeed do "+getName()+" aumenta para "+ speedAtual);
    }

    public void fly(StarLight object){
        System.out.println("\nA starlight está voando!");
    }

    public void userPower(StarLight object){
        System.out.println("\nPoder especial de luz da starlight!\n");
    }
}
    

