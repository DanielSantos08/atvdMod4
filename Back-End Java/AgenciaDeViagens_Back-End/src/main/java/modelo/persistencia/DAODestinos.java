package modelo.persistencia;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.pessoal.Destinos;

public class DAODestinos {

	private Connection conexao = null;
	private PreparedStatement preparedStatement = null;
private BancoDados bancoDados;

public DAODestinos() throws Exception {
	bancoDados = new BancoDados();
	conexao = bancoDados.getConexao();
}

public void incluir(Destinos destinos) throws Exception {
	
	final String instrucao_sql = "insert into Destinos (Cidade_Destino, Estado_Destino, País_Destino, Valor) values (?,?,?,?)";
		
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		preparedStatement.setString(1, destinos.getCidade());
		preparedStatement.setString(2, destinos.getEstado());
		preparedStatement.setString(3, destinos.getPaís());
		preparedStatement.setDouble(4, destinos.getValor1());
		
		
		
		preparedStatement.executeUpdate();
			
}


public void excluir(Destinos destinos) throws Exception{
	
	final String instrucao_sql = "DELETE FROM Destinos WHERE Cidade_Destino = ?";
	
		
	preparedStatement = conexao.prepareStatement(instrucao_sql);
	preparedStatement.setString(1, destinos.getCidade());
	
	preparedStatement.executeUpdate();
		
}


public void alterar(Destinos destinos) throws Exception{
	
	final String instrucao_sql = "UPDATE Destinos set Cidade_Destino=?, Estado_Destino=?, País_Destino=?, Valor=? WHERE Cidade_Destino=?";
		
	try {
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		preparedStatement.setString(1, destinos.getCidade());
		preparedStatement.setString(2, destinos.getEstado());
		preparedStatement.setString(3, destinos.getPaís());
		preparedStatement.setDouble(4, destinos.getValor1());
		preparedStatement.setString(5, destinos.getCidade());

	
		preparedStatement.executeUpdate();
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	
}

public Destinos consultar(Destinos destinos) throws Exception{
	final String instrucao_sql = "SELECT * FROM Destinos WHERE Cidade_Destino = ?";
		
	try {
			
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		preparedStatement.setString(1, destinos.getCidade());
		
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while(resultSet.next()) {
			
			destinos.setCidade(resultSet.getString("Cidade_Destino"));
			destinos.setEstado(resultSet.getString("Estado_Destino"));
			destinos.setPaís(resultSet.getString("País_Destino"));
			destinos.setValor2(resultSet.getDouble("Valor"));
			destinos.setId(resultSet.getInt("Id_Destinos"));
		}
		} catch (Exception e){
			e.printStackTrace();
		}
	
	
	return destinos;

	}
}
