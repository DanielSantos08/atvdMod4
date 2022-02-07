<%@page import="modelo.pessoal.Cliente"%>
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
<% Cliente cliente = (Cliente) request.getAttribute("cli"); %>
<% Destinos destinos = (Destinos) request.getAttribute("des"); %>
	
	
	<table>
		<b>Dados do Cliente:</b>
		
		<tr>
			<th>Id do Cliente:</th>
			<td> <%= cliente.getId() %></td>
		</tr>
		<tr>
			<th>Nome:</th>
			<td> <%= cliente.getNome() %></td>
		</tr>
		<tr>
			<th>CPF:</th>
			<td><%= cliente.getCPF() %></td>
		</tr>	
			<th>
			<b>Dados do Destino:</b>
			</th>
			<tr>
				<th>Id do Destino:</th>
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
		
	<form action="IncluirCompra" method="post">
		Digite a Forma de Pagamento: <input type="text" name="txtPagamento"/><br/>
		Digite a Data da sua Viagem: <input type="date" name="txtData"><br>
		Digite seu Id de Cliente: <input type="number" name="txtIdClienteCompra"/><br/>
		Digite o Id da Cidade: <input type="number" name="txtIdDestinosCompra"/><br/>
		<input type="submit" value="Comprar"/>
		<input type="reset" value="Cancelar"/>
	
	</form>
</body>
</html>