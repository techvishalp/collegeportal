<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="collegeportal.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show college details</title>
</head>
<body>

<%

College clg=(College)application.getAttribute("collegedetails");
%>
<%=clg.getName() %>
<%=clg.getEmail() %>
<%=clg.getPhone() %>

</body>
</html>




