package construcaodealgoritmo6;

import java.util.Scanner;

public class Exemplo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opt = 0;

        do {
            System.out.println("1 - Cadastrar\n2 - Sair");
            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Cadastrando...");
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opt != 2);
    }
}
