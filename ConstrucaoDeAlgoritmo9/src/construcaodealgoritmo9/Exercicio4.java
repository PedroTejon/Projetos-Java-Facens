package construcaodealgoritmo9;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int[][] matrizDobro = new int[3][3];
        for (int i = 0; i < matrizDobro.length; i++) {
            for (int j = 0; j < matrizDobro[i].length; j++) {
                matrizDobro[i][j] = matriz[i][j] * 2;
            }
        }
        
        System.out.println("Matriz inserida:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz com valores dobrados:");
        for (int i = 0; i < matrizDobro.length; i++) {
            for (int j = 0; j < matrizDobro[i].length; j++) {
                System.out.print(matrizDobro[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
