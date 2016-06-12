<!--@author 遠藤 5/23 -->

<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="Article.bean.Article"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta charset="utf-8" />
<link href="<%=request.getContextPath() %>/Article/stylesheet/ArticleStyle.css" rel="stylesheet"
	type="text/css">
<link href="<%=request.getContextPath() %>/Article/stylesheet/MainListStyle.css" rel="stylesheet"
	type="text/css">
<title>indexテスト</title>
</head>
<body>
	<div class="contents">
		<div class="header">
			<h1>
				<a href="index.html">2016Project </a>
			</h1>
			<form class="top_search" action="<%=request.getContextPath() %>/ArticleSearchAction" method="get">
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
				<h3 class="title">記事検索</h3>
				<div class="search">
					<form action="<%=request.getContextPath() %>/ArticleSearchAction" method="get">
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
						List<Article> list = (ArrayList<Article>) request.getAttribute("article");
					%>
					<table class="ArticleList">
						<thead>
							<!--見出しにしました-->
							<tr>
							<th>タイトル</th>
							<th>リンク</th>
							<th>登録情報</th>
							<th>カテゴリ</th>
							</tr>
						</thead>
						<tbody>
							<!-- ここスクロールバー入れるかどうするか
						どっちにしても何個で？縦がどのくらいで？1ページに収めるかを決めてない-->
							<%
								for (Article article : list) {
							%>
							<form action="<%=request.getContextPath()%>/ArticleDetailAction">
							<tr>
								<td class="ArticleList"><input type="submit" value="<%=article.getArticle_title()%>"></td>
								<td class="ArticleList"><a href=<%=article.getArticle_url()%>><%=article.getArticle_url()%></a></td>
								<td class="ArticleList"><%=article.getRegist_user_id()%><br> <%=article.getRegist_date()%></td>
								<td class="ArticleList"><%=article.getArticle_category()%></td>
							</tr>
							<input type="hidden" name="id" value="<%=article.getArticle_id()%>"/>
							<input type="hidden" name="title" value="<%=article.getArticle_title()%>"/>
							<input type="hidden" name="category" value="<%=article.getArticle_category()%>"/>
							<input type="hidden" name="url" value="<%=article.getArticle_url()%>"/>
							<input type="hidden" name="data" value="<%=article.getRegist_date()%>"/>
							<input type="hidden" name="userId" value="<%=article.getRegist_user_id()%>"/>
							<input type="hidden" name="comment" value="<%=article.getArticle_comment()%>"/>
							<%-- <input type="hidden" name="comment" value="<%=list.getArticle_title()%>"/> --%>
							</form>
							<%
								}
							%>
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