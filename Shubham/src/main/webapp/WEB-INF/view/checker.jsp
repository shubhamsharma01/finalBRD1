<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

 <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <a class="navbar-brand" href="#"><security:authentication property="name"/></a>
    
    </div>
      <ul class="nav navbar-nav navbar-right">
      <li><a href="j_spring_security_logout"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
      </ul>
      </div>
      </nav>
      
<IFRAME width="600" height="870" SRC="adduser" frameborder=10></IFRAME>
<IFRAME width="600" height="870" SRC="viewuser" frameborder=10></IFRAME>

</body>
</html>