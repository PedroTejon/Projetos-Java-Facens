package aula2;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite outro numero: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Soma = " + (num1 + num2));
    }
}
