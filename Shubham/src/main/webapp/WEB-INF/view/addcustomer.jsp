<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add</title>
</head>

<script>

</script>

<body>
<%@include file="index1.jsp" %>



<h1><center>Insert New Record</center></h1>
<s:form action="add1" modelAttribute="customer">
<table border="5" align="center" >
<tr><td>Customer Code:</td><td><s:input  path="customer_code" /><s:errors path="customer_code"/></td></tr>
<tr><td>Customer Name:</td><td><s:input path="customer_name" /><s:errors path="customer_name"/></td></tr>
<tr><td>Customer Address :</td><td><s:input path="customer_address1" /><s:errors path="customer_address1"/></td></tr>
<tr><td>Customer Pin Code:</td><td><s:input path="customer_pinCode" /><s:errors path="customer_pinCode"/></td></tr>
<tr><td>E-mail address:</td><td><s:input path="email_address" /><s:errors path="email_address"/></td></tr>
<tr><td>Contact number:</td><td><s:input path="contact_number" /><s:errors path="contact_number"/></td></tr>
<tr><td></td><td><input type="submit" value="submit details" /></td></tr>

</table>
</s:form>
</body>
</html> 





