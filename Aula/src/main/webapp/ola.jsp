<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ol� personalizado</title>
</head>
<body>
Digite o seu nome e clique em enviar:
<form action="ServletOlaPersonalizado" method="post">
<input type="text" name="nome" />
<input type="submit" value="Enviar" />
//o nome ou name � o identificador daquele input espec�fico, ent�o se tiver v�rios inputs do tipo texto, n�o pode ter o mesmo name = x, tem que ser x1, x2,x3 etc
</form>
</body>
</html>