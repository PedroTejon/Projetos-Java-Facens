package construcaodealgoritmo3;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome de usuário:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();
        
        if (senha.equals("123")) {
            System.out.printf("Acesso permitido a %s\n", nome);
        } else {
            System.out.println("Acesso negado");
        }
    }
}
