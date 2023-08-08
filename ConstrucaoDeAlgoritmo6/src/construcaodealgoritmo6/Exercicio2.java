package construcaodealgoritmo6;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, nulo = 0, branco = 0;
        
        int inp;
        do {
            System.out.println("Digite o seu voto:");
            inp = scanner.nextInt();
            switch (inp) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    nulo++;
                    break;
                case 6:
                    branco++;
                    break;
            }
        } while (inp != 0);
        
        System.out.println("Qntd. Candidato 1: " + c1);
        System.out.println("Qntd. Candidato 2: " + c2);
        System.out.println("Qntd. Candidato 3: " + c3);
        System.out.println("Qntd. Candidato 4: " + c4);
        System.out.println("Qntd. Nulo: " + nulo);
        System.out.println("Qntd. Branco: " + branco);
    }
}
