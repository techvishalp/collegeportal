<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@page import="collegeportal.beans.*" %>
	<%@page import="collegeportal.student.*" %>
	<%@page import="java.util.*" %>
	<%@page import="collegeportal.beans.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>

<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    
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
function changeImage()
{
	var tagref=document.getElementById("logo")
	tagref.src="/collegeportal/images/log1.png"
	tagref.style.width= "300"
	}
function rollImage()
{
	document.getElementById("logo").src="/collegeportal/images/spring.png"
	
	}



</script>





</head>
<body style="margin: 0px">
<%@include file="/WEB-INF/headers/adminheader.html" %>
	<div style="background-color: grey; width: 100%; height: 60px">
		<span
			style="font-size: 20px; font-family: Chiller; color: black; font-weight: bold; text-transform: capitalize; margin-left: 40%">
			College Portal Welcomes you
			
			<%
			String slogan=application.getInitParameter("Tagline");
			String year=application.getInitParameter("Year");//web.xml
			
			College clg=(College)application.getAttribute("collegedetails");//with servelet
			%>
			
			<%=slogan %>
			Year of Establishment <%=year %>
			 </span>
		<div style="width: 100px; height: 100%; float: right">
			<img alt="images" id="logo" src="/collegeportal/images/logo.png"
				style="width: 100%; height: 100%;" onmouseover="changeImage()" onmouseout="rollImage()">
		</div>
	</div>
	
	
	
	





	
	
	
	
	
		<div
		style="background-color: red; width: 15%; height: 900px; float: left">
		<div
			style="background-color: lightgreen; width: 100%; height: 300px; float: left">
			<img alt="images" src="/collegeportal/images/college.jpg"
				style="width: 100%; height: 100%;">
		</div>
	
	<marquee direction="down" scrolldelay="250" onmouseover="this.stop()" onmouseout="this.start()">
	<ul style="list-style-type:none">
	<%
	
	AdminTask task=new AdminTask();
	ArrayList<News_bean>newslist=task.viewNews();
	for(News_bean news:newslist)
	{
		
		
		System.out.println(news.getSubject());
	%>
	
	
	<li><a href="/collegeportal/jsp/displaynews.jsp?news_id=<%=news.getNewsid()%>">
	<%=news.getSubject() %></a></li>
	<%} %>
	
	
	
	</ul>
	
	
	
	</marquee>
	
	
	</div>
	<div
		style="background-color: brown; width: 85%; height: 900px; float: left">
	</div>
	<div
		style="background-color: lightgreen; width: 100%; height: 40px; float: left;color:white">
		
		<%
		if(clg!=null)
		{
			%>
			<span><%=clg.getName() %>Email<%=clg.getEmail() %>Phone<%=clg.getPhone() %></span>
			<span>Address:<%=clg.getAddress() %></span>
		<%} %>
	
	</div>
	
	
	
	
	
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
</body>
</html>