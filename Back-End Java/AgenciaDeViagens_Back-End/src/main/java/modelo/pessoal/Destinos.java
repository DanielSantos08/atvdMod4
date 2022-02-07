package modelo.pessoal;

public class Destinos {
	
	private String Cidade;
	private String Estado;
	private String País;
	private String alimentacao_Valor; //Entrada de dados dos valores na tela, tipo String
	private Double alimentacao_DB_valor; //Recebe o valor acima, da variavel alimentacao_Valor do tipo String e converte em double e envia para o banco de Dados
	private Double valorDe_Exibicao; //Retorno do valor do banco de dados
	private int Id;
	
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getPaís() {
		return País;
	}
	public void setPaís(String país) {
		País = país;
	}
	public String getValor() {
		return alimentacao_Valor;
	}
	public void setValor(String valor) {
		alimentacao_Valor = valor;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Double getValor1() {
		return Double.parseDouble(alimentacao_Valor);
	}
	public void setValor1(Double valor1) {
		this.alimentacao_DB_valor = Double.parseDouble(alimentacao_Valor);
	}
	public Double getValor2() {
		return valorDe_Exibicao;
	}
	public void setValor2(Double valor2) {
		this.valorDe_Exibicao = valor2;
	}
	
}
