package construcaodealgoritmo9;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int[] soma = new int[5];
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            for (int j = 0; j < matriz.length; j++) {
                soma[coluna] += matriz[j][coluna];
            }
            System.out.println(soma[coluna]);
        }
        
        System.out.println("Matriz inserida:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < soma.length; i++) {
            System.out.println("A coluna de indíce " + i + " tem a soma de seus elementos igual a " + soma[i]);
        }
    }
}
