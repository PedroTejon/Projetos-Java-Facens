package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um n�mero:");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite outro n�mero:");
        int num2 = scanner.nextInt();
        
        System.out.printf("O maior n�mero entre %d e %d � %d\n", num1, num2, Math.max(num1, num2));
    }
}
