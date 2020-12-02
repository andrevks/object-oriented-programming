/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercício capítulo 3.13, fixação de sintaxe FJ11. Imprima a soma de 1 até 1000.
*/

class Exercicio2 {
	public static void main(String[] args){
		int soma = 0;

		for(short i = 1; i<= 1000; i++){
			
			soma += i;
			
		}

		System.out.println("Soma do intervalo de 1 ateh 1000: " + soma);

	}
}