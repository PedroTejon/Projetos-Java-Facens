package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura atual:");
        int temp = scanner.nextInt();
        
        if (temp <= 15) {
            System.out.println("Frio");
        } else if (temp <= 30) {
            System.out.println("Morno");
        } else {
            System.out.println("Quente");
        }
    }
}
