<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	Deseja Incluir uma Cidade?<br>
	<form action="IncluirDestinos" method="post">
		Digite o Nome da Cidade: <input type="text" name="txtCidade"><br>
		Digite o Nome do Estado: <input type="text" name="txtEstado"><br>
		Digite o Nome do País: <input type="text" name="txtPaís"><br>
		Digite o Valor da Passagem: <input type="text" name="txtValor"><br>
		<input type="submit" value="Enviar">
	</form>
	</div>
	Deseja Consultar uma Cidade?<br>
	<form action="ConsultarDestinos" method="post">
		Digite o Nome da Cidade: <input type="text" name="txtCidade"><br>
		<input type="submit" value="Enviar">
	</form>
	Deseja Apagar uma Cidade?<br>
	<form action="ExcluirDestino" method="post">
		Digite o Nome da Cidade: <input type="text" name="txtCidade"><br>
		<input type="submit" value="Enviar">
	</form>
	<form action="AlterarDestino" method="post">
		Digite o Nome da Cidade que deseja Alterar: <input type="text" name="txtCidade"><br>
		Digite suas alterações abaixo:
		Digite o Nome da Cidade: <input type="text" name="txtCidade"><br>
		Digite o Nome do Estado: <input type="text" name="txtEstado"><br>
		Digite o Nome do País: <input type="text" name="txtPaís"><br>
		Digite o Valor da Passagem: <input type="text" name="txtValor"><br>
		<input type="submit" value="Enviar">
	</form>
</body>
</html>