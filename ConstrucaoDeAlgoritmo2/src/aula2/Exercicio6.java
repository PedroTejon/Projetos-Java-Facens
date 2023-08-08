package aula2;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de pontos do líder do campeonato brasileiro:");
        int pontuacao_br = scanner.nextInt();
        
        System.out.println("Insira a quantidade de pontos do time lanterna:");
        int pontuacao_lanterna = scanner.nextInt();
        
        int vitorias = (pontuacao_br - pontuacao_lanterna) / 3;
        
        System.out.printf("O numero de vitorias necessarias para o time lanterna alcancar/ultrapassar o lider sera %d\n", vitorias);
    }
}
