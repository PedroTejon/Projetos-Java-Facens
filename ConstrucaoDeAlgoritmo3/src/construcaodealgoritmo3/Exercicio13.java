package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira sua idade:");
        int idade = scanner.nextInt();
        
        System.out.println("Insira sua altura:");
        float altura = scanner.nextFloat();
        
        System.out.println("Insira seu peso:");
        float peso = scanner.nextFloat();
        
        if (35 >= idade && idade >= 18 && altura >= 1.65 && peso <= 100) {
            System.out.println("Você poderá testar o protótipo.");
        } else {
            System.out.println("Você não poderá testar o protótipo.");
        }
    }
}
