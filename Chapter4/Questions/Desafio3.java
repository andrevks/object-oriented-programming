/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercícios cap. 4.13. DESAFIOS.

	Escreva o método recursivo novamente, usando apenas uma linha. Para isso, pesquise sobre o
	operador condicional ternário. (ternary operator)
	
*/
class Fibonacci {

	int calculaFibonacci(int n){
      	   return (n <= 1)? n: this.calculaFibonacci(n-1) + this.calculaFibonacci(n-2);
	}

	

}

class Desafio3 {
    public static void main(String[] args) {

	Fibonacci fibo = new Fibonacci();
	for(byte i = 1; i <= 6; i++){
	   int resultado = fibo.calculaFibonacci(i);
	   System.out.print(resultado + ", ");
	}
	


    }
}
