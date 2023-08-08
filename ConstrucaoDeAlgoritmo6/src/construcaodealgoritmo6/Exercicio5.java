package construcaodealgoritmo6;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        while (true) {
            System.out.println("Digite um número: ");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            if (num <= 25) {
                c1++;
            } else if (num <= 50) {
                c2++;
            } else if (num <= 75) {
                c3++;
            } else if (num <= 100) {
                c4++;
            }
        }

        System.out.printf("%d entre 0-25, %d entre 26-50, %d entre 51-75, %d entre 76-100\n", c1, c2, c3, c4);
    }
}
