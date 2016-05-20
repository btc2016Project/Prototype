<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- okamoto -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>IT archives</h1>
<%
if(session.getAttribute("username") != null){
%>
${username}
<p><a href="<%=request.getContextPath() %>/LogoutServlet">ログアウト</a></p>
<a href="./UserInf.jsp">登録情報一覧</a>
<p><a href="<%=request.getContextPath() %>/User/Login.jsp">記事検索ページへ(Loginへ)</a></p>
<%
}
%>
<%
if(session.getAttribute("username") == null){
%>
<p><a href="<%=request.getContextPath() %>/User/Login.jsp">ログイン画面へ</a></p>
<%
}
%>
</body>
</html>