package main.java.model;
import java.util.ArrayList;

public class Cefet {
    private String nome;
    private String url;
    private ArrayList<Curso> cursos;

    public Cefet(){

    }

    public Cefet(String nome, String url) {
        this.nome = nome;
        this.url = url;
        this.cursos = new ArrayList<Curso>();
    }

    public Cefet(String nome, String url, ArrayList<Curso> cursos) {
        this.nome = nome;
        this.url = url;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void imprimirCursos(){
        System.out.println("Politecnico Cefet [Nome: " + getNome() + ", Url: " + getUrl() + "]");
        for(Curso cursin: cursos){
            cursin.imprimirInfo();
        }
    }
}
