package Aula14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteBanco {
	
	public static final String URL = "jdbc:mariadb://localhost:3307/AppAlunos?allowPublicKeyRetrieval=true&useSSL=false";
	public static final String USER = "root";
	public static final String PASSWORD = "alunofatec";
	

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Classe carregada");
			
			Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conectado ao banco de dados");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}
