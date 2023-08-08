package construcaodealgoritmo6;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int code = -1;
        while (true) {
            System.out.println("Digite o código de aluno:");
            code = scanner.nextInt();

            if (code == 0) {
                break;
            }
            
            float sum = 0;
            for (int i = 1; i <= 3; i++) {
                System.out.printf("Digite a %d nota:\n", i);
                sum += scanner.nextFloat();
            }

            System.out.printf("A média do aluno %d é igual a %f\n", code, sum / 3.0);
        }
    }
}
