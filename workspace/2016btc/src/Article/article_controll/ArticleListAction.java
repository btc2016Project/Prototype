package Article.article_controll;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *@author aoyama 05/14
 *Servlet implementation class ArticleListAction
 */
public class ArticleListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcher;
		if (request.getParameterNames() != null) {
			// データベース接続サーブレットにフォワード
			requestDispatcher = request.getRequestDispatcher("/FetchArticleList");
			requestDispatcher.forward(request, response);
		} else {
			// パラメータの引き渡しがなければ、全一覧にフォワード
			requestDispatcher = request.getRequestDispatcher("/jsp_html/ArticleList.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
