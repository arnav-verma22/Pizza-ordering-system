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
<title>Search PGs</title>
</head>
<body>
	<%
		String my = null;
		if(session.getAttribute("my") != null)
			my = session.getAttribute("my").toString();
	%>
	<h1 style="text-align:center;">Pizza Feast</h1>
<div style="text-align:center;">
	
	<form action="Modifyserv" >
			<c:forEach items="${list}" var="Pizza">
			<input type="radio"  placeholder="Enter your name" value="${Pizza.name }" name="name"/>${Pizza.name}<br>
			<input type="hidden" placeholder="Price of PG" name="price"/>${Pizza.price}<br>
			<br><br>
			</c:forEach>
			<input type="submit" value="Add to Cart" name="modifythis"/>
		</form>
	</div>
	<%
		/*ArrayList<Pizza> list1 = (ArrayList<Pizza>)session.getAttribute("list");
		for(Pizza pz:list1)
		{
			out.println("Owner's Name: " + pz.getName() + "<br>");
			/*out.println("Contact: " + pg.getContact() + "<br>");
			out.println("City: " + pg.getAddress() + "<br>");
			out.println("Room Type: " + pg.getRoom() + "<br>");
			out.println("Price: " + pz.getPrice() + "<br>");
			out.println("<br><br>");
		}
		if(list1.size() == 0)
		{
			out.println("Sorry No PGs available, try reducing filters..");
		}*/
					
	%>
	
</body>
</html>