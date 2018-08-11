<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %> 
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<s:form action="add1" modelAttribute="user">
<table border="5" align="center" >



<tr><td>User Name </td><td><s:input path="username" /></td></tr>
<tr><td>User Role Password </td><td><s:input path="userPassword" /><s:errors path="userPassword"/></td></tr>
<%-- <tr><td>User Role </td><td><s:input path="userRole" /><s:errors path="userRole"/></td></tr>
 --%><tr><td></td><td><input type="submit" value="submit details" /></td></tr>
</table>
</s:form>
</body>
</html>