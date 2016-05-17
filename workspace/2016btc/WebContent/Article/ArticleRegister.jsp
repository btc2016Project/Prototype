<%--@author aoyama 05/14 --%>

<%@ page contentType="text/html;charset=utf-8"%>

<html>
<head>
<link href="<%=request.getContextPath() %>/Article/stylesheet/ArticleStyle.css" rel="stylesheet"
	type="text/css">
<link href="<%=request.getContextPath() %>/Article/stylesheet/MainListStyle.css" rel="stylesheet"
	type="text/css">
<title>includeテスト</title>
</head>
<body>
	<div class="contents">
		<%@ include file="template/Header.jsp"%>
		<div class="container">
			<%@ include file="template/SideMenu.jsp"%>
			<div class="main">
				<h2>記事情報登録</h2>
				<div>
				<p>タイトル</p>
					<input type=text name="">
				</div>
				<div>
				<p>タイトル</p>
					<input type=text name="">
				</div>
				<div>
				<p>タイトル</p>
					<input type=text name="">
				</div>
				<div>
				<p>タイトル</p>
					<input type=text name="">
				</div>
				<div>
				<p>タイトル</p>
					<input type=text name="">
				</div>

				<div class="confirm">
				<input type="button" value="戻る">
				<input type="button" value="確認">
				</div>
			</div>
		</div>
		<%@ include file="template/Footer.jsp"%>
	</div>
</body>
</html>
