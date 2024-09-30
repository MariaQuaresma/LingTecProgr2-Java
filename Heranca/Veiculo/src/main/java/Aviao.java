package main.java;

public class Aviao extends Veiculo {
    private String regAeronautico;
    private boolean decolado;

    public Aviao(){
        super();
        this.decolado = false;
    }

    public Aviao(String regAeronautico, boolean decolado) {
        this.regAeronautico = regAeronautico;
        this.decolado = decolado;
    }

    public String getRegAeronautico() {
        return regAeronautico;
    }

    public void setRegAeronautico(String regAeronautico) {
        this.regAeronautico = regAeronautico;
    }

    public boolean isDecolado() {
        return decolado;
    }

    public void setDecolado(boolean decolado) {
        this.decolado = decolado;
    }

    public void decolar() {
        if (isLigado() && !decolado) {
            System.out.println("Avião decolando.");
            decolado = true;
        } 
        else if (!isLigado()) {
            System.out.println("Avião desligado. Não é possível decolar.");
        } 
        else {
            System.out.println("Avião já decolado.");
        }
    }

    public void pousar() {
        if (isLigado() && decolado) {
            System.out.println("Avião pousando.");
            decolado = false;
        } 
        else if (!isLigado()) {
            System.out.println("Avião desligado. Não é possível pousar.");
        } 
        else {
            System.out.println("Avião já no solo.");
        }
    }
}

