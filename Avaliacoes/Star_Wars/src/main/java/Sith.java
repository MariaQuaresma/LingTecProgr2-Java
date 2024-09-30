package main.java;
import java.util.ArrayList;

import main.java.interfaces.Force;

public class Sith extends Pessoa implements Force {
    private String titulo;
    private ArrayList<Weapons>weapons;

    public Sith(){
        super();
        weapons = new ArrayList<>();
    }

    public Sith(String nome, String sobrenome, String sexo, String titulo, ArrayList<Weapons> weapons) {
        super(nome, sobrenome, sexo);
        this.titulo = titulo;
        this.weapons = weapons;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Weapons> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapons> weapons) {
        this.weapons = weapons;
    }

    @Override
    public void mindControl() {
        System.out.println("[Sith]: Controle mental ativado");
    }

    @Override
    public void farsseing() {
        System.out.println("[Sith]: Visão amplificada");
    }

    @Override
    public void telepath() {
        System.out.println("[Sith]: Telepatia ativada");
    }

    @Override
    public void levitation() {
        System.out.println("[Sith]: Levitating Somenthing");
    }
    
    public void lightning(){

    }

    @Override
    public void imprimirPessoa(){
        System.out.println("\nSith [nome:"+getNome()+", titulo:"+getTitulo() + ", sobrenome: " + getSobrenome() + ", sexo: " + getSexo()+"]");
    }
}
