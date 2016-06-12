package User.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import User.db.DBmanager;
import User.validateCheck.InputValidate;
import common.DBManager;

public class LoginServlet extends HttpServlet {
    /**
     * LoginServlet ログイン
     * @author okamoto
     *
     * struts使用前
     */
    private static final long serialVersionUID = 1L;
    private Connection conn;

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request
     *            servlet request
     * @param response
     *            servlet response 処理なし
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
	String url = null;
	HttpSession session = request.getSession();
	// requestからusernameとpassの取得
	String un = request.getParameter("username");
	String pw = request.getParameter("password");

	// 入力チェック missがあれば再度Loginへ
	InputValidate.inputCheck(un, pw, session, request, response);
	try {

		Connection con = DBManager.getConn();
	    Statement st = con.createStatement();

	    String sql = "SELECT * FROM user_master where user_name = \'" + un
		    + "\' " + "and user_password =\'" + pw + "\'";

	    ResultSet rs = st.executeQuery(sql);

	    if (rs.next() == true) {
		// セッションオブジェクトに保存する
		//session.setAttribute("username", un);
		session.setAttribute("password", pw);
		// url (フォワード先の指定) ログイン後トップページへ
		url = "/User/toppage.jsp";
	    } else {
		// url (フォワード先の指定) ログイン失敗後 再度ログイン画面へ
		session.setAttribute("errorStatusMiss", "NotAuth");
		url = "/User/Login.jsp";
	    }
	    st.close();
	    rs.close();
	} catch (SQLException e) {
	    e.printStackTrace();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	} finally {
		DBmanager.close(conn);
	    }
	    // 入力チェックでミスなしの場合、urlで指定した遷移先へ
	    if (url != null) {
		RequestDispatcher dispatcher = request
		.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	    }
	}
    }
