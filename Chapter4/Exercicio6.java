/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercício capítulo 3.13, fixação de sintaxe FJ11.Imprima os primeiros números da série de Fibonacci até passar de 100.

	

*/


class Exercicio6 {
	public static void main(String[] args){

		byte an1, an2;
		an1 = 0, an2 = 1;
		short fibo = 0;

		for(byte n = 0; n < 102; n++){

			if(n < 2){
				System.out.println(n);
				continue;
			}

			fibo += an1 + an2;
			System.out.println(fibo);
			an1 = an2;
			an2 = fibo;
		}

	}

}
