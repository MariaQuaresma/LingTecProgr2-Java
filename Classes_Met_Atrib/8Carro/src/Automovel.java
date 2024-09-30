public class Automovel {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int anoModelo;
    private String cor;
    private int KilometragemTotal = 0; 

    public Automovel(){

    }

    public Automovel(String marca, String modelo, int anoFabricacao, int anoModelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }
    
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getKilometragemTotal() {
        return KilometragemTotal;
    }

    public void setKilometragemTotal(int kilometragemTotal) {
        KilometragemTotal = kilometragemTotal;
    }

    public void imprimirAutomovel(){
        System.out.println("Automovel [Marca: "+ getMarca()+ ", Modelo: "+getModelo()+", Ano Fabricação:"+", Ano Modelo: "+ getAnoModelo()+", Cor: "+ getCor()+"]");
    }

    public void AddKm(int Km) {
        KilometragemTotal += Km;
        System.out.println("A Kilometragem total: " + KilometragemTotal);
    }

    public void VelocidadeMedia(float tempo, float distancia) {
        float VM = distancia / tempo;
        System.out.println("\nA velocidade media eh: " + VM);
    }

    public void Acelerar() {
        System.out.println("\nCarro acelerando!");
    }

    public void Frear() {
        System.out.println("\nCarro freando!");
    }

    public void Esquerda(){
        System.out.println("\nCarro virando para a esquerda!");
    }

    public void Direita(){
        System.out.println("\nCarro virando para a direita!");
    }
}