<%@page import="com.arnav.verma.Pizza"%>
<%@page import="com.arnav.verma.Pg"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center;">Cart</h1>
<div style="text-align:center;">
	<%
		ArrayList<Pizza> list1 = (ArrayList<Pizza>)session.getAttribute("Cart");
		int total = 0;
		for(Pizza pz:list1)
		{
			out.println("Pizza : " + pz.getName() + "<br>");
			
			out.println("Price: " + pz.getPrice() + "<br>");
			total += pz.getPrice();
			out.println("<br><br>");
		}
		out.println("Total Price = " + total + "<br>");
		if(list1.size() == 0)
		{
			out.println("Sorry No PGs available, try reducing filters..");
		}
		
					
	%>
	<form action="Order.jsp">
		<br><input type="submit" value="Place order" name="add">
	</form>
	</div>
</body>
</html>