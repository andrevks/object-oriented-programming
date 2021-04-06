
public class Pessoa {
	String nome;
	int cpf;
	
	//qualquer um pode chamar esse método
	public void falar() {
		System.out.println("Olá meu nome é " + this.nome + " e meu cpf é " + this.cpf);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	

}
