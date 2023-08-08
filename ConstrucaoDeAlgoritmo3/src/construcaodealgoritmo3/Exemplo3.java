package construcaodealgoritmo3;

import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        float num1 = scanner.nextFloat();
        
        System.out.println("Digite outro número: ");
        float num2 = scanner.nextFloat();
        
        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, num1 * num2);
    }    
}
