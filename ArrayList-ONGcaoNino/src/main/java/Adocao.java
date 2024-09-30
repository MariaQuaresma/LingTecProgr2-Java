package main.java;

import java.time.LocalDate;
import java.util.ArrayList;

import main.java.enums.Raca;

public class Adocao {
    private LocalDate dataAdocao;
    private Pet pet;
    private Pessoa pessoa;

    public Adocao(){

    }

    public Adocao(LocalDate dataAdocao, Pet pet, Pessoa pessoa) {
        this.dataAdocao = dataAdocao;
        this.pet = pet;
        this.pessoa = pessoa;
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(LocalDate dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public static void verificarData(ArrayList<Adocao> adocoes) {
        for (Adocao adocao : adocoes) {
            LocalDate dataAdocao = adocao.getDataAdocao();
            LocalDate pet = adocao.getPet().getDataEntrada();
        if (dataAdocao.isBefore(pet)) {
            System.out.println("Erro! Data de adoção (" + dataAdocao + ") é anterior à data de entrada do pet (" + adocao.pet.getDataEntrada() + ")");   
        } 
        else {
            System.out.println("A pessoa " + adocao.pessoa.getNome() + " adotou o pet " + adocao.pet.getNome());
        }
      }
    }

    public static void visualizar_ficha(ArrayList<Adocao> adocoes) {
        for (Adocao adocao : adocoes) {
            System.out.println("\n----------------------");
            System.out.println("   - Ficha de adoção -  ");
            System.out.println("Dono: " + adocao.getPessoa().getNome());
            System.out.println("Pet adotado: " + adocao.getPet().getNome());
            System.out.println("Data de adoção: " + adocao.getDataAdocao());
            System.out.println("----------------------");
        }
    }

    public void substituirPessoa(Pessoa novaPessoa) {
        pessoa = novaPessoa;
        System.out.println("\nA pessoa responsável pela adoção do pet " + pet.getNome() + " foi substituída por " + novaPessoa.getNome());
    }

    public static void calcularTempoONG(ArrayList<Adocao> adocoes) {
        for (int i = 0; i < adocoes.size(); i++) {
          Adocao adocao = adocoes.get(i);
          LocalDate dataEntrada = adocao.pet.getDataEntrada();
            int anos = adocao.dataAdocao.getYear() - dataEntrada.getYear();
            int meses = adocao.dataAdocao.getMonthValue() - dataEntrada.getMonthValue();
            int dias = adocao.dataAdocao.getDayOfMonth() - dataEntrada.getDayOfMonth();
            System.out.println("Tempo que o cachorro "+ adocao.pet.getNome()+" ficou na ONG: " + anos + " anos, " + meses + " meses, e " + dias + " dias.");
        }
    }

    public static void nutricao(ArrayList<Adocao> adocoes) {
        for (Adocao adocao : adocoes) {
        int peso = adocao.pet.getPeso();
        if (peso <= 20) {
            System.out.println("O pet "+ adocao.pet.getNome()+ " está desnutrido!");
        } 
        else if (peso <= 30) {
            System.out.println("O pet "+ adocao.pet.getNome()+" está bem nutrido!");
        } 
        else {
            System.out.println("O pet "+ adocao.pet.getNome()+" está obeso!");
        }
      }
    }

    public static void calcularTempoAdotado(ArrayList<Adocao> adocoes) {
        for (Adocao adocao : adocoes) {
        LocalDate hoje = LocalDate.now();
        int anos = hoje.getYear() - adocao.dataAdocao.getYear();
        int meses = hoje.getMonthValue() - adocao.dataAdocao.getMonthValue();
        int dias = hoje.getDayOfMonth() - adocao.dataAdocao.getDayOfMonth();
        System.out.println("Tempo de adotado do "+adocao.pet.getNome()+": "+ anos+" anos, " + meses +" meses e "+ dias+" dias.");
        }
    }

    public static void buscarPet(String nome, ArrayList<Adocao> adocoes) {
        boolean encontrado = false;
        for (int i = 0; i < adocoes.size(); i++) {
            Adocao adocao = adocoes.get(i);
            if (adocao.getPet().getNome().equals(nome)) {
                encontrado = true;
                System.out.println("\nPet " + nome + " encontrado no sistema!\n");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\nPet " + nome + " não encontrado no sistema!\n");
        }
    }

    public static void petMaisAntigoAdotado(ArrayList<Adocao> adocoes) {
        LocalDate dataAtual = LocalDate.now();
        String petMaisAntigo = "";
        for (Adocao adocao : adocoes) {
            LocalDate dataAdocao = adocao.getDataAdocao();
            if (dataAdocao.isBefore(dataAtual)) {
                dataAtual = dataAdocao;
                petMaisAntigo = adocao.getPet().getNome();
            }
        }
        System.out.println("Pet com maior tempo de adoção: " + petMaisAntigo);
    }

    public static void qtdViraLataAdotados(ArrayList<Adocao> adocoes) {
        int qtdViraLataAdotados = 0;
        for (int i = 0; i < adocoes.size(); i++) {
            Adocao adocao = adocoes.get(i);
            if (adocao.getPet().getRaca().equals(Raca.VIRA_LATA)) {
                qtdViraLataAdotados++;
            }
        }
        System.out.println("\nQuantidade de pets adotados com raça Vira Lata: " + qtdViraLataAdotados);
    }
     
}