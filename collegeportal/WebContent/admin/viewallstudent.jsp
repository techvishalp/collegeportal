



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="collegeportal.student.*,java.util.*,collegeportal.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Students</title>

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
ArrayList<Student_bean>list=task.viewStudents();
%>
<table>
<tr><th>Name</th>><th>Phone</th></tr>

<%
for(Student_bean st:list)
{
%>
<tr><th><%=st.getName() %></th><th><%=st.getPhone() %></th></tr>

<%} %>

</table>

<%@include file="/html/commonfooter.html" %>
</body>
</html>