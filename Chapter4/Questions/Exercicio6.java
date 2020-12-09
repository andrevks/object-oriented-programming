/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercícios cap. 4.12. Orientação a objetos. 

	Em vez de utilizar uma String para representar a data, crie uma outra classe, chamada
	Data. Ela possui 3 campos int , para dia, mês e ano.

	Desenho do estado da memória quando criar uma Conta:
	 ________________
	|    |null | c1	 |
	|    |data |_____|
	|	         |
	|		 |
	|________________|
	
	
	
*/
class Data {
	int dia;
	int mes;
	int ano;
}

class Conta {
	//Coisas importantes que ela tem
	String titular;
	int numero;
	String agencia;
	double saldo;
	Data dataAbertura;

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
	     dados += "\nData de Abertura: " + this.dataAbertura.dia +"/"+this.dataAbertura.mes +"/"
	     +this.dataAbertura.ano;
	     dados += "\nRendimento mensal: " + this.calculaRendimento();
	
	     return dados;
	}
}


class Exercicio6 {
     public static void main(String[] args){
	 	Conta c1 = new Conta();
		c1.titular = "George Washington";
		c1.numero = 1789;
		c1.agencia = "1797-9";
		c1.saldo = 200000;

		Data d1 = new Data();
		
	
		c1.dataAbertura = d1;

		System.out.println(c1.recuperaDadosParaImpressao());

		c1.dataAbertura.dia = 18;
		c1.dataAbertura.mes = 2;
		c1.dataAbertura.ano = 2020;


	




     }
}

