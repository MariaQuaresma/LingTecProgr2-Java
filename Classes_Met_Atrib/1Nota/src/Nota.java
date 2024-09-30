import java.util.Scanner;

public class Nota {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        double nota1, nota2;

        System.out.println("Entre com a primeira nota:");
        nota1 =  in.nextDouble();

        System.out.println("Entre com a segunda nota:");
        nota2 = in.nextDouble();
        
        double media = (nota1+nota2)/2;
        if (media>=7){
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Reprovado!");
        }
    in.close();
    }
}
