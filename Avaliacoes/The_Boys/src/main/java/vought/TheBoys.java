package main.java.vought;
import java.util.ArrayList;

public class TheBoys extends Person{
    private ArrayList<Person> intergrantes = new ArrayList<Person>();

    public TheBoys() {
        
    }

    public TheBoys(ArrayList<Person> intergrantes) {
        this.intergrantes = intergrantes;
    }

    public TheBoys(String name, String surname, ArrayList<Person> intergrantes) {
        super(name, surname);
        this.intergrantes = intergrantes;
    }


    public ArrayList<Person> getIntergrantes() {
        System.out.println("Foi adicionado no time The Boys");
        return intergrantes;
    }

    public void setIntergrantes(ArrayList<Person> intergrantes) {
        this.intergrantes = intergrantes;
    }
}
