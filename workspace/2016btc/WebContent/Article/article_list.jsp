<%@ page contentType="text/html;charset=utf-8"%>
<%@ page import="Article.bean.Article"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>

<html>
<head>
<link
	href="<%=request.getContextPath()%>/Article/stylesheet/article_style.css"
	rel="stylesheet" type="text/css">
<link
	href="<%=request.getContextPath()%>/Article/stylesheet/main_list_style.css"
	rel="stylesheet" type="text/css">
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
					<form action="<%=request.getContextPath()%>/Article_List_Action"
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
					<table  class="article_list">
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
								<td class="article_list"><%=list.getArticle_title()%></td>
								<td class="article_list"><a href=<%=list.getArticle_url()%>><%=list.getArticle_url()%></a></td>
								<td class="article_list"><%=list.getRegist_user_id()%><br> <%=list.getRegist_date()%></td>
								<td class="article_list"><%=list.getArticle_category()%></td>
							</tr>
							<%
								}
							%>
						</tbody>
					</table>



				</div>
			</div>
		</div>
		<%@ include file="template/footer.jsp"%>
	</div>
</body>
</html>
