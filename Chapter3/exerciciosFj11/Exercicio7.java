/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercício capítulo 3.13, fixação de sintaxe FJ11.

	Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
	novo x de acordo com a seguinte regra:

	se x é par, x = x / 2
	se x é impar, x = 3 * x + 1
	imprime x

	O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13 , a saída
	será:
		40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
*/

import java.util.Scanner;

class Exercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um valo inteiro: ");
		int x = teclado.nextInt();


		while(x != 1){

			if( x % 2 == 0){

		   		x = (x/2);

			} else {

	        		x = 3 * x + 1;
			}
			
			System.out.print(x + " -> ");
		
		}
		
		


	}
}
