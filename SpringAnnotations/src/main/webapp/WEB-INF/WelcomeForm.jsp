<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login </title>
</head>
<body>
<h1>${msg }</h1>
<form action="/SpringMVCAnnotations/Success3" method="post"/>
<form:errors path="user1.*"/>

<table>
 <tr> <td> User Name  </td> <td>   <input type="text" name="user"/> </td> </tr>
  <tr> <td> Date of Birth </td> <td> <input type="text" name="dob"/>  </td> </tr> 
 <tr> <td> Degree </td> <td><input type="text" name="degree"/>  </td> </tr>
 <tr> <td>City  </td> <td><input type="text" name="city"/>   </td> </tr>
  <tr> <td>State</td> <td> <input type="text" name="state"/>  </td> </tr>
  <tr> <td> Zipcode</td> <td> <input type="text" name="zipcode"/>  </td> </tr>
  </table>
 <tr> <td>    </td> <td>   <input type="submit" value="submit"/>  </td> </tr>

</body>
</html>