package construcaodealgoritmo4;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Digite sua idade:");
            sum += scanner.nextInt();
        }
        
        System.out.println("A média das idades é " + sum / 20);
    }
}
