package construcaodealgoritmo4;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countP = 0;
        int countN = 0;
        int countZ = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número:");
            int num = scanner.nextInt();
            
            if (num > 0) {
                countP++;
            } else if (num < 0) {
                countN++;
            } else {
                countZ++;
            }
        }
        
        System.out.printf("Foram digitados %d números positivos, %d números negativos e %d zeros \n", countP, countN, countZ);
    }
}
