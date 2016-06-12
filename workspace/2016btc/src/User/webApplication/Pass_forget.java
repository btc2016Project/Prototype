package User.webApplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Pass_forget extends HttpServlet {
    private static final long serialVersionUID = 1L;
    String word = null;
    String pass = null;
    public void doPost(HttpServletRequest request, HttpServletResponse response)

            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        //idと秘密の質問を取得
        String id = request.getParameter("id");
        String aikotoba = request.getParameter("word");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //DBとの連携
        DB manager = new DB();
        try {
            // 接続する
            Connection conn = null;
            PreparedStatement ps = null;
            //変数の初期化
            ResultSet rs = null;
            String word = null;
            String pass = null;
            conn = manager.getConn();
            //SQL文の作成
            ps = conn.prepareStatement("SELECT * FROM pass WHERE id = ?");
            //バインド
            ps.setString(1, id);
            rs = ps.executeQuery();
            //秘密の質問とパスワードの取得
            while (rs.next()) {
                word = rs.getString("word");
                pass = rs.getString("pass");
                }


            //入力された秘密の質問が正しいかチェック
            //正しい場合はパスワードを表示
            //異なる場合は再表示
            if (aikotoba.equals(word)) {
                String str = pass;
                request.setAttribute("password", str);
                RequestDispatcher dispatcher = request
                                .getRequestDispatcher("/jsp/After_pass_forget.jsp");
                dispatcher.forward(request, response);
            }
            else {
                response.sendRedirect(request.getContextPath() + "/jsp/Error_pass_forget.jsp");
            }
            out.println("</body></html>");
            out.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            }
        catch (SQLException e) {
            System.err.println("Oracleエラーコード:" + e.getErrorCode());
            System.err.println("SQLStateコード:" + e.getSQLState());
            System.err.println("エラーメッセージ:" + e.getMessage());
            e.printStackTrace();
            }
    }
}
