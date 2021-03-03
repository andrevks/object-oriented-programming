package cursoemvideo.aula09;

public class Pessoa {
    //Atributos - O que o objeto vai ter
    private String nome;
    private int idade;
    private String sexo;

    //Métodos - O que o objeto vai fazer
    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }
    //Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
