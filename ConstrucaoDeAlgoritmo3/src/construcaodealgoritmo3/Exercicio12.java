package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o valor total dos produtos da compra:");
        float valor = scanner.nextFloat();
        
        System.out.println("Insira a forma de pagamento (credito, debito ou dinheiro):");
        String forma = scanner.next();
        
        if (forma.equals("credito")) {
            System.out.printf("O valor total após o acréscimo será %.2f\n", valor * 1.1);
        } else if (forma.equals("debito")) {
            System.out.printf("O valor total será %.2f\n", valor);
        } else if (forma.equals("dinheiro")) {
            System.out.printf("O valor total após o acréscimo será %.2f\n", valor * 0.95);
        }
    }
}
