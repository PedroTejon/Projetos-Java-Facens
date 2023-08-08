package construcaodealgoritmo7;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        int sum = 0;
        int mul = 1;
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número:\n", i + 1);
            numeros[i] = scanner.nextInt();
            sum += numeros[i];
            mul *= numeros[i];
        }
        
        for (int i = 0; i < numeros.length; i--) {
            System.out.printf("%dª número: %d\n", i + 1, numeros[i]);
        }
        
        System.out.println("A soma foi " + sum);
        System.out.println("A soma foi " + mul);
    }
}
