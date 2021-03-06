/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercícios cap. 4.12. Orientação a objetos. 

	Crie um método na classe Data que devolva o valor formatado da data, isto é,
	devolva uma String com "dia/mes/ano".
	
*/
class Data {
	int dia;
	int mes;
	int ano;

	String formatada(){
	    String dataFormatada = "";//So deu certo quando foi atribuído "" 
	    dataFormatada += this.dia+ "/";
            dataFormatada += this.mes+ "/";
            dataFormatada += this.ano;
	    return dataFormatada;
	}
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
	     dados += "\nData de abertura: "+ this.dataAbertura.formatada();
	     dados += "\nRendimento mensal: " + this.calculaRendimento();

	     return dados;
	}
}


class Exercicio9 {
     public static void main(String[] args){
	 	Conta c1 = new Conta();
		c1.titular = "George Washington";
		c1.numero = 1789;
		c1.agencia = "1797-9";
		c1.saldo = 200000;

		Data d1 = new Data();
		
	
		c1.dataAbertura = d1;


		c1.dataAbertura.dia = 18;
		c1.dataAbertura.mes = 2;
		c1.dataAbertura.ano = 2020;
		
		System.out.println(c1.recuperaDadosParaImpressao());

     }
}

