import java.util.Scanner;
import java.util.Arrays;

public class Ordenacao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] num = new int[tamanho];

        System.out.println("Digite os números: ");
        for(int i=0; i<tamanho; i++){
            num[i] = scanner.nextInt();
        }

        Ordenacao ord = new Ordenacao();

        System.out.println("\nOrdenação Crescente (método da Classe Ordenacao): ");
        ord.ordenarCrescente(num);
        System.out.println(Arrays.toString(num));

        System.out.println("Ordenação Decrescente (Método da Classe Ordenacao):");
        ord.ordenarDecrescente(num);
        System.out.println(Arrays.toString(num));

        System.out.println("Ordenação Crescente (Método estático da classe Arrays): ");
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        System.out.println("Ordenação Decrescente (Método estático da classe Arrays):");
        for(int i=0; i<num.length/2; i++){
            int temp = num[i];
            num[i] = num[num.length-1 - i];
            num[num.length-1 - i] = temp;
        }
        System.out.println(Arrays.toString(num));
        scanner.close();
    }

    public void ordenarCrescente(int[] array){
        Arrays.sort(array);
    }

    public void ordenarDecrescente(int[] array){
        for(int i=0; i<array.length/2;  i++){
            int temp = array[i];
            array[i] = array[array.length-1 -i];
            array[array.length-1 -i] = temp;
        }
    }
}