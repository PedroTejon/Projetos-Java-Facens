package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        
        System.out.printf("O antecessor de %d é %d e o sucessor é %d\n", num, num - 1, num + 1);
    }
}
