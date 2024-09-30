package main.java;

public class Automovel extends Veiculo {
    private String renavam;
    private String placa;

    public Automovel() {
    }

    public Automovel(String nome, String cor, float peso, String renavam, String placa) {
        super(nome, cor, peso);
        this.renavam = renavam;
        this.placa = placa;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void imprimirAutomovel(){
        System.out.println("\nAutomovel [nome: "+getNome()+", cor:"+getCor()+", peso: "+getPeso()+", renavam: "+getRenavam()+", placa:"+getPlaca()+"]");
    }

    @Override
    public void ligar(){
        System.out.println(getNome()+"ligado.");
    }

    @Override
    public void desligar(){
        System.out.println(getNome()+" desligado.");
    }

    @Override
    public void moverFrente(){
        System.out.println(getNome()+" movendo para frente.");
    }

    @Override
    public void re(){
        System.out.println(getNome()+" dando re.");
    }

    @Override
    public void parar(){
        System.out.println(getNome()+" parado.");
    }
}
