package main.java;
import java.util.ArrayList;

public class Firm {
    private String name;
    private String foundation;
    private ArrayList<Person> employeers = new ArrayList<Person>();

    public Firm(){

    }

    public Firm(String name, String foundation) {
        this.name = name;
        this.foundation = foundation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public ArrayList<Person> getEmployeers() {
        return employeers;
    }

    public void setEmployeers(Person person) {
        this.employeers.add(person);
        System.out.println("Na firma "+getName()+" foi adicionada "+ person.getName());
    }

    public String listEmployees(){
        String p = "Empregados: ";
        if(employeers.size() == 0){
            return p = "nenhum.";
        }
        for(Person person: employeers){
            p+= person.getName()+ ", ";
        }
        return p;
    }

    public void info(){
        System.out.println("Firm [name:"+getName()+", foundation:"+getFoundation()+"]");
    }
}
