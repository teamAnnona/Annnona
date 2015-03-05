<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert Page</title>
	</head>
	<body>
		<center>
			<table border = 1>
				<form:form commandName="RegisterCommand">
				<tr>
					<td>First Name :
					</td>
					<td><form:input path="firstName"/>
					</td>
				</tr>
				<tr>
					<td>Second Name :
					</td>
					<td><form:input path="secondName"/>
					</td>
				</tr>	
				 <tr>
					<td>Mobile Number
					</td>
					<td><form:input path="mobile"/>
					</td>
				</tr>
				
				<tr>
					<td>E-mail
					</td>
					<td><form:input path="email"/>
					</td>
				</tr>
				
					<td>Alternative E-mail
					</td>
					
					<td><form:input path="alternativeemail"/>
					</td>
				<tr>
					<td>Address
					</td>
					<td><form:input path="address"/>
					</td>
				</tr>
				<tr>
					<td>Marital status:
					</td>
					<td><form:input path="maritalstatus"/>
					</td>
				</tr>
				 
				<tr>
					<td>Citizenship
					</td>
					<td><form:input path="citizenship"/>
					</td>
				</tr>
				
				         
				
				
				<tr>
					<td colspan="2">
					
						<input type="submit" value="save"/>  
						
				     </form>
					</td>
				</tr>
				
				
				
			</table>
			
			</form:form>
				<form action="login.htm">

<input type="submit"  value="Next">

</form>
		</center>
	</body>
</html>