
public class Pessoa {
	String nome;
	int cpf;
	
	//qualquer um pode chamar esse m�todo
	public void falar() {
		System.out.println("Ol� meu nome � " + this.nome + " e meu cpf � " + this.cpf);
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
