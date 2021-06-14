package funcionario;

public class Funcionario {

    private String nome;
    private Float salarioBase = 1000f;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalarioBase() {
        return salarioBase;
    }
    public Funcionario setSalarioBase(Float salarioBase) {
        this.salarioBase = salarioBase;
        return this;
    }
}
