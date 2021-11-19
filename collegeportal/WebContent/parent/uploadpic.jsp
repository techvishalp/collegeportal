


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	
	<%@page import="collegeportal.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload_pic</title>

<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    
    
<link href="/collegeportal/css/style.css" type="text/css"
	rel="stylesheet">
<style>
li.items {
	display: inline;
	font-family: "Comic Sans Ms";
	font-size: 20px;
	margin-left: 20px;
}

ul.listitems {
	list-style-type: none;
}

a {
	text-decoration: none;
}
</style>
<script >
</script>

</head>
<body style="margin: 0px">
<%@include file="/WEB-INF/headers/parentheader.html" %>  


<div class="container-fluid bd-warning">
<%
HttpSession hs=request.getSession(false);
System.out.println(hs.getId());



String uid=(String)hs.getAttribute("session_userid");
if(uid==null||hs.isNew())//return new if session is new
{
	request.setAttribute("msg",Message.INVALID_ACCESS);
RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp/login.jsp");

dispatcher.forward(request,response);

%>
<% }
else{
	%>
}

<div class="container-fluid bg-warning">

<span class="text-primary">Hello  <%=uid %>


</span>


</div>


</div>
	<form method="post" action="/collegeportal/Upload" enctype="multipart/form-data">
	
	<input type="file" name="uploadctrl"><br>
	<input type="text" name="txtdesc">
	<button type="submit">uploadpic</button>
	
	</form>
		

    <%} %>
    
    	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
    
</body>
</html>









