package User.validateCheck;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InputValidate {
	/**
     * validate class
     * @author okamoto
     * user name と passwordの文字列長チェック
     *
     */

    public static void inputCheck(String un, String pw, HttpSession session,
	    HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	UserNameTest ut = new UserNameTest();
	PasswordCheck pc = new PasswordCheck();
//入力ミスがあればログイン画面に戻る
	if (ut.userNameTest(un) == true || pc.passWordCheck(pw) == true) {
	    session.setAttribute("errorStatusLength", "NotAuth");
	    RequestDispatcher dispatcher = request
		    .getRequestDispatcher("/Login.jsp");
	    dispatcher.forward(request, response);
	}
    }
}
