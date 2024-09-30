package main.java;
import java.util.ArrayList;

public class MainGame {
    public static void main(String[] args) {
        System.out.println("\n+-----------------------------------+");
    System.out.println("|             SUPERKATE             |");
    System.out.println("+-----------------------------------+");
    System.out.println("         SEJA BEM VINDO(A) AO JOGO"   );
    System.out.println("+-----------------------------------+");
    
    System.out.println("\n--- Poderes da Super Kate---");
    Poder superBark = new Poder("super Bark", 10);
    superBark.imprimirPoder();

    Poder EyeBeam = new Poder("Eye Beam", 20);
    EyeBeam.imprimirPoder();

    Poder RearRocket = new Poder("Rear Rocket", 30);
    RearRocket.imprimirPoder();

    ArrayList<Poder> poderes = new ArrayList<>();
    poderes.add(superBark);
    poderes.add(EyeBeam);
    poderes.add(RearRocket);

    System.out.println("\n--- Personagens ---");
    Kate superKate = new Kate("Super Kate", 100, 5, poderes, superBark);
    superKate.imprimirPersonagem();

    System.out.println("\n--- Inimigos ---");
    BadFish badFish1 = new BadFish("Bad Fish1", 100);
    badFish1.imprimirPersonagem();

    BadFish badFish2 = new BadFish("Bad Fish2", 90);
    badFish2.imprimirPersonagem();

    BadFish badFish3 = new BadFish("Bad Fish3", 80);
    badFish3.imprimirPersonagem();

    MadCat madCat1 = new MadCat("Mad cat1", 50);
    madCat1.imprimirPersonagem();

    MadCat madCat2 = new MadCat("Mad cat2", 50);
    madCat2.imprimirPersonagem();

    MegaBob megaBob = new MegaBob("Mega bob", 100);
    megaBob.imprimirPersonagem();

    Obstaculos obstaculos = new Obstaculos("pedra", "ferro");
    obstaculos.imprimirObstaculos();

    superKate.andar();
    superKate.pular();

    badFish1.receberDano(EyeBeam);
    superKate.alterarpoder(RearRocket);
    badFish2.receberDano(RearRocket);
    badFish3.receberDano(superBark);

    madCat1.receberDano(EyeBeam);
    madCat2.receberDano(superBark);
   
    megaBob.receberDano(RearRocket); 
    }
}
