package Chapter9.exemplos;

public class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double getBonificacao(){
        return super.getBonificacao() + 1000;
    }
}
