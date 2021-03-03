package cursoemvideo.aula10;

public class Aluno extends Pessoa {
    //Herança para diferença - Herda e adiciona novos atributos e métodos
    //Atributos - O que o objeto vai ter
    private int matr;
    private String curso;
    //Métodos - O que o objeto vai fazer
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }
    //Métodos Especiais

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
