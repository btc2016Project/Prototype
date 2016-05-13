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
			<div class="main">
				<h2>記事一覧</h2>
				<div class="search">
					<h3 class="title">記事検索</h3>
					<p>
						なんか検索項目1: <input type="checkbox" name="name" value="1">検索値１
						<input type="checkbox" name="name" value="2">検索値２
					</p>
					<p>
						なんか検索項目2: <input type="checkbox" name="name" value="1">検索値１
						<input type="checkbox" name="name" value="2">検索値２
					</p>
					<p>
						フリーワード:<input type="text" name="name" placeholder="検索"> <input
							type="button" name="name" value="検索">
					</p>

				</div>
			</div>
		</div>
		<%@ include file="template/footer.jsp"%>
	</div>
</body>
</html>
