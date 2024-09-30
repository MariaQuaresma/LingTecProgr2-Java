import java.util.Arrays;

public class Inverta {

    public static void inverterArray(String[] array) {
        int inicio = 0;
        int fim = array.length - 1;
        String temp;

        while (inicio < fim) {
            temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            inicio++;
            fim--;
        }
    }

    public static void main(String[] args) throws Exception {

        String[] texto = {"Olá", "como", "você", "está", "?"};
        System.out.println("\nArray original: " + Arrays.toString(texto));

        inverterArray(texto);
        System.out.println("\nArray invertido: " + Arrays.toString(texto));
    }
}

