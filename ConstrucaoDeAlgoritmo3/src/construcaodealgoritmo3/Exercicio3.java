package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a base do ret�ngulo:");
        int base = scanner.nextInt();
        
        System.out.println("Digite a altura do ret�ngulo:");
        int altura = scanner.nextInt();
        
        System.out.printf("A �rea do ret�ngulo � %d\n", base * altura);
    }
}
