package construcaodealgoritmo4;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countPar = 0;
        int countImpar = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite um número:");
            int num = scanner.nextInt();
            
            if (num % 2 == 0) {
                countPar++;
            } else {
                countImpar++;
            }
        }
        
        System.out.printf("Foram digitados %d números pares e %d números ímpares\n", countPar, countImpar);
    }
}
