package main.java.vought;
import main.java.vought.interfaces.BasicPower;
import main.java.vought.interfaces.SpecialPower;

public class HomelawenderCompoundV extends Hero implements BasicPower<Homelander>, SpecialPower<Homelander>{
    
    public HomelawenderCompoundV(String name, String surname, String nickname, int energy, int strenght, int speed) {
        super(name, surname, nickname, energy, strenght, speed);
    }

    public void activateDurability(Homelander object){
        int energiaAtual = getEnergy();
        while (getEnergy() < 100) {
            energiaAtual++;
            setEnergy(energiaAtual); 
        }
        System.out.println("\nActivateDurability do "+getName()+" aumenta para "+ energiaAtual);
    }

    public void giveStrenght(Homelander object){
        int strenghtAtual = getStrenght();
        while (strenghtAtual < 100) {
            strenghtAtual++;
            setStrenght(strenghtAtual); 
        }
        System.out.println("\nGiveStrenght do "+getName()+" aumenta para "+ strenghtAtual);
    }

    public void maxSpeed(Homelander object){
        int speedAtual = getSpeed();
        while (speedAtual < 100) {
            speedAtual++;
            setSpeed(speedAtual);
        }
        System.out.println("\nMaxSpeed do "+getName()+" aumenta para "+speedAtual);
    }

    public void fly(Homelander object){
        System.out.println("\nO homelander está voando!");
    }

    public void userPower(Homelander object){
        System.out.println("\nPoder especial de força do homelander!");
    }
}
