package main.java;

public class Aviao extends Veiculo{
    private String registroAeronautico;

    public Aviao(){

    }

    public Aviao(String nome, String cor, float peso, String registroAeronautico) {
        super(nome, cor, peso);
        this.registroAeronautico = registroAeronautico;
    }

    public String getRegistroAeronautico() {
        return registroAeronautico;
    }

    public void setRegistroAeronautico(String registroAeronautico) {
        this.registroAeronautico = registroAeronautico;
    }

    public void imprimirAviao(){
        System.out.println("\nAviao [nome:"+getNome()+", cor:"+getCor()+", peso:"+getPeso()+", registroAeronautico:"+getRegistroAeronautico()+"]");
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
