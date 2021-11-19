<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bootstrap Validation</title>

<%@include file="/html/commonheader.html"%>
</head>
<body>
	<div>

		<form class="was-validated">
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control" id="txtemail" name="email"
					required="required">


				<div class="valid-feedback ">thanku for ur id</div>
				<div class="invalid-feedback">id required</div>
			</div>




			<div class="form-group">
				<label for="email">Name</label> <input type="text"
					class="form-control" id="name" name="name" required="required">


				<div class="valid-feedback ">thanku for ur id</div>
				<div class="invalid-feedback">id required</div>
			</div>





			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="txtpass" name="txtpass"
					required="required">

				<div class="valid-feedback ">thanku for ur password</div>
				<div class="invalid-feedback">password required</div>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>
	<%@include file="/html/commonfooter.html"%>
</body>
</html>