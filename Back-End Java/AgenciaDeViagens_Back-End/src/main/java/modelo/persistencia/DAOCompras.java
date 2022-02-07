package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.pessoal.Cliente;
import modelo.pessoal.Compras;
import modelo.pessoal.Destinos;

public class DAOCompras {
	private Connection conexao = null;
	private PreparedStatement preparedStatement = null;
	private BancoDados bancoDados;
	
	public DAOCompras() throws Exception {
		bancoDados = new BancoDados();
		conexao = bancoDados.getConexao();
}
	public void incluir(Compras compras) throws Exception {
		
		final String instrucao_sql = "insert into Compra (Fk_Id_Cliente, Fk_Id_Destino, Pagamento, Data) values (?,?,?,?)";
			
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setInt(1, compras.getFk_IdCliente());
			preparedStatement.setInt(2, compras.getFk_IdDestinos());
			preparedStatement.setString(3, compras.getFormaPagamento());
			preparedStatement.setString(4, compras.getData());
			
			
			
			preparedStatement.executeUpdate();
				
	}
	
	public void excluir(Compras compras) throws Exception{
		
		final String instrucao_sql = "DELETE FROM Compra WHERE Id_Compra = ?";
		
			
		preparedStatement = conexao.prepareStatement(instrucao_sql);
		preparedStatement.setInt(1, compras.getId_Compra());
		
		preparedStatement.executeUpdate();
			
	}


	public void alterar(Compras compras) throws Exception{
		
		final String instrucao_sql = "UPDATE Compra set  Fk_Id_Destino=?, Pagamento=?, Data=? WHERE Fk_Id_Cliente=?";
			
		try {
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setInt(1, compras.getFk_IdDestinos());
			preparedStatement.setString(2, compras.getFormaPagamento());
			preparedStatement.setString(3, compras.getData());
			preparedStatement.setInt(4, compras.getFk_IdCliente());


		
			preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}

	public Compras consultar(Compras compras) throws Exception{
		
		final String instrucao_sql = "SELECT * FROM Compra WHERE Fk_Id_Cliente = ?";
			
		try {
				
			preparedStatement = conexao.prepareStatement(instrucao_sql);
			preparedStatement.setInt(1, compras.getFk_IdCliente());
			
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				compras.setFk_IdCliente(resultSet.getInt("Fk_Id_Cliente"));
				compras.setId_Compra_Retornando_DataBase(resultSet.getInt("Id_Compra"));
				compras.setId_Destino_Retornando_DataBase(resultSet.getInt("Fk_Id_Destino"));
				compras.setData(resultSet.getString("Data"));
				
				compras.setFormaPagamento(resultSet.getString("Pagamento"));
			}
			} catch (Exception e){
				e.printStackTrace();
			}
		
		
		return compras;

		}
}