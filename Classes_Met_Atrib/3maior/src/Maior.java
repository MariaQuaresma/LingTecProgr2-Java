import java.util.Scanner;

public class Maior {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
      Double nota1, nota2, nota3;

    System.out.println("\nDigite o primeiro numero: ");
      nota1 = in.nextDouble();

    System.out.println("\nDigite o segundo numero: ");
      nota2 = in.nextDouble();

    System.out.println("\nDigite o terceiro numero: ");
      nota3 = in.nextDouble();

    if(nota1 > nota2 && nota1 > nota3){
        System.out.println(nota1+" é a maior numero!\n");
    }
    else if (nota2 > nota1 && nota2 > nota3){
        System.out.println(nota2+" é a maior numero!\n");
    }
    else {
        System.out.println(nota3+" é a maior numero!\n");
    }
    in.close();
  }
}