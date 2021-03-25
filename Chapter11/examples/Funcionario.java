package Chapter11.examples;

public abstract class Funcionario {

    protected String nome;
    protected String cpf;
    protected double salario;

    //Qualquer classe que estender Funcionario
    //
    public abstract double getBonificacao();
    //Métodos acessores

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
