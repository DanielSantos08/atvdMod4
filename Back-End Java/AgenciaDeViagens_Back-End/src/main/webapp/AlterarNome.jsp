<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AlterarClienteNome" method="post">
		
		Digite o novo nome: <input type="text" name="txtNome"/><br/>
		
		Digite seu CPF para confirmar: <input type="text" name="txtCPF">
		
		<input type="submit" value="Enviar"/>
		<input type="reset" value="Cancelar"/>
	
	</form>
</body>
</html>