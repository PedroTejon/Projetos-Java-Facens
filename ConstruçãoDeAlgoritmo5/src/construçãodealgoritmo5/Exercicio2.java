package construçãodealgoritmo5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o código do produto comprado:");
        int cod = scanner.nextInt();
        
        System.out.println("Digite a quantidade de produtos comprados:");
        int qntd = scanner.nextInt();
        
        switch (cod) {
            case 100:
                System.out.println(1.70 * qntd);
                break;
            case 101:
                System.out.println(2.30 * qntd);
                break;
            case 102:
                System.out.println(2.60 * qntd);
                break;
            case 103:
                System.out.println(2.40 * qntd);
                break;
            case 104:
                System.out.println(2.50 * qntd);
                break;
            case 105:
                System.out.println(1 * qntd);
                break;
        }
        
        
    }
}
