package main.java.model;

import java.util.ArrayList;

import main.java.model.enums.Esfera2;

public class DiarioOficial2 {
    private String data;
    private int numero;
    private String titulo;
    private Esfera2 esfera;
    private ArrayList<Publicacao2> publicacao = new ArrayList<Publicacao2>();

    public DiarioOficial2(){

    }

    public DiarioOficial2(String data, int numero, String titulo, Esfera2 esfera) {
        this.data = data;
        this.numero = numero;
        this.titulo = titulo;
        this.esfera = esfera;
    }

    public DiarioOficial2(String data, int numero, String titulo, Esfera2 esfera, ArrayList<Publicacao2> publicacao) {
        this.data = data;
        this.numero = numero;
        this.titulo = titulo;
        this.esfera = esfera;
        this.publicacao = publicacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Esfera2 getEsfera() {
        return esfera;
    }

    public void setEsfera(Esfera2 esfera) {
        this.esfera = esfera;
    }

    public ArrayList<Publicacao2> getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(ArrayList<Publicacao2> publicacao) {
        this.publicacao = publicacao;
    }

    public void imprimirDiario(){
        System.out.println("Diario [data:"+getData()+", numero:"+getNumero()+", titulo:"+getTitulo()+"]");
    }

    public void addPublicacao(Publicacao2 pub){
        publicacao.add(pub);
    }

    public void deletePublicacao(Publicacao2 pub){
       publicacao.remove(pub);
    }
}
