package programacaoorientadaaobjetos2;

import java.util.UUID;

public class Curso {
    private String nome;
    private int duracao;
    private UUID codigo;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public int getDuracao() {
        return this.duracao;
    }
    
    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }
    
    public UUID getCodigo() {
        return this.codigo;
    }
    
    public String imprimir() {
        return "Nome: %s\nDuração: %d\nCódigo: %s".formatted(this.nome, this.duracao, this.codigo);
    }
}
