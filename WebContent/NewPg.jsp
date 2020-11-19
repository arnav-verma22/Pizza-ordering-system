<%@page import="com.arnav.verma.Pg"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NewPg</title>
</head>
<%
	
	String req = null;
	req = request.getParameter("modifythis");
	String se = session.getAttribute("modifythis").toString();
	out.println(req + se);
%>
<body>
	
</body>
</html>