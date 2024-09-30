package main.java;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
    Pessoa leia = new Pessoa();
    leia.setNome("Leia");
    leia.setSobrenome("Organa");
    leia.setSexo("feminino");
    leia.imprimirPessoa();

    Pessoa luke = new Pessoa();
    luke.setNome("Luke");
    luke.setSobrenome("Skywalker");
    luke.setSexo(" Masculino");
    luke.imprimirPessoa();

    Jedi obi = new Jedi();
    obi.setNome("Obi-Wan");
    obi.setSobrenome("Kenobi");
    obi.setTitulo("Jedi");
    obi.setSexo("Masculino");
    obi.imprimirPessoa();

    Sith darth = new Sith();
    darth.setNome("Darth");
    darth.setSobrenome("Vader");
    darth.setTitulo("sith");
    darth.setSexo("Masculino");
    darth.imprimirPessoa();

    darth.mindControl();
    darth.levitation();
    obi.mindControl();
    obi.levitation();

    Saber sabre1 = new Saber("Um sabre de luz azul", 1);
    sabre1.imprimirWeapons();

    Saber sabre2 = new Saber("Um sabre de luz vermelho", 2);
    sabre2.imprimirWeapons();

    Blast blast = new Blast("Um blast laser", 3);
    blast.imprimirWeapons();

    darth.getWeapons().add(sabre2.pickUp());
    obi.getWeapons().add(sabre1.pickUp());

    ArrayList<Weapons> weapons = new ArrayList<>();
    weapons.add(sabre2);
    darth.setWeapons(weapons);
    sabre2.slash();

    weapons.add(blast);
    obi.setWeapons(weapons);
    blast.shot();
    blast.drop(); 
    }
}
