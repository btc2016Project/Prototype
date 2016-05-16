<%@ page contentType="text/html;charset=utf-8"%>

<html>
<head>
<link href="stylesheet/article_style.css" rel="stylesheet"
	type="text/css">
<link href="stylesheet/main_list_style.css" rel="stylesheet"
	type="text/css">
<title>includeテスト</title>
</head>
<body>
	<div class="contents">
		<%@ include file="template/header.jsp"%>
		<div class="container">
			<%@ include file="template/side_menu.jsp"%>
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
		<%@ include file="template/footer.jsp"%>
	</div>
</body>
</html>