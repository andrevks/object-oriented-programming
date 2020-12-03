/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercício capítulo 3.13, fixação de sintaxe FJ11.Imprima os primeiros números da série de Fibonacci até passar de 100.

	

*/


class Exercicio6 {
	public static void main(String[] args){

		int an1, an2;
		an1 = 0; an2 = 1;
		int fibo = 0;
		System.out.println("------- Serie de FIBONACCI (ateh passar de 100) ---------");
		System.out.print(an1 + ", ");
		System.out.print(an2 + ", ");

		for(byte n = 0; n < 11; n++){

			fibo = (an1 + an2);
			System.out.print(fibo + ", ");
			an1 = an2;
			an2 = fibo;
		}
		System.out.print("...");

	}

}
