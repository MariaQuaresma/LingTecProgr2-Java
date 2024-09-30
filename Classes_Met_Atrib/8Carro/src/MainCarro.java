
public class MainCarro {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\n---Carro 1---");
        Automovel carro1 = new Automovel("Nissan", "cabine simples", 2022, 2021, "azul");
        carro1.imprimirAutomovel();
        carro1.Acelerar();
        carro1.Frear();
        carro1.Direita();
        carro1.Esquerda();
        carro1.AddKm(20);
        carro1.VelocidadeMedia(2.10f, 200);

        System.out.println("\n---Carro 2---");
        Automovel carro2 = new Automovel("Fiat", "camaro", 2022, 2021, "cinza");
        carro2.imprimirAutomovel();
        carro2.Acelerar();
        carro2.Frear();
        carro2.Direita();
        carro2.Esquerda();
        carro2.AddKm(200);
        carro2.VelocidadeMedia(1.30f, 55);
    }   
}