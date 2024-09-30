package main.java;

public class Barco extends Veiculo{
    private String regEmbarcacao;
    private boolean ancorado;

    public Barco(){
        super();
        this.ancorado = true;    
    }

    public Barco(String regEmbarcacao, boolean ancorado) {
        this.regEmbarcacao = regEmbarcacao;
        this.ancorado = ancorado;   
    }

    public String getRegEmbarcacao() {
        return regEmbarcacao;
    }

    public void setRegEmbarcacao(String regEmbarcacao) {
        this.regEmbarcacao = regEmbarcacao;
    }

    public boolean isAncorado() {
        return ancorado;
    }

    public void setAncorado(boolean ancorado) {
        this.ancorado = ancorado;
    }

    public void navegar(){
        if(isLigado() && !ancorado){
            System.out.println("Barco está navegando.");
        }
        else if(!isLigado() && ancorado){
            System.out.println("Não é possivel navegar, barco ancorado.");
        }
        else{
            System.out.println("Barco desligado.");
        }
    }

    public void ancorar(){
        if(!isLigado() && ancorado){
            System.out.println("Barco ancorado.");
            ancorado = true;
        }
        else if(!isLigado()){
          System.out.println("Barco desligado mas não está ancorado.");
        }
        else{
         System.out.println("Barco ligado. Não é possível ancorar.");
        }
    }
}
