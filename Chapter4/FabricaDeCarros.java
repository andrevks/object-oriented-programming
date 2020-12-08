
/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Fazer exemplos do capítulo 4.10. Fábrica de carros

*/
class Motor {
	int potencia;
	String tipo;



}
class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor motor = new Motor();


	void liga(){
	     System.out.println("VRUMMM.... Carro ligado ! ");
	}
	
	void acelera(double quantidade){
	     double velocidadeNova = this.velocidadeAtual + quantidade;
	     this.velocidadeAtual = velocidadeNova;
	     this.getVelocidadeAtual();
	     
	}
	
	void getVelocidadeAtual(){
		System.out.println("Velocidade atual: " + this.velocidadeAtual);

	}


	int pegaMarcha(){
		if(this.velocidadeAtual < 0) 
		   return -1;

		if(this.velocidadeAtual <= 20 )
		   return 1;

		if(this.velocidadeAtual > 20 && this.velocidadeAtual <= 40)
		   return 2;

		if(this.velocidadeAtual > 40 && this.velocidadeAtual <= 60)
		   return 3;

		if(this.velocidadeAtual > 60 && this.velocidadeAtual <= 80)
		   return 4;

		return 5;

	}

}

class FabricaDeCarros {
	public static void main(String[] args) {
		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.cor = "Prata";
		meuCarro.modelo = "Opala SS";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 160;

		meuCarro.liga();
		meuCarro.acelera(40);
		



	}
}