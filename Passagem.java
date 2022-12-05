package DependenciaAeroporto;

import java.time.LocalDateTime;

public class Passagem {
	String classe;
	LocalDateTime dataHr;
	String numPassagem;
	String destino;
	String origem;
	
	public void Apresentar () {
		System.out.println("Apresente sua passagem");
	}
	
	public void Validar () {
		System.out.println("Validando sua passagem... Aguarde");
		System.out.println("Validação completa, aguarde o seu comprovante");
	}
	
	public void Emitir () {
		System.out.println("Comprovante emitido");
	}
}
