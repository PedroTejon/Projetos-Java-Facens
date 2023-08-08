package construcaodealgoritmo9;
import java.util.Scanner;

public class Aquecimento1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[10];
        int currInd = 0;
        int sum = 0;
        while (vetor[9] == 0) {
            System.out.println("Insira um número: ");
            int num = scanner.nextInt();
            if (num > 0) {
                vetor[currInd] = num;
                
                if (currInd % 2 == 1)
                    sum += num;
                
                currInd++;
            }
        }
        
        System.out.println(sum);
    }
}
