import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Double nota1, nota2, notapf;

            System.out.println("\nDigite a primeira nota do aluno ate 10: ");
            nota1 = in.nextDouble();
            while (nota1<0 || nota1>10) {
                System.out.println("\nNota inválida. Digite novamente:");
                nota1 = in.nextDouble();
            }

            System.out.println("\nDigite a segunda nota do aluno ate 10:");
            nota2 = in.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("\nNota inválida. Digite novamente:");
                nota2 = in.nextDouble();
            }

            Double media = (nota1 + nota2) / 2;

            if (media >= 6.0) {
                System.out.println("Aprovado!");
            } 
            else if (media < 2.0) {
                System.out.println("Reprovado!");
            } 
            else {
                System.out.println("\nInforme a nota da prova final:");
                notapf = in.nextDouble();
                while (notapf<0 || notapf>10) {
                    System.out.println("\nNota inválida. Digite novamente:");
                    notapf = in.nextDouble();
                }

                Double mediafinal = (media + notapf) / 2;

                if (mediafinal >= 6.0) {
                    System.out.println("\nAluno aprovado após prova final!");
                } 
                else {
                    System.out.println("\nAluno reprovado após prova final!");
                }
                System.out.println("\nMédia final: "+ mediafinal);
            } 
        in.close();
    }
}