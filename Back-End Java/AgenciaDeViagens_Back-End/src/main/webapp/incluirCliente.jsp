<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

	

	<form action="incluir.clientes" method="post">
		Digite seu Nome: <input type="text" name="txtNome"/><br/>
		Digite o seu CPF: <input type="text" name="txtCPF"/><br/>
		Digite sua Data de Nascimento: <input type="date" name="txtNascimento"/><br/>
		Digite seu Telefone: <input type="text" name="txtTelefone"/><br/>
		Digite seu Endereço: <input type="text" name="txtEndereco"/><br/>
		Digite seu E-mail: <input type="text" name="txtEmail"/><br/>
		Digite sua Senha: <input type="text" name="txtSenha"/><br/>
		
		
		<input type="submit" value="Finalizar Cadastro"/>
		<input type="reset" value="Cancelar"/>
	
	</form>
		
	
</body>
</html>