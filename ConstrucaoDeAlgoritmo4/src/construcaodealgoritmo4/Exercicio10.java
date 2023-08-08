package construcaodealgoritmo4;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número:");
            int num = scanner.nextInt();
            
            if (num >= 0 && num <= 100) {
                count++;
            } 
        }
        
        System.out.printf("Foram digitados %d números entre 0 e 100\n", count);
    }
}
