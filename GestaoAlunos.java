package Exercicio10;

import java.util.Date;
import java.util.Scanner;

public class GestaoAlunos {
	int indice;
	String resposta;
	Alunos[][] aluno = new Alunos[10][5];
	
	public void Menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha uma opção: "
				+ "C - Criar"
				+ "E - Exibir"
				+ "R - Remover"
				+ "A - Atualizar"
				+ "S - Sair");
		resposta = scan.next();
		
		while (resposta != "S") {
			
			switch (resposta) {
	
			case "C":
				Criar();
	
			case "E":
	
				Exibir();
	
			case "R":
				Excluir();
			
			case "A":
				Atualizar();
			}
		}
	}
	
	public void Criar() {
		Alunos alun = new Alunos ();
		Scanner scann = new Scanner(System.in);
		System.out.println("Informe o nome do aluno");
		resposta = scann.next();
		alun.setNome(resposta);
		System.out.println("Informe o RA do aluno");
		resposta = scann.next();
		alun.setRa(resposta);
		System.out.println("Ïnforme a data de nascimento do aluno");
		resposta = scann.next();
		alun.setNascimento(null);
		System.out.println("Informe o ID do aluno");
		resposta = scann.next();
		alun.setId(13);
		
		for(int i=0; i<aluno.length; i++) {
			for(int j=0; i<aluno.length; j++) {
				
			}
		}
	}
	
	
	public void Exibir() {
		
	}
	
	public void Atualizar() {
		
	}
	
	public void Excluir() {
		
	}
	
	
	
	
}
