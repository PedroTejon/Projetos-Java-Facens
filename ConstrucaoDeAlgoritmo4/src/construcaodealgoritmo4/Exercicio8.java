package construcaodealgoritmo4;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int idade = scanner.nextInt();
            if (idade >= 18) {
                count++;
            }
        }
        
        System.out.println("A quantidade de maiores de idade é " + count);
    }
}
