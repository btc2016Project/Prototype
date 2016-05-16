package Article.article_controll;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Article_List_Action
 */
public class Article_List_Action extends HttpServlet {
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
			System.out.println("データ接続します");
			requestDispatcher = request.getRequestDispatcher("/Fetch_Article_List");
			requestDispatcher.forward(request, response);
		} else {
			System.out.println("普通に遷移sます");
			// パラメータの引き渡しがなければ、全一覧にフォワード
			requestDispatcher = request.getRequestDispatcher("/jsp_html/article_list.jsp");
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
