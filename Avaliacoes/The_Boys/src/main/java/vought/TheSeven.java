package main.java.vought;
import java.util.ArrayList;

public class TheSeven extends Hero {
    private ArrayList<Hero> intergrantes = new ArrayList<Hero>();

    public TheSeven() {
    }

    public TheSeven(ArrayList<Hero> intergrantes) {
        this.intergrantes = intergrantes;
    }

    public TheSeven(String nickname, int energy, int strenght, int speed, ArrayList<Hero> intergrantes) {
        super(nickname, energy, strenght, speed);
        this.intergrantes = intergrantes;
    }

    public TheSeven(String name, String surname, String nickname, int energy, int strenght, int speed,
            ArrayList<Hero> intergrantes) {
        super(name, surname, nickname, energy, strenght, speed);
        this.intergrantes = intergrantes;
    }

    public ArrayList<Hero> getIntergrantes() {
        System.out.println("Foi adicionado no time The Seven");
        return intergrantes;
    }

    public void setIntergrantes(ArrayList<Hero> intergrantes) {
        this.intergrantes = intergrantes;
    }     
}
