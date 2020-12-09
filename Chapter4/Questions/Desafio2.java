/*
	Aluno: André Geraldo Curso: Eng. Da Computação.

	Professor: Tiago de Almeida Lacerda

	Disciplina: Linguagem de Programação I

	Objetivo: Exercícios cap. 4.13. DESAFIOS.
	
	Por que o modo acima é extremamente mais lento para calcular a série do que o modo iterativo (que
	se usa um laço)?	

	Resposta: Pois o modo recursivo necessita usar execessivamente o quadro de pilha onde coloca todas
	as funções chamadas, então as chamadas ficam paradas, esperando retorno das chamadas
	recursivas abaixo delas, guardando dados de endereço das funções e variáveis já utilizadas
	, até que se chegue ao ponto de parada (Quando chega-se no caso conhecido, n == 0 ou n == 1).

	Além disso, para piorar, as funções pode ser rechamadas muitas vezes,
	o que não aconteceria em uma forma iterativa;
	
*/