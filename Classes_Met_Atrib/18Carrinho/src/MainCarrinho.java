import java.time.LocalDate;

public class MainCarrinho {
    public static void main(String[] args) {
    Mercadorias m = new Mercadorias();

    Mercadorias prod1 = new Mercadorias("tomate", 22.0, 50.0, LocalDate.of(2024, 05, 24), new Fornecedor("Tomaz", "465385","rua cacau", "46553383" ), 1000);
    prod1.imprimirMercadorias();

    Mercadorias prod2 = new Mercadorias("Alface", 22.0, 50.0, LocalDate.of(2024, 05, 24), new Fornecedor("Tomaz", "465385","rua cacau", "46553383" ), 1000);
    prod2.imprimirMercadorias();

    Mercadorias prod3 = new Mercadorias("Arroz", 22.0, 50.0, LocalDate.of(2024, 05, 24), new Fornecedor("Tomaz", "465385","rua cacau", "46553383" ), 1000);
    prod3.imprimirMercadorias();

    Mercadorias prod4 = new Mercadorias("Feijão", 22.0, 50.0, LocalDate.of(2024, 05, 24), new Fornecedor("Tomaz", "465385","rua cacau", "46553383" ), 1000);
    prod4.imprimirMercadorias();

    Mercadorias prod5 = new Mercadorias("Soja", 22.0, 50.0, LocalDate.of(2024, 05, 24), new Fornecedor("Tomaz", "465385","rua cacau", "46553383" ), 1000);
    prod5.imprimirMercadorias();

    Mercadorias prod6 = new Mercadorias("Suco", 22.0, 50.0, LocalDate.of(2024, 05, 24), new Fornecedor("Tomaz", "465385","rua cacau", "46553383" ), 1000);
    prod6.imprimirMercadorias();

    Mercadorias prod7 = new Mercadorias("Biscoito", 22.0, 50.0, LocalDate.of(2024, 05, 24), new Fornecedor("Tomaz", "465385","rua cacau", "46553383" ), 1000);
    prod7.imprimirMercadorias();
    
    m.qtdItens();

    double valorTotal = prod1.getValorCompra()+prod2.getValorCompra()+prod3.getValorCompra()+prod4.getValorCompra()+prod5.getValorCompra()+prod6.getValorCompra()+prod7.getValorCompra();
    System.out.println("\nValor Total:" + valorTotal);

    Fornecedor fornecedor = new Fornecedor("Tomaz", "1626262", "rua ali", "64748586");
    fornecedor.imprimirFornecedor();
  }
}
    


