package main.java;

import java.util.Arrays;

import main.java.enums.AreasPesquisa;

public class Artigo extends Publicacao {
    private String nomePeriodico;
    private int volume;
    private int numero;

    public Artigo(){
        
    }

    public Artigo(String titulo, int ano, String[] autores, AreasPesquisa[] areasRelacionadas, String nomePeriodico,
            int volume, int numero) {
        super(titulo, ano, autores, areasRelacionadas);
        this.nomePeriodico = nomePeriodico;
        this.volume = volume;
        this.numero = numero;
    }

    public String getNomePeriodico() {
        return nomePeriodico;
    }

    public void setNomePeriodico(String nomePeriodico) {
        this.nomePeriodico = nomePeriodico;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("\nArtigo [titulo:" + getTitulo() +  ", ano:" + getAno() + ", autores:" + Arrays.toString(autores) + 
               ", areasRelacionadas:" + Arrays.toString(areasRelacionadas) +  ", Nome Periodico:" + getNomePeriodico() + 
               ", Volume:" + getVolume() + ", Numero:" + getNumero() +  "]");
    }
}
