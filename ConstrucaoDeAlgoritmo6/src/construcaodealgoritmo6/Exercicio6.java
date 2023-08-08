package construcaodealgoritmo6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("Digite um número:");
            int inp = scanner.nextInt();

            if (inp == 0) {
                break;
            } else if (inp < 0) {
                sum += inp;
            }
        }

        System.out.println(sum);
    }
}
