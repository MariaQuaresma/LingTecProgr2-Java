package main.java;

public class Personagens {
    private String nome;
    private float energia;

    public Personagens(){

    }

    public Personagens(String nome, float energia) {
        this.nome = nome;
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public void imprimirPersonagem(){
        System.out.println("Personagem [nome:"+getNome()+", energia:"+getEnergia()+"]");
    }

    public void receberDano(Poder poder) {
        System.out.println("\nO " + getNome() + " recebeu um dano do poder " + poder.getPoder());
        energia -= poder.getDano();

        if (energia <= 0) {
            System.out.println("O " + getNome() + " morreu!");
            energia = 0;  
        } 
        else {
            System.out.println("O " + getNome() + " sobreviveu ao dano!");
            System.out.println("Quantidade de energia do " + getNome() + ": " + energia);
        }
    }
}

    
