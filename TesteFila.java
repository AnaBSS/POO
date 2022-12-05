package model;

import javax.swing.JOptionPane;

public class TesteFila {
	int inicio;
	int fim;
	int tamanho;
	int qndtElemento;
	String f[];
	
	public TesteFila() {
		inicio = fim = -1;
		tamanho = 100;
		f= new String[tamanho];
		qndtElemento = 0;
	}
	
	public boolean estaVazia() {
		if (qndtElemento == 0) {
			return true;
		}return false;
	}
	
	public boolean estaCheia() {
		if (qndtElemento == tamanho - 1) {
			return true;
		}
		return false;
	}
	
	public void Adiciona(String e) {
		if (! estaCheia()) {
			if(inicio == -1) {
				inicio = 0;
			}
			fim ++;
			f[fim] = e;
			qndtElemento ++;
		}
	}
	
	public void Remove () {
		if (! estaVazia()) {
			inicio ++;
			qndtElemento --;
		}
	}
	
	public void Mostrar () {
		String elemento = "";
		 for (int i = inicio; i <= fim; i ++) {
			 elemento += f[i] + " - ";
		 }
		 JOptionPane.showMessageDialog(null, elemento);
	}
} 
