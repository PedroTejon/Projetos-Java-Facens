package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a base do retângulo:");
        int base = scanner.nextInt();
        
        System.out.println("Digite a altura do retângulo:");
        int altura = scanner.nextInt();
        
        System.out.printf("A área do retângulo é %d\n", base * altura);
    }
}
