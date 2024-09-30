package main.java.model;
import java.util.ArrayList; 

public class Contrato extends Publicacao2 {
    private ArrayList<Aditivos> aditivos;

    Contrato(){
        aditivos = new ArrayList<Aditivos>();

    }

    public Contrato(ArrayList<Aditivos> aditivos) {
        this.aditivos = aditivos;
    }

    public Contrato(int id, String tituloPrincipal, String tituloAxiliar, String conteudo, Orgao2 orgao,
            ArrayList<Aditivos> aditivos) {
        super(id, tituloPrincipal, tituloAxiliar, conteudo, orgao);
        this.aditivos = aditivos;
    }

    public ArrayList<Aditivos> getAditivos() {
        return aditivos;
    }

    public void setAditivos(ArrayList<Aditivos> aditivos) {
        this.aditivos = aditivos;
    }

    @Override
    public void imprimirPublicacao2(){
        System.out.println("\nContrato [tituloPrincipal: "+getTituloPrincipal()+", tituloAxiliar: "+getTituloAxiliar()+", conteudo: "+getConteudo());
    }
}
