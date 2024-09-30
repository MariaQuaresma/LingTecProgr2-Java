package main.java;

import main.java.enums.AreasPesquisa;

public class Pesquisa {
    private String nomePesquisa;
    private String descricao;
    private String dataInicio;
    private String dataTermino;
    private AreasPesquisa areaPesquisa;
    public Coordenador coordenador;

    public Pesquisa(){

    }

    public Pesquisa(String nomePesquisa, String descricao, String dataInicio, String dataTermino,
            AreasPesquisa areaPesquisa, Coordenador coordenador) {
        this.nomePesquisa = nomePesquisa;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.areaPesquisa = areaPesquisa;
        this.coordenador = coordenador;
    }

    public String getNomePesquisa() {
        return nomePesquisa;
    }

    public void setNomePesquisa(String nomePesquisa) {
        this.nomePesquisa = nomePesquisa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public AreasPesquisa getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(AreasPesquisa areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public void imprimirPesquisa(){
        System.out.println("\nPesquisa [nome da pesquisa:"+getAreaPesquisa()+", descricao:"+getDescricao()+", data Inicio:"+getDataInicio()+", data Termino:"+getDataTermino()+", area Pesquisa:"+getAreaPesquisa()+", coordenador:"+getCoordenador().getNome()+"]");
    }
}
