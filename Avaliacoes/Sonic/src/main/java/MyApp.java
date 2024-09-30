package main.java;
import main.java.model.Character;
import main.java.model.Environment;
import main.java.model.Objetos;
import main.java.model.Sonic;
import main.java.model.Tails;
import main.java.model.Monkey;

public class MyApp {
    public static void main(String[] args) {
        Character sonic = new Character("Sonic", "azul", 1, 3, 3, 5.0, 5.0, 5.0, 5.0, true);
        sonic.imprimirCharacter();

        Character tails = new Character("Tails", "amarelo", 1, 3, 2, 4.0, 4.0, 4.0, 4.0, true);
        tails.imprimirCharacter();

        Character monkey = new Character("Monkey", "vermelho", 1, 3, 1, 3.0, 3.0, 3.0, 3.0, true);
        monkey.imprimirCharacter();

        Environment hillTopZone = new Environment("Hill Top Zone", 50.0, 50.0, 50.0, 50.0, 0, "00:03");
        hillTopZone.imprimirEnvironment();

        hillTopZone.getCharacter().add(sonic);
        hillTopZone.getCharacter().add(tails);
        hillTopZone.getCharacter().add(monkey);
        
        Objetos ring1 = new Objetos("ring1", "amarelo", 8.0, 8.0, 9.0, 2.0, 2.0);
        ring1.imprimirObjeto();

        Objetos ring2 = new Objetos("ring2", "amarelo", 8.0, 9.0, 10.0, 2.0, 2.0);
        ring2.imprimirObjeto();

        Objetos ring3 = new Objetos("ring3", "amarelo", 8.0, 10.0, 11.0, 2.0, 2.0);
        ring3.imprimirObjeto();

        Objetos box = new Objetos("box", "preto", 8.0, 2.0, 2.0, 3.0, 3.0);
        box.imprimirObjeto();

        hillTopZone.getObjetos().add(ring1);
        hillTopZone.getObjetos().add(ring2);
        hillTopZone.getObjetos().add(ring3);
        hillTopZone.getObjetos().add(box);

        sonic.moverFrente(1);
        sonic.moverBaixo(1);
        sonic.moverCima(1);
        sonic.moverTras(1);

        tails.moverFrente(1);
        tails.moverBaixo(1);
        tails.moverCima(1);
        tails.moverTras(1);

        monkey.moverFrente(1);
        monkey.moverBaixo(1);
        monkey.moverCima(1);
        monkey.moverTras(1);

        Sonic moverSonic = new Sonic("Sonic", "azul", 1, 3, 3, 5.0, 5.0, 5.0, 5.0, true);
        moverSonic.imprimirCharacter();
        moverSonic.moverCima(1);
        moverSonic.moverFrente(1);
        moverSonic.moverBaixo(1);
        moverSonic.moverTras(1);

        Tails moverTails = new Tails("Tails", "amarelo", 1, 3, 2, 4.0, 4.0, 4.0, 4.0, true);
        moverTails.imprimirCharacter();
        moverTails.moverCima(1);
        moverTails.moverFrente(1);
        moverTails.moverBaixo(1);
        moverTails.moverTras(1);

        Monkey moverMonkey = new Monkey("Monkey", "vermelho", 1, 3, 1, 3.0, 3.0, 3.0, 3.0, true);
        moverMonkey.imprimirCharacter();
        moverMonkey.moverCima(1);
        moverMonkey.moverFrente(1);
        moverMonkey.moverBaixo(1);
        moverMonkey.moverTras(1);

        hillTopZone.Colidiu(moverSonic, moverTails);
        hillTopZone.ColisaoObj(moverSonic, ring3);
        hillTopZone.ColisaoObj(moverTails, ring3);
        hillTopZone.Colidiu(moverSonic, moverMonkey);
    }     
}

