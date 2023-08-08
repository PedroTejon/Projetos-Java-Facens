package construcaodealgoritmo6;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumO = 0;
        int sumN = 0;
        int qntd = 0;
        while (true) {
            System.out.println("Digite o código do produto:");
            int code = scanner.nextInt();
            
            if (code < 0)
                break;
            
            System.out.println("Digite o preço do produto:");
            float price = scanner.nextFloat();
            
            sumO += price;
            sumN += price * 1.2;
            qntd++;
            
            System.out.printf("O produto %d terá o novo preço de %f\n", code, price * 1.2);
        }
        
        System.out.println("A média do preço dos produtos com o preço original é " + sumO / qntd);
        System.out.println("A média do preço dos produtos com o preço novo é " + sumN / qntd);
    }
}
