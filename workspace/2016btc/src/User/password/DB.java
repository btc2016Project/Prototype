package User.password;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DB {
/**
* DBと接続する
*
* @return DBコネクション
* @throws ClassNotFoundException
* @throws SQLException
*/
    public Connection getConn() throws ClassNotFoundException, SQLException {
        // JDBCドライバクラスをJVMに登録
        Class.forName("oracle.jdbc.driver.OracleDriver");
        // DBへ接続
        Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE","system", "systemsss");
        return conn;
        }
        /**
        * DB接続を切断する
        *
        * @param conn
        * DBコネクション
        */
        public static void close(Connection conn) {
            try {
                // 切断処理
                if (conn != null) {
                conn.close();
                }
                } catch (SQLException e) {
                e.printStackTrace();
                }
                }
                }

