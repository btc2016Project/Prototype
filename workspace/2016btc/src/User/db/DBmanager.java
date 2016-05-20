package User.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBmanager {

	/**
	 * DBと接続する　Oracle ver.  研修環境でのtest用なので適宜削除
	 *@author okamoto
	 * @return DBコネクション
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConn() throws ClassNotFoundException, SQLException {
		// JDBCドライバクラスをJVMに登録
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prototype", "root", "");
		// DBへ接続

		System.out.println("DBに接続しました");
		return conn;
	}

	/**
	 * DB接続を切断する
	 *
	 * @param conn
	 *            DBコネクション
	 */
	public static void close(Connection conn) {
		try {
			// 切断処理
			if (conn != null) {
				conn.close();
				System.out.println("切断しました");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
