package DependenciaAeroporto;

public class Pessoa {
	private String nome;
	private String telefone;
	private String cpf;
	String passaporte;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void Comer () {
		System.out.println(nome + " está comendo");
	}
	
	public void Dormir () {
		System.out.println(nome + " está dormindo");
	}

	public void Viajar () {
		System.out.println(nome + " está viajando");
	}
}
