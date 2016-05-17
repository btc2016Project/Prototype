<%--@author aoyama 05/14 --%>

<%@ page contentType="text/html;charset=utf-8"%>

<html>
<head>
<<<<<<< HEAD:workspace/2016btc/WebContent/Article/ArticleRegister.jsp
<link href="<%=request.getContextPath() %>/Article/stylesheet/ArticleStyle.css" rel="stylesheet"
	type="text/css">
<link href="<%=request.getContextPath() %>/Article/stylesheet/MainListStyle.css" rel="stylesheet"
=======
<link href="stylesheet/article_style.css" rel="stylesheet"
	type="text/css">
<link href="stylesheet/main_list_style.css" rel="stylesheet"
>>>>>>> d1b745a87c23bc3dbc282c4d656919108a1d44ee:workspace/2016btc/WebContent/Article/article_register.jsp
	type="text/css">
<title>includeテスト</title>
</head>
<body>
	<div class="contents">
		<%@ include file="template/Header.jsp"%>
		<div class="container">
<<<<<<< HEAD:workspace/2016btc/WebContent/Article/ArticleRegister.jsp
			<%@ include file="template/SideMenu.jsp"%>
=======
			<%@ include file="template/side_menu.jsp"%>
			<form method="get" action="<%=request.getContextPath()%>/Echo">
>>>>>>> d1b745a87c23bc3dbc282c4d656919108a1d44ee:workspace/2016btc/WebContent/Article/article_register.jsp
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