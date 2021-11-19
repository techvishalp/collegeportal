<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>advance JavaScript</title>
<%@include file="/html/commonheader.html" %>
</head>
<body>

<button id="btn">clickMe</button>
<p id="p1"></p>
<script>
var bt=document.getElementById("btn")
var para=document.getElementById("p1")

bt.addEventListener("click",function()
		
		{
	
	para.innerText="hello javascript"
		}
		
		
		);
</script>

<%@include file="/html/commonfooter.html" %>
</body>
</html>