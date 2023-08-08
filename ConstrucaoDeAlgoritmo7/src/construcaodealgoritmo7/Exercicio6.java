package construcaodealgoritmo7;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float[] medias = new float[3];
        for (int aluno = 0; aluno < medias.length; aluno++) {
            float sum = 0;
            for (int i = 0; i < 4; i++) {
                System.out.printf("Insira a %dª do aluno %d\n", i + 1, aluno + 1);
                sum += scanner.nextFloat();
            }
            medias[aluno] = sum / 4.0f;
        }
        
        for (int i = 0; i < medias.length; i++ ) {
            if (medias[i] >= 7) {
                System.out.printf("Aluno %d, com nota %.2f\n", i + 1, medias[i]);
            }
        }
    }
}
