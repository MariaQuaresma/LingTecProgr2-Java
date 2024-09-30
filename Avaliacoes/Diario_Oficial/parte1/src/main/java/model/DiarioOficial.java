package main.java.model;

import java.util.ArrayList;

import main.java.model.enums.Esfera;

public class DiarioOficial {
    private String data;
    private int numero;
    private String titulo;
    private Esfera esfera;
    private ArrayList<Publicacao> publicacao = new ArrayList<Publicacao>();

    public DiarioOficial(){

    }

    public DiarioOficial(String data, int numero, String titulo, Esfera esfera) {
        this.data = data;
        this.numero = numero;
        this.titulo = titulo;
        this.esfera = esfera;
    }

    public DiarioOficial(String data, int numero, String titulo, Esfera esfera, ArrayList<Publicacao> publicacao) {
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

    public Esfera getEsfera() {
        return esfera;
    }

    public void setEsfera(Esfera esfera) {
        this.esfera = esfera;
    }

    public ArrayList<Publicacao> getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(ArrayList<Publicacao> publicacao) {
        this.publicacao = publicacao;
    }

    public void imprimirDiario(){
        System.out.println("Diario [data:"+getData()+", numero:"+getNumero()+", titulo:"+getTitulo()+"]");
    }

    public void addPublicacao(Publicacao pub){
        publicacao.add(pub);
    }

    public void deletePublicacao(Publicacao pub){
       publicacao.remove(pub);
    }
} 
