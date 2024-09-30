package main.java;

import main.java.vought.Billy;
import main.java.vought.BillyCompoundV;
import main.java.vought.Hero;
import main.java.vought.Homelander;
import main.java.vought.HomelawenderCompoundV;
import main.java.vought.Person;
import main.java.vought.StarLight;
import main.java.vought.StarLightCompoundV;
import main.java.vought.TheBoys;
import main.java.vought.TheSeven;

public class Main {
    public static void main(String[] args) {
        Hero homelander = new Hero("John", "Gillman", "johnn", 80, 80, 90);
        homelander.imprimirHero();

        Hero starLight = new Hero("Rebecca", "Anne Janery", "reb", 90, 70, 60);
        starLight.imprimirHero();

        Person ashley = new Person("Ashley", "Barret");
        ashley.imprimirPerson();

        Person billy = new Person("Billy", "Butcher");
        billy.imprimirPerson();

        Person hughie = new Person("Hughie", "Campbell");
        hughie.imprimirPerson();

        StarLight starLight2 = new StarLight("starlight Rebecca", "Anne Janery", "reb", 70, 60, 50);
        starLight2.imprimirHero();
        starLight2.eletricidade();

        Homelander homelander2 = new Homelander("homelander John", "Gillman", "johnn", 90, 70, 70);
        homelander2.imprimirHero();
        homelander2.raioVisao();
    
        HomelawenderCompoundV homelawenderCompoundV = new HomelawenderCompoundV("Homelander John", "Gillman", "johnn", 10, 80, 60);
        homelawenderCompoundV.imprimirHero();
        homelawenderCompoundV.activateDurability(homelander2);
        homelawenderCompoundV.maxSpeed(homelander2);
        homelawenderCompoundV.giveStrenght(homelander2);
        homelawenderCompoundV.fly(homelander2);
        homelawenderCompoundV.userPower(homelander2);

        StarLightCompoundV starLightCompoundV = new StarLightCompoundV("Starlight Rebecca", "Anne Janery", "reb", 30, 60, 50);
        starLightCompoundV.activateDurability(starLight2);
        starLightCompoundV.maxSpeed(starLight2);
        starLightCompoundV.giveStrenght(starLight2);
        starLightCompoundV.fly(starLight2);
        starLightCompoundV.userPower(starLight2);

        TheBoys theBoys = new TheBoys();
        theBoys.getIntergrantes().add(billy);
        theBoys.getIntergrantes().add(hughie);
    
        TheSeven theSeven = new TheSeven();
        theSeven.getIntergrantes().add(homelander);
        theSeven.getIntergrantes().add(starLight);

        Billy billy2 = new Billy("Billy", "Butcher", "johnn", 50, 40, 30);
        BillyCompoundV billyCompoundV = new BillyCompoundV();
        billyCompoundV.activateDurability(billy2);
        billyCompoundV.maxSpeed(billy2);
        billyCompoundV.giveStrenght(billy2);
        billyCompoundV.fly(billy2);
        billyCompoundV.userPower(billy2);
    }
}
