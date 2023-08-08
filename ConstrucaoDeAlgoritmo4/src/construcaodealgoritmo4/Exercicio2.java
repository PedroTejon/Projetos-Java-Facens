package construcaodealgoritmo4;

public class Exercicio2 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 15; i++) {
            System.out.printf("%d + %d = %d\n", sum, i, sum + i);
            sum += i;
        }

        System.out.println(sum);
    }
}
