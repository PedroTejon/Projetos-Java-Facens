package programacaoorientadaaobjetos2;

public class Pessoa {
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public char getSexo() {
        return this.sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String imprimir(){
        return "Nome: %s\nCPF: %s\nSexo: %c\nIdade: %d".formatted(this.nome, this.cpf, this.sexo, this.idade);
    }
}
