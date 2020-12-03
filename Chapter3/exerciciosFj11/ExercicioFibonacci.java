/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercício capítulo 3.13, fixação de sintaxe FJ11.Imprima os primeiros números da série de Fibonacci até passar de 100.

	Solução: Pensar em tirar oq foi adicionado no an2 quando fizesse a atribuição do an1
*/


class ExercicioFibonacci {
	public static void main(String[] args){

	
		int an1, an2;
		an1 = 0;
		an2 = 1;
	
	
		System.out.println("------- Serie de FIBONACCI (ateh passar de 100 com Duas Var) ---------");

		System.out.print(an1 + ", ");
		System.out.print(an2 + ", ");

		for(byte n = 2; n < 13; n++){
			System.out.print((an1 + an2) + ", "); 
			an2 += an1;
			an1 = an2 - an1;	
		}
		
		System.out.print("...");
	}

}
