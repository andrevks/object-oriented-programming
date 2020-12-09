/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercícios cap. 4.13. DESAFIOS.

	Um método pode chamar ele mesmo. Chamamos isso de recursão. Você pode resolver a série de
	Fibonacci usando um método que chama ele mesmo. O
	
	
	
	
*/
class Fibonacci {
	int an1 = 0;
	int an2 = 1;

	int calculaFibonacci(int n){
      	    if(n <= 1){
               return n;
	    }else {	
		return this.calculaFibonacci(n-1) + this.calculaFibonacci(n-2);
	    }
	}

	

}

class Desafio1 {
    public static void main(String[] args) {

	Fibonacci fibo = new Fibonacci();
	for(byte i = 1; i <= 6; i++){
	   int resultado = fibo.calculaFibonacci(i);
	   System.out.print(resultado + ", ");
	}
	


    }
}
