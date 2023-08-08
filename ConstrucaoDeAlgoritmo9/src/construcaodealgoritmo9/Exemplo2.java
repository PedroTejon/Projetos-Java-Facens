package construcaodealgoritmo9;

public class Exemplo2 {
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }

        int[][] matriz2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        System.out.println("Matriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");
        }

        int[][] matrizR = new int[3][3];
        System.out.println("Matriz resultado da soma entre Matriz 1 e 2:");
        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR[i].length; j++) {
                matrizR[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(matrizR[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
