/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercícios cap. 4.12. Orientação a objetos. 

	Crie um método recuperaDadosParaImpressao() , que não recebe parâmetro mas devolve o texto
	com todas as informações da nossa conta para efetuarmos a impressão.

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


class Exercicio3 {
     public static void main(String[] args){
	 	Conta c1 = new Conta();
		c1.titular = "LUCAS PEREIRA";
		c1.numero = 123213;
		c1.agencia = "4343-9";
		c1.dataAbertura = "08-12-2020";
		
		c1.saldo = 2000;
		boolean sacou = c1.saca(20);
	
	
		System.out.println(c1.recuperaDadosParaImpressao());
     }
}

