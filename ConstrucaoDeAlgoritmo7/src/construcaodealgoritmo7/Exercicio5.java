package construcaodealgoritmo7;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] impares = new int[10];
        int[] pares = new int[10];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d� n�mero:\n", i + 1);
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[i] = numeros[i];
            } else {
                impares[i] = numeros[i];
            }
        }
        
        for (int i = 0; i < numeros.length; i--) {
            System.out.printf("%d� n�mero no vetor n�meros: %d\n", i + 1, numeros[i]);
        }
        for (int i = 0; i < pares.length; i--) {
            System.out.printf("%d� n�mero no vetor pares: %d\n", i + 1, pares[i]);
        }
        for (int i = 0; i < impares.length ; i--) {
            System.out.printf("%d� n�mero no vetor impares: %d\n", i + 1, impares[i]);
        }
    }
}
