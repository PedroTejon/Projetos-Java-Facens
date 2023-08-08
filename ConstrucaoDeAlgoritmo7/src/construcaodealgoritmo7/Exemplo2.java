package construcaodealgoritmo7;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            String nome = scanner.next();
            nomes[i] = nome;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("No indice %d, temos o nome %s\n", i, nomes[i]);
        }

        int[] idades = new int[50];
        idades[0] = 11;
        idades[49] = 84;

        int[] valores = {11, 85, 18, 14, 24};

        System.out.println(valores[3]);
        valores[3] = 100;
        System.out.println(valores[3]);

        String[] eventos = {"Teatro", "Cinema", "Show", "Yoga"};

        for (int i = 0; i < eventos.length; i++) {
            System.out.println((i + 1) + " - " + eventos[i]);
        }*/
        
        String[] cidades = new String[5];

        for (int i = 0; i < cidades.length; i++) {
            System.out.printf("Digite o nome da %dª cidade:\n", i + 1);
            cidades[i] = scanner.next();
        }

        for (int i = 0; i < cidades.length; i++) {
            System.out.printf("A %dª foi %s\n", i + 1, cidades[i]);
        }
    }
}
