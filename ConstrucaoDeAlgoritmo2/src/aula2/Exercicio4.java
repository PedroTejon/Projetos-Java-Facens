package aula2;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de cavalos:");
        int qntd_cavalos = scanner.nextInt();
        
        System.out.printf("Voce vai precisar de %d ferraduras\n", qntd_cavalos);
    }
}
