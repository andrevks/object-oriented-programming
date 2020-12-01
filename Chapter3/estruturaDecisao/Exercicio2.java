/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Realizar os exercícios propostos sobre Estrutura de Decisão do Cap 3. Tópicos 3.6. 
		  Exercício 2 -  Apresentar o somatório dos valores pares existentes na faixa de 50 até 150. 
*/

class Exercicio2 {
	public static void main(String[] args) {
		int somatorio = 0;
		boolean par = false;

		for(int i = 50; i <= 150;i++){	
			par = i%2 == 0;
			if(par){	
				somatorio += i;		
			}
		}	
		
		System.out.println("O somatorio dos valores pares da faixa de 50 ateh 150: " + somatorio); 
	}
}