package User.password;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PassChange extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws  ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //idと今のパスワードと新しいパスワードを代入
        String id = request.getParameter("id");
        String nowpass = request.getParameter("nowpass");
        String newpass = request.getParameter("newpass");
        response.setContentType("text/html;charset=UTF-8");

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
            //入力された新しいパスワードが4文字以上8文字以下かチェック
            //判定結果に応じて次のページへ進む

            //新しいパスワードの長さをpasslengthに代入
            int passlength = newpass.length();

            if (nowpass.equals(getpass) && (passlength >= 4) && (passlength <= 8)) {
                //条件に合致したため、データを更新
                PreparedStatement ps2 = null;
                ps2 = conn.prepareStatement("UPDATE pass SET pass = ? WHERE id = ?");
                ps2.setString(1, newpass);
                ps2.setString(2, id);
                ps2.executeUpdate();
                conn.commit();
                response.sendRedirect(request.getContextPath() + "/jsp/AfterPassChange.jsp");
                }
            //現在のパスワードが異なる場合
            else if (nowpass != getpass){
                String message = "現在のパスワードが違います";
                request.setAttribute("message", message);
                request.getRequestDispatcher("/jsp/ErrorPassChange.jsp").forward(request, response);
            }
            //パスワードの文字数が4文字未満か8文字を超えている場合
            else {
                String message = "パスワードは4文字から8文字で入力してください";
                request.setAttribute("message", message);
                request.getRequestDispatcher("/jsp/ErrorPassChange.jsp").forward(request, response);
            }
            // 切断する
            manager.close(conn);
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