public class Fornecedor {
    private String nome;
    private String telefone;
    private String endereco;
    private String cnpj;

    public Fornecedor(){

    }

    public Fornecedor(String nome, String telefone, String endereco, String cnpj) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void imprimirFornecedor(){
        System.out.println("\nFornecedor [Nome: "+getNome()+", Telefone: "+getTelefone()+", Endereço: "+getEndereco()+ ", Cnpj: "+getCnpj()+"]");
    }
}
