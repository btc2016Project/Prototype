<%@ page contentType="text/html;charset=utf-8" %>

    <div class="header">
      <h1>2016Project</h1>
      <form class="top_search" action="<%=request.getContextPath() %>/ArticleListAction" method="get">
          <input type=text name="freeword" placeholder="検索">
          <input type="submit" value="検索">
      </form>
    </div>
