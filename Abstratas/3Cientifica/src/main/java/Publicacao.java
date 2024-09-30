package main.java;

import main.java.enums.AreasPesquisa;

public abstract class Publicacao {
    private String titulo;
    private int ano;
    protected String[] autores;
    protected AreasPesquisa[] areasRelacionadas;

    public Publicacao(){

    }

    public Publicacao(String titulo, int ano, String[] autores, AreasPesquisa[] areasRelacionadas) {
        this.titulo = titulo;
        this.ano = ano;
        this.autores = autores;
        this.areasRelacionadas = areasRelacionadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public AreasPesquisa[] getAreasRelacionadas() {
        return areasRelacionadas;
    }

    public void setAreasRelacionadas(AreasPesquisa[] areasRelacionadas) {
        this.areasRelacionadas = areasRelacionadas;
    }

    public abstract void imprimirInformacoes();
    
}
