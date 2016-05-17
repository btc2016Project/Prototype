<%--@author aoyama 05/14 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="<%=request.getContextPath()%>/Article/stylesheet/ArticleStyle.css"
	rel="stylesheet" type="text/css">
<link
	href="<%=request.getContextPath()%>/Article/stylesheet/MainListStyle.css"
	rel="stylesheet" type="text/css">
<title>includeテスト</title>
</head>
<body>
	<div class="contents">
		<%@ include file="template/Header.jsp"%>
		<div class="container">
			<%@ include file="template/SideMenu.jsp"%>
			<div class="main">
			<h3>記事詳細</h3>
			<p>タイトル</p>

			<p>登録日/登録者    分類</p>

			<p>記事概要</p>

			<p>コメント</p>


			<form>

			<input type="submit">
			</form>
			<a href="javascript:history.back();">戻る</a>
			</div>
		</div>
	</div>
	<%@ include file="template/Footer.jsp"%>
</body>
</html>

