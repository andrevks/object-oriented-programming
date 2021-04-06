
public class TestDrivePessoa {
	
	public static void main(String[] args) {
	
			Pessoa pessoa1 = new Pessoa();
			Pessoa pessoa2 = new Pessoa();
			pessoa1.nome = "lucas";
			pessoa1.cpf = 12313213;
			
			
			pessoa2.cpf = 88899;
			pessoa2.nome = "Darth";
			
			String x = pessoa1.getNome();
			System.out.println(x);
			
			pessoa1.setNome("John");
			pessoa1.falar();
			
	}
}
