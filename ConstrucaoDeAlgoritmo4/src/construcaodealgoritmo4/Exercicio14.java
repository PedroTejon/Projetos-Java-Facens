package construcaodealgoritmo4;

public class Exercicio14 {

    public static void main(String[] args) {
        System.out.println("0");
        long ant = 0;
        long ant2 = 1;
        for (int i = 0; i < 99; i++) {
            long temp = ant;
            ant = ant + ant2;;
            ant2 = temp;
            System.out.printf("%d\n", ant);
        }
    }
}
