package main.java;

public class Obstaculos {
    private String nome;
    private String material;

    public Obstaculos(){

    }

    public Obstaculos(String nome, String material) {
        this.nome = nome;
        this.material = material;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void imprimirObstaculos(){
        System.out.println("\nObstaculo [nome:"+getNome()+" e material:"+getMaterial() +"]");
    }
}
