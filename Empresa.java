package DependenciaAeroporto;

public class Empresa {
	String endereco;
	String nome;
	String identificacao;
	int qntdAviao;
	Piloto[] piloto;
	
	public void FornecerAviao () {
		System.out.println("Temos 8 aviões diponíveis");
	}
	
	public void FornecerPiloto () {
		System.out.println("Temos 16 pilotos diponíveis");
	}
	
	public void VenderPassagem () {
		System.out.println("Temos promoções nas passagens internacionais. Só hoje, não perca.");
	}
}
