package programacaoorientadaaobjetos2;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qntHora;
    private float salario;
    private float valorDesconto;

    
    public int getCracha() {
        return cracha;
    }
    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }
    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQntHora() {
        return qntHora;
    }
    public void setQntHora(float qntHora) {
        this.qntHora = qntHora;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }
    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public float calcularValorSalario(){
        return tipoVinculo == 'H' ? valorHora * qntHora - valorDesconto: salario - valorDesconto;
    }
    
    public String imprimir(){
        return "Crachá: %d\nNome: %s\nTipo Vínculo: %c\nSalário: %.2f\nDesconto: %.2f\nValor a receber: %.2f".formatted(cracha, nome, tipoVinculo, tipoVinculo == 'H' ? valorHora * qntHora: salario, valorDesconto, calcularValorSalario());
    }
}
