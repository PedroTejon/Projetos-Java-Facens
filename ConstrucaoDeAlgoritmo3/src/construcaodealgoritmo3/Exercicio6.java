package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um n�mero:");
        int num = scanner.nextInt();
        
        if (num > 0) {
            System.out.printf("%d � um n�mero positivo\n", num);
        } else if (num < 0) {
            System.out.printf("%d � um n�mero negativo\n", num);
        } else {
            System.out.printf("%d � zero\n", num);
        }
    }
}
