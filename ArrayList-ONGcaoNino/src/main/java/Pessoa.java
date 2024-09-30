package main.java;

public class Pessoa {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private char sexo;
    private Pet pet;

    public Pessoa(){

    }

    public Pessoa(String nome, String endereco, String email, String telefone, char sexo, Pet pet) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.pet = pet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void imprimirPessoa(){
        System.out.println("Pessoa [Nome: "+getNome()+", Endereço: " + getEndereco()+", Email: "+getEmail()+", Telefone: "+getTelefone()+", Sexo:"+getSexo()+"]");
    }
}
