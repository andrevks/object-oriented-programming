/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Realizar os exercícios propostos sobre variáveis e tipos primitivos no cap 3.3 do FJ11
*/

class BalancoTrimestral {
	public static void main(String[] args){
		
		int gastosJaneiro, gastosFevereiro, gastosMarco, gastoTotalTrimestre;

		gastosJaneiro = 15000;
		gastosFevereiro = 23000;
		gastosMarco = 17000;
		
		gastoTotalTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		float mediaMensal = (float)(gastoTotalTrimestre/3);
		System.out.println("Gasto total do trimestre:R$ " + gastoTotalTrimestre);
		System.out.println("Valor da media mensal = " + mediaMensal);


	}
}