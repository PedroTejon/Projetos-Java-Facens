package aula2;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();
        
        System.out.println("Qual o seu endereco?");
        String end = scanner.nextLine();        
        
        System.out.println("Qual o seu numero de telefone?");
        String tel = scanner.nextLine();
        
        System.out.println("Qual a sua area de atuacao?");
        String job = scanner.nextLine();
        
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Endereco: %s\n", end);
        System.out.printf("Numero de telefone: %s\n", tel);
        System.out.printf("Area de atuacao: %s\n", job);
    }
}
