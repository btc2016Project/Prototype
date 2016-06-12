<%--@author aoyama 05/14 --%>

<%@ page contentType="text/html;charset=utf-8"%>

<html>
<head>
<link
	href="<%=request.getContextPath()%>/Article/stylesheet/ArticleStyle.css"
	rel="stylesheet" type="text/css">
<link
	href="<%=request.getContextPath()%>/Article/stylesheet/MainListStyle.css"
	rel="stylesheet" />
<title>includeテスト</title>
</head>
<body>
	<div class="contents">
		<%@ include file="template/Header.jsp"%>
		<div class="container">
			<%@ include file="template/SideMenu.jsp"%>
			<form method="get" action="<%=request.getContextPath()%>/Echo">
				<div class="main">
					<h3 class="title center">記事編集</h3>
					<form action="ArticleConfirm.html" method="get">

                   <p>記事タイトル<input type="text" name="title"
									size="100" placeholder="記事タイトル maxlength50" maxlength="50"></p>

							<p>記事URL      <input type="text" name="url" size="100"
									placeholder="記事url maxlength100" maxlength="100"></p>
                   <!--上にそろえたかったけど何か無理-->

							<p class="verticaltop">コメント      <textarea name="comment"
									rows=5 cols="100" maxlength="100" placeholder="maxlength100"></textarea>
									</p>

							<p>分類            <select name="category">
								<option selected>

									<option value="Java">Java

									<option value="Oracle">Oracle

									<option value="Others">Others

								</select>
								</p>

							<p> <input type="submit" value="確認">  <input
									type="reset" value="リセット">    <INPUT type="button"
									onClick='history.back();' value="戻る"></p>
					</form>
				</div>
		</div>
	</div>
	<div class="footer">
	<%@ include file="template/Footer.jsp"%>
	</div>
</body>
</html>