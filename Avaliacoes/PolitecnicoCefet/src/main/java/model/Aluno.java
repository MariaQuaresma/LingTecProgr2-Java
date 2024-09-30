package main.java.model;
import java.util.ArrayList;

public class Aluno extends Pessoa {
    private int matricula;
    private ArrayList<Apontamento> historico;
    private Grade grade;

    public Aluno(){

    }

    public Aluno(String nome, String apelido, String numFiscal, int matricula, ArrayList<Apontamento> apontamentos, Grade grade) {
        super(nome, apelido, numFiscal);
        this.matricula = matricula;
        this.historico = apontamentos;
        this.grade = grade;
    }

    public Aluno(String nome, String apelido, String numFiscal, int matricula, Grade grade, ArrayList<Apontamento> historico) {
        super(nome, apelido, numFiscal);
        this.matricula = matricula;
        this.historico = new ArrayList<Apontamento>();
        this.grade = grade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Apontamento> getHistorico() {
        return historico;
    }

    public void setHistorico(ArrayList<Apontamento> historico) {
        this.historico = historico;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void addHistorico(Apontamento apontamentos){
        historico.add(apontamentos);
    }

    public void imprimirHistorico(){
        System.out.println("Aluno [Nome: " + getNome() + ", Apelido: " + getApelido() + ", Numero Fiscal: " + 
        getNumFiscal() + ", Matricula: " + getMatricula() + "]");
        System.out.println("\n--------- Grade ----------");
        grade.imprimirGrade();
        System.out.println("\n--------- Historico ------");
        for(Apontamento historicos: historico){
            historicos.imprimirRegistro();
        }
    }

    public void imprimirPessoa(){
        System.out.println("Pessoa Aluno [Nome: " + getNome() + ", Apelido: " + getApelido() 
        +", Numero Fical: "+ "Matricula:"+ getMatricula() + "]");
    }

    public boolean estaIntegralizado(){
        if(grade.getDisciplinas().size() > historico.size()){
            return false;
        }
        int contador=0;
        for(Apontamento apontamento : historico){
            for(Disciplina disciplina : grade.getDisciplinas()){
                if(disciplina.getNome() == apontamento.getDisciplina().getNome()){
                    contador++;
                }
            }
        }
        if(contador >= getGrade().getDisciplinas().size()){
            return true;
        }
        return false;
    }

    public ArrayList<Disciplina> getDisciplinasFaltantes(){
        ArrayList<Disciplina> disciplinasFaltantes = new ArrayList<Disciplina>();
        
        for(Disciplina disciplina : grade.getDisciplinas()){
            boolean cursou = false;
            for(Apontamento apontamento : historico){
                if(apontamento.getDisciplina().getNome() == disciplina.getNome()){
                    cursou = true;
                }
            }
            if(!cursou){
                disciplinasFaltantes.add(disciplina);
            }
        }
        return disciplinasFaltantes;
    }
}
        


    
