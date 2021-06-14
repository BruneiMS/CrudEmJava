package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	//Nome do usu�rio do mysql
	private static final String USERNAME = "root";
	
	//Senha do banco
	private static final String PASSWORD = "";
	
	//caminho do banco de cados, porta, nome do banco
	private static final String DATABASE_URL = "jdbc:mysql://localhost:1521/agenda";
	
	//cONEX�O COM O BANCO
	
	public static Connection createConnectionToMySQL() throws Exception {
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		//recuperar uma conex�o com o banco
		Connection con = createConnectionToMySQL();
		
		//testea se a conex�o � nula
		if(con!=null) {
			System.out.println("Conex�o obtida com sucesso");
			con.close();
		}
		
	}
}
