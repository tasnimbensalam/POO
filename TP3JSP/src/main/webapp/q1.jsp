<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
Nous sommes le <%= new Date() %> <br>
Le nom du serveur sur lequel vous êtes connecté : <%= request.getServerName() %> <br>
</p>
</body>
</html>