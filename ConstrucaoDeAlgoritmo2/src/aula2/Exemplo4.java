package aula2;
import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual a sua idade?");
        
        int idade = scanner.nextInt();
        System.out.println("Sua idade é " + idade);
    }
}
