package construcaodealgoritmo4;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número cuja tabuada você deseja:");
        int num = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, i * num);
        }
    }
}
