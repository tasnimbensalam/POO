<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Division par zero !</title>
</head>
<body>
<%
if(request.getParameter("attention") == null)
{response.getWriter().append("Cette page fonctionne !<br>"); }
else
{ try {
    int i = 1/0; 
} catch (Exception e) {
   
    response.sendRedirect("/TP3JSP/error.jsp");
}
	

}
%>

</body>
</html>