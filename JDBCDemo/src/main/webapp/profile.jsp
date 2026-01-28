<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Data</title>
</head>
<body>

<%
String url = "jdbc:mysql://localhost:3306/employee?useSSL=false&serverTimezone=UTC";
String sql = "select * from empdata";

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(url, "root", "Roman123@.");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sql);

if (rs.next()) {
%>

empId: <%= rs.getInt(1) %><br/>
Name: <%= rs.getString(2) %><br/>
mobile: <%= rs.getString(3) %><br/>

<%
}

rs.close();
st.close();
con.close();
%>

</body>
</html>
