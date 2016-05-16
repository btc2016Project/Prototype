<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>pass_change</title>
</head>
<body>
<form method="post" action="<%=request.getContextPath()%>/Pass_change">
<h2>パスワードを変更します</h2>
IDを入力して下さい。<p></p>
<input type="text" name="id">
<p></p>
現在のパスワードを入力して下さい。<p></p>
<input type="text" name="nowpass">
<p></p>
新しいパスワードを入力して下さい。<p></p>
<input type="password" name="newpass"><p></p>
<input type="submit" value="送信"></a></p>
</form>
</body>
</html>