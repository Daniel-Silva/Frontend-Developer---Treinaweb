<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Digite seu nome</title>
	</head>
	<body>
		<form method="post" action="/tw-agenda-servlets/GetMsgServlet" enctype="application/x-www-form-urlencoded">
			<h1>Digite seu nome:</h1>
			<p><input type="text" name="nomeUser" /></p>
			<button type="submit">Enviar</button>
		</form>
	</body>
</html>