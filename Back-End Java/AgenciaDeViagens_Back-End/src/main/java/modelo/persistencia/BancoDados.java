package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BancoDados {
	
	private static final String url = "jdbc:sqlserver://localhost;databaseName=ag;";
	private static final String user = "sa";
	private static final String password = "daniel123";
	private static final String driverBanco = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private Connection conexao = null;
	private PreparedStatement preparedStatement = null;
	
	
	public BancoDados() throws Exception {
		Class.forName(driverBanco);
		conexao = DriverManager.getConnection(url, user, password);
	
	}
	
	public Connection getConexao() {
		return conexao;
	}
}
