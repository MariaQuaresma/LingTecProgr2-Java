package main.java;

public class Veiculo{
    private boolean ligado;

    public Veiculo() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("Veículo ligado.");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println("Veículo desligado.");
    }

    public void moverParaFrente() {
        if (ligado) {
            System.out.println("Veículo movendo para frente.");
        } 
        else {
            System.out.println("Veículo desligado. Não é possível mover para frente.");
        }
    }

    public void re() {
        if (ligado) {
            System.out.println("Veículo movendo ré.");
        } 
        else {
            System.out.println("Veículo desligado. Não é possível mover ré.");
        }
    }
    
    public void parar() {
        if (ligado) {
            System.out.println("Veículo parado.");
        } 
        else {
            System.out.println("Veículo desligado. Não é possível parar.");
        }
    }
}