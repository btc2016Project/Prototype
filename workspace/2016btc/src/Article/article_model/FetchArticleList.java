package Article.article_model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Article.bean.Article;
import common.DBManager;

/**
 * @author aoyama 05/14 Servlet implementation class FetchArticleList
 */
public class FetchArticleList {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public static void searchArticleList(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// データアクセスのパート
		try {
			Connection con = DBManager.getConn();

			String sql = "SELECT * FROM `article_master` WHERE `article_title` LIKE ? AND `article_category`= ?";

			String freeword = request.getParameter("freeword");
			if (request.getParameter("freeword") == null) {
				freeword = "";
			}

			String category = request.getParameter("category");
			if (category == "" || category == null) {
				sql = "SELECT * FROM `article_master` WHERE `article_title` LIKE ?";
			}

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, "%" + freeword + "%");
			if (category != "" && category != null) {
				ps.setString(2, request.getParameter("category"));
			}

			ResultSet rs = ps.executeQuery();

			List<Article> list = new ArrayList<Article>();
			while (rs.next()) {

				int article_id = rs.getInt("article_id");
				String article_title = rs.getString("article_title");
				String article_url = rs.getString("article_url");
				String article_category = rs.getString("article_category");
				String regist_date = rs.getString("regist_date");
				int regist_user_id = rs.getInt("regist_user_id");
				String article_comment = rs.getString("article_comment");

				list.add(new Article(article_id, article_title, article_url, article_category, regist_user_id,
						regist_date,article_comment));
			}

			request.setAttribute("article", list);

			rs.close();
			ps.close();

		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

	public static void fetchListByArticleId(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException {
		Connection con = DBManager.getConn();
		String sql = "SELECT * FROM `article_master` WHERE `article_id` = ?";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, (String) request.getAttribute("articleId"));
		ResultSet rs = ps.executeQuery();

		List<Article> list = new ArrayList<Article>();
		while (rs.next()) {

			int article_id = rs.getInt("article_id");
			String article_title = rs.getString("article_title");
			String article_url = rs.getString("article_url");
			String article_category = rs.getString("article_category");
			String regist_date = rs.getString("regist_date");
			int regist_user_id = rs.getInt("regist_user_id");
			String article_comment = rs.getString("article_comment");

			list.add(
					new Article(article_id, article_title, article_url, article_category, regist_user_id, regist_date,article_comment));
		}

		request.setAttribute("article", list);

		rs.close();
		ps.close();
	}

}
