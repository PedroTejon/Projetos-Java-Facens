package programacaoorientadaaobjetos5;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String cpf, String email, String celular) {
        super(email, celular);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return "CPF: " + cpf +
                "\nNome: " + nome + "\n" +
                super.toString();
    }
    
    @Override
    public String imprimir() {
        return "CPF: " + cpf +
                "\nNome: " + nome + "\n" +
                super.imprimir();
    }
}
