package programacaoorientadaaobjetos5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        int opc = 0;
        String nomeRazao, cpfCnpj, email, celular;
        
        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro\n2 - Mostrar todos\n3 - Sair"));
            
            switch (opc) {
                case 1:
                    opc = Integer.parseInt(JOptionPane.showInputDialog("Tipo:\n1 - Física\n2 - Juridica"));
                    if (opc == 1) {
                        nomeRazao = JOptionPane.showInputDialog("Nome: ");
                        cpfCnpj = JOptionPane.showInputDialog("CPF: ");
                        email = JOptionPane.showInputDialog("E-mail: ");
                        celular = JOptionPane.showInputDialog("Celular: ");
                                
                        listaPessoa.add(new PessoaFisica(nomeRazao, cpfCnpj, email, celular));
                    } else {
                        nomeRazao = JOptionPane.showInputDialog("Razão Social: ");
                        cpfCnpj = JOptionPane.showInputDialog("CNPJ: ");
                        email = JOptionPane.showInputDialog("E-mail: ");
                        celular = JOptionPane.showInputDialog("Celular: ");
                                
                        listaPessoa.add(new PessoaJuridica(nomeRazao, cpfCnpj, email, celular));
                    }
                    
                    break;
                case 2:
                    String msg = "";
                    for (Pessoa p : listaPessoa) {
                        msg += p + "\n------\n";
                    }
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showInputDialog(null, "Opção Inválida");
            }
        }
    }
}
