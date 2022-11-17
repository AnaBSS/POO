package Aula14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.NumberStringConverter;

public class AlunoBoudary extends Application {
	private TextField txtId = new TextField();
	private TextField txtRa = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtNascimento = new TextField();
	
	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");
	
	private TableView<Aluno> tableAluno = new TableView<>();

	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private AlunoControl control = new AlunoControl();
	
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		GridPane gp = new GridPane();
		
		bp.setTop(gp);
		bp.setCenter(tableAluno);
		
		gp.add(new Label("Id"), 0, 0);
		gp.add(txtId, 1, 0);
		gp.add(new Label("Ra"), 0, 1);
		gp.add(txtRa, 1, 1);
		gp.add(new Label("Nome"), 0, 2);
		gp.add(txtNome, 1, 2);
		gp.add(new Label("Nascimento"), 0, 3);
		gp.add(txtNascimento, 1, 3);
		
		gp.add(btnAdicionar, 0, 4);
		gp.add(btnPesquisar, 1, 4);

		StringConverter<? extends Number> converterNumber = 
				new NumberStringConverter();
		StringConverter<? extends LocalDate> converterDate = 
				new LocalDateStringConverter();       

		
		Bindings.bindBidirectional(control.nomeProperty(),
				txtNome.textProperty());
		Bindings.bindBidirectional(control.raProperty(),
				txtRa.textProperty());
		Bindings.bindBidirectional(txtId.textProperty(),
				control.idProperty(), (StringConverter<Number>) converterNumber);
		Bindings.bindBidirectional(txtNascimento.textProperty(), 
				control.nascimentoProperty(), (StringConverter<LocalDate>)converterDate);
		
		control.cleanBoundary();
		
		TableColumn<Aluno, Long> col1 = new TableColumn<>("ID");
		col1.setCellValueFactory(new PropertyValueFactory<Aluno, Long>("id") ); 	

		TableColumn<Aluno, String> col2 = new TableColumn<>("Nome");
		col2.setCellValueFactory(new PropertyValueFactory<Aluno, String>("nome") ); 	
		
		TableColumn<Aluno, String> col3 = new TableColumn<>("Ra");
		col3.setCellValueFactory(new PropertyValueFactory<Aluno, String>("ra") );
		
		TableColumn<Aluno, LocalDate> col4 = new TableColumn<>("Nascimento");
		col4.setCellValueFactory(new PropertyValueFactory<Aluno, LocalDate>("nascimento") ); 	
		
		tableAluno.setItems(control.getLista());
		tableAluno.getColumns().addAll(col1, col2, col3, col4);
	 
		
		btnAdicionar.setOnAction( e -> {
			control.adicionar();
		});

		btnPesquisar.setOnAction( e -> { //Arrow Function
			control.pesquisar();
		});
		
		Scene scn = new Scene(bp, 600, 300);
		
		stage.setScene(scn);
		stage.setTitle("Gestão de Alunos");
		stage.show();	
		stage.addEventFilter(MouseEvent.MOUSE_ENTERED, e->{
			System.out.println(e);
			e.consume();
		});
	}
	

	public static void main(String[] args) {
		System.out.println("App iniciado");
		Application.launch(AlunoBoudary.class, args);
	}
}
