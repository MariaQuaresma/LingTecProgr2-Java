package main.java;

public class MainAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", "caramelo", 20);
        dog.imprimirAnimal();
        dog.andar();
        dog.latir();

        Eagle eagle = new Eagle("Eagle", "marrom", 30);
        eagle.imprimirAnimal();
        eagle.respirar();
        eagle.voar();

        Lion lion = new Lion("Lion", "Amarelo", 40);
        lion.imprimirAnimal();
        lion.dormir();

        Ornitorrinco ornitorrinco = new Ornitorrinco("Ornitorrinco", "preto", 100);
        ornitorrinco.imprimirAnimal();
        ornitorrinco.comer();

        
    }
}
