package construcaodealgoritmo9;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        matriz[0][0] = 100;
        matriz[1][1] = 200;
        matriz[2][2] = 300;

        int matriz2[][] = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        
        Scanner scanner = new Scanner(System.in);
        int matriz3[][] = new int[3][3];
        for (int linha = 0; linha < matriz3.length; linha++) {
            for (int coluna = 0; coluna < matriz3[linha].length; coluna++) {
                matriz3[linha][coluna] = scanner.nextInt();
            }
        }
        
        for (int linha = 0; linha < matriz3.length; linha++) {
            for (int coluna = 0; coluna < matriz3[linha].length; coluna++) {
                System.out.print(matriz3[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
