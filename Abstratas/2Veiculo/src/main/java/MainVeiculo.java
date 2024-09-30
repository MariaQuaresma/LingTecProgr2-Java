package main.java;

public class MainVeiculo {
    public static void main(String[] args) {
        Automovel automovel = new Automovel("Carro", "vermelho", 500, "84374687", "46557");
        automovel.imprimirAutomovel();
        automovel.ligar();
        automovel.desligar();
        automovel.moverFrente();
        automovel.re();
        automovel.parar();

        Aviao aviao = new Aviao("Aviao", "verde", 10000, "45463745");
        aviao.imprimirAviao();
        aviao.ligar();
        aviao.desligar();
        aviao.moverFrente();
        aviao.re();
        aviao.parar();

        Barco barco = new Barco("Barco", "branco", 1000, "65346");
        barco.imprimirBarco();
        barco.ligar();
        barco.desligar();
        barco.moverFrente();
        barco.re();
        barco.parar();
    }
}
