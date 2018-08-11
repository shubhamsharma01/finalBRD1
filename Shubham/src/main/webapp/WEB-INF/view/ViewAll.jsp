<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <h1>CUSTOMER DETAILS</h1>
 <table id="example" cellspacing="0"  class="display" width="60%"> 
<!-- <table id="example" border = "2" cellpadding="10" class="display" width="100%"> -->
        <thead>
            <tr>
                <th>Customer Code</th>
                <th>Customer Name</th>
                 <th>Customer Address1</th>
                   <th>Customer Pin Code</th>
                    <th>Customer Email</th>
                     <th>Customer Contact Number</th>
                        
                             
            </tr>
        </thead>
        <tbody>
       
               <c:forEach var="list" items="${c}">
			   <tr>
                    <td><c:out value="${list.getCustomer_code()}" /></td>
                    <td><c:out value="${list.getCustomer_name()}" /></td>
                    <td><c:out value="${list.getCustomer_address1()}" /></td>
                    <td><c:out value="${list.getCustomer_pinCode()}" /></td>
                    <td><c:out value="${list.getEmail_address()}" /></td>
                    <td><c:out value="${list.getContact_number()}" /></td>

                    </tr>
			</c:forEach>
        </tbody>
        </table>
<script src="https://code.jquery.com/jquery-1.12.4.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js" type="text/javascript"></script>
<script>
$(document).ready(function()
{
    $('#example').DataTable();
} );
</script>
</body>
</html>