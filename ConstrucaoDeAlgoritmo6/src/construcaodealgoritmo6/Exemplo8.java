package construcaodealgoritmo6;

import java.util.Scanner;

public class Exemplo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();
        
        boolean podeEntrar = senha.equals("123") ? true : false;
        
        System.out.println(podeEntrar);
    }
}
