<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Olá personalizado</title>
</head>
<body>
Digite o seu nome e clique em enviar:
<form action="ServletOlaPersonalizado" method="post">
<input type="text" name="nome" />
<input type="submit" value="Enviar" />
//o nome ou name é o identificador daquele input específico, então se tiver vários inputs do tipo texto, não pode ter o mesmo name = x, tem que ser x1, x2,x3 etc
</form>
</body>
</html>