package User.password;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Pass_change extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws  ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //idと今のパスワードと新しいパスワードを代入
        String id = request.getParameter("id");
        String nowpass = request.getParameter("nowpass");
        String newpass = request.getParameter("newpass");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //DBとの連携
        DB manager = new DB();
        try {
            // 接続する
            Connection conn = null;
            conn = manager.getConn();
            //変数の初期化
            PreparedStatement ps = null;
            ResultSet rs = null;
            String getpass = null;
            //SQL文の作成
            ps = conn.prepareStatement("SELECT * FROM pass WHERE id =?");
            //バインド
            ps.setString(1, id);
            rs = ps.executeQuery();
            //パスワードの取得
            while (rs.next()) {
                getpass = (rs.getString("pass"));
                }

            //入力された現在のパスワードが正しいかチェック
            //判定結果に応じて次のページへ進む
            if (nowpass.equals(getpass)) {
                //UPDATE文
                PreparedStatement ps2 = null;
                ps2 = conn.prepareStatement("UPDATE pass SET pass = ? WHERE id = ?");
                ps2.setString(1, newpass);
                ps2.setString(2, id);
                ps2.executeUpdate();
                conn.commit();

                response.sendRedirect(request.getContextPath() + "/jsp/After_pass_change.jsp");

                }
            else {
                response.sendRedirect(request.getContextPath() + "/jsp/Error_pass_change.jsp");
            }
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace(); }
        catch (SQLException e) {
            System.err.println("Oracleエラーコード:" + e.getErrorCode());
            System.err.println("SQLStateコード:" + e.getSQLState());
            System.err.println("エラーメッセージ:" + e.getMessage());
            e.printStackTrace();
        }
    }
}