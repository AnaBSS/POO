package GestaoAlun;

import java.time.LocalDate;


public class Aluno {
	private long id;
	private LocalDate nascimento;
	private String ra;
	private String nome;
	
	// Getters e setters 
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Metodos
	
	public void exibir(){
        System.out.println("------ Dados do Aluno ------");
        System.out.println(toString());
    }   

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\tID: " + getId() + "\t\tData de nascimento: " + getNascimento() +
             "\nRA: " + getRa();
            
    }
}
