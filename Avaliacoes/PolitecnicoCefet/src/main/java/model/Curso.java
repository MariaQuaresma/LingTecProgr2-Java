package main.java.model;

public class Curso {
    private String nome;
    private String portaria;

    public Curso(){

    }

    public Curso(String nome, String portaria) {
        this.nome = nome;
        this.portaria = portaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPortaria() {
        return portaria;
    }

    public void setPortaria(String portaria) {
        this.portaria = portaria;
    }

    public void imprimirInfo(){
        System.out.println("\nCurso [Nome: " + getNome() + "e Portaria: " + getPortaria() + "]");
    }
}
