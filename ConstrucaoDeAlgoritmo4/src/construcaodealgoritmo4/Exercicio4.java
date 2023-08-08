package construcaodealgoritmo4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite a quantidade de vezes que você deseja repetir seu nome:");
        int qntd = scanner.nextInt();

        for (int i = 0; i < qntd; i++) {
            System.out.printf("%d - %s", i, nome);
        }
    }
}
