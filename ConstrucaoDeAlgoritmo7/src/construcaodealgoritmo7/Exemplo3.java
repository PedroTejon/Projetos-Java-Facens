package construcaodealgoritmo7;

public class Exemplo3 {
    public static void main(String[] args) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        
        int[] diaMes = {31, 28, 31, 30, 10, 4, 5, 6, 7, 8 ,9, 10};
        
        for (int i = 0; i < meses.length; i++) {
            System.out.printf("O mes %s tem %d dias\n   ", meses[i], diaMes[i]);
        }
        
    }
}
