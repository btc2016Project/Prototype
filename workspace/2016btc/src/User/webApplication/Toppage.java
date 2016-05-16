package webApplication11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Toppage extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {

	HttpSession session = request.getSession();
	response.setContentType("text/html; charset=UTF-8");
	PrintWriter out = response.getWriter();

	out.println("<HTML>");
	out.println("<HEAD>");
	out.println("<TITLE>ITarchives</TITLE>");
	out.println("</HEAD>");
	out.println("<BODY>");
	out.println("<h3>トップページ</h3>");
	out.println("<p><a href=\"./Login.html\">ログイン画面へ</a>");
	out.println("</BODY>");
	out.println("</HTML>");
    }
}
