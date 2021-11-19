<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add news</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


</head>
<body>
<div>
<form method="post" action ="/collegeportal/News">
  <div class="form-group">
    <label for="sub">Subject</label>
    <input type="text" class="form-control" id="Subject" name="Subject">
  
  </div>
  <div class="form-group">
    <label for="Content">Content</label>
    <input type="text" class="form-control" id="Content" name="Content">
  </div>
   <div class="form-group">
    <label for="Date">Date</label>
    <input type="text" class="form-control" id="date" name="date">
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</body>
</html>