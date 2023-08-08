package construcaodealgoritmo6;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumIdade = 0;
        int qntd90p = 0;
        
        int qntd = 1;
        do {
            System.out.println("Digite sua idade:");
            sumIdade += scanner.nextInt();
            
            System.out.println("Digite seu peso:");
            float peso = scanner.nextFloat();
            
            if (peso > 90) {
                qntd90p++;
            }
            
            qntd++;
        } while (qntd <= 7);
                
        System.out.println("Quantidade de pesosas com mais de 90 quilos:" + qntd90p);
        System.out.println("Média de idade:" + sumIdade / 7);
    }
}
