/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercícios cap. 4.12. Orientação a objetos. 

	Construa duas contas com o new e compare-os com o "==".

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


	boolean depositaPara(Conta destino, double valor){
             boolean sacou = this.saca(valor);
	     if(sacou){
		destino.deposita(valor);
		return true;
	     }
	     return false;

	}
	
	String recuperaDadosParaImpressao(){
	     String dados = "Titular: " + this.titular;
	     dados += "\nNumero: " + this.numero;
	     dados += "\nAgencia: " + this.agencia;
	     dados += "\nSaldo: " + this.saldo;
	     dados += "\nData de Abertura: " + dataAbertura;
	     dados += "\nRendimento mensal: " + this.calculaRendimento();
	
	     return dados;
	}
}


class Exercicio4 {
     public static void main(String[] args){
	 	Conta c1 = new Conta();
		c1.titular = "George Washington";
		c1.numero = 1789;
		c1.agencia = "1797-9";
		c1.dataAbertura = "08-12-2020";
		c1.saldo = 200000;


		Conta c2 = new Conta();
		c2.titular = "George Washington";
		c2.numero = 1789;
		c2.agencia = "1797-9";
		c2.dataAbertura = "08-12-2020";
		c2.saldo = 200000;

		boolean iguais = c1 == c2;
		if(iguais){
		  System.out.println("Sao Iguais");
		}else {
		  System.out.println("Sao diferentes");

	         }



     }
}

