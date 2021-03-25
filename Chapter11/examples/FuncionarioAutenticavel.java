package Chapter11.examples;

public class FuncionarioAutenticavel extends  Funcionario{


    public boolean autentica(int senha) {
        //faz autenticação padrão
        return true;
    }
    @Override
    public double getBonificacao() {
        return 0;
    }
}
