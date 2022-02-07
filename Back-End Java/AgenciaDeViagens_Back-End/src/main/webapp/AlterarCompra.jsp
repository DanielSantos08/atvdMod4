<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="AlterarCompra" method="post">
		
		Digite seu Id de Cliente: <input type="number" name="txtIdClienteCompra"/><br/>
		Digite o Id da Cidade: <input type="number" name="txtIdDestinosCompra"/><br/>	
		Digite a Data da sua Viagem: <input type="date" name="txtData"><br>	
		Digite a Forma de Pagamento: <input type="text" name="txtPagamento"/><br/>
		<input type="submit" value="Confirmar"/>
		<input type="reset" value="Cancelar"/>
	
	</form>

</body>
</html>