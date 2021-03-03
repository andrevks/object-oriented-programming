package cursoemvideo.aula11;

public abstract class Animal {
    //Uma classe abstrata não pode ser instânciada
    //Ter uma classe abstrata permite a implementação
    // de métodos abstratos :D

    //Atributos - o que o objeto teria se fosse instânciado
    protected float peso;
    protected int idade;
    protected int qtdMembros;

    //Métodos - o que o objeto faria se fosse instânciado
    //Métodos abstratos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    //Métodos acessores

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQtdMembros() {
        return qtdMembros;
    }

    public void setQtdMembros(int qtdMembros) {
        this.qtdMembros = qtdMembros;
    }
}
