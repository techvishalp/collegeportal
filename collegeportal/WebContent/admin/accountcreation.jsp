<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Account</title>


<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>



<link rel="shortcut icon" href="/collegeportal/images/favicon.ico" type="image/x-icon">
<link rel="icon" href="/collegeportal/images/favicon.ico" type="image/x-icon">
<script src="/collegeportal/js/validation.js"></script>
<script >












</script>

<style>
input[type=text], input[type=password] {
  padding: 12px 20px;
  margin: 8px 0;
  background: transparent; 
  border: none;
  outline: none;
  border-bottom: 2px solid black ;
  font-size: 10px;
}
button {
  background-color: black;
  color: white;
  padding: 14px 20px;
  margin-top: 15px;
  margin-left: 25px;
  border: none;
  border-radius: 100px;
  cursor: pointer;
  width: 250px;
}
button1 {
  background-color: black;
  color: white;
  padding: 14px 20px;
  margin-top: 15px;
  margin-left: 25px;
  border: none;
  border-radius: 100px;
  cursor: pointer;
  width: 250px;
}
.button2 {
  background-color: blue;
  color: white;
  padding: 10px 10px;
  margin-top:0px;
  border: none;
  border-radius: 100px;
  cursor: pointer;
  width: 500px;
}
h1{
margin-left: 90px;
}
p{
margin-left: 40px;
}
</style> 
</head>
<body >


<div >

<div style="background-color: grey; width: 300px; height: 400px; margin-top: 80px; margin-left: 110px;">
<form action="/collegeportal/Accountcreation" method="post" onsubmit="return main()">

<h1>
Create Account

</h1>

<ul>

  <li><label for="ulogin" style="margin-left: 10px;"><b>Login Id:</b></label>
    <input type="text"  name="userloginid" id="userloginid"></li>

   <li> <label for="upsw" style="margin-left: 10px;"><b>Password:</b></label>
    <input type="password"  name="userpass" id="userpass"></li>
    
    
   <li> <label for="uname" style="margin-left: 10px;"><b>Name:</b></label>
    <input type="text"  name="username" id="username"></li>
    
   <li>
    <label for="uemail" style="margin-left: 10px;"><b>Email:</b></label>
    <input type="text"  name="useremail" id="useremail"></li>
    
    <li><label for="uphone" style="margin-left: 10px;"><b>Phone:</b></label>
    <input type="text"  name="userphone" id="userphone">
    </li>
    
    </ul>

    <button type="submit">Submit</button>
   
   
</form>









</div>

</body>
</html>