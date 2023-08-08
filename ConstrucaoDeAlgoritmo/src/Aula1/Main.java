package Aula1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static String repeat(String string, int qntd) {
        String fullString = "";

        for (int i = 0; i < qntd; i++) {
            fullString += string;
        }

        return fullString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = scanner.nextInt();

        for (int i = 0; i < tamanho; i++) {
            System.out.print(repeat(" ", tamanho - i));
            System.out.print(repeat("*", i + 1));
            System.out.println(repeat("*", i));
        }
        for (int i = tamanho - 2; i >= 0; i--) {
            System.out.print(repeat(" ", tamanho - i));
            System.out.print(repeat("*", i + 1));
            System.out.println(repeat("*", i));
        }
    }
}
