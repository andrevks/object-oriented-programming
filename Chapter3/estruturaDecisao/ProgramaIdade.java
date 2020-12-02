/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Representação de exemplos no vídeo #9 - Estruturas Condicionais - Curso em Vídeo
*/

import java.util.Scanner;


class ProgramaIdade {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Digite o ano de nascimento: ");
		short nasc = keyboard.nextShort();
		//Impossível alguém ter mais de 127 anos
		byte idade = (byte)(2020 - nasc);
		
		System.out.println("Voce tem " + idade + " anos");

		if(idade >= 18){
			System.out.println("Maior");
		}else {
			//System.out.println("Menor");
		}

	}
}