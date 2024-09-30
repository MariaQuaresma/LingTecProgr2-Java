package main.java;

import java.util.Scanner;

public class MultPadrao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        testExamples();

        System.out.println("\n---Faça a sua conta de multiplicação Padrão---");
        System.out.println("Digite o valor de A:");
        int a = in.nextInt();
        System.out.println("Digite o valor de B:");
        int b = in.nextInt();
        System.out.println("Digite a base (2 para binária, 10 para decimal):");
        int base = in.nextInt();
        System.out.println("Digite o número de dígitos de A e B:");
        int n = in.nextInt();

        int resultado = mult(a, b, n, base);
        System.out.println("O resultado da multiplicação é: " + resultado);

        in.close();
    }

    public static int mult(int a, int b, int n, int base) {
        if (n > 1) {
            int divisor = (int) Math.pow(base, n / 2);

            int A1 = a / divisor;
            int A0 = a % divisor;
            int B1 = b / divisor;
            int B0 = b % divisor;

            int A1B1 = mult(A1, B1, n / 2, base);
            int A1B0 = mult(A1, B0, n / 2, base);
            int A0B1 = mult(A0, B1, n / 2, base);
            int A0B0 = mult(A0, B0, n / 2, base);

            return (int) (Math.pow(base, n) * A1B1 + (int) Math.pow(base, n / 2) * (A1B0 + A0B1) + A0B0);
        } 
        else {
            return a * b;
        }
    }

    public static int mult(String a, String b, int n, int base) {
        int[] num1 = toIntArray(a);
        int[] num2 = toIntArray(b);
        int[] result = new int[num1.length + num2.length];

        for (int i = num1.length - 1; i >= 0; i--) {
            for (int j = num2.length - 1; j >= 0; j--) {
                int mul = num1[i] * num2[j];
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % base;
                result[i + j] += sum / base;
            }
        }
        int res = 0;
        for (int r : result) {
            res = res * base + r;
        }
        return res;
    }

    private static int[] toIntArray(String num) {
        int[] result = new int[num.length()];
        for (int i = 0; i < num.length(); i++) {
            result[i] = Character.digit(num.charAt(i), 10);
        }
        return result;
    }

    public static void testExamples() {
        int result;
        System.out.println("---Exemplos---");
    
        result = mult(8, 5, 1, 10);
        System.out.println("Exemplo a: 8 x 5 (Decimal) = " + result);

        result = mult(62938427, 32984729, 8, 10);
        System.out.println("Exemplo b: 62938427 x 32984729 (Decimal) = " + result);

        result = mult(3209094, 246, 7, 10);
        System.out.println("Exemplo c: 3209094 x 246 (Decimal) = " + result);

        result = mult(23487, 294582745, 9, 10);
        System.out.println("Exemplo d: 23487 x 294582745 (Decimal) = " + result);

        result = mult("234566778996867555342234234245", "450294459842450836750959083096", 30, 10);
        System.out.println("Exemplo e: 234566778996867555342234234245 x 450294459842450836750959083096 (Decimal) = " + result); 

        result = mult(1, 0, 1, 10);
        System.out.println("Exemplo f: 1 x 0 (Decimal) = " + result);

        result = mult(0b11101101, 0b11110100, 8, 2);
        System.out.println("Exemplo g: 11101101 x 11110100 (Binário) = " + Integer.toBinaryString(result));

        result = mult(0b1111111, 0b1100, 7, 2);
        System.out.println("Exemplo h: 1111111 x 1100 (Binário) = " + Integer.toBinaryString(result));

        result = mult(0b1100, 0b1111110, 7, 2);
        System.out.println("Exemplo i: 1100 x 1111110 (Binário) = " + Integer.toBinaryString(result));

        result = mult(0b110101011101010111010101110101, 0b110101010101111000000011111101, 30, 2);
        System.out.println("Exemplo j: 110101011101010111010101110101 x 110101010101111000000011111101 (Binário) = " + Integer.toBinaryString(result));
    }
}