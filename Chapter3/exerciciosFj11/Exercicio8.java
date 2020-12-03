/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercício capítulo 3.13, fixação de sintaxe FJ11.
	Imprima a seguinte tabela, usando for s encadeados:
	1
	2 4
	3 6 9
	4 8 12 16
	n n*2 n*3 .... n*n
	
*/

class Exercicio8 {
	public static void main(String[] args){
		
		for(short i = 1; i < 10; i++){
		    for(short j = 1; j <= i; j++){
			System.out.print((i * j)+ " ");
		    }
			System.out.println(" ");
		}
	
	}
}