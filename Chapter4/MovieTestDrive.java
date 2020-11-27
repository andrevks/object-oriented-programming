/*
	Objetivo: Apenas testando um simples 
*/

class Movie {
	//Atributos|Var de instância
	//O que deve conhecer/ter
	String title;
	String genre;
	int rating;
	
	//Método | Comportamento
	//O que faz
	void playIt() {
		System.out.println("Playing the movie: " + title);
	}
}

//Classe para teste
public class MovieTestDrive {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = -2;
		one.playIt();

		Movie two = new Movie();
		two.title = "Lost in Cubicle Space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();

		Movie three = new Movie();
		three.title = "Byte Club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;
		
	}
}