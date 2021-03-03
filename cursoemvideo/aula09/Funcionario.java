package cursoemvideo.aula09;

public class Funcionario extends Pessoa{
    //Atributos - O que o objeto terá
    private String setor;
    private boolean trabalhando;
    //Métodos - O que o objeto fará
    public void mudarTrabalhando(boolean estado){
        this.setTrabalhando(!this.trabalhando);
    }


    //Métodos Especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
