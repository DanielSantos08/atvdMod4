package modelo.pessoal;

public class Cliente {

	private String Nome;
	private String CPF;
	private String Endereco;
	private String Telefone;
	private String Nascimento;
	private String Email;
	private String Password;
	private int Id_Cliente;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getNascimento() {
		return Nascimento;
	}
	public void setNascimento(String nascimento) {
		Nascimento = nascimento;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	
	}
	public int getId(){
		return Id_Cliente ;
	}
	public void setId(int id) {
		Id_Cliente = id;
	}
	
	
}
