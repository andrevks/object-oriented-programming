package avaliacao.modeloConceitual;

import java.util.Date;

public class Assalariado extends Empregado implements ICeletista{
    /*
     * Significado de Assalariado
     * Aquele cuja remuneração mensal é o salário.
     *
     * Quem recebe mensalmente uma quantia mínima
     * estabelecida por lei que deve ser paga pelos serviços prestados.
     * */

    private float valorSalario;

    Assalariado(String nome, String cargo, String dep, String dAdmissão){
        setNome(nome);
        setCargo(cargo);
        setDepartamento(dep);
        setDataAdmissao(dAdmissão);
    }

    Assalariado(){

    }

    @Override
    public void informeRAIS() {
        System.out.println("--- RAIS - Relação Anual de Informações Sociais --- \n");
        System.out.println("Data de admissão: " + getDataAdmissao());
        System.out.println("__Dados do Assalariado__");
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("------------------------------------------------------");
    }

    public float getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(float valorSalario) {
        this.valorSalario = valorSalario;
    }


}
