package Exercicio9;

import java.util.Scanner;

public class Teste {

	public static void main(int energia, int velocidade, int temperatura, String humor) {
		String resposta;
		
		Dinossauro skeep = new Dinossauro();
		Scanner scan = new Scanner(System.in);
		System.out.println("O estado atual do dinossauro é: "
				+ energia + " %\n" 
				+ velocidade + " km/h\n"
				+ temperatura + " °C\n"
				+ humor + humor 
				+ "Escolha uma opção: "
				+ "P - Pular"
				+ "A - Cantar"
				+ "C - Correr"
				+ "S - Tomar sol"
				+ "M - Comer"
				+ "O - Ficar na sombra"
				+ "E - Sair");
		resposta = scan.next();
		while (resposta != "E") {
			switch (resposta) {
	
			case "P":
	
				skeep.pular();
	
			case "A":
	
				skeep.cantar();
	
			case "C":
	
				skeep.correr();
			
			case "S":
	
				skeep.tomarSol();
				
			case "M":
	
				skeep.comer();	
				
			case "O":
	
				skeep.ficarNaSombra();
				
			}
		}

	}

}
