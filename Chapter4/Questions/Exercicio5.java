/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercícios cap. 4.12. Orientação a objetos. 

	Crie duas referências para a mesma conta, compare-os com o == . Tire suas conclusões.
	
	Conclusão: As duas referências estão referenciando o mesmo endereço, o mesmo local
	onde o objeto se encontra. Portanto, ao comparar as duas refências,
	é true, já que está sendo comparado o endereço do objeto no acervo(pilha de lixo coletável,
	onde os objetos se encontram).
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


class Exercicio5 {
     public static void main(String[] args){
	 	Conta c1 = new Conta();
		c1.titular = "George Washington";
		c1.numero = 1789;
		c1.agencia = "1797-9";
		c1.dataAbertura = "08-12-2020";
		c1.saldo = 200000;


		Conta c2 = c1;
	

		boolean iguais = c1 == c2;
		if(iguais){
		  System.out.println("Sao Iguais");
		}else {
		  System.out.println("Sao diferentes");

	         }



     }
}

