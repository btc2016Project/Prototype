<%--@author aoyama 05/14 --%>

<%@ page contentType="text/html;charset=utf-8"%>

<html>
<head>
<link href="<%=request.getContextPath() %>/Article/stylesheet/ArticleStyle.css" rel="stylesheet"
	type="text/css">
<link href="<%=request.getContextPath() %>/Article/stylesheet/MainListStyle.css" rel="stylesheet"/>
<title>includeテスト</title>
</head>
<body>
	<div class="contents">
		<%@ include file="template/Header.jsp"%>
		<div class="container">
			<%@ include file="template/SideMenu.jsp"%>
			<form method="get" action="<%=request.getContextPath()%>/Echo">
			<div class="main">
				<h2>記事情報登録</h2>
				<div>
				<p>タイトル1</p>
					<input type=text name="title1">
				</div>
				<div>
				<p>タイトル2</p>
					<input type=text name="title2">
				</div>
				<div>
				<p>タイトル3</p>
					<input type=text name="title3">
				</div>
				<div>
				<p>タイトル4</p>
					<input type=text name="title4">
				</div>
				<div>
				<p>タイトル5</p>
					<input type=text name="title5">
				</div>

				<div class="confirm">
				<input type="button" value="戻る">
				<input type="submit" value="確認">
				</form>
				</div>
			</div>
		</div>
		<%@ include file="template/Footer.jsp"%>
	</div>
</body>
</html>