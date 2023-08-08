package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        
        if (num > 0) {
            System.out.printf("%d é um número positivo\n", num);
        } else if (num < 0) {
            System.out.printf("%d é um número negativo\n", num);
        } else {
            System.out.printf("%d é zero\n", num);
        }
    }
}
