<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exercice2 - Vue</title>
</head>
<body>
    <%
       
        String a = (String) request.getAttribute("NomEnMajuscule");
    %>
    <h1>Bonjour <%= a %></h1>
</body>
</html>
