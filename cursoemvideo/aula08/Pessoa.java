package cursoemvideo.aula08;

public class Pessoa {
    //Atributos - O que ele tem
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String no, int id, String sexo){
        this.setNome(no);
        this.setIdade(id);
        this.setSexo(sexo);
    }

    //Métodos - O que ele faz
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }




}
