<%@page import="modelo.pessoal.Compras"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<% Compras compras = (Compras) request.getAttribute("com"); %>
	
	
		<table>
			<caption><b>Dados da Compra:</b></caption>
			
			<tr>
				<th>Id:</th>
					<td> <%= compras.getId_Compra_Retornando_DataBase() %></td>
			</tr>
			<tr>
				<th>Id Cliente:</th>
					<td> <%= compras.getFk_IdCliente() %></td>
			</tr>
			<tr>
				<th>Id Destino:</th>
					<td> <%= compras.getId_Destino_Retornando_DataBase() %></td>
			</tr>
			<tr>
				<th>Forma de Pagamento:</th>
					<td> <%= compras.getFormaPagamento() %></td>
			</tr>
			<tr>
				<th>Data da Viagem:</th>
					<td> <%= compras.getData() %></td>
			</tr>
			</table>
			<b>Deseja alterar sua Passagem?</b>
			<a href="AlterarCompra.jsp"><button>Alterar</button></a>
</body>
</html>