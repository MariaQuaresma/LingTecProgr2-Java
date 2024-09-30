package main.java;

import java.time.LocalDate;
import java.util.ArrayList;

import main.java.enums.Raca;
import main.java.enums.Cor;

public class Pet {
    private String nome;
    private LocalDate dataEntrada;
    private Raca raca;
    private Cor cor;
    private int peso;

    public Pet(){

    }

    public Pet(String nome, LocalDate dataEntrada, Raca raca, Cor cor, int peso) {
        this.nome = nome;
        this.dataEntrada = dataEntrada;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void imprimirPet() {
        System.out.println("Pet [nome: " + getNome() + ", data de entrada: " + getDataEntrada() + ", raça: " + getRaca() + ", cor: " + getCor() + ", peso: " + getPeso() + "]");
    }

    public static void qtdDesnutridos(ArrayList<Pet> pets) {
        int qtdDesnutridos = 0;
        for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);
            if (pet.getPeso() <= 20) {
                qtdDesnutridos++;
            }
        }
        System.out.println("\nQuantidade de cachorros desnutridos: " + qtdDesnutridos);
    }

    public static void qtdViraLata(ArrayList<Pet> pets) {
        int qtdViraLata = 0;
        for (Pet pet : pets) {
            if (pet.getRaca() != null && pet.getRaca() == Raca.VIRA_LATA) {
                qtdViraLata++;
            }
        }
        System.out.println("\nQuantidade de cachorros no sistema com raça Vira Lata: " + qtdViraLata);
    }

    public static void qtdPetAmarelos(ArrayList<Pet> pets) {
        int qtdPetAmarelos = 0;
        for (Pet pet : pets) {
            if (pet.getCor().equals(Cor.AMARELA)) {
                qtdPetAmarelos++;
            }
        }
        System.out.println("\nQuantidade de cachoros com a cor amarela: " + qtdPetAmarelos);
    }
}