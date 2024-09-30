package main.java.model;

public class Publicacao {
    private int id;
    private String tituloPrincipal;
    private String tituloAxiliar;
    private String conteudo;
    private Orgao orgao;

    public Publicacao(){

    }

    public Publicacao(int id, String tituloPrincipal, String tituloAxiliar, String conteudo, Orgao orgao) {
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

    public Orgao getOrgao() {
        return orgao;
    }

    public void setOrgao(Orgao orgao) {
        this.orgao = orgao;
    }

    public void imprimirPublicacao(){
        System.out.println("\nPublicacao [id: "+getId()+", tituloPrincipal: "+getTituloPrincipal()+", tituloAxiliar: "+getTituloAxiliar()+", conteudo: "+getConteudo()+"]");
    }
}
