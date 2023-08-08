package construcaodealgoritmo6;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int sumIdadeM = 0;
        int sumIdadeF = 0;
        float sumAlturaF = 0;
        int qntdM = 0;
        int qntdF = 0;
        int qntdIdade1835 = 0;
        
        int qntd = 1;
        do {
            System.out.println("Digite seu sexo (0 - feminino, 1 - masculino)");
            int sexo = scanner.nextInt();
            
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            
            if (idade >= 18 && idade <= 35) {
                qntdIdade1835++;
            }
            
            System.out.println("Digite sua altura(m): ");
            float altura = scanner.nextInt();
            
            if (sexo == 0) {
                qntdF++;
                sumIdadeF += idade;
                sumAlturaF += altura;
            } else {
                qntdM++;
                sumIdadeM += idade;
            }
            
            qntd++;
        } while (qntd <= 1000);
        
        System.out.println("Média de idade do grupo: " + (sumIdadeM + sumIdadeF) / qntd);
        System.out.println("Média de altura das mulheres: " + sumAlturaF / qntdF);
        System.out.println("Média da idade dos homens: " + sumIdadeM / qntdM);
        System.out.println("Percentual de pessoas com idade entre 18 e 35: " + qntdIdade1835 / qntd * 100 + "%");
    }
}
