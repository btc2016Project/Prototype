package webApplication11;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import db.DBmanager;

public class LoginServlet extends HttpServlet {
    /**
     * LoginServlet class ログイン
     */
    private static final long serialVersionUID = 1L;
    private Connection conn;
    private Statement st;
    private ResultSet rs;

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request
     *            servlet request
     * @param response
     *            servlet response
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request
     *            servlet request
     * @param response
     *            servlet response
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	// requestからusernameとpassの取得
	String un = request.getParameter("username");
	String pw = request.getParameter("password");

	// request内容の確認テスト
	// System.out.println(un + pw);
	try {
	    // DB接続
	    conn = DBmanager.getConn();
	    st = conn.createStatement();
	    // sql文 DB上のすべてのアカウントおよびパスワードから一致検索
	    String sql = "SELECT * FROM ITMEMBER where accname = \'" + un
		    + "\' " + "and pass =\'" + pw + "\'";
	    // Resultsetの実行
	    rs = st.executeQuery(sql);

	    // セッション情報の新規作成
	    HttpSession session = request.getSession();
	    // セッションオブジェクトに保存する EX)ユーザーネーム表示用
	    session.setAttribute("username", un);
	    session.setAttribute("password", pw);
	    // un = Cookiemake.getCookie(request, "un");

	    // contenttypeの指定 MIME: html 文字encoding:SJIS
	    response.setContentType("text/html; charset=shift-jis");

	    // 文字出力用メソッドの取得
	    PrintWriter out = response.getWriter();

	    // RequestDispatcher rd = request.getRequestDispatcher(url);
	    // rd.forward(request, response);
	    // 以下html------------------------
	    out.println("<HTML>");
	    out.println("<HEAD>");
	    out.println("<TITLE>ITarchives</TITLE>");
	    out.println("</HEAD>");
	    out.println("<BODY>");
	    try {
		if (rs.next() == true) {
		    out.println("<h3>" + un + "</h3>");
		    // 記事ページ(トップページ)へ
		    out.println("<p><a href=\"./UserInf\">登録情報の確認</a></p>");
		    // ログイン画面へ
		    out.println("<p><a href=\"./Login.html\">ログイン画面に戻る</a>");
		    out.println("</BODY>");
		    out.println("</HTML>");
		} else {
		    // ログインミス→ログイン画面に戻る
		    out.println("NG パスワードまたはユーザー名が違います");
		    out.println("<p><a href=\"./Login.html\">ログイン画面に戻る</a>");
		    out.println("</BODY>");
		    out.println("</HTML>");
		}
		// ---------------------------------------------------------------
	    } catch (SQLException e) {
		// TODO 自動生成された catch ブロック
		e.printStackTrace();
	    }

	} catch (ClassNotFoundException e) {
	    // TODO 自動生成された catch ブロック
	    e.printStackTrace();
	} catch (SQLException e) {
	    // TODO 自動生成された catch ブロック
	    e.printStackTrace();
	} finally {
	    // ResultSetを閉じる
	    if (rs != null) {
		try {
		    rs.close();
		} catch (SQLException e) {
		    // TODO 自動生成された catch ブロック
		    e.printStackTrace();
		}
	    }
	    // PreparedStatementを閉じる
	    if (st != null) {
		try {
		    st.close();
		} catch (SQLException e) {
		    // TODO 自動生成された catch ブロック
		    e.printStackTrace();
		}
	    }
	    // DB切断
	    System.out.println("okok");
	    DBmanager.close(conn);
	}
    }
}
