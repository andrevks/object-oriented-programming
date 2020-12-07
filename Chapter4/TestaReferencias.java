/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exemplo capítulo 4.7

*/
class Conta {
	int numero;
	double saldo;
	double limite;
	String nome;


	boolean saca(double valor) {
		if(this.saldo < valor){
		   return false;
		}else{
		   this.saldo -= valor;
		   return true;
		}

	}

	void deposita(double valor){
		if(valor > 0) {
		   this.saldo += valor;		
	           System.out.println("Saldo: R$ " + this.saldo);
		}

	}
	
	boolean transferePara(Conta destino, double valor){
		boolean sacou = this.saca(valor);

		if(sacou){
	           destino.deposita(valor);	
		   return true;
		}

		  return false;
	
	}


}
class TestaReferencias {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.deposita(100);

		Conta c2 = c1;//Linha importante. Referenciado ao mesmo objeto
		
		c2.deposita(200);
		
		System.out.println("---------");
	
		System.out.println(c1 == c2);


		Conta c3 = new Conta();
		c3.nome = "Duke";
		c3.saldo = 227;


		Conta c4 = new Conta();
		c4.nome = "Duke";
		c4.saldo = 227;

		if(c3 == c4) {
		   //Em c3 e c4 se encontra o endereço do objeto
		   //Quando se trata de referência de objeto, o "==" compara
	           //se as referências são os mesmos, e não se são iguais	
		   System.out.println("Contas Iguais");
		}

		c3.transferePara(c4,27);
		System.out.println(c3.saldo);
		System.out.println(c4.saldo);
		
		

	}
}