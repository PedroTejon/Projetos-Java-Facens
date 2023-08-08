package aula2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada
        System.out.println("Insira um numero inteiro:");
        int num1 = scanner.nextInt();
        System.out.println("Insira outro numero inteiro:");
        int num2 = scanner.nextInt();
        
        // Processamento
        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        float div = num1 / num2;
        
        // Sai­da
        System.out.printf("%d + %d = %d\n", num1, num2, soma);
        System.out.printf("%d - %d = %d\n", num1, num2, sub);
        System.out.printf("%d * %d = %d\n", num1, num2, mult);
        System.out.printf("%d / %d = %.2f\n", num1, num2, div);
    }
}
