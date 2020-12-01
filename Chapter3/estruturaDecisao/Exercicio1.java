/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Realizar os exercícios propostos sobre Estrutura de Decisão do Cap 3. Tópicos 3.6. 
		  Exercício 1 - Apresentar os números que são divisíveis por 2 e 3 no intervalo de 1 até 100.
*/



class Exercicio1 {
	public static void main(String[] args){
		int divisivel = 0;
		for(int i = 1; i <= 100;i++){
			divisivel = i%6;
			if( divisivel == 0) {
				System.out.println(i);
			}
		} 
	}
}