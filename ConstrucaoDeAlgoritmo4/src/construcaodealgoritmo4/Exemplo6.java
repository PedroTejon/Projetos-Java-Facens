package construcaodealgoritmo4;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de vezes para repetir:");
        int qnt = scanner.nextInt();
        
        int count = 0;
        for (int i = 0; i < qnt; i++) {
            System.out.println("Digite um número:");
            int num = scanner.nextInt();
            if (num >= 10 && num <= 20) {
                count++;
                System.out.println(i + ") Você digitou " + num);
            } else {
                System.out.println("Número inválido");
            }
        }
        
        System.out.printf("%d dos %d números informados estavam entre 10 e 20\n", count, qnt);
    }
}
