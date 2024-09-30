package main.java;
import java.util.ArrayList;

import main.java.model.Aluno;
import main.java.model.Apontamento;
import main.java.model.Curso;
import main.java.model.Disciplina;
import main.java.model.Grade;
import main.java.model.Cefet;
import main.java.model.Professor;

public class MyProgram {
    public static void main(String[] args) {
        
    ArrayList<Curso> si = new ArrayList<Curso>();

    //poli cefet
    Cefet cefetmariadagraca = new Cefet("Cefet maria da graça", "cefet-rj@gmail.com", si);
    System.out.println("\nPolitecnico Cefet [nome: " + cefetmariadagraca.getNome() + ", url: "+  cefetmariadagraca.getUrl() + "]");
    
    //Grade
    ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    //1 periodo
    Disciplina producaoTexto = new Disciplina("Producao de Texto", 90, null);
    disciplinas.add(producaoTexto);

    Disciplina fundMatematica = new Disciplina("fundamentos Matematica", 90, null);
    disciplinas.add(fundMatematica);

    Disciplina algoritmo = new Disciplina("algoritmo ", 90, null);
    disciplinas.add(algoritmo);

    Disciplina fisica = new Disciplina("fisica ", 90,null);
    disciplinas.add(fisica);

    Disciplina eletricidade = new Disciplina("eletricidade ", 90,null);
    disciplinas.add(eletricidade);

    //2 periodo
    Disciplina calculo = new Disciplina("calculo ", 90);
    disciplinas.add(calculo);
    calculo.setPreRequisitos(new ArrayList<>());
    calculo.getPreRequisitos().add(fundMatematica);
    calculo.imprimirRequisitos();

    Disciplina ltp1 = new Disciplina("lpt1 ", 90);
    disciplinas.add(ltp1);
    ltp1.setPreRequisitos(new ArrayList<Disciplina>());
    ltp1.getPreRequisitos().add(algoritmo);
    ltp1.imprimirRequisitos();
   
    Disciplina ingles1 = new Disciplina("ingles ", 90,null);
    disciplinas.add(ingles1);

    Disciplina arquitetura = new Disciplina("arquitetura ", 90,null);
    disciplinas.add(arquitetura);

    Disciplina laboratorioEletr = new Disciplina("laboratorioEletr ", 90,null);
    disciplinas.add(laboratorioEletr);

    Disciplina logica = new Disciplina("logica ", 90,null);
    disciplinas.add(logica);

    //3 periodo
    Disciplina algEstrura = new Disciplina("algEstrura ", 90);
    disciplinas.add(algEstrura);
    algEstrura.setPreRequisitos(new ArrayList<Disciplina>());
    algEstrura.getPreRequisitos().add(ltp1);
    ltp1.imprimirRequisitos();

    Disciplina ltp2 = new Disciplina("lpt2 ", 90);
    disciplinas.add(ltp2);
    ltp2.setPreRequisitos(new ArrayList<Disciplina>());
    ltp2.getPreRequisitos().add(ltp1);
    ltp1.imprimirRequisitos();

    Disciplina ingles2 = new Disciplina("ingles2 ", 90);
    disciplinas.add(ingles2);
    ingles2.setPreRequisitos(new ArrayList<Disciplina>());
    ingles2.getPreRequisitos().add(ingles1);
    ingles2.imprimirRequisitos();

    Disciplina laboratorioEletr2 = new Disciplina("laboratorioEletr2 ", 90);
    disciplinas.add(laboratorioEletr2);
    laboratorioEletr2.setPreRequisitos(new ArrayList<Disciplina>());
    laboratorioEletr2.getPreRequisitos().add(laboratorioEletr);
    laboratorioEletr2.imprimirRequisitos();

    Disciplina algebraLinear = new Disciplina("algebraLinear ", 90);
    disciplinas.add(algebraLinear);
    algebraLinear.setPreRequisitos(new ArrayList<>());
    algebraLinear.getPreRequisitos().add(fundMatematica);
    algebraLinear.imprimirRequisitos();

    Disciplina eletronica = new Disciplina("eletronica ", 90);
    disciplinas.add(eletronica);
    eletronica.setPreRequisitos(new ArrayList<Disciplina>());
    eletronica.getPreRequisitos().add(eletricidade);
    eletronica.imprimirRequisitos();

    //curso si
    Curso sistemasDaInformacao = new Curso("Sistema da Informação", "portaria123");
    System.out.println("\nCurso [Nome: " + sistemasDaInformacao.getNome() + ", Portaria: " + sistemasDaInformacao.getPortaria() + "]");
    Grade gradesistemasDaInformacao = new Grade(2020, 3000, disciplinas, sistemasDaInformacao);

    //historico
    ArrayList<Apontamento> apontamentos = new ArrayList<Apontamento>();
    Apontamento apont1 = new Apontamento(9, "Aprovado", "01/02/2023", eletronica);
    apontamentos.add(apont1);

    Apontamento apont2 = new Apontamento(9, "Aprovado", "01/02/2023", fisica);
    apontamentos.add(apont2);

    Apontamento apont3 = new Apontamento(9, "Aprovado", "01/02/2023", fundMatematica);
    apontamentos.add(apont3);

    Apontamento apont4 = new Apontamento(9, "Aprovado", "01/02/2023", eletricidade);
    apontamentos.add(apont4);

    Apontamento apont5 = new Apontamento(9, "Aprovado", "01/02/2023", algoritmo);
    apontamentos.add(apont5);

    Apontamento apont6 = new Apontamento(9, "Aprovado", "01/02/2023", calculo);
    apontamentos.add(apont6);

    Apontamento apont7 = new Apontamento(9, "Aprovado", "01/02/2023", logica);
    apontamentos.add(apont7);

    Apontamento apont8 = new Apontamento(9, "Aprovado", "01/02/2023", ltp1);
    apontamentos.add(apont8);

    Apontamento apont9 = new Apontamento(9, "Aprovado", "01/02/2023", ingles1);
    apontamentos.add(apont9);

    Apontamento apont10 = new Apontamento(9, "Aprovado", "01/02/2023", arquitetura);
    apontamentos.add(apont10);

    Apontamento apont11 = new Apontamento(9, "Aprovado", "01/02/2023", laboratorioEletr);
    apontamentos.add(apont11);

    Apontamento apont12 = new Apontamento(9, "Matriculada", "01/02/2023", algebraLinear);
    apontamentos.add(apont12);

    Apontamento apont13 = new Apontamento(9, "Matriculada", "01/02/2023", laboratorioEletr2);
    apontamentos.add(apont13);

    Apontamento apont14 = new Apontamento(9, "Matriculada", "01/02/2023", algEstrura);
    apontamentos.add(apont14);

    Apontamento apont15 = new Apontamento(9, "Matriculada", "01/02/2023", ingles2);
    apontamentos.add(apont15);

    Apontamento apont16 = new Apontamento(9, "Matriculada", "01/02/2023", eletronica);
    apontamentos.add(apont16);

    Apontamento apont17 = new Apontamento(9, "Matriculada", "01/02/2023", ltp2);
    apontamentos.add(apont17);

    Professor professor = new Professor("Pantoja", "Kadu", "1233", 12, 10000.0, 12334);
    professor.imprimirPessoa();
    
    Aluno aluno = new Aluno("Maria", "maria", "ahdg12", 2344, apontamentos, gradesistemasDaInformacao);
    aluno.imprimirHistorico();
    aluno.estaIntegralizado();
    aluno.getDisciplinasFaltantes();
   }
}
