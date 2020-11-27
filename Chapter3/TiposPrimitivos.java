/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exemplo do vídeo do guanabara sobre "Tipos Primitivos e Manipulação de Dados"
*/
import java.util.Scanner;

class TiposPrimitivos {
	public static void main(String[] args){
		//Tipo do objeto, nome(Objeto), new cria um novo objeto	
		//NomeDaClasse nomeObjeto = new TipoObjeto(parametro necessário)

		//Entre parentes fica o dispositivo a ser monitorado
		Scanner teclado = new Scanner(System.in);
		
		//String nome = "Andre";
		//float nota = (float) 6.5;
		Float nota = new Float(6.5);

		System.out.print("Ola, digite o nome: ");
		String nome = teclado.nextLine();
		
		System.out.print("Digite a nota: ");
		float nota1 = teclado.nextFloat();
		
		System.out.print("Digita a idade: ");
		int idade = teclado.nextInt();

		System.out.println("Sua nota eh: " + nota);
		System.out.printf("A nota do %s, tendo %d anos = %.2f \n", nome, idade , nota1);
		System.out.format("A nota do %s usando format: %.2f \n", nome, nota1);
		
		//Teste de tipos
		int idade2 = 30;
		String valor = Integer.toString(idade2);
		System.out.println("Valor: " + valor);

		String valor2 = "31.6";
		float idade3 = Float.parseFloat(valor2);
		System.out.println("Idade: " + idade3);
	}
}