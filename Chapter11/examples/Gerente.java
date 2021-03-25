package Chapter11.examples;

public class Gerente extends FuncionarioAutenticavel {
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
        return  1000;
    }

    public boolean autentica(int senha){
        //Verifica aqui se a senha confere com a recebida como parâmetro
        //no caso do gerente verifica também se o seu departamento
        //tem acesso
        return true;
    }
}
