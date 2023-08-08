package construcaodealgoritmo6;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opt = 0;

        while (opt != 2) {
            System.out.println("1 - Cadastrar, 2 - Sair");
            opt = scanner.nextInt();
            
            switch(opt) {
                case 1:
                    System.out.println("Cadastrando...");
                    break;
            }
        }
    }
}
