package DependenciaAeroporto;

public class Aeroporto {
	int capcPessoa;
	Piloto piloto;
	String endereco;
	String nome;
	Aeronave aviao[];
	
	public void LiberarAviaoParaDecolagem () {
		System.out.println("Avião liberado para decolagem");
	}
	
	public void LiberarAviaoParaAterissagem () {
		System.out.println("Avião liberado para aterissagem");
	}
	
	public void AtendimentoPassageiro () {
		System.out.println("Passageiro se dirija para o balcão 5");
	}
	
	public void VerificarCartãoEmbarque () {
		System.out.println("Verificando cartão embarque");
		System.out.println("Cartão verificado com sucesso, tenha uma boa viagem");
	}
	
	public void RevistaPassageiro () {
		System.out.println("Passageiro liberado");
	}
	
	public void RevistaBagagem () {
		System.out.println("Bagagem liberada");
	}
}
