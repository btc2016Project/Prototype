<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- okamoto -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<%
if(session.getAttribute("errorStatusMiss")=="NotAuth"){
    %>
    UserName or Password status MISS
<%}%>
<%
if(session.getAttribute("errorStatusLength")=="NotAuth"){
    %>
    UserName or Password Length MISS
<%}%>
   <FORM method="POST" action="<%=request.getContextPath()%>/LoginServlet">
<p>UserName : <INPUT type="text" name="username"></p>
  <p>Password : <INPUT type="password" name="password"></p>
      <INPUT type="submit" value="SEND">
      <INPUT type="reset" value="RESET">
    </FORM>
   <p> <a href="./toppage.jsp">トップページへ</a></p>
</body>
</html>