import java.time.LocalDate;

public class Mercadorias {
    private String nome;
    private double valorCompra;
    private double valorVenda;
    private LocalDate validade;
    private Fornecedor fornecedor;

    private static int qtdItens=0;
    private double valorTotal=0;

    public Mercadorias(){

    }

    public Mercadorias(String nome, double valorCompra, double valorVenda, LocalDate validade,
            Fornecedor fornecedor, double valorTotal) {
        this.nome = nome;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.validade = validade;
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;

        LocalDate hoje = LocalDate.now();
        if (hoje.compareTo(validade) <= 0) {   //2024atual - 2025validade = -1 ou 0 está na validade
            valorVenda = valorCompra + (0.3 * valorCompra);
            qtdItens++;
            System.out.println("\nAdicionado ao carrinho.");
        } 
        else {
            System.out.println("O item " + nome + " não foi adicionado ao carrinho pois está vencido.");
        }
    }

    public void qtdItens(){
        System.out.println("\nQuantidade de produtos: " + qtdItens);
    }

    public void imprimirMercadorias(){
        System.out.println("Mercadoria [Nome: "+getNome()+", Valor compra:"+getValorCompra()+", Valor Venda: "+getValorVenda()+ ", " + getValidade()+"]");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public static int getQtdItens() {
        return qtdItens;
    }

    public static void setQtdItens(int qtdItens) {
        Mercadorias.qtdItens = qtdItens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}