package main.java;
import main.java.enums.Cor;
import main.java.enums.Raca;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n--- Pets da ONG CãoNino ---");
        Pet kate = new Pet("Kate", LocalDate.of(2009, 06, 12), Raca.VIRA_LATA, Cor.PRETA, 35);
        kate.imprimirPet();
        Pet bob = new Pet("Bob", LocalDate.of(2010, 10, 9), Raca.BULLDOG, Cor.PRETA, 22);
        bob.imprimirPet();
        Pet pritty = new Pet("Pitty", LocalDate.of(2007, 03, 2), Raca.PITBULL, Cor.BRANCA, 38);
        pritty.imprimirPet();
        Pet kelly = new Pet("Kelly", LocalDate.of(2001, 05, 8), Raca.LABRADOR, Cor.AMARELA, 36);
        kelly.imprimirPet();
        Pet peixe = new Pet("Peixe", LocalDate.of(2008, 11, 9), Raca.VIRA_LATA, Cor.AMARELA, 20);
        peixe.imprimirPet();
        Pet grazi = new Pet("Grazi", LocalDate.of(2012, 12, 12), Raca.PASTOR, Cor.AMARELA, 18);
        grazi.imprimirPet();
        
        System.out.println("\n--- Pessoas que adotaram =) ---");
        Pessoa diana = new Pessoa("Diana", "rua adi", "diana@gmail.com", "656746", 'f', kate);
        diana.imprimirPessoa();
        Pessoa louis = new Pessoa("Louis", "rua loidiana", "lois@gamil.com", "633756", 'm', bob);
        louis.imprimirPessoa();
        Pessoa bruce = new Pessoa("Bruce", "rua bruceiladia", "bruce@gmail.com", "656845", 'm', pritty);
        bruce.imprimirPessoa();
        Pessoa clark = new Pessoa("Clark", "rua clariana", "clari@gmail.com", "648735", 'f', kelly);
        clark.imprimirPessoa();

        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(kate);
        pets.add(bob);
        pets.add(pritty);
        pets.add(kelly);
        pets.add(peixe);
        pets.add(grazi);

        ArrayList<Adocao> adocao = new ArrayList<Adocao>();
        Adocao ficha1 = new Adocao(LocalDate.of(2010, 12, 24), kate, diana);
        Adocao ficha2 = new Adocao(LocalDate.of(2011, 03, 20), bob, louis);
        Adocao ficha3 = new Adocao(LocalDate.of(2007, 06, 18), pritty, bruce);
        Adocao ficha4 = new Adocao(LocalDate.of(2002, 9, 01), kelly, clark);

        adocao.add(ficha1);
        adocao.add(ficha2);
        adocao.add(ficha3);
        adocao.add(ficha4);

        System.out.println("\n--- Adoções realizadas com sucesso! ---");
        Adocao.verificarData(adocao);

        Adocao.visualizar_ficha(adocao);

        ficha2.substituirPessoa(clark);
      
        System.out.println("\n--- Tempo total que esteve na ONG ---");
        Adocao.calcularTempoONG(adocao);

        System.out.println("\n--- Estado de nutrição dos pets ---");
        Adocao.nutricao(adocao);

        System.out.println("\n--- Tempo de adotado ---");
        Adocao.calcularTempoAdotado(adocao);

        Adocao.buscarPet("Kate", adocao);

        Adocao.petMaisAntigoAdotado(adocao);

        Adocao.qtdViraLataAdotados(adocao);

        Pet.qtdDesnutridos(pets);
        Pet.qtdViraLata(pets);
        Pet.qtdPetAmarelos(pets);
    }
}
