import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int tentativas = 0;
        int numDesc = 36;
        System.out.println("Bem-vindo ao jogo Adivinhe o número!");

        while(true){
            System.out.println("\nTentativa " + (tentativas+1) + ": \nDigite um número: ");
            int palpite = in.nextInt();
            tentativas++;

            if(palpite == numDesc){
                if(tentativas == 1){
                   System.out.println("\nVocê é exelente!");
                }
                else if(tentativas <= 10){
                   System.out.println("\nVocê é bom!");
                }
                else if(tentativas <= 20){
                   System.out.println("\nVocê não foi tão bem!");
                }
                else{
                   System.out.println("\nVocê presisa praticar!");
                }
                break;
            }
        }
        in.close();
    }
}