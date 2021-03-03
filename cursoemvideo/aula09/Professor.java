package cursoemvideo.aula09;

public class Professor extends Pessoa{
    //Herança para diferença - herda e adiciona novos atributos e métodos
    //Atributos - O que o objeto terá
    private String especialidade;
    private float salario;

    //Métodos - O que o objeto fará
    public void receberAum(float aumento){
        float valorAcres = this.getSalario() * (float)(aumento/100);
        this.setSalario(this.getSalario() + valorAcres);
    }

    //Métodos Especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
