package controller;

import model.Fila;

public class FilaAplicacao {
	public static void main(String[] args) {
        Fila f = new Fila();        
        f.adicionar("Maria");
        f.adicionar("João");
        f.adicionar("Carlos");
        f.mostrar();
        f.remover();
        f.mostrar();
    }
}
