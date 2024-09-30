package main.java.model;

import java.util.ArrayList;

public class Environment {
    private String nome;
    private double alturaEnvX;
    private double alturaEnvY;
    private double larguraEnvX;
    private double larguraEnvY;
    private int score;
    private String time;
    private ArrayList<Character> character = new ArrayList<Character>();
    private ArrayList<Objetos> objetos = new ArrayList<Objetos>();
  
    public Environment(){

    }

    public Environment(String nome, double alturaEnvX, double alturaEnvY, double larguraEnvX, double larguraEnvY,
            int score, String time) {
        this.nome = nome;
        this.alturaEnvX = alturaEnvX;
        this.alturaEnvY = alturaEnvY;
        this.larguraEnvX = larguraEnvX;
        this.larguraEnvY = larguraEnvY;
        this.score = score;
        this.time = time;
    }

    public Environment(String nome, double alturaEnvX, double alturaEnvY, double larguraEnvX, double larguraEnvY,
            int score, String time, ArrayList<Character> character, ArrayList<Objetos> objetos) {
        this.nome = nome;
        this.alturaEnvX = alturaEnvX;
        this.alturaEnvY = alturaEnvY;
        this.larguraEnvX = larguraEnvX;
        this.larguraEnvY = larguraEnvY;
        this.score = score;
        this.time = time;
        this.character = character;
        this.objetos = objetos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAlturaEnvX() {
        return alturaEnvX;
    }

    public void setAlturaEnvX(double alturaEnvX) {
        this.alturaEnvX = alturaEnvX;
    }

    public double getAlturaEnvY() {
        return alturaEnvY;
    }

    public void setAlturaEnvY(double alturaEnvY) {
        this.alturaEnvY = alturaEnvY;
    }

    public double getLarguraEnvX() {
        return larguraEnvX;
    }

    public void setLarguraEnvX(double larguraEnvX) {
        this.larguraEnvX = larguraEnvX;
    }

    public double getLarguraEnvY() {
        return larguraEnvY;
    }

    public void setLarguraEnvY(double larguraEnvY) {
        this.larguraEnvY = larguraEnvY;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ArrayList<Character> getCharacter() {
        System.out.println("Personagem adicionado no ambiente Hill Top Zone.");
        return character;
    }

    public void setCharacter(ArrayList<Character> character) {
        this.character = character;
    }

    public ArrayList<Objetos> getObjetos() {
        System.out.println("Objeto adicionado no ambiente Hill Top Zone.");
        return objetos;
    }

    public void setObjetos(ArrayList<Objetos> objetos) {
        this.objetos = objetos;
    }

    public void imprimirEnvironment(){
        System.out.println("\nEnvironment [nome:"+getNome()+", alturaEnvX:"+getAlturaEnvX()+", alturaEnvY:"+getAlturaEnvY()
        +", larguraEnvX:"+getLarguraEnvX()+", larguraEnvY:"+getLarguraEnvX()+", score:"+getScore()+", time:"+getTime()+"]");

        for(Character charac: character){
            charac.imprimirCharacter();
        }

        for(Objetos obj: objetos){
            obj.imprimirObjeto();
        }
    }

    public void Colidiu(Sonic sonic, Tails tails) {
        if ((sonic.getAlturaX() == tails.getAlturaX() && sonic.getAlturaY() == tails.getAlturaY()) || 
            (sonic.getLarguraX() == tails.getLarguraX() && sonic.getLarguraY() == tails.getLarguraY())) {      
            if (sonic.isPulando() || tails.isPulando()) { 
                System.out.println("Sonic e Tails colidiram, mas nada aconteceu.");
            } 
            else {
            System.out.println("Não colidiram.");
            }
        }
    }
    
    public void ColisaoObj(Sonic sonic, Objetos ring) {
        if ((sonic.getAlturaX() == ring.getAlturaObjX() && sonic.getAlturaY() == ring.getAlturaObjY()) || 
            (sonic.getLarguraX() == ring.getLarguraObjX() && sonic.getLarguraY() == ring.getLarguraObjY())) {
            if (sonic.isPulando()) {  
                score++;  
                System.out.println("Sonic colidiu com um Ring e coletou uma moeda.");
            }
            else {
                System.out.println("Sonic colidiu com o Ring, mas nada acontece.");
            }
        }
    }
    
    public void ColisaoObj(Tails tails, Objetos ring) {
        if ((tails.getAlturaX() == ring.getAlturaObjX() && tails.getAlturaY() == ring.getAlturaObjY()) || 
            (tails.getLarguraX() == ring.getLarguraObjX() && tails.getLarguraY() == ring.getLarguraObjY())) {
            if (tails.isPulando()) { 
                System.out.println("Tails colidiu com o Ring, mas nada aconteceu.");
            } 
            else {
                System.out.println("Tails colidiu com o Ring, mas nada acontece.");
            }
        }
    }
    
    public void Colidiu(Sonic sonic, Monkey monkey) {
        if ((sonic.getAlturaX() == monkey.getAlturaX() && sonic.getAlturaY() == monkey.getAlturaY()) || 
            (sonic.getLarguraX() == monkey.getLarguraX() && sonic.getLarguraY() == monkey.getLarguraY())) {
            if (sonic.isPulando()) { 
                System.out.println("Sonic matou o Monkey.");
            } 
            else {
                System.out.println("Sonic morreu e perdeu uma vida.");
                sonic.setVidas(sonic.getVidas() - 1);  
            }
        }
    }
}