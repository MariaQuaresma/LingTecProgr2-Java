package main.java;
import java.util.Arrays;

import main.java.enums.AreasPesquisa;

public class Tese extends Publicacao {
    private String grau;
    private String instituicao;

    public Tese(){
        
    }

    public Tese(String titulo, int ano, String[] autores, AreasPesquisa[] areasRelacionadas, String grau, String instituicao) {
        super(titulo, ano, autores, areasRelacionadas);
        this.grau = grau;
        this.instituicao = instituicao;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("\nTese [titulo:" + getTitulo() + ", ano:" + getAno() + ", autores:" +
         Arrays.toString(autores) +  ", areasRelacionadas:" + Arrays.toString(areasRelacionadas) + 
               ", grau:" + grau + ", instituicao:" + instituicao + "]");
    }
}



