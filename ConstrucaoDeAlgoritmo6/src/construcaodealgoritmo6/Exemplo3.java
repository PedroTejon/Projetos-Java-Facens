package construcaodealgoritmo6;

import java.util.Scanner;

public class Exemplo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cmd = "";

        while (!cmd.equals("sair")) {
            System.out.println("1 - Cadastrar\n2 - Editar\n3 - Apagar\n4 - Sair");
            cmd = scanner.nextLine().toLowerCase();

            switch (cmd) {
                case "1":
                case "cadastrar":
                    System.out.println("Cadastrando...");
                    break;
                case "2":
                case "editar":
                    System.out.println("Editando...");
                    break;
                case "3":
                case "apagar":
                    System.out.println("Apagando...");
                    break;
                case "4":
                case "sair":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Comando não reconhecido");
                    break;
            }
        }
    }
}
