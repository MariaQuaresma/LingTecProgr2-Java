package main.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---Avião---");
        Aviao aviao = new Aviao("643476757", true);
        System.out.println("Registro Aeronáutico: " + aviao.getRegAeronautico());
        aviao.ligar();
        aviao.decolar();
        aviao.moverParaFrente();
        aviao.pousar();
        aviao.desligar();

        System.out.println("\n---Barco---");
        Barco barco = new Barco("54765464", false);
        System.out.println("Registro de Embarcação: " + barco.getRegEmbarcacao());
        barco.ligar();
        barco.navegar();
        barco.moverParaFrente();
        barco.desligar();
        barco.ancorar();

        System.out.println("\n---Automovel---");
        Automovel automovel = new Automovel(253535, "636vddv", false);
        System.out.println("Renavam: " + automovel.getRenavam());
        System.out.println("Placa: " + automovel.getPlaca());
        automovel.ligar();
        automovel.passarMarcha();
        automovel.moverParaFrente();
        automovel.re();
        automovel.frear();
        automovel.parar();
        automovel.desligar();
    } 
}
