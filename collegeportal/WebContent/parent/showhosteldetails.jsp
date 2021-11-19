<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@page import="collegeportal.beans.*" %>
    <%@page import="collegeportal.parent.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>showdetails</title>
</head>
<body>
<%
String cityid=request.getParameter("cid");
ParentTask task=new ParentTask();
ArrayList<Hostel> hostelList=task.viewHostel(cityid);


%>
<h1>Hostel Deatails are as Follows</h1>
<table><tr><th>Name</th><th>Address</th></tr>
<%
for(Hostel hostel:hostelList)
{
		
%>
<tr>
<th><%=hostel.getName() %></th>
<th><%=hostel.getAddress()%></th>

</tr>
<%} %>
</table>
</body>
</html>