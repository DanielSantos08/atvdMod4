<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<form action="AlterarClienteNascimento" method="post">
		
		Digite a Data de Nascimento (FORMATO: ANO/MÊS/DIA): <input type="date" name="txtNascimento"/><br/>
		
		Digite seu CPF para confirmar: <input type="text" name="txtCPF">
		
		<input type="submit" value="Enviar"/>
		<input type="reset" value="Cancelar"/>
	
	</form>

</body>
</html>