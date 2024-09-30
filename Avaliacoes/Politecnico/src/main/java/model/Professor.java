package main.java.model;

public class Professor extends Pessoa {
    private int id;
    private double salario;
    private int contrato;

    public Professor(){

    }

    public Professor(int id, double salario, int contrato) {
        this.id = id;
        this.salario = salario;
        this.contrato = contrato;
    }

    public Professor(String nome, String apelido, String numFiscal, int id, double salario, int contrato) {
        super(nome, apelido, numFiscal);
        this.id = id;
        this.salario = salario;
        this.contrato = contrato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    @Override
    public void imprimirPessoa(){
        System.out.println("\nProfessor [Nome:"+getNome()+ ", Apelido:"+getApelido()+", NumFiscal:" +getNumFiscal()+ ", id: "+getId()+", Salario:"+getSalario()+", Contrato:"+getContrato());
    }
}
