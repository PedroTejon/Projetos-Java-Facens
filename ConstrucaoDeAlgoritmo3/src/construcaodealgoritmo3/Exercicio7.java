package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite outro número:");
        int num2 = scanner.nextInt();
        
        System.out.printf("O maior número entre %d e %d é %d\n", num1, num2, Math.max(num1, num2));
    }
}
