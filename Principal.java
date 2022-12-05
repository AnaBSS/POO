package controller;

import model.Fila;
import model.No;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new Fila ();
		fila.inserir(new No ("Maria"));
		fila.inserir(new No ("João"));
		fila.inserir(new No ("José"));
		fila.inserir(new No ("Carla"));
		fila.remove();
	}

}
