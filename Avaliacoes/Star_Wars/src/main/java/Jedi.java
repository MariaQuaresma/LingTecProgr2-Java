package main.java;
import java.util.ArrayList;

import main.java.interfaces.Force;

public class Jedi extends Pessoa implements Force {
    private String titulo;
    private ArrayList<Weapons>weapons = new ArrayList<Weapons>();

    public Jedi(){

    }

    public Jedi(String nome, String sobrenome, String sexo, String titulo, ArrayList<Weapons> weapons) {
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
        System.out.println("[Jedi]: Do what I wish"); 
    }

    @Override
    public void farsseing() {
        System.out.println("[Jedi]: Visão amplificada");
    }

    @Override
    public void telepath() {
        System.out.println("[Jedi]: Telepatia ativada");
    }

    @Override
    public void levitation() {
        System.out.println("[Jedi]: Levitação ativada");
    }

    public void patience(){

    }

    @Override
    public void imprimirPessoa(){
        System.out.println("\nJedi [nome: "+getNome()+", titulo:"+getTitulo() + ", sobrenome: " + getSobrenome() + ", sexo: " + getSexo()+"]");
    }
}
