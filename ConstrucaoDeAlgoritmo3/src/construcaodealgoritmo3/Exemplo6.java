package construcaodealgoritmo3;

import java.util.Scanner;

public class Exemplo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Você está de folga?");
        boolean folga = scanner.nextBoolean();
        
        System.out.println("Tem sol?");
        boolean temSol = scanner.nextBoolean();
        
        if (temSol && folga) {
            System.out.println("Irei passear hoje");
        } else {
            System.out.println("Nao irei passear hoje");
        }
    }
}
