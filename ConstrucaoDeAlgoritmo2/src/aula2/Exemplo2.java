package aula2;

public class Exemplo2 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        
        int soma = num1 + num2;
        System.out.println("Soma = " + soma);
        
        int subtracao = num1 - num2;
        System.out.println("Subtracao = " + subtracao);
        
        int mult = num1 * num2;
        System.out.println("Multiplicacao = " + mult);
        
        int div = num1 / num2;
        System.out.println("Divisao = " + div);
        
        int resto = num1 % num2;
        System.out.println("Resto = " + resto);
        
        num1++;
        System.out.println("Num1 = " + num1);
        
        num2--;
        System.out.println("Num2 = " + num2);
    }
}
