package main.java.model;

import main.java.model.enums.Poder2;

public class Orgao2 {
    private int id;
    private String nomeOrg;
    private Poder2 poder;

    public Orgao2(){

    }

    public Orgao2(int id, String nomeOrg, Poder2 poder) {
        this.id = id;
        this.nomeOrg = nomeOrg;
        this.poder = poder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeOrg() {
        return nomeOrg;
    }

    public void setNomeOrg(String nomeOrg) {
        this.nomeOrg = nomeOrg;
    }

    public Poder2 getPoder() {
        return poder;
    }

    public void setPoder(Poder2 poder) {
        this.poder = poder;
    }

    public void imprimirOrgao(){
        System.out.println("\nOrgao [id: "+getId()+", nomeOrg: "+getNomeOrg()+"]");
    }
}
