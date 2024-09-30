package main.java;

public class Automovel extends Veiculo{
    private int renavam;
    private String placa;
    private boolean parado;

    public Automovel(){
        super();
        this.parado = true;
    }

    public Automovel(int renavam, String placa, boolean parado) {
        this.renavam = renavam;
        this.placa = placa;
        this.parado = parado;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isParado() {
        return parado;
    }

    public void setParado(boolean parado) {
        this.parado = parado;
    }

    public void frear(){
        if(!parado){
            System.out.println("Automóvel freando.");
        }
        else{
            System.out.println("Automóvel já está parado! Não é possivel frear.");
        }
    }

    public void passarMarcha(){
        if(!parado){
            System.out.println("Automóvel passando marcha.");
        }
        else{
            System.out.println("Automóvel está parado. Não é possível passar marcha.");
        }
    }
}
