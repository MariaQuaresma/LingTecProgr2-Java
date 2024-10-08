package main.java.model;
import java.util.ArrayList;

public class Politecnico {
    private String nome;
    private String url;
    private ArrayList<Curso> cursos = new ArrayList<Curso>();

    public Politecnico(){
        
    }

    public Politecnico(String nome, String url, ArrayList<Curso> cursos) {
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
        System.out.println("\nPolitecnico [nome:"+getNome()+", url: "+getUrl()+"]");
        for(Curso curso:cursos){
            curso.imprimirInfo();
        }
    }
}
