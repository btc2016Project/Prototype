package Article.article_controll;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Article.article_model.FetchArticleList;

/**
 * Servlet implementation class ArticleSearchAction
 */
public class ArticleSearchAction extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *
	 *      記事検索に用いるメソッド
	 *      DBから検索条件に合う記事をとってきてresponseに返す
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//DBからデータを取ってくる
			FetchArticleList.searchArticleList(request, response);
		//画面遷移
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Article/ArticleList.jsp");
			requestDispatcher.forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
