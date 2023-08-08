package construcaodealgoritmo9;

import java.util.Scanner;

public class Aquecimento2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[10];
        int[] vetorI = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Insira um número:");
            vetor[i] = scanner.nextInt();
            vetorI[vetor.length - 1 -i] = vetor[i];
        }
        
        for (int i = 0; i < vetor.length; i++)
        {
            if (vetor[i] == vetorI[i])
                System.out.println(vetor[i] + " na index " + i);
        }
    }
}
