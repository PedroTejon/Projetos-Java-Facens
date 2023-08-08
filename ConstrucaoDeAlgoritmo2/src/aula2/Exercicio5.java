package aula2;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto:");
        float valor_produto = scanner.nextFloat();
        
        System.out.println("Digite a porcentagem do desconto:");
        float desconto = valor_produto * (scanner.nextFloat() / 100);
        
        float valor_descontado =  valor_produto - desconto;
        
        System.out.printf("O valor do produto apos o desconto de R$%.2f sera R$%.2f\n", desconto,valor_descontado);
    }
}
