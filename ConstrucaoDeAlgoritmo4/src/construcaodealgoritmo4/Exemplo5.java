package construcaodealgoritmo4;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de vezes para repetir:");
        int qnt = scanner.nextInt();
        
        for (int i = 0; i < qnt; i++) {
            System.out.println("Digite um número:");
            int num = scanner.nextInt();
            if (num >= 10 && num <= 20) {
                System.out.println(i + ") Você digitou " + num);
            } else {
                System.out.println("Número inválido");
            }
        }
    }
}
