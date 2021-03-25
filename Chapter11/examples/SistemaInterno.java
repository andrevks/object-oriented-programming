package Chapter11.examples;

public class SistemaInterno {


    //Precisa-se receber um Diretor ou Gerente
    public void login(FuncionarioAutenticavel fa){
        int senha = 123;//pega senha de um lugar
        //Pode-se se chamer atentica !
        //Pois todo FuncionarioAtuenticavel tem
        boolean ok = fa.autentica(senha);
    }


    //Precisa-se receber um Diretor ou Gerente
    //public void login(FuncionarioAutenticavel fa){
    //Invoncar o método autentica ?
    //não dá ! nem todo funcionário tem
    //funcionario.autentica(...); // NÃO COMPILA
    //}
}
