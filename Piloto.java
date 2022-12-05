package DependenciaAeroporto;

public class Piloto extends Pessoa {
	String breve;
	int hrVoo;
	String uniforme;
	Empresa empresa;
	private boolean descansado;
	
	public void Pilotar () {
		System.out.println("O piloto está pilotando");
	}
	
	public void DecolarPiloto () {
		System.out.println("O piloto está levantando voo");
	}
	
	public void AterissarPiloto () {
		System.out.println("O piloto está aterrisando com a aeronave");
	}
	
	public boolean isDescansado () {
		return this.descansado;
	}
	
	public void setDescansado (boolean descansado) {
		this.descansado = true;
	}
}
