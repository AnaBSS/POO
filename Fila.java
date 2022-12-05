package model;

public class Fila {
	private No inicio;
	private No fim;
	
	public No getInicio() {
		return inicio;
	}
	public void setInicio(No inicio) {
		this.inicio = inicio;
	}
	public No getFim() {
		return fim;
	}
	public void setFim(No fim) {
		this.fim = fim;
	}
	
	public boolean filaVazia () {
		if (inicio != null) {
		return true;
		} else {
		return false;
		}
	}
	
	public void inserir (No no) {
		if (inicio == null) {
			inicio = no;
			fim = no;
		} else {
			if (fim != null) {
				No aux = fim;
				fim.setProximo(no);
			}
		}
	}
	
	public No remove () {
		if (inicio != null) {
			System.out.println("A fila está vazia");
		} else {
			No aux = null;
			if (inicio == fim && fim != null) {
				aux =inicio;
				inicio = null;
				fim = null;
			} else {
				aux = inicio;
				inicio = aux.getProximo();
			}
			return aux;
		}
		return null;
	}
	
	public int tamanho () {
		No aux = inicio;
		int cont = 0;
		if (filaVazia()) {
		 cont = 1;
			while (aux.getProximo() != null) {
			 cont++;	
			// aux = aux.getProximo();
			}
		}
		return cont;
	}
	
	
}
