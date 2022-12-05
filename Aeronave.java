package DependenciaAeroporto;

public class Aeronave {
	String numAero;
	Empresa empresa;
	Passageiro passageiro[];
	int capMax;
	int limCarga;
	String frabric;
	String modelo;
	
	public void Decolar () {
		System.out.println("A aeronave está decolando");
	}
	
	public void Aterissar () {
		System.out.println("A aeronave está aterissando");
	}
	
	public void Taxiar () {
		System.out.println("A aeronave está taxiando para pousar");
	}
	
	public void Emergencia () {
		System.out.println("A aeronave teve um imprevisto e vai precisar fazer um pouso de emergência");
	}
}
