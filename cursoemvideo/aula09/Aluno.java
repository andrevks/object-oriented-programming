package cursoemvideo.aula09;

public class Aluno extends Pessoa {
    //Atributos - O que o objeto vai ter
    private int matr;
    private String curso;
    //Métodos - O que o o objeto vai fazer
    public void cancelarMatr(){
        this.setMatr(0);
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
