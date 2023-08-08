package construcaodealgoritmo9;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float[][] matriz = new float[3][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Escolha uma linha para exibir m�dia (1-3):");
        int linha = scanner.nextInt() - 1;
        
        float sum = 0;
        for (int i = 0; i < matriz[linha].length; i++) {
            sum += matriz[linha][i];
        }
        
        System.out.println("A m�dia da linha " + (linha + 1) + " � " + (sum / matriz[linha].length));
    }
}
