package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();
        
        int temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;
        } 
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
         
        System.out.printf("%d %d %d\n", num1,num2,num3);
    }
}
