package User.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {

    /**
     *@author okamoto
     *ログアウト
     */
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws IOException, ServletException {
	// (false)現行のセッションがなければnullを返す
	HttpSession session = request.getSession(false);
	//session保持確認出力
	System.out.println(session.getAttribute("username"));

	if (session.getAttribute("username") != null
		|| session.getAttribute("errorStatusMiss") != null
		|| session.getAttribute("errorStatusLength") != null) {
	    System.out.println("sessionを破棄");
	    session.removeAttribute("username");
	    session.removeAttribute("errorStatusMiss");
	    session.removeAttribute("errorStatusLength");
	}
	//Login画面に遷移
	response.sendRedirect("./Login.jsp");

    }
}
