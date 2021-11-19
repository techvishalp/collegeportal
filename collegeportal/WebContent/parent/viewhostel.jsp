<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="collegeportal.beans.*" %>
    <%@page import="collegeportal.parent.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ViewHostel</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
$(document).ready(function()
		
		{
	$("#cmbcity").change(function() {
		
		 cityid=this.value;
		 alert(cityid);
		
		
		 $.get("/collegeportal/parent/showhosteldetails.jsp",
				 {
			 
			 cid:cityid
		 }, function(data, status){
		      alert("Data:" + data + "\nStatus: " + status);
		      
		      
		      
		      $("#hosteldiv").html(data)
		    });
		 
		 
		/*  $.post("/ecollege/jsp/demoajax.jsp",
				  {
				    name: "Scott",
				    city: "Lucknow"
				  },
				  function(data, status){
				    alert("Data: " + data + "\nStatus: " + status);
				  });
		 */
		 
		 
	});
	

	
	
		}
		)


</script>
</head>
<body>
<%
ParentTask task =new ParentTask();
ArrayList<City>citylist=task.viewcity();

%>
<select id="cmbcity" name="cmbcity">
<option value="default">Select</option>
<%
for(City city:citylist)
{



%>
<option value="<%=city.getId()%>"<%=city.getName() %>></option>
<%} %>
</select>

<div id="hosteldiv">


</div>
</body>
</html>