package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da var x:");
        int x = scanner.nextInt();
        
        System.out.println("Digite o valor da var y:");
        int y = scanner.nextInt();
        
        int temp = x;
        x = y;
        y = temp;
        
        System.out.printf("Var X que era %d virou %d e Var Y que era %d virou %d\n", temp, x, x, y);
    }
}
