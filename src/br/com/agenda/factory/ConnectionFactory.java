package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	// Usuário do banco de dados (padrão do MySQL costuma ser "root")
	private static final String USERNAME = "root";
	
	// Senha do banco (no seu caso está vazia)
	private static final String PASSWORD = "Morenahxh410";
	
	// URL de conexão com o banco
	// jdbc:mysql:// -> tipo do banco (MySQL)
	// localhost -> servidor (sua máquina)
	// 3306 -> porta padrão do MySQL
	// agenda -> nome do banco de dados
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	// Método responsável por criar e retornar a conexão com o banco
	public static Connection createConnectionToMySQL() throws Exception {
		
		
		// Carrega o driver do MySQL na memória
		// Necessário para o Java conseguir se comunicar com o banco
		// Ele é tipo um adaptador para o java conseguir enviar e traduzir oq mandar pro sgbd
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Cria a conexão com o banco usando URL, usuário e senha
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		// Retorna a conexão criada
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		
		// Chama o método para criar a conexão
		Connection con = createConnectionToMySQL();
		
		// Verifica se a conexão foi criada com sucesso
		if (con != null) {
			System.out.println("Conexão obtida com sucesso!");
			
			// Fecha a conexão para liberar recursos
			con.close();
		}
	}
}