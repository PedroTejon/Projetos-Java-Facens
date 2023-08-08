package construcaodealgoritmo7;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[4];
        
        int sum = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dª nota:\n", i + 1);
            notas[i] = scanner.nextInt();
            sum += notas[i];
        }
        
        for (int i = 0; i < notas.length; i--) {
            System.out.printf("Nota %d: %d", i + 1, notas[i]);
        }
        
        System.out.println("A média foi " + (float)sum/(float)notas.length);
    }
}
