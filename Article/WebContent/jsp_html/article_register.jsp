<%@ page contentType="text/html;charset=utf-8"%>

<html>
<head>
<link href="<%=request.getContextPath() %>/jsp_html/stylesheet/article_style.css" rel="stylesheet"
	type="text/css">
<link href="<%=request.getContextPath() %>/stylesheet/main_list_style.css" rel="stylesheet"
	type="text/css">
<title>includeテスト</title>
</head>
<body>
	<div class="contents">
		<%@ include file="template/header.jsp"%>
		<div class="container">
			<%@ include file="template/side_menu.jsp"%>
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
		<%@ include file="template/footer.jsp"%>
	</div>
</body>
</html>
