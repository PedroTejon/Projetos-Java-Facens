package construcaodealgoritmo7;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int sum = 0;
        int qntd = 0;
        int opt = 1;
        int maior = 0; 
        do {
            System.out.println("Digite um número:");
            int num = scanner.nextInt();
            
            qntd++;
            sum += num;
            if (num > maior)
                maior = num;
            
            System.out.println("Deseja continuar inserindo? (1 para continuar)");
            opt = scanner.nextInt();
        } while (opt == 1);
        
        System.out.printf("O maior número foi %d\n", maior);
        System.out.printf("A média aritmética dos números é %.2f\n", (float)sum / (float)qntd);
    }
}
