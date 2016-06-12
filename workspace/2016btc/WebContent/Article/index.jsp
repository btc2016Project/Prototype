<%--@author aoyama 05/14 --%>

<%@ page contentType="text/html;charset=utf-8"%>

<html>
<head>
<link
	href="<%=request.getContextPath()%>/Article/stylesheet/ArticleStyle.css"
	rel="stylesheet" type="text/css">
<link
	href="<%=request.getContextPath()%>/Article/stylesheet/MainListStyle.css"
	rel="stylesheet" />
<title>includeテスト</title>
</head>
<body>
	<div class="contents">
		<div class="header">
			<h1>
				<a href="index.html">2016Project</a>
			</h1>
			<form class="top_search" action="ArticleList1.html" method="get">
				<input type=text name="freeword" placeholder="検索"> <input
					type="submit" value="検索">
			</form>
		</div>
		<div class="container">
			<div class="side_menu">
				<h3>
					<%@ include file="/Article/template/SideMenu.jsp"%>
				</h3>
			</div>
			<div class="main">
				<h2>トップページ</h2>
				<br>左手にあるサイドバーからメニューをお選びください
			</div>
		</div>
	</div>
	<div class="footer">
		<h3>@ 2016Project</h3>
	</div>
	</div>
</body>
</html>