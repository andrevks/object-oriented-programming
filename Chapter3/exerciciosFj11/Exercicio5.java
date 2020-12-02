/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercício capítulo 3.13, fixação de sintaxe FJ11. Imprima os fatoriais de números que terão os fatoriais impressos,
			até 20, 30, 40.

	Pergunta: Em um determinado momento, além desse cálculo demorar, vai começar a mostrar
	respostas completamente erradas. Por quê?

	Resposta: A capacidade total do int de 4 bytes, vai até 2 147 483 647, chega um momento que o valor 
	          do fatorial do número informado é tão grande que não suporta armazenar. 
 		 
		 Como se fosse um container ou um copo, está sendo colocado mais conteúdo 
		  ou líquido do que se pode armazernar. 

*/
import java.util.Scanner;

class Exercicio5 {
	public static void main(String[] args) {
		long factorial = 1;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Digite o numero que deseja saber o fatorial: ");
		int n = keyboard.nextInt();
		for(short i = 1; i <= n; i++){
			factorial *= i;	
			
		}
		System.out.println("Fatorial de " + n + ":"+factorial);
	}
}