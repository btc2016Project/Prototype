<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pass_forget</title>
</head>
<body>
<form method="post" action="<%=request.getContextPath()%>/Pass_forget">
IDを入力して下さい。<p></p>
<input type="text" name="id"><p></p>
秘密の質問を入力してください。<p></p>

<select name="kinds">
  <option value="elementaryschool">通っていた小学校は</option>
  <option value="food">好きな食べ物は</option>
</select><p></p><DIV style="line-height: 25pt;">

<BR>

</DIV>
<input type="text" name="word"><p></p>
<a href="After_pass_forget.jsp"><input type="submit" value="送信"></a>
</form>
</body>
</html>