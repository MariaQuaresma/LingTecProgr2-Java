package main.java;

import java.util.Arrays;

import main.java.enums.AreasPesquisa;

public class Livro extends Publicacao{
    private String editora;
    private String localPublicacao;

    public Livro(){

    }

    public Livro(String titulo, int ano, String[] autores, AreasPesquisa[] areasRelacionadas, String editora,
            String localPublicacao) {
        super(titulo, ano, autores, areasRelacionadas);
        this.editora = editora;
        this.localPublicacao = localPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getLocalPublicacao() {
        return localPublicacao;
    }

    public void setLocalPublicacao(String localPublicacao) {
        this.localPublicacao = localPublicacao;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println( "\nLivro [titulo:" + getTitulo() +  ", ano:" + getAno() +  ", autores:" + Arrays.toString(autores) + 
               ", areasRelacionadas:" + Arrays.toString(areasRelacionadas) + 
               ", editora:" + getEditora() +  ", localPublicacao:" + getLocalPublicacao() + "]");
    }

}
