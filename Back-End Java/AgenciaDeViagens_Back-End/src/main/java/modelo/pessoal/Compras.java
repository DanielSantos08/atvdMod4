package modelo.pessoal;

public class Compras {
	private int Fk_IdCliente; //Recebe o valor da variavel Fk_IdCli do tipo String e converte em double e envia para o banco de Dados
	private String Fk_IdCli; //Entrada de dados dos valores na tela, tipo String
	private int Fk_IdDestinos; //Recebe o valor da variavel Fk_IdDes do tipo String e converte em double e envia para o banco de Dados
	private String Fk_IdDes; //Entrada de dados dos valores na tela, tipo String
	private String FormaPagamento;
	private String VariaveldeConversaoIdCompra;//Entrada de dados dos valores na tela, tipo String
	private int Id_Compra;//Recebe o valor da variavel Fk_IdDes do tipo String e converte em double e envia para o banco de Dados
	private int Id_Compra_Retornando_DataBase;//Retorno do valor do banco de dados
	private int Id_Destino_Retornando_DataBase;//Retorno do valor do banco de dados
	private String Data;
	
	public int getFk_IdCliente() {
		return Integer.parseInt(Fk_IdCli);
	}
	public void setFk_IdCliente(int fk_IdCliente) {
		this.Fk_IdCliente = Integer.parseInt(Fk_IdCli);
	}

	public int getFk_IdDestinos() {
		return Integer.parseInt(Fk_IdDes);
	}
	public void setFk_IdDestinos(int fk_IdDestinos) {
		this.Fk_IdDestinos = Integer.parseInt(Fk_IdDes);
	}

	
	public String getFormaPagamento() {
		return FormaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		FormaPagamento = formaPagamento;
	}
	public String getFk_IdCli() {
		return Fk_IdCli;
	}
	public void setFk_IdCli(String fk_IdCli) {
		Fk_IdCli = fk_IdCli;
	}
	public String getFk_IdDes() {
		return Fk_IdDes;
	}
	public void setFk_IdDes(String fk_IdDes) {
		Fk_IdDes = fk_IdDes;
	}
	public String getVariaveldeConversaoIdCompra() {
		return VariaveldeConversaoIdCompra;
	}
	public void setVariaveldeConversaoIdCompra(String variaveldeConversaoIdCompra) {
		VariaveldeConversaoIdCompra = variaveldeConversaoIdCompra;
	}
	public int getId_Compra() {
		return Integer.parseInt(VariaveldeConversaoIdCompra);
	}
	public void setId_Compra(int id_Compra) {
		this.Id_Compra = Integer.parseInt(VariaveldeConversaoIdCompra);
	}
	public int getId_Compra_Retornando_DataBase() {
		return Id_Compra_Retornando_DataBase;
	}
	public void setId_Compra_Retornando_DataBase(int id_Compra_Retornando_DataBase) {
		Id_Compra_Retornando_DataBase = id_Compra_Retornando_DataBase;
	}
	public int getId_Destino_Retornando_DataBase() {
		return Id_Destino_Retornando_DataBase;
	}
	public void setId_Destino_Retornando_DataBase(int id_Destino_Retornando_DataBase) {
		Id_Destino_Retornando_DataBase = id_Destino_Retornando_DataBase;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	
}
