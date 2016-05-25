<%@ page contentType="text/html;charset=utf-8"%>

<div class="header">
	<h1>
		<a href="<%=request.getContextPath()%>/ArticleSearchAction">2016Project </a>
	</h1>
	<form class="top_search"
		action="<%=request.getContextPath()%>/ArticleSearchAction"
		method="get">
		<input type=text name="freeword" placeholder="検索"> <input
			type="submit" value="検索">
	</form>
</div>
