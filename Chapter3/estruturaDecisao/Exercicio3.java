/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Realizar os exercícios propostos sobre Estrutura de Decisão do Cap 3. Tópicos 3.6. 
		  Exercício 3 -  Apresente o fatorial dos números no intervalo de 5 até 10.
*/

class Exercicio3 {
	public static void main(String[] args){
		int fatorial,n;
		
		for(int i = 5; i <=10; i++){
			n = i;
			fatorial = 1;
			while( n > 1) {
				fatorial *= n;
				n--;
			}
			System.out.println("Fatorial de "+ i +" = "+ fatorial);
		}
	}
}