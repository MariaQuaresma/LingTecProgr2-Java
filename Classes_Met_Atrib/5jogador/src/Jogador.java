import java.util.Random;
import java.util.Scanner;

public class Jogador {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tentativas = 0;
        int numDesc = new Random().nextInt(100);

        System.out.println("Bem-vindo ao jogo Adivinhe o número!");
        System.out.println("Tente adivinhar o número entre 0 e 100:");

        while(true) {
            System.out.println("\nInforme o seu palpite: ");
            int palpite = in.nextInt();
            tentativas++;

            if(palpite > numDesc) { 
                System.out.println("\nTente um número menor.");  
            } 
            else if (palpite < numDesc) { 
                System.out.println("\nTente um número maior.");
            } 
            else {
                System.out.println("\nParabéns! Você acertou o número em "+ tentativas +" tentativas.");
                break;
            }
        }
       in.close();
    }
}