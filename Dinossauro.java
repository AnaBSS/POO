package Exercicio9;

public class Dinossauro {
	int energia = 80;
	int velocidade = 20;
	int temperatura = 36;
	String humor = "neutro";
	
	public void pular() {
		energia--;
		velocidade--;
		humor = "feliz";
		System.out.println("O dinossauro está "+ humor + 
				"Sua velocidade é de " + velocidade + " km/h" +
				"Sua energia está em " + energia + " %");
	}
	
	public void correr() {
		energia--;
		velocidade--;
		humor = "feliz";
		System.out.println("O dinossauro está "+ humor + 
				"Sua velocidade é de " + velocidade + " km/h" +
				"Sua energia está em " + energia + " %");
	}
	
	public void comer() {
		energia++;
		velocidade--;
		humor = "feliz";
		System.out.println("O dinossauro está "+ humor + 
				"Sua velocidade é de " + velocidade + " km/h" +
				"Sua energia está em " + energia + " %");
		
	}
	
	public void cantar() {
		energia--;
		humor = "feliz";
		System.out.println("O dinossauro está "+ humor +
				"Sua energia está em " + energia + " %");
	}
	
	public void tomarSol() {
		velocidade++;
		temperatura++;
		humor = "feliz";
		System.out.println("O dinossauro está "+ humor + 
				"Sua velocidade é de " + velocidade + "km/h" +
				"Sua temperatura está em " + temperatura + " °C");
	}
	
	public void ficarNaSombra() {
		energia++;
		temperatura--;
		humor = "triste";
		System.out.println("O dinossauro está "+ humor + 
				"Sua temperatura é de " + temperatura + " °C" +
				"Sua energia está em " + energia + " %");
	}
}
