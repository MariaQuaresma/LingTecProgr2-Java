package main.java;

import java.util.ArrayList;

public class Kate extends Personagens{
    private int qtdVidas;
    private ArrayList<Poder> poder;
    private Poder poderAtual;

    public Kate(){

    }

    public Kate(String nome, float energia) {
        super(nome, energia);
    }

    public Kate(String nome, float energia, int qtdVidas, ArrayList<Poder> poder, Poder poderAtual) {
        super(nome, energia);
        this.qtdVidas = qtdVidas;
        this.poder = poder;
        this.poderAtual = poderAtual;
    }

    public int getQtdVidas() {
        return qtdVidas;
    }

    public void setQtdVidas(int qtdVidas) {
        this.qtdVidas = qtdVidas;
    } 

    public ArrayList<Poder> getPoder() {
        return poder;
    }

    public void setPoder(ArrayList<Poder> poder) {
        this.poder = poder;
    }

    public Poder getPoderAtual() {
        return poderAtual;
    }

    public void setPoderAtual(Poder poderAtual) {
        this.poderAtual = poderAtual;
    }

    private String getPoderesNomes() {
        String nomes = "";
        for (int i = 0; i < poder.size(); i++) {
            if (i > 0) {
                nomes += ", ";
            }
            nomes += poder.get(i).getPoder();
        }
        return nomes;
    }

    @Override
    public void imprimirPersonagem(){
        System.out.println("Personagem principal [nome:"+getNome()+", energia:"+getEnergia()+
        ", quantidade de vidas:"+getQtdVidas()+", poderes:"+getPoderesNomes()+", poder atual:"+getPoderAtual().getPoder()+"]"); 
    }
    
    public void pular(){
        System.out.println("\nA kate pulou!");
    }

    public void andar(){
        System.out.println("\nA kate andou!");
    }

    public void alterarpoder(Poder novoPoder) {
        poderAtual = novoPoder;
        System.out.println("\nO poder foi alterado para o " + novoPoder.getPoder());
    }
}
