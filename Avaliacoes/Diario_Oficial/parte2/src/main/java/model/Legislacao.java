package main.java.model;

import main.java.model.enums.TipoLegislacao;

public class Legislacao extends Publicacao2 {
    private TipoLegislacao tipoLegislacao;

    public Legislacao(){

    }

    public Legislacao(TipoLegislacao tipoLegislacao) {
        this.tipoLegislacao = tipoLegislacao;
    }

    public Legislacao(int id, String tituloPrincipal, String tituloAxiliar, String conteudo, Orgao2 orgao,
            TipoLegislacao tipoLegislacao) {
        super(id, tituloPrincipal, tituloAxiliar, conteudo, orgao);
        this.tipoLegislacao = tipoLegislacao;
    }

    public TipoLegislacao getTipoLegislacao() {
        return tipoLegislacao;
    }

    public void setTipoLegislacao(TipoLegislacao tipoLegislacao) {
        this.tipoLegislacao = tipoLegislacao;
    }

    public void imprimirPublicacao2(){
        System.out.println("\nLegislacao [tituloPrincipal: "+getTituloPrincipal()+", tituloAxiliar: "+getTituloAxiliar()+", conteudo: "+getConteudo()+"]");
    }
}
