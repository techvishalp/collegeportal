<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JqueryDemo</title>
<%@include file="/html/commonheader.html" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script>
$(document).ready(function()
		
		
		{
	$("#topdiv").click(function()
			
	{
		
		//alert("in div")
		//alert("button is clicked")
		$("#bottomdiv").slideDown(2000);
		$("#bottomdiv").show();
	}
	
	);//button click event close here
	
	
	
	
	
	//alert("in function")
		}
			
		);

</script>

</head>
<body>

<div id="topdiv" class="container bg-warning">hello
</div>
<div id="bottomdiv"  class="container bg-primary" style="dispay:none">hello
</div>





<%@include file="/html/commonfooter.html" %>
</body>
</html>