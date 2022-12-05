package DependenciaAeroporto;

public class Passageiro extends Pessoa {
	Passagem passagen;
	String localEmbarque;
	String destFinal;
	
	public void Embarcar () {
		System.out.println("O passageiro está embarcando");
	}
	
	public void Desmbarcar () {
		System.out.println("O passageiro está desembarcando");
	}
	
	public void EsperarTransporte () {
		System.out.println("O passageiro está esperando o transporte para embarcar");
	}
}
