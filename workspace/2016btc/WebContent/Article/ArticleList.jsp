<%--@author aoyama 05/14 --%>

<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="Article.bean.Article"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>

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
				<h2>記事一覧</h2>
				<div class="search">
					<h3 class="title">記事検索</h3>
					<form action="<%=request.getContextPath()%>/ArticleListAction"
						method="get">
						<p>
							<select name="category">
								<option selected>
								<option value="Java">Java
								<option value="Oracle">Oracle
								<option value="Others">Others
							</select> フリーワード:<input type="text" name="freeword" placeholder="検索">
						</p>
						<input type="submit" value="検索"><input type="reset"
							value="リセット">
					</form>
				</div>
				<div>

					<%
						List<Article> article = (ArrayList) request.getAttribute("article");
					%>
					<table  class="ArticleList">
						<thead>
							<tr>
								<td>タイトル</td>
								<td>リンク</td>
								<td>登録情報</td>
								<td>カテゴリ</td>
							</tr>
						</thead>
						<tbody>
							<%
								for (Article list : article) {
							%>
							<tr>
								<td class="ArticleList"><%=list.getArticle_title()%></td>
								<td class="ArticleList"><a href=<%=list.getArticle_url()%>><%=list.getArticle_url()%></a></td>
								<td class="ArticleList"><%=list.getRegist_user_id()%><br> <%=list.getRegist_date()%></td>
								<td class="ArticleList"><%=list.getArticle_category()%></td>
							</tr>
							<%
								}
							%>
						</tbody>
					</table>



				</div>
			</div>
		</div>
		<%@ include file="template/Footer.jsp"%>
	</div>
</body>
</html>
