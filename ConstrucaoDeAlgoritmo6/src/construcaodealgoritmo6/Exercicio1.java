package construcaodealgoritmo6;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        float qntd = 0;
        while (sum >= 0) {
            System.out.println("Digite um número:");
            float inp = scanner.nextFloat();
            if (inp >= 0) {
                sum += inp;
                qntd++;
            }
            else {
                break;
            }
        }
        
        System.out.println("A média é igual a " + sum / qntd);
    }
}
