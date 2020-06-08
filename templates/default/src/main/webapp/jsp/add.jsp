<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Add a new record </h1>
	</div>
 <form:form method="post" action="save">   

	<table class="table table-dark">
		<thead>
			<tr>
				
				<th scope="col">Name</th>
				<th scope="col">Phone</th>
				<th scope="col">Email</th>
			</tr>
		</thead>
		<tbody>
			
			
				<tr>
					<td><form:input path="name"  /></td>
                                        <td><form:input path="phoneNumber"  /></td>
                                        <td><form:input path="email"  /></td>

				</tr>
				
								
		</tbody>
	</table>
<input type="submit" value="Save" />
   </form:form>    
<a href="Az">View User</a> 
</body>
</html>