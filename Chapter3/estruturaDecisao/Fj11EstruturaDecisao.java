

class Fj11EstruturaDecisao {

	public static void main(String[] args) {
		
		//Testando Pós incremento vs Pré incremento
		int i = 5;
		int x = i++;
		System.out.println("Pos Incremento: x = " + x);
		System.out.println("Pos Incremento: i = " + i);

		int i1 = 5;
		int x1 = ++i1;
		System.out.println("Pre Incremento: x = " + x1);
		System.out.println("Pos Incremento: i = " + i1);

		//Testando o continue
		for(int j = 0; j < 100; j++) {
			if (j > 50 && j < 60) {
				System.out.println("PULA");
				continue;
			}
			System.out.println(j);
		}

		//Escopo da variável
		// aqui a variável i não existe
		//int i2 = 5;
		// a partir daqui ela existe
		//while (condicao) {
			// o i2 ainda vale aqui
		//	int j1 = 7;
			// o j1 passa a existir
		//}
		// aqui o j não existe mais, mas o i continua dentro do escopo
		//System.out.println(j1);
	}
}