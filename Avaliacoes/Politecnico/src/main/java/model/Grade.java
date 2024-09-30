package main.java.model;
import java.util.ArrayList;

public class Grade {
    private int ano;
    private int chTotal;
    private ArrayList<Disciplina>disciplinas= new ArrayList<Disciplina>();
    private Curso curso;

    public Grade(){
       
    }

    public Grade(int ano, int chTotal, ArrayList<Disciplina> disciplinas, Curso curso) {
        this.ano = ano;
        this.chTotal = chTotal;
        this.disciplinas = disciplinas;
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getChTotal() {
        return chTotal;
    }

    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void imprimirGrade(){
        System.out.println("\nGrade [ano: "+getAno()+", chTotal: "+ getChTotal()+"]");
        curso.imprimirInfo();
        for(Disciplina disc:disciplinas){
            disc.imprimirRequisitos();
        }
    }
}
