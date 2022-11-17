package Aula14;

import java.time.LocalDate;

import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AlunoControl {

private ObservableList<Aluno> lista = FXCollections.observableArrayList();
	
	private LongProperty id = new SimpleLongProperty(0);
	private StringProperty ra = new SimpleStringProperty("");
	private StringProperty nome = new SimpleStringProperty("");
	private ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<>(LocalDate.now());

	public Aluno boundaryToAluno() { 
		Aluno a = new Aluno();
		a.setId(id.get());
		a.setRa(ra.get());
		a.setNome(nome.get());
		a.setNascimento(nascimento.get());
		return a;
	}
	
	public void alunoToBoundary(Aluno a) {
		if (a != null) {
			id.set(a.getId());
			ra.set(a.getRa());
			nome.set(a.getNome());
			nascimento.set(a.getNascimento());
		}
	}
	
	public void cleanBoundary() { 
		Aluno a = new Aluno();
		alunoToBoundary(a);
	}
	
	public void adicionar() { 
		Aluno a = boundaryToAluno();
		lista.add(a);
	}
	
	public void pesquisar() { 
		for (Aluno a : lista) { 
			if (a.getNome().contains(nome.get())) { 
				alunoToBoundary(a);
			}
		}
	}
	
	public ObservableList<Aluno> getLista() { 
		return this.lista;
	}
	
	public LongProperty idProperty() { 
		return this.id;
	}
	
	public StringProperty raProperty() { 
		return this.ra;
	}
	
	public StringProperty nomeProperty() { 
		return this.nome;
	}
	
	public ObjectProperty<LocalDate> nascimentoProperty() { 
		return this.nascimento;
	}
}
