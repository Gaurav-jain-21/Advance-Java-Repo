<%@page import="java.util.Scanner" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add two number</title>
</head>
<body bgcolor="cyan">
<%!
int coef= 3;
Scanner sc = new Scanner(System.in);
%>
<%
out.println("hello world");
%>
<h1> we dont talk anymore lik</h1>
<%
int i = Integer.parseInt(request.getParameter("num1"));
int j = Integer.parseInt(request.getParameter("num2"));
int k = i +j;
out.println("output : "+ k);
%>
<br/>
my Fav Number is : <%= coef %>

</body>
</html>