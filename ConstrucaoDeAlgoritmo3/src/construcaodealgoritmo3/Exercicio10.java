package construcaodealgoritmo3;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota do aluno:");
        int nota = scanner.nextInt();
        
        if (nota < 5) {
            System.out.println("Reprovado");
        } else if (nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }
    }
}
