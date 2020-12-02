/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercício capítulo 3.13, fixação de sintaxe FJ11. Imprima os fatoriais de 1 a 10.
*/

class Exercicio4 {
	public static void main(String[] args){
		int factorial = 1;

		for(byte i = 10; i > 0; i--){
			factorial *= i;		
		}
		
		System.out.println("Fatorial de 10: " + factorial);

	}
}