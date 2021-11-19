<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="collegeportal.parent.*,collegeportal.beans.*" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
<META HTTP-EQUIV="PRAGMA" CONTENT="NO-CACHE">
<META HTTP-EQUIV="EXPIRES" CONTENT="0">



	


<title>View Profile</title>
	<script>
window.history.forward(0);
</script>


<%@include file="/html/commonheader.html" %>
</head>
<body>

<%@include file="/WEB-INF/headers/parentheader.html" %>  
<%

HttpSession hs=request.getSession(false);
String uid=(String)hs.getAttribute("session_userid");



if(uid==null||hs.isNew())//return new if session is new
{
	request.setAttribute("msg",Message.INVALID_ACCESS);
RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/login.jsp");

dispatcher.forward(request,response);

 }
else{
	ParentTask pt=new ParentTask();
	Parent p=pt.viewProfile(uid);
	%>








<div class="card" style="width: 18rem;">
  <img src="https://source.unsplash.com/400x400/?Vishal" class="card-img-top" alt="...">
  <div class="card-body">
    <p class="card-text">
    <%=p.getName() %>
    </p>
    
    <p class="card-text">
    <%=p.getPhone() %>
    </p>
    
    <p class="card-text">
    <%=p.getCity() %>
    </p>
  </div>
</div>
<%} %>



<%@include file="/html/commonfooter.html" %>
</body>
</html>