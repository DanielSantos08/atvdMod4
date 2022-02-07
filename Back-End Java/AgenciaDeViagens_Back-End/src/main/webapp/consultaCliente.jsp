
<%@page import="modelo.pessoal.Cliente"%>
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
	
	<b>Deseja alterar o Cadastro?</b>
	<a href="alterarCliente.jsp"><button>Alterar</button></a>
	<b>Deseja Apagar o seu Cadastro?</b>
	<a href="excluirCliente.jsp"><button>Excluir</button></a><br/>
	<a href="ConsultarCompra.jsp"><button>Consultar suas Compras</button></a>
	
	<table>
		<caption><b>Dados do Cliente:</b></caption>
		
		<tr>
			<th>Id:</th>
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
		<tr>
			<th>Data de Nascimento:</th>
			<td><%= cliente.getNascimento() %></td>
		</tr>
		<tr>
			<th>E-mail::</th>
			<td><%= cliente.getEmail() %></td>
		</tr>
		<tr>
			<th>Senha:</th>
			<td><%= cliente.getPassword() %></td>
		</tr>
		<tr>
			<th>Telefone:</th>
			<td><%= cliente.getTelefone() %></td>
		</tr>
		<tr>
			<th>Endereco:</th>
			<td><%= cliente.getEndereco() %></td>
		</tr>
	</table>
	
	Veja nossas Ofertas para:<br>
	<b>BA:</b><br>
	Salvador<br>
	Itacaré<br>
	<b>RJ:</b><br>
	Rio De Janeiro<br>
	Búzios<br>
	<b>SP:</b><br>
	São Paulo<br>
	Santos<br>
	
	<form action="ConsultarDestinos" method="post">
		Digite o Nome da Cidade: <input type="text" name="txtCidade"><br>
		<input type="submit" value="Enviar">
	</form>

</body>
</html>