package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.printf("%d é um número par\n", num);
        } else {
            System.out.printf("%d é um número impar\n", num);
        }
    }
}
