package main.java.model;
import java.util.ArrayList;

public class Aluno extends Pessoa {
    private int matricula;
    private ArrayList<Apontamento> historico = new ArrayList<Apontamento>();
    private Grade grade;

    public Aluno(){

    }

    public Aluno(int matricula, ArrayList<Apontamento> historico, Grade grade) {
        this.matricula = matricula;
        this.historico = historico;
        this.grade = grade;
    }

    public Aluno(String nome, String apelido, String numFiscal, int matricula, ArrayList<Apontamento> historico, Grade grade) {
        super(nome, apelido, numFiscal);
        this.matricula = matricula;
        this.historico = historico;
        this.grade = grade;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
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

    public void addHist(Apontamento apontamento){
        historico.add(apontamento);
    }

    public void imprimirHistorico(){
        System.out.println("\nAluno [Nome:"+getNome()+ ", Apelido:"+getApelido()+", NumFiscal:" +getNumFiscal()+", Matricula:"+getMatricula()+"]");
        System.out.println("\n---Historico---");
        for(Apontamento hist: historico){
            hist.imprimirRegistro();  
        }
    }

    public boolean estaIntegralizado(){
        if(grade.getDisciplinas().size()> historico.size()){
            return false;
        }
        int contador=0;
            for(Apontamento apontamento: historico){
                for(Disciplina disciplina: grade.getDisciplinas()){
                    if(disciplina.getNome() == apontamento.getDisciplina().getNome()){
                        contador++;
                    }
                }
            }
            if(contador>= getGrade().getDisciplinas().size()){
                return true;
            }
            return false;
        }
    
        public ArrayList<Disciplina> getDisciplinasFaltantes(){
            ArrayList<Disciplina> disciplinasFaltDisciplinas = new ArrayList<Disciplina>();
            for(Disciplina disciplina : grade.getDisciplinas()){
                boolean cursou = false;            //boolean cursou
                for(Apontamento apontamento : historico){ //apontamentos historico
                if(apontamento.getDisciplina().getNome() == disciplina.getNome()){
                    cursou = true;
                }
            }
            if(!cursou){
                disciplinasFaltDisciplinas.add(disciplina);
            }
          }
           return disciplinasFaltDisciplinas;
      }  
}
