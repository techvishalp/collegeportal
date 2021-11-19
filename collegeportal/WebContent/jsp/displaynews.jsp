<%@page import="collegeportal.servlets.News"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="collegeportal.student.*,collegeportal.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display News</title>

</head>
<body>

<%
String id=request.getParameter("news_id");
if(id!=null)
{
	int id_int=Integer.parseInt(id);
	AdminTask task=new AdminTask();
	News_bean news=task.viewNews(id_int);
	

%>
<div class="container bg-warningw-50">
<h2>
News Published on Date<%=news.getNewsid() %></h2>
<%} %>
</div>
</body>
</html>