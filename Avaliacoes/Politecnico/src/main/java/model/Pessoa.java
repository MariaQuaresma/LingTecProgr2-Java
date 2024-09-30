package main.java.model;

public class Pessoa {
    private String nome;
    private String apelido;
    private String numFiscal;

    public Pessoa(){

    }

    public Pessoa(String nome, String apelido, String numFiscal) {
        this.nome = nome;
        this.apelido = apelido;
        this.numFiscal = numFiscal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNumFiscal() {
        return numFiscal;
    }

    public void setNumFiscal(String numFiscal) {
        this.numFiscal = numFiscal;
    }

    public void imprimirPessoa(){
        System.out.println("\nPessoa [Nome:"+getNome()+ ", Apelido:"+getApelido()+", NumFiscal:" +getNumFiscal()+"]");
    }
}
