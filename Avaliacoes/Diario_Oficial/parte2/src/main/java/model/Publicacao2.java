package main.java.model;

public abstract class Publicacao2 {
    private int id;
    private String tituloPrincipal;
    private String tituloAxiliar;
    private String conteudo;
    private Orgao2 orgao;

    public Publicacao2(){

    }

    public Publicacao2(int id, String tituloPrincipal, String tituloAxiliar, String conteudo, Orgao2 orgao) {
        this.id = id;
        this.tituloPrincipal = tituloPrincipal;
        this.tituloAxiliar = tituloAxiliar;
        this.conteudo = conteudo;
        this.orgao = orgao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloPrincipal() {
        return tituloPrincipal;
    }

    public void setTituloPrincipal(String tituloPrincipal) {
        this.tituloPrincipal = tituloPrincipal;
    }

    public String getTituloAxiliar() {
        return tituloAxiliar;
    }

    public void setTituloAxiliar(String tituloAxiliar) {
        this.tituloAxiliar = tituloAxiliar;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Orgao2 getOrgao() {
        return orgao;
    }

    public void setOrgao(Orgao2 orgao) {
        this.orgao = orgao;
    }

    public abstract void imprimirPublicacao2();
}