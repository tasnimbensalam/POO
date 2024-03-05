<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ne pas oublier l'import de java.util.Random ;-)</title>
</head>
<body>
    Le nombre aléatoire généré est <%= new Random().nextInt(100) %> <br>
    <a href="<%= request.getRequestURI() %>">Recommencer !</a>
</body>
