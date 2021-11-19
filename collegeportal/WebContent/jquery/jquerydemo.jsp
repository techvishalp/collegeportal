<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JqueryDemo</title>
<%@include file="/html/commonheader.html" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function()
		
		
		{
	$("#btnshow").click(function()
			
	{
		
		
		//alert("button is clicked")
		$("#p1").show();
	}
	
	);//button click event close here
	
	
	
	
	$("#btnhide").click(function()
			
			{
				
				
				//alert("button is clicked")
				$("#p1").show();
			}
			
			);//button click event close here
			

	//alert("in function")
		}
			
		);

</script>
</head>
<body>

<button id="btnshow">show</button>
<button id="btnhide">hide</button>
<p id="p1" > hello world</p>


<%@include file="/html/commonfooter.html" %>
</body>
</html>