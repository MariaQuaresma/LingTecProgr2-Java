package main.java;

public class Person {
    private String name;
    private String surname;
    private String gender;
    private Posicao job;

    public Person(){

    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, String gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public Person(String name, String surname, String gender, Posicao job) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Posicao getJob() {
        return job;
    }

    public void setJob(Posicao posicao) {
        this.job = posicao;
        System.out.println(getName()+" tem uma nova posição!\n");
    }

    public void imprimirPerson(){
        System.out.println("\nPerson [name: "+getName()+", surname: "+getSurname()+", gender: "+getGender()+"]");
    }  
}
