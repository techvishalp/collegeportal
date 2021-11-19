<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="collegeportal.student.*,collegeportal.beans.*" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Student Profile</title>


<%@include file="/html/commonheader.html" %>
</head>
<body>

<%@include file="/WEB-INF/headers/studentheader.html" %>  
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
	AdminTask at=new AdminTask();
	Student_bean s=at.viewProfile(uid);
	%>








<div class="card" style="width: 18rem;">
  <img src="https://source.unsplash.com/400x400/?Vishal" class="card-img-top" alt="...">
  <div class="card-body">
    <p class="card-text">
    <%=s.getLoginid() %>
    </p>
    
    <p class="card-text">
    <%=s.getPassword() %>
    </p>
    
    <p class="card-text">
    <%=s.getName() %>
    </p>
     <p class="card-text">
    <%=s.getEmail() %>
    </p>
     <p class="card-text">
    <%=s.getPhone()%>
    </p>
    
  </div>
</div>
<%} %>



<%@include file="/html/commonfooter.html" %>
</body>
</html>