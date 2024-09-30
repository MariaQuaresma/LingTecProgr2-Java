package main.java;

public class Barco extends Veiculo {
    private String registroEmbarcacao;

    public Barco(){

    }

    public Barco(String nome, String cor, float peso, String registroEmbarcacao) {
        super(nome, cor, peso);
        this.registroEmbarcacao = registroEmbarcacao;
    }

    public String getRegistroEmbarcacao() {
        return registroEmbarcacao;
    }

    public void setRegistroEmbarcacao(String registroEmbarcacao) {
        this.registroEmbarcacao = registroEmbarcacao;
    }

    public void imprimirBarco(){
        System.out.println("\nBarco [nome:"+getNome()+", cor:"+getCor()+", peso:"+getPeso()+", registro Embarcacao:"+getRegistroEmbarcacao()+"]");
    }

    @Override
    public void ligar(){
        System.out.println(getNome()+" ligado.");
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
