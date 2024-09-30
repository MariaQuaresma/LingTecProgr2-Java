package main.java;

import main.java.model.Aluno;
import main.java.model.Apontamento;
import main.java.model.Curso;
import main.java.model.Disciplina;
import main.java.model.Grade;
import main.java.model.Politecnico;
import main.java.model.Professor;
import java.util.ArrayList;

public class MyProgram {
    public static void main(String[] args) {

        ArrayList<Curso> cursos = new ArrayList<Curso>();

        Politecnico politecnicodoPort = new Politecnico("Politecnico do Port", "politecnicodoPort@gmail.com", cursos);
        politecnicodoPort.imprimirCursos();

        Curso licenciaturaemEngenhariaInformatica = new Curso("Licenciatura em Engenharia Informatica", "portaria1");
        licenciaturaemEngenhariaInformatica.imprimirInfo();
        cursos.add(licenciaturaemEngenhariaInformatica);

        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

        Grade gradlicenciaturaemEngenhariaInformatica = new Grade(2020, 3000, disciplinas, licenciaturaemEngenhariaInformatica);
        gradlicenciaturaemEngenhariaInformatica.imprimirGrade();
        
        //1 periodo
        Disciplina algLiner = new Disciplina("Algebra Linear Geo Analitica", 60, null);
        algLiner.imprimirRequisitos();

        Disciplina fisicaAplicada = new Disciplina("fisica Aplicada", 60, null);
        fisicaAplicada.imprimirRequisitos();

        Disciplina fundProgramacao = new Disciplina("fundProgramacao", 60, null);
        fundProgramacao.imprimirRequisitos();

        Disciplina introdSistComp = new Disciplina("introdSistComp", 60, null);
        introdSistComp.imprimirRequisitos();

        Disciplina labProgramacao = new Disciplina("labProgramacao", 60, null);
        labProgramacao.imprimirRequisitos();

        Disciplina engenhariaSoftware1 = new Disciplina("engenhariaSoftware1", 60, null);
        engenhariaSoftware1.imprimirRequisitos();

        Disciplina matComp1 = new Disciplina("matComp1", 60, null);
        matComp1.imprimirRequisitos();

        Disciplina matDiscreta = new Disciplina("matDiscreta", 60, null);
        matDiscreta.imprimirRequisitos();

        Disciplina paradigmasProgramacao = new Disciplina("paradigmasProgramacao", 60, null);
        paradigmasProgramacao.imprimirRequisitos();

        Disciplina sistDigitais = new Disciplina("sistDigitais", 60, null);
        sistDigitais.imprimirRequisitos();
 
        disciplinas.add(matDiscreta);
        disciplinas.add(labProgramacao);
        disciplinas.add(engenhariaSoftware1);
        disciplinas.add(matComp1);
        disciplinas.add(sistDigitais);

        //2 periodo
        Disciplina engenhariaSotware2 = new Disciplina("engenhariaSotware2", 60);
        engenhariaSotware2.setPreRequisitos(new ArrayList<Disciplina>());
        engenhariaSotware2.getPreRequisitos().add(engenhariaSoftware1);
        engenhariaSotware2.imprimirRequisitos();

        Disciplina estrutDados = new Disciplina("estrutDados", 60);
        estrutDados.setPreRequisitos(new ArrayList<Disciplina>());
        estrutDados.getPreRequisitos().add(fundProgramacao);
        estrutDados.imprimirRequisitos();
 
        Disciplina matComput2 = new Disciplina("matComputacional2", 60);
        matComput2.setPreRequisitos(new ArrayList<Disciplina>());
        matComput2.getPreRequisitos().add(matComp1);
        matComput2.imprimirRequisitos();

        Disciplina procEstruturaInf = new Disciplina("procEstruturaInf", 60);
        procEstruturaInf.setPreRequisitos(new ArrayList<Disciplina>());
        procEstruturaInf.getPreRequisitos().add(paradigmasProgramacao);
        procEstruturaInf.imprimirRequisitos();

        Disciplina sisOperativos = new Disciplina("sisOperativos", 60);
        sisOperativos.setPreRequisitos(new ArrayList<Disciplina>());
        sisOperativos.getPreRequisitos().add(labProgramacao);
        sisOperativos.imprimirRequisitos();

        Disciplina analiseAlgoritma = new Disciplina("analiseAlgoritma", 60, null);
        analiseAlgoritma.imprimirRequisitos();

        Disciplina basesDados = new Disciplina("basesDados", 60, null);
        basesDados.imprimirRequisitos();

        Disciplina gestaoProjetos = new Disciplina("gestaoProjetos", 60, null);
        gestaoProjetos.imprimirRequisitos();

        Disciplina progWeb = new Disciplina("progWeb", 60, null);
        progWeb.imprimirRequisitos();

        Disciplina redesComp = new Disciplina("redesComp", 60, null);
        redesComp.imprimirRequisitos();

        //3 periodo
        Disciplina admSistInf = new Disciplina("admSistInf", 60);
        admSistInf.setPreRequisitos(new ArrayList<Disciplina>());
        admSistInf.getPreRequisitos().add(gestaoProjetos);
        admSistInf.imprimirRequisitos();

        Disciplina compMovel = new Disciplina("compMovel", 60);
        compMovel.setPreRequisitos(new ArrayList<Disciplina>());
        compMovel.getPreRequisitos().add(basesDados);
        compMovel.imprimirRequisitos();

        Disciplina labDesenSotware = new Disciplina("labDesenSotware", 60);
        labDesenSotware.setPreRequisitos(new ArrayList<Disciplina>());
        labDesenSotware.getPreRequisitos().add(analiseAlgoritma);
        labDesenSotware.imprimirRequisitos();

        Disciplina sistInf = new Disciplina("sistInf", 60);
        sistInf.setPreRequisitos(new ArrayList<Disciplina>());
        sistInf.getPreRequisitos().add(sisOperativos);
        sistInf.imprimirRequisitos();

        Disciplina sistDistr = new Disciplina("sistDistr", 60);
        sistDistr.setPreRequisitos(new ArrayList<Disciplina>());
        sistDistr.getPreRequisitos().add(matComput2);
        sistDistr.imprimirRequisitos();

        Disciplina intelArtic = new Disciplina("intelArtic", 60);
        intelArtic.setPreRequisitos(new ArrayList<Disciplina>());
        intelArtic.getPreRequisitos().add(engenhariaSotware2);
        intelArtic.imprimirRequisitos();

        Disciplina projetoFinal = new Disciplina("projetoFinal", 60);
        projetoFinal.setPreRequisitos(new ArrayList<Disciplina>());
        projetoFinal.getPreRequisitos().add(admSistInf);
        projetoFinal.imprimirRequisitos();

        Disciplina nocoesGestao = new Disciplina("nocoesGestao", 60, null);
        nocoesGestao.imprimirRequisitos();

        ArrayList<Apontamento> histApontamentos= new ArrayList<Apontamento>();

        Professor professor = new Professor("Kadu", "Kaduzinho", "266237ger", 1, 10000, 123);
        professor.imprimirPessoa();

        Aluno aluno = new Aluno("Maria", "mari", "373g", 1243, histApontamentos, gradlicenciaturaemEngenhariaInformatica);
        aluno.imprimirHistorico();

        Apontamento hist1 = new Apontamento(10, "aprovado", "01/01/2022", admSistInf);
        hist1.imprimirRegistro();

        Apontamento hist2 = new Apontamento(10, "aprovado", "01/01/2022", algLiner);
        hist2.imprimirRegistro();

        Apontamento hist3 = new Apontamento(10, "aprovado", "01/01/2022", analiseAlgoritma);
        hist3.imprimirRegistro();

        Apontamento hist4 = new Apontamento(10, "aprovado", "01/01/2022", basesDados);
        hist4.imprimirRegistro();

        Apontamento hist5 = new Apontamento(10, "aprovado", "01/01/2022", compMovel);
        hist5.imprimirRegistro();

        Apontamento hist6 = new Apontamento(10, "aprovado", "01/01/2022", engenhariaSoftware1);
        hist6.imprimirRegistro();

        Apontamento hist7 = new Apontamento(10, "aprovado", "01/01/2022", engenhariaSotware2);
        hist7.imprimirRegistro();

        Apontamento hist8 = new Apontamento(10, "aprovado", "01/01/2022", fisicaAplicada);
        hist8.imprimirRegistro();

        Apontamento hist9 = new Apontamento(10, "aprovado", "01/01/2022", fundProgramacao);
        hist9.imprimirRegistro();

        Apontamento hist10 = new Apontamento(10, "aprovado", "01/01/2022", gestaoProjetos);
        hist10.imprimirRegistro();

        Apontamento hist11 = new Apontamento(10, "aprovado", "01/01/2022", intelArtic);
        hist11.imprimirRegistro();

        Apontamento hist12 = new Apontamento(10, "aprovado", "01/01/2022", introdSistComp);
        hist12.imprimirRegistro();

        Apontamento hist13 = new Apontamento(10, "aprovado", "01/01/2022", fisicaAplicada);
        hist13.imprimirRegistro();

        Apontamento hist14 = new Apontamento(10, "aprovado", "01/01/2022", fundProgramacao);
        hist14.imprimirRegistro();

        Apontamento hist15 = new Apontamento(10, "aprovado", "01/01/2022", gestaoProjetos);
        hist15.imprimirRegistro();

        Apontamento hist16 = new Apontamento(10, "aprovado", "01/01/2022",matComp1);
        hist16.imprimirRegistro();

        Apontamento hist17 = new Apontamento(10, "aprovado", "01/01/2022", matComput2);
        hist17.imprimirRegistro();

        Apontamento hist18 = new Apontamento(10, "aprovado", "01/01/2022", matDiscreta);
        hist18.imprimirRegistro();

        Apontamento hist19 = new Apontamento(10, "aprovado", "01/01/2022", sisOperativos);
        hist19.imprimirRegistro();

        Apontamento hist20 = new Apontamento(10, "aprovado", "01/01/2022", nocoesGestao);
        hist20.imprimirRegistro();

        histApontamentos.add(hist20);
        histApontamentos.add(hist19);
        histApontamentos.add(hist18);
        histApontamentos.add(hist17);
        histApontamentos.add(hist16);

        aluno.estaIntegralizado();
        aluno.getDisciplinasFaltantes();
    }
}
