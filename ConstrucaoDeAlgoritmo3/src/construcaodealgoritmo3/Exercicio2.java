package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um valor:");
        int num = scanner.nextInt();
        
        System.out.printf("O triplo de %d é %d\n", num, num * 3);
    }
}
