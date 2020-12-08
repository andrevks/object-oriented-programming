/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercícios cap. 4.12. Orientação a objetos. Transforme o modelo de uma conta do
	Exercicio1.java em uma classe Java.

*/

class Conta {
	//Coisas importantes que ela tem
	String titular;
	int numero;
	String agencia;
	double saldo;
	String dataAbertura;

	//Coisas importantes que ela faz
	boolean saca(double valor){
	     if(this.saldo >= valor) {
	        this.saldo -= valor;
		return true;
	     }
	
	     return false;
	}
	
	void deposita(double valor){
	     if(valor > 0){
		this.saldo += valor;
		System.out.println("Dinheiro depositado com sucesso");
	     }

	}
	
	double calculaRendimento(){
	     return this.saldo * 0.1;
	}


	void infoConta(){
	     System.out.println("---------INFO DA CONTA---------");
	     System.out.format("Titular: %s do numero: %d e agencia: %s, possui: R$ %.2f ", this.titular, this.numero, this.agencia, this.saldo);


	}

	boolean depositaPara(Conta destino, double valor){
             boolean sacou = this.saca(valor);
	     if(sacou){
		destino.deposita(valor);
		return true;
	     }
	     return false;

	}
}


class Exercicio2 {
     public static void main(String[] args){
	 	Conta c1 = new Conta();
		c1.titular = "LUCAS PEREIRA";
		c1.numero = 123213;
		c1.agencia = "4343-9";
		c1.dataAbertura = "08-12-2020";
		
		c1.deposita(2000);
		boolean sacou = c1.saca(20);
		if(sacou){
		   System.out.println("Sacado com sucesso");
		   System.out.println("Saldo atual: " + c1.saldo);
		}
		

		System.out.println("Redimento mensal da conta : " + c1.calculaRendimento());
		c1.infoConta();

		Conta c2 = new Conta();
		c2.titular = "JOAO OLIVEIRA";
		c2.numero = 1141;
		c2.agencia = "8785-9";
		c2.dataAbertura = "08-12-2020";
		c2.saldo = 100;

		c1.depositaPara(c2,500);
		System.out.println("\n");
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
     }
}

