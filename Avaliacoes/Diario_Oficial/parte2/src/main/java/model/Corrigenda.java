package main.java.model;

public class Corrigenda extends Publicacao2{
    private String ring;

    public Corrigenda(){

    }

    public Corrigenda(String ring) {
        this.ring = ring;
    }

    public Corrigenda(int id, String tituloPrincipal, String tituloAxiliar, String conteudo, Orgao2 orgao,
            String ring) {
        super(id, tituloPrincipal, tituloAxiliar, conteudo, orgao);
        this.ring = ring;
    }

    public String getRing() {
        return ring;
    }

    public void setRing(String ring) {
        this.ring = ring;
    }

    public void imprimirPublicacao2(){
        System.out.println("\nCorrigenda [tituloPrincipal: "+getTituloPrincipal()+", tituloAxiliar: "+getTituloAxiliar()+", conteudo: "+getConteudo()+ ", ring: "+getRing()+"]");
    }
}
