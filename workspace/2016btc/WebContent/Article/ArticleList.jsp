<!--@author 遠藤 5/23 -->

<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="Article.bean.Article"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta charset="utf-8" />
<link href="stylesheet/ArticleStyle.css" rel="stylesheet"
	type="text/css">
<link href="stylesheet/MainListStyle.css" rel="stylesheet"
	type="text/css">
<title>indexテスト</title>
</head>
<body>
	<div class="contents">
		<div class="header">
			<h1>
				<a href="index.html">2016Project </a>
			</h1>
			<form class="top_search" action="ArticleList1.html" method="get">
				<input type=text name="freeword" placeholder="検索"> <input
					type="submit" value="検索">
			</form>
		</div>
		<div class="container">
			<div class="side_menu">
				<h3>
					<a href="ArticleList.html">記事一覧 </a> <a href="">記事登録 </a> <a
						href="">ユーザ一覧 </a> <a href="">ユーザ情報 </a>
				</h3>
			</div>
			<div class="main">
				<h3 class="title">記事検索</h3>
				<div class="search">
					<form action="ArticleList1.html" method="get">
						<p>
							<u>分類 </u> <select name="category">
								<option selected>
								<option value="Java">Java
								<option value="Oracle">Oracle
								<option value="Others">Others
							</select>
							<!--30文字以内でテキストボックスの横幅は20（デフォ） -->
							<u>フリーワード </u>: <input type="text" name="freeword" size="20"
								maxlength="30" placeholder="検索">
						</p>
						<input type="submit" value="検索"> <input type="reset"
							value="リセット">
					</form>
					<HR>
				</div>
				<div>
					<h3>記事一覧（ｎ件中4件表示）</h3>
					<%
						List<Article> list = (ArrayList) request.getAttribute("article");
					%>
					<table class="ArticleList">
						<h2></h2>
						<thead>
							<!--見出しにしました-->
							<th>タイトル</th>
							<th>リンク</th>
							<th>登録情報</th>
							<th>カテゴリ</th>
						</thead>
						<tbody>
							<!-- ここスクロールバー入れるかどうするか
						どっちにしても何個で？縦がどのくらいで？1ページに収めるかを決めてない-->
							<c:forEach var="article" items="list">
								<tr>
									<!--それぞれの項目ごとに横幅を決めてます（幅は要検討）
							一番上だけにつけてますが深い意味はありません-->
									<td class="title ArticleList">適当なの</td>
									<td class="link ArticleList"><a href="ArticleDetail.html" />ArticleDetail.html
									</td>
									<td class="info ArticleList">${article.user_name}
										<br> <br> <br></td>
									<td class="ct ArticleList">${article.article_category}
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div class="center">
					<p>
						<input type="button" value="最初のページへ" onClick="location.href='';">1
						<a href="">2 </a> <a href="">3 </a> <input type="button"
							value="最後のページへ" onClick="location.href='';">
					</p>
				</div>
			</div>
		</div>
	</div>
	<div class="footer">
		<h3>@ 2016Project</h3>
	</div>
	</div>
</body>
</html>