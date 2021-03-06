﻿package Article.article_controll;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Article.article_model.FetchArticleList;

/**
 * @author aoyama 05/14 Servlet implementation class ArticleListAction
 *         一覧画面に遷移する際のcontrollerクラス DBからデータを全権取得してrequestに入れる。
 */
public class ArticleListAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			RequestDispatcher requestDispatcher;


			// DBからデータを取り、requestに格納するメソッド
			FetchArticleList.searchAllArticle(request, response);
			requestDispatcher = request.getRequestDispatcher("/Article/ArticleList.jsp");

			// 一覧画面に遷移
			requestDispatcher.forward(request, response);


		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
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
