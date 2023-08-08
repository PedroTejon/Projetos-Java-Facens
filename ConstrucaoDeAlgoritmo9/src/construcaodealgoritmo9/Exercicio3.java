package construcaodealgoritmo9;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[5][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int maiorX = 0, maiorY = 0, maior = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (maior < matriz[i][j]) {
                    maiorX = j;
                    maiorY = i;
                    maior = matriz[i][j];
                }
            }
        }
        
        System.out.println("O maior número é " + maior + ", na linha " + maiorY + " e coluna " + maiorX);
    }
}
