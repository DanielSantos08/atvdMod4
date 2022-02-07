<%@page import="modelo.pessoal.Destinos"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<% Destinos destinos = (Destinos) request.getAttribute("des"); %>
	
	
		<table>
			<caption><b>Dados do Destino:</b></caption>
			
			<tr>
				<th>Id:</th>
					<td> <%= destinos.getId() %></td>
			</tr>
			<tr>
				<th>Destino:</th>
					<td> <%= destinos.getCidade() %></td>
			</tr>
			<tr>
				<th>Estado:</th>
					<td> <%= destinos.getEstado() %></td>
			</tr>
			<tr>
				<th>País:</th>
					<td> <%= destinos.getPaís() %></td>
			</tr>
			<tr>
				<th>Valor:</th>
					<td> <%= destinos.getValor2() %></td>
			</tr>
		</table>
		
		<form action="ConsultarCompra" method="post">
		Digite sua Senha: <input type="text" name="txtSenha"/><br/>
		Digite o nome da Cidade: <input type="text" name="txtCidade"/><br/>
		<input type="submit" value="Comprar"/>
		<input type="reset" value="Cancelar"/>
		</form>
</body>
</html>