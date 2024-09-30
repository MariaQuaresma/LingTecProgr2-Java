package main.java.vought;

import main.java.vought.interfaces.BasicPower;
import main.java.vought.interfaces.SpecialPower;

public class BillyCompoundV extends Hero implements BasicPower<Billy>, SpecialPower<Billy>{

    public BillyCompoundV(){

    }

    public BillyCompoundV(String name, String surname, String nickname, int energy, int strenght, int speed) {
        super(name, surname, nickname, energy, strenght, speed);
    }

    public void activateDurability(Billy object){
        int energiaAtual = getEnergy();
        while (getEnergy() < 70) {
            energiaAtual++;
            setEnergy(energiaAtual); 
        }
        System.out.println("\nActivateDurability do Bilyy aumenta para "+ energiaAtual);
    }

    public void giveStrenght(Billy object){
        int strenghtAtual = getStrenght();
        while (strenghtAtual < 100) {
            strenghtAtual++;
            setStrenght(strenghtAtual); 
        }
        System.out.println("\nGiveStrenght do Billy aumenta para "+ strenghtAtual);
    }

    public void maxSpeed(Billy object){
        int speedAtual = getSpeed();
        while (speedAtual < 60) {
            speedAtual++;
            setSpeed(speedAtual);
        }
        System.out.println("\nMaxSpeed do Billy aumenta para "+ speedAtual);
    }

    public void fly(Billy object){
        System.out.println("\nBilly está voando!");
    }

    public void userPower(Billy object){
        System.out.println("\nPoder especial de força do Billy!");
    }
}

