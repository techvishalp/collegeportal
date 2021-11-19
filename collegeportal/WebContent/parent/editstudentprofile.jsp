<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="collegeportal.student.*,collegeportal.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Profile</title>


<%@include file="/html/commonheader.html" %>
</head>
<body>

<%@include file="/WEB-INF/headers/studentheader.html" %>  
<%

HttpSession hs=request.getSession(false);
String uid=(String)hs.getAttribute("session_loginid");



if(uid==null||hs.isNew())//return new if session is new
{
	request.setAttribute("msg",Message.INVALID_ACCESS);
RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/login.jsp");

dispatcher.forward(request,response);

 }
else{
AdminTask pt=new AdminTask();
	Student_bean p=pt.viewProfile(uid);
	%>

<div class="container">
<form method="post" action="/collegeportal/EditProfile">
  <div class="form-group">
    <label for="phone number">Phone Number</label>
    <input type="number" class="form-control" id="txtphone" name="txtphone" value="<%=p.getPhone() %>" >
   
  </div>
 
 
  <div class="form-group">
    <label for="city">City</label>
    <input type="text" class="form-control" id="txtcity" name="txtcity"  value="" >
   
  </div>
 
 
   <div class="form-group">
    <label for="Name">Name</label>
    <input type="text" class="form-control" id="txtname" name="txtname" readonly="readonly"   value="<%=p.getName() %>" >
    
    
    
   
   
  </div>
  
  <input type="hidden" name="txthidden" value="<%=uid%>">
  <button type="submit" class="btn btn-primary">Update</button>
</form>

</div>












<%@include file="/html/commonfooter.html" %>
<%} %>
</body>
</html>