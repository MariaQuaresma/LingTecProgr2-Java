import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1, num2, num3;
        double delta, x1, x2;

        System.out.println("\nInforme os valores dos coeficientes a:");
        num1 = in.nextDouble();

        System.out.println("\nInforme os valores dos coeficientes b:");
        num2 = in.nextDouble();

        System.out.println("\nInforme os valores dos coeficientes c:");
        num3 = in.nextDouble();

        delta = (num2 * num2) - 4 * num1 * num3;

        if (delta > 0) {
            x1 = ((-num2) + Math.sqrt(delta)) / (2 * num1);
            x2 = ((-num2) - Math.sqrt(delta)) / (2 * num1);
            System.out.println("\nRaíz 1: " + x1);
            System.out.println("Raíz 2: " + x2);
        } 
        else if (delta == 0) {
            x1 = -num2 / (2 * num1);
            System.out.println("\nA equação tem apenas uma raiz real: " + x1);
        } 
        else {
            System.out.println("\nA equação não possui raízes reais.");
        }
      in.close();
    }
}