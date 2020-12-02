/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercício capítulo 3.13, fixação de sintaxe FJ11. Imprima todos os múltiplos de 3, entre 1 e 100.
*/

class Exercicio3 {
	public static void main(String[] args) {
		
		for(byte i = 1; i <100; i++){

			if(i % 3 == 0){
				System.out.println(i);			
			}

		}

	}
}