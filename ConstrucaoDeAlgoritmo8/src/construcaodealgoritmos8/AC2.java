// Feito por Ana Giulia Moreira de Lima, Lauren Giulia Marcondes Barbosa e Ana Giulia Moreira de Lima

package construcaodealgoritmos8;

import java.util.Scanner;

public class AC2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Jogo da velha");
        System.out.println("Escolha sua letra, jogador 1(X, O): ");
        
        // Escolha de letraJ1
        String letraJ1 = scanner.next();
        String letraJ2;
        switch (letraJ1) {
            case "X":
                System.out.println("Você escolheu o X, seu oponente será O");
                letraJ2 = "O";
                break;
            case "O":
                System.out.println("Você escolheu o O, seu oponente será X");
                letraJ2 = "X";
                break;
            default:
                System.out.println("Escolha inválida, definindo letra do jogador 1 como X");
                letraJ1 = "X";
                letraJ2 = "O";
                break;
        }
        
        boolean ganhou = false;
        boolean jogador1 = true;
        int countJogadas = 0;
        String[] tab1 = {" ", " ", " "};
        String[] tab2 = {" ", " ", " "};
        String[] tab3 = {" ", " ", " "};
        while(!ganhou) {
            System.out.println("    0   1   2");
            
            // Mostra linha 1
            System.out.print("0 | ");
            for (int i = 0; i < tab1.length; i++) {
                System.out.print(tab1[i] + " | " ); 
            }
            System.out.println("");
            
            // Mostra linha 2
            System.out.print("1 | ");
            for (int i = 0; i < tab1.length; i++) {
                System.out.print(tab2[i] + " | " );
            }
            System.out.println("");
            
            // Mostra linha 3
            System.out.print("2 | ");
            for (int i = 0; i < tab1.length; i++) {
                System.out.print(tab3[i] + " | " );
            }
            System.out.println("");
            
            System.out.printf("Jogador %s joga (fileira, coluna):\n", jogador1 ? letraJ1 : letraJ2);
            countJogadas++;
            // Entrada de jogador
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            // Alteração no tabuleiro nas coordenadas
            if (y == 0 && tab1[x].equals(" ")) {
                tab1[x] = jogador1 ? letraJ1 : letraJ2;
            }
            else if (y == 1 && tab2[x].equals(" ")) {
                tab2[x] = jogador1 ? letraJ1 : letraJ2;
            }
            else if (y == 2 && tab3[x].equals(" ")) {
                tab3[x] = jogador1 ? letraJ1 : letraJ2;
            } else{
                System.out.println("Entrada inválida!! Perdeu a vez");
            }
            
            // Verificação se alguem venceu
            String[] letras = {"X", "O"};
            for (int i = 0; i < letras.length; i++) {
                boolean tab1h = tab1[0].equals(tab1[1]) && tab1[1].equals(tab1[2]) && tab1[0].equals(letras[i]);
                boolean tab2h = tab2[0].equals(tab2[1]) && tab2[1].equals(tab2[2]) && tab2[0].equals(letras[i]);
                boolean tab3h = tab3[0].equals(tab3[1]) && tab3[1].equals(tab3[2]) && tab3[0].equals(letras[i]);

                // Verifica se uma linha horizontal está completa
                if (tab1h || tab2h || tab3h)
                {
                    System.out.println("O jogador com a letra " + letras[i] + " ganhou!");
                    ganhou = true;
                }
                
                boolean tab1d = tab1[0].equals(tab2[1]) && tab2[1].equals(tab3[2]) && tab1[0].equals(letras[i]);
                boolean tab2d = tab3[0].equals(tab2[1]) && tab2[1].equals(tab1[2]) && tab3[0].equals(letras[i]);

                // Verifica se uma linha diagonal está completa
                if (tab1d || tab2d)
                {
                    System.out.println("O jogador com a letra " + letras[i] + " ganhou!");
                    ganhou = true;
                    System.out.println(tab1d);
                    System.out.println(tab2d);
                }
                
                boolean tab1v = tab1[0].equals(tab2[0]) && tab2[0].equals(tab3[0]) && tab1[0].equals(letras[i]);
                boolean tab2v = tab1[1].equals(tab2[1]) && tab2[1].equals(tab3[1]) && tab1[1].equals(letras[i]);
                boolean tab3v = tab1[2].equals(tab2[2]) && tab2[2].equals(tab3[2]) && tab1[2].equals(letras[i]);
                
                // Verifica se uma linha vertical está completa
                if (tab1v || tab2v || tab3v)
                {
                    System.out.println("O jogador com a letra " + letras[i] + " ganhou!");
                    ganhou = true;
                }
            }
            
            if (countJogadas == 9 && !ganhou) {
                System.out.println("Velha! Ninguém ganhou!");
                ganhou = true;
            }
            
            jogador1 = !jogador1;
        }
    }
    
}
