package construcaodealgoritmo3;

public class Exemplo5 {

    public static void main(String[] args) {
        int idade = 17;
        String nome = "Maria";

        if (idade >= 18) {
            System.out.println("Acesso aprovado");
        } else if (nome.equals("Maria")) {
            System.out.println("Acesso aprovado");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
