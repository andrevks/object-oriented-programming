/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Realizar os exemplos propostos sobre casting e promoção no cap 3.5 do FJ11
*/

class CastingPromocao {
	public static void main(String[] args){
		//double d = 3.1415;
		//int i = d; //não compila
		
		//double d = 5;
		//int i = d; // n compila
		
		double d3 = 3.13;
		int i3 = (int) d3;

		long x = 1000;
		int i4 = (int)x;
		System.out.println(i3);
		
		//Casos não tão comuns de castings e atribuição
		//Todos os literais com ponto flutuante são considerados double pelo Java.
		float naoDouble =  0.0f;
		
		double d = 5;
		float f = 3;
		//O java armazena sempre no maior tipo que apareceu durante as operações
		float result = f + (float) d;

	}
}