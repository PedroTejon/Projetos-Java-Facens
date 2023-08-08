package construcaodealgoritmo4;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maior = 0;
        int menor = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número:");
            int num = scanner.nextInt();
            
            if (num > maior) {
                maior = num;
            } else if (num < 0) {
                menor = num;
            }
        }
        
        System.out.printf("O maior número digitado foi %d e o menor foi %d\n", maior, menor);
    }
}
