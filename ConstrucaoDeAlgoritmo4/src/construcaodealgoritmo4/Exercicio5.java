package construcaodealgoritmo4;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        for (int i = 0; i < 10; i++) {
            sum += scanner.nextInt();
        }
        
        System.out.println("A soma dos números é " + sum);
    }
}
