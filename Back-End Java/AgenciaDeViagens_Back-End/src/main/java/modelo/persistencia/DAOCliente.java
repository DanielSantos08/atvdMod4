package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.pessoal.Cliente;

public class DAOCliente {
		
		private Connection conexao = null;
		private PreparedStatement preparedStatement = null;
	private BancoDados bancoDados;
	
	public DAOCliente() throws Exception {
		bancoDados = new BancoDados();
		conexao = bancoDados.getConexao();
	}
	
	public void incluir(Cliente cliente) throws Exception {
		
		final String instrucao_sql = "insert into Cliente (Nome_Cliente, CPF_Cliente, Endereco_Cliente, Telefone_Cliente, Data_Nascimento, Email, Password) values (?,?,?,?,?,?,?)";
			
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setString(1, cliente.getNome());
			preparedStatement.setString(2, cliente.getCPF());
			preparedStatement.setString(3, cliente.getEndereco());
			preparedStatement.setString(4, cliente.getTelefone());
			preparedStatement.setString(5, cliente.getNascimento());
			preparedStatement.setString(6, cliente.getEmail());
			preparedStatement.setString(7, cliente.getPassword());
			
			
			preparedStatement.executeUpdate();
				
	}
	
	
	public void excluir(Cliente cliente) throws Exception{
		
		final String instrucao_sql = "DELETE FROM Cliente WHERE CPF_Cliente = ?";
		
			
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		preparedStatement.setString(1, cliente.getCPF());
		
		preparedStatement.executeUpdate();
			
	}
	
	public Cliente consultar(Cliente cliente) throws Exception{
		final String instrucao_sql = "SELECT * FROM Cliente WHERE Password=?";
			
		try {
				
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setString(1, cliente.getPassword());
			
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				cliente.setNome(resultSet.getString("Nome_Cliente"));
				cliente.setCPF(resultSet.getString("CPF_Cliente"));
				cliente.setEndereco(resultSet.getString("Endereco_Cliente"));
				cliente.setTelefone(resultSet.getString("Telefone_Cliente"));
				cliente.setNascimento(resultSet.getString("Data_Nascimento"));
				cliente.setEmail(resultSet.getString("Email"));
				cliente.setPassword(resultSet.getString("Password"));
				cliente.setId(resultSet.getInt("Id_Cliente"));
			}
			} catch (Exception e){
				e.printStackTrace();
			}
		
		return cliente;
	}
	public void alterarNome(Cliente cliente) throws Exception{
		
		final String instrucao_sql = "UPDATE Cliente set Nome_Cliente = ? WHERE CPF_Cliente=?";
			
		try {
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setString(1, cliente.getNome());
			preparedStatement.setString(2, cliente.getCPF());
		
			preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}
	public void alterarEmail(Cliente cliente) throws Exception{
		
		final String instrucao_sql = "UPDATE Cliente set Email = ? WHERE CPF_Cliente=?";
			
		try {
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setString(1, cliente.getEmail());
			preparedStatement.setString(2, cliente.getCPF());
		
			preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}
	public void alterarPassword(Cliente cliente) throws Exception{
		
		final String instrucao_sql = "UPDATE Cliente set Password = ? WHERE CPF_Cliente=?";
			
		try {
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setString(1, cliente.getPassword());
			preparedStatement.setString(2, cliente.getCPF());
		
			preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}
	public void alterarEndereco(Cliente cliente) throws Exception{
		
		final String instrucao_sql = "UPDATE Cliente set Endereco_Cliente = ? WHERE CPF_Cliente=?";
			
		try {
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setString(1, cliente.getEndereco());
			preparedStatement.setString(2, cliente.getCPF());
		
			preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}
	public void alterarNascimento(Cliente cliente) throws Exception{
		
		final String instrucao_sql = "UPDATE Cliente set Data_Nascimento = ? WHERE CPF_Cliente=?";
			
		try {
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setString(1, cliente.getNascimento());
			preparedStatement.setString(2, cliente.getCPF());
		
			preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}
	public void alterarTelefone(Cliente cliente) throws Exception{
		
		final String instrucao_sql = "UPDATE Cliente set Telefone_Cliente = ? WHERE CPF_Cliente=?";
			
		try {
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setString(1, cliente.getTelefone());
			preparedStatement.setString(2, cliente.getCPF());
		
			preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}
}

