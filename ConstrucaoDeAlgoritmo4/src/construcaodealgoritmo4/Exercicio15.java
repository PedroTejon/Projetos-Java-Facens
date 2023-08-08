package construcaodealgoritmo4;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num = scanner.nextInt();      
        
        double sum = 1;
        for (int i = 2; i <= num; i++) {
            sum += 1.0 / i;
        }
        
        System.out.println(sum);
    }
}
