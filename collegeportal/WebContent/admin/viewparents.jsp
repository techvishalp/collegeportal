<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="collegeportal.student.*,java.util.*,collegeportal.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Viewparents</title>

<%@include file="/html/commonheader.html" %>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
</head>
<body>

<%@include file="/admin/commonsession.jsp" %>
<%@include file="/WEB-INF/headers/adminheader.html" %>

<%
AdminTask task=new AdminTask();
ArrayList<Parent>parentlist=task.viewParents();
%>
<form action="/collegeportal/DeleteParents" method="post">

<table>
<tr>
<th scope="col"> select </th>
<th scope="col">Name</th>
<th scope="col">City</th>
<th scope="col" >Phone</th>
</tr>

<% 
for(Parent p:parentlist)
{
%>
<tr>
<th> <input type="checkbox" name="chkdelete" value="<%=p.getId() %>" ></th>
<th><%=p.getName() %></th>
<th><%=p.getCity() %></th>
<th><%=p.getPhone() %></th>
</tr>

<%} %>

</table>
<tr><th colspan="4"><button type=>Delete</button></th></tr>
</form>

<%@include file="/html/commonfooter.html" %>
</body>
</html>