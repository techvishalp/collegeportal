<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" type="text/css"
	href="/collegeportal/css/style.css">
<script src="/collegeportal/js/validation.js"></script>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script >
function showCity(city)
{
	//alert(city)
	if(city=="others")
		document.getElementById("txtothers").style.display="block"
		else
			document.getElementById("txtothers").style.display="none"	
}
function main(){
	var status=true
	var cityname=document.getElementById("cmbcity").value
	if(checkCombo(cityname)==false){
		document.getElementById("cmbcity").after("Please select the city")
		status=false
		
	}
	var checkboxArray=document.getElementsByName("chklanguage")
	if(checkBox_Radio(checkboxArray)==false)
		{
		document.getElementById("chkhindi").after("Select atleast one language")
		status=false
		
		}
	
	
	
	return status
	
	
}

</script>
	<script>
$(document).ready(function()
		
		{
	$("#txtuserid").blur(function() {
		alert(this.value);
		var userid=this.value
		
		
		 $.get("/collegeportal/Registration",
				 {
			 
			 uid:userid
		 }, function(data, status){
		      alert("Data: " + data + "\nStatus: " + status);
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
	<div style="width: 100%; height: auto;">
	<form action="/collegeportal/Registration" method="post" onsubmit="return main()">
		<table class="details" border=3>

			<tr>
				<th>UserID</th>
				<th><input type="text" placeholder="Username" name="txtuserid"
					id="txtuserid" ></th>
			</tr>
			<tr>
				<th>Password</th>
				<th><input type="text" placeholder="Password"
					name="txtuserpass" id="txtuserpass" ></th>
			</tr>
			<tr>
				<th>Name:</th>
				<th><input type="text" placeholder="Enter Your Name"
					name="txtusername" id="txtusername" ></th>
			</tr>
			<tr>
				<th>Phone:</th>
				<th><input type="number" placeholder="Enter Your Phone No"
					name="txtuserphone" id="txtuserphone" ></th>
			</tr>
			<tr>
				<th>Male<input type="radio" value="M" id="rdmale" name="gender"
					></th></tr>	
			<tr>
				<th>Female<input type="radio" value="F" id="rdfemale" name="gender"
					></th></tr>
			<tr>
				<th>Hindi<input type="checkbox" name="language" value="hindi" id="chkhindi" >
			<tr>
				<th>English<input type="checkbox" name="language" value="english" id="chkenglish" >
			<tr>
				<th>City</th>
				<th><select name="cmbcity" id="cmbcity" onchange="showCity(this.value)">
						<option value="default">Select City</option>
						<option value="lko">Lucknow</option>
						<option value="vns">Varanasi</option>
						<option value="Del">Delhi</option>
						<option value="Mum">Mumbai</option>
						<option value="others">Others</option>
				</select>
				<input type="text" name="txtothers" id ="txtothers" style="display: none">
				</th>
			</tr>
			<tr>
				<th><button type="reset">Clear</button></th>
			<tr>
				<th><button type="submit">Submit</button></th>
			</tr>

		</table>
</form>
<span>

$("#msgid").text(data)
</span>
	</div>
	
	<%@include file="/jsp/message.jsp" %>
	

</body>
</html>