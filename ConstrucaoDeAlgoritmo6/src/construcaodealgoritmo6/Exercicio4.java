package construcaodealgoritmo6;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float sum = 0;
        float qntd = 0;
        while (true) {
            System.out.println("Digite um número:");
            int inp = scanner.nextInt();
            
            if (inp == 0) {
                break;
            } else if (inp % 2 == 0) {
                sum += inp;
                qntd++;
            }
        }
        
        System.out.printf("A média dos %f números é %f\n", qntd, sum / qntd);
        
    }
}
