/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Testar os exemplos propostos sobre declaração de variáveis no cap 3.1 do FJ11

*/

class TestaIdade {
	
	public static void main(String[] args) {
		//Imprime a idade 
		int idade = 20;
		System.out.println("Idade atual: "+ idade);
		
		//Gera uma idade do ano seguinte de maneira simplista e limitada
		int idadeNoAnoQueVem;
		idadeNoAnoQueVem = idade + 1;

		//Imprime a idade do ano seguinte
		System.out.println("Idade do ano que vem: "+ idadeNoAnoQueVem);

		//Continuando os testes
		double pi = 3.14;
		double product = 5 * pi;
		System.out.println("Pegando " + pi + " * 5 fica igual a: "+ product);

		idade = 30;
		boolean menorDeIdade = idade < 18;
		System.out.println("Tem "+ idade +" anos, eh menor de idade ? "+ menorDeIdade);

		char letra = 'A';

		System.out.println("Diga: " + letra);
	}
}