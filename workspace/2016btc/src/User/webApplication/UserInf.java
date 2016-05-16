package webApplication11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class UserInf extends HttpServlet {
    protected void doGet(HttpServletRequest request,
	    HttpServletResponse response) throws ServletException, IOException {

	HttpSession session = request.getSession();

	response.setContentType("text/html; charset=UTF-8");
	PrintWriter out = response.getWriter();

	// セッションオブジェクトの獲得確認
	if (session == null || session.getAttribute("username") == null) {
	    // セッションが取得できなければエラー
	    out.println("Cookieが無効です。Cookieを有効にしてからもう一度ログインしなおしてください。");
	} else {
	    // セッションが取得できた場合はリストを表示
	    out.println("<HTML>");
	    out.println("<HEAD>");
	    out.println("<TITLE>ITarchives</TITLE>");
	    out.println("</HEAD>");
	    out.println("<BODY>");
	    out.println("<h3>登録情報</h3>");
	    out.println("<p>UserName <br />" + session.getAttribute("username")
		    + "</p>");
	    // パスワードの表示
	    out.println("<p>password<br />" + session.getAttribute("password")
		    + "</p>");

	    out.println("<p><a href=\"./Login.html\">ログイン画面に戻る</a>");
	    out.println("<p><a href=\"Toppage\">トップページへ戻る</a>");
	    out.println("</BODY>");
	    out.println("</HTML>");
	}
    }
}