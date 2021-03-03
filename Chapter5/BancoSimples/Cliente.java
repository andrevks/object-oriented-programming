public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    Cliente(String cpf){
        System.out.println("Construindo um objeto Cliente");
        this.mudaCpf(cpf);
    }
    public String getCpf(){
        return this.cpf;
    }
    public void mudaCpf(String cpf){
        if(this.idade <= 60) this.validaCpf(cpf);
        this.cpf = cpf;
    }
    private void validaCpf(String cpf){
        System.out.println("CPF válido !");
    }


}
