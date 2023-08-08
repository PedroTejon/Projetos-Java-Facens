package construçãodealgoritmo5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite outro número:");
        int num2 = scanner.nextInt();
        
        System.out.println("Digite 1 para soma, 2 para subtração, 3 para multiplicação ou 4 para divisão");
        int op = scanner.nextInt();
        
        switch (op)  {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}
