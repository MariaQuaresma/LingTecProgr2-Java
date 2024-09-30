package main.java.model;
import main.java.model.enums.Poder;

public class Orgao {
    private int id;
    private String nomeOrg;
    private Poder poder;

    public Orgao(){

    }

    public Orgao(int id, String nomeOrg, Poder poder) {
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

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    public void imprimirOrgao(){
        System.out.println("\nOrgao [id: "+getId()+", nomeOrg: "+getNomeOrg()+"]");
    }
}
